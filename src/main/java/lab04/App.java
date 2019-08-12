//authors: Jack Daniel Kinne and Melfi Perez
//challenge by: Code Fellows

package lab04;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {

        String path = "./src/main/resources/Coffee.bmp";

        //run with IntelliJ
        if (args.length < 1 ) {
            //create bitmap and populate from path.
            Bitmap bmp = new Bitmap(path);
            //make a black and white image
            bmp.blackAndWhite();
            bmp.writeOut("blackWhite");
            //make a violet masterpiece
            bmp.paintViolet();
            bmp.writeOut("violet");
        }
        else {
            //run with command line args
            path = args[0];

            if(args[2].equals( "violet") ){
                //create bitmap and populate from path.
                Bitmap bmp = new Bitmap(path);
                //make a violet masterpiece
                bmp.paintViolet();
                bmp.writeOut("violet");
            }
            else if(args[2].equals("black")){
                //create bitmap and populate from path.
                Bitmap bmp = new Bitmap(path);
                //make a black and white image
                bmp.blackAndWhite();
                bmp.writeOut("blackWhite");
            }
            else {
                System.out.println("please choose a valid transform:");
                System.out.println("1. violet:");
                System.out.println("2. black:");
            }
        }
    }
    //input from a bmp file
    //confirm we can see values in from the file input
    //create a class
    //create methods - transforms
    //output to a file
}
