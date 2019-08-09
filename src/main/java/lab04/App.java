//authors: Jack Daniel Kinne and Melfi Perez
//challenge by: Code Fellows

package lab04;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
//        seeBMPImage("./src/main/resources/Coffee.bmp");
    }

//
    public void seeBMPImage(String path) throws IOException {
        //grab our file from path, read as a stream.
        BufferedImage image = ImageIO.read(getClass().getResourceAsStream(path));

        //hold our bits as a 2d array
        int[][] array2D = new int[66][66];

        for (int xPixel = 0; xPixel < array2D.length; xPixel++)
        {
            for (int yPixel = 0; yPixel < array2D[xPixel].length; yPixel++)
            {
                int color = image.getRGB(xPixel, yPixel);
                if ((color >> 23) == 1) {
                    array2D[xPixel][yPixel] = 1;
                } else {
                    array2D[xPixel][yPixel] = 1;
                }
            }
        }

        System.out.println(array2D);
    }


    //input from a bmp file
    //confirm we can see values in from the file input
    //create a class
    //create methods - transforms
    //output to a file

}
