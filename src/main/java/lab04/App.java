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

    public static void main(String[] args) throws IOException {
//        seeBMPImage("./src/main/resources/Coffee.bmp");
        Bitmap bmp = new Bitmap("./src/main/resources/Coffee.bmp");
        bmp.writeOut();
        //int x = bmp2.getImage()
    }

//



    //input from a bmp file
    //confirm we can see values in from the file input
    //create a class
    //create methods - transforms
    //output to a file

}
