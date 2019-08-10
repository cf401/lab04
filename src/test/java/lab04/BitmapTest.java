package lab04;

import org.junit.Test;

import java.awt.image.BufferedImage;
import java.io.IOException;

import static org.junit.Assert.*;

public class BitmapTest {

    @Test
    public void blackAndWhite() {

    }

    @Test
    public void paintViolet() {
        //make an image
        BufferedImage result = new BufferedImage(
                5,
                5,
                BufferedImage.TYPE_BYTE_BINARY);

        for (int i = 0; i < result.getWidth(); i ++){
            for(int j = 0; j < result.getHeight(); j++){
                result.setRGB(j, i, 0);
            }
        }

        try {
            //give image to bitmap instance using overloaded constructor
            Bitmap mapForTesting = new Bitmap(result);
            //paint it
            mapForTesting.paintViolet();

            //assert image changed to purple


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}