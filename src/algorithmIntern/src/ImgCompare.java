import java.awt.*;
import java.awt.image.PixelGrabber;

public class ImgCompare {
    public static void main(String[] args) {
        String file1 = "C:\\Users\\lexsh\\Desktop\\Login1.png";
        String file2 = "C:\\Users\\lexsh\\Desktop\\Login2.png";
        Image image1 = Toolkit.getDefaultToolkit().getImage(file1);
        Image image2 = Toolkit.getDefaultToolkit().getImage(file2);
        PixelGrabber grab1 = new PixelGrabber(image1, 0, 0, -1, -1, false);
        PixelGrabber grab2 = new PixelGrabber(image2, 0, 0, -1, -1, false);
        int[] data1 = null;
        try {
            if (grab1.grabPixels()) {
                int width = grab1.getWidth();
                int height = grab1.getHeight();
                data1 = new int[width * height];
                data1 = (int[])(grab1.getPixels());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int[] data2 = null;
        try {
            if (grab2.grabPixels()) {
                int width = grab2.getWidth();
                int height = grab2.getHeight();
                data2 = new int[width * height];
                data2 = (int[])(grab2.getPixels());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (java.util.Arrays.equals(data1, data2)) {
            System.out.println("good");
        } else {
            System.out.println("diff");
        }

    }
}
