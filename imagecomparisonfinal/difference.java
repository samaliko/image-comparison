package imagecomparisonfinal;
import java.awt.Color;
import java.awt.image.BufferedImage;
import static java.lang.Math.sqrt;

public class difference {
    
    public static BufferedImage getDifference(BufferedImage img1, BufferedImage img2,int dvalue) {
    
    int w = img1.getWidth(),
        h = img1.getHeight(), 
              highlight = Color.BLACK.getRGB();
    int[] p1 = img1.getRGB(0, 0, w, h, null, 0, w);
    int[] p2 = img2.getRGB(0, 0, w, h, null, 0, w);
    
    for (int i = 0; i < p1.length; i++) {
        
        Color c1 = new Color(p1[i]);
        Color c2 = new Color(p2[i]);
        
        long rmean = ( (long)c1.getRed() + (long)c2.getRed() ) / 2;
        long r = (long)c1.getRed() - (long)c2.getRed();
        long g = (long)c1.getGreen() - (long)c2.getGreen();
        long b = (long)c1.getBlue() - (long)c2.getBlue();
        double d =  sqrt((((512+rmean)*r*r)>>8) + 4*g*g + (((767-rmean)*b*b)>>8));
        //double d = sqrt(Math.pow(r/2, 2) + Math.pow(g/(1+0.048 * c1.getGreen()), 2) + Math.pow(b/(1 + 0.014 * c1.getGreen()), 2));
        if (d>dvalue)
        {
            p1[i] = highlight;
        }
    }

    final BufferedImage out = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
    out.setRGB(0, 0, w, h, p1, 0, w);
    return out;
}
    
    
    
}
