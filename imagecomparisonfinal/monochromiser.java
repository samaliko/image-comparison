package imagecomparisonfinal;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.*;
import java.io.*;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class monochromiser {
    
    public void monochromise(String filename)
    {
    BufferedImage srcImage = null;
try
{
File imgFile = new File(filename);
srcImage = javax.imageio.ImageIO.read(imgFile);
}
catch (IOException ioE)
		{
System.err.println(ioE);
System.exit(1);
		}
int width = srcImage.getWidth();
int height = srcImage.getHeight();
// Get raw image data
Raster raster = srcImage.getData();
DataBuffer buffer = raster.getDataBuffer();
int type = buffer.getDataType();
if (type != DataBuffer.TYPE_BYTE)
		{
System.err.println("Wrong image data type");
System.exit(1);
		}
if (buffer.getNumBanks() != 1)
		{
System.err.println("Wrong image data format");
System.exit(1);
		}
DataBufferByte byteBuffer = (DataBufferByte) buffer;
byte[] srcData = byteBuffer.getData(0);
// Sanity check image
if (width * height * 3 != srcData.length) {
System.err.println("Unexpected image data size. Should be RGB image");
System.exit(1);
		}

// Create Monochrome version - using basic threshold technique
byte[] monoData = new byte[width * height];
int srcPtr = 0;
int monoPtr = 0;
while (srcPtr < srcData.length)
		{
int val = ((srcData[srcPtr]&0xFF) + (srcData[srcPtr+1]&0xFF) + (srcData[srcPtr+2]&0xFF)) / 3;
			monoData[monoPtr] = (val > 50) ? (byte) 0xFF : 0;
			srcPtr += 3;
			monoPtr += 1;
		}
byte[] dstData = new byte[srcData.length];

// Create Blob Finder
BlobFinder finder = new BlobFinder(width, height);
ArrayList<BlobFinder.Blob> blobList = new ArrayList<BlobFinder.Blob>();
		finder.detectBlobs(monoData, dstData, 0, -1, (byte)0, blobList);

try{
    File imgFile = new File("output.jpg");
    BufferedImage img = ImageIO.read(imgFile);

    Graphics2D g2d = img.createGraphics();
    g2d.setColor(Color.BLACK);
    
    for(int i=0; i<blobList.size(); i++)
    {       
        if((blobList.get(i).mass*100)/(width*height)>0.4)
    {
            g2d.setStroke(new BasicStroke((blobList.get(i).mass*100)/(width*height*0.8f)));
            g2d.drawRect(blobList.get(i).xMin, blobList.get(i).yMin, blobList.get(i).xMax-blobList.get(i).xMin, blobList.get(i).yMax-blobList.get(i).yMin);
    }
    }
    g2d.dispose();
    RenderedImage rendImage = img;

    File file = new File("output2.jpg");
    ImageIO.write(rendImage, "jpg", file);
    
    
}
                catch(Exception e){System.out.println(e);}


	}
    }
    

