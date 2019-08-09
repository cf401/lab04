package lab04;


import javax.imageio.ImageIO;
import java.awt.*;
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
        this.image = readBMPImage(path);
    }

    public void writeOut(){
        try {
            ImageIO.write(this.image, "BMP", new File("./src/main/resources/CoffeeNew.bmp"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void changeColor(){
        BufferedImage result = new BufferedImage(
                this.image.getWidth(),
                this.image.getHeight(),
                BufferedImage.TYPE_BYTE_BINARY);

        Graphics2D graphic = result.createGraphics();
        graphic.drawImage(this.image, 0, 0, Color.WHITE, null);
        graphic.dispose();
        this.image = result;
    }


    public BufferedImage readBMPImage(String path) throws IOException {
        try {
            File bmp = new File(path);
            //grab our file from path, read as a stream.
            BufferedImage image = ImageIO.read(bmp);

            return image;
        }
        catch (FileNotFoundException e){
            System.out.println("File was not found.");
        }
        return null;
    }
}