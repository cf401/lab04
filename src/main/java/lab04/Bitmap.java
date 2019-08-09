package lab04;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Bitmap{

    private BufferedImage image;

    //bitmap constructor
    public Bitmap(String path) throws IOException {
        this.image = seeBMPImage(path);
    }

    public void writeOut(){
        try {
            ImageIO.write(this.image, "BMP", new File("./src/main/resources/CoffeeNew.bmp"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public BufferedImage seeBMPImage(String path) throws IOException {
        try {
            File bmp = new File(path);
            //grab our file from path, read as a stream.
            BufferedImage image = ImageIO.read(bmp);

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
            System.out.println(Arrays.toString((array2D)));
            return image;
        }
        catch (FileNotFoundException e){
            System.out.println("File was not found.");
        }
        return null;
    }
}