package lab04;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Bitmap{

//  Instance variables
    private BufferedImage image;

//  Bitmap constructor
    public Bitmap(String path) throws IOException {
        this.image = readBMPImage(path);
    }

//  Overloaded constructor
    public Bitmap(BufferedImage result) throws IOException {
        this.image = result;
    }

//  Instance methods
    public void writeOut(String file){
        try {
            ImageIO.write(this.image, "BMP", new File("./src/main/resources/" + file + ".bmp"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//  First Transformation : Black & White
    public void blackAndWhite(){
        BufferedImage result = new BufferedImage(
                this.image.getWidth(),
                this.image.getHeight(),
                BufferedImage.TYPE_BYTE_BINARY);

        Graphics2D graphic = result.createGraphics();
        graphic.drawImage(this.image, 0, 0, Color.WHITE, null);
        graphic.dispose();
        this.image = result;
    }
//  Second Transformation : Paint Violet
    public void paintViolet() {
        for ( int i = 0; i < this.image.getWidth(); i++){
            for (int j = 0 ; j < this.image.getHeight(); j++){
                this.image.setRGB(i,j,new Color(197, 196, 250).getRGB());
            }
        }
    }

//  Third Transformation : Make It Flip
    public void  makeItFlip() {
        BufferedImage result = new BufferedImage(
                this.image.getWidth(),
                this.image.getHeight(),
                BufferedImage.TYPE_INT_ARGB);

        Graphics2D gg = result.createGraphics();
        gg.drawImage(this.image, this.image.getHeight(), 0, -this.image.getWidth(), this.image.getHeight(), null);
        gg.dispose();
    }

//  Read's BMP image
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