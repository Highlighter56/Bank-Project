import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class TestingFileWriting {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        File fl = new File("Data.txt");
        Scanner sc = new Scanner(System.in);
        Scanner scF = new Scanner(fl);
        FileWriter fw = new FileWriter(fl, true);
        PrintWriter pw = new PrintWriter(fl);


        System.out.println("Hi");
        pw.println("Hi");
        pw.println("Test");

        // By Closing pw, the changes you made are sent to the file
        pw.close();
    }
}
