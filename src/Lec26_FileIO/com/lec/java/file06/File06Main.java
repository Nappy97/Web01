package Lec26_FileIO.com.lec.java.file06;

/*  Data Filter Stream
 Program <=== DataInputStream <=== FileInputStream <=== File
 Program ===> DataOutputStream ===> FileOutputStream ===> File

java.io.InputStream
|__ java.io.FilterInputStream
   |__ java.io.DataInputStream  

java.io.OutputStream
|__ java.io.FilterOutputStream
   |__ java.io.DataOutputStream
*/

import java.io.*;

public class File06Main {

    public static void main(String[] args) {
        System.out.println("Data Filter Stream");

        try (
                OutputStream out = new FileOutputStream("temp/data.bin");
                DataOutputStream dout = new DataOutputStream(out);

                InputStream in = new FileInputStream("temp/data.bin");
                DataInputStream din = new DataInputStream(in);
        ) {

            dout.writeBoolean(true);
            dout.writeInt(100);
            dout.writeDouble(3.14);
            dout.writeChar('A');

            boolean b= din.readBoolean();
            System.out.println("boolean: " + b);

            int num1 = din.readInt();
            System.out.println("int: " + num1);

            double num2 = din.readDouble();
            System.out.println("double: " + num2);

            char ch = din.readChar();
            System.out.println("char: " + ch);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n프로그램 종료");

    } // end main()

} // end class
















