//authors: Jack Daniel Kinne and Melfi Perez
//challenge by: Code Fellows

package lab04;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        //create bitmap and populate from path.
        Bitmap bmp = new Bitmap("./src/main/resources/Coffee.bmp");
        //make a black and white image
        bmp.blackAndWhite();
        bmp.writeOut("blackWhite");
        //make a violet masterpiece
        bmp.paintViolet();
        bmp.writeOut("violet");

//        if(args[2].equals( "violet") ){
//            //do stuff
//        }
//        else if(args[2].equals("none")){
//            //do nothing
//        }
//        else {
//            System.out.println("please choose a valid transform:");
//            System.out.println("1. violet:");
//            System.out.println("2. black:");
//        }

        //int x = bmp2.getImage()
    }

    //input from a bmp file
    //confirm we can see values in from the file input
    //create a class
    //create methods - transforms
    //output to a file

}
