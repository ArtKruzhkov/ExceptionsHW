package HW03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileSystemException;


public class HW03 {

    public static void main(String[] args) {

        try {
            makeRecord();
            System.out.println("success");
        } catch (FileSystemException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void makeRecord() throws Exception{

        System.out.println("Enter surname, name, fathername, phone number (without spaces), through a space");

        String text;
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            text = bf.readLine();
        } catch (IOException e) {
            throw new Exception("Error while working with console");
        }

        String[] array = text.split(" ");
        if (array.length != 4) {
            throw new Exception("Incorrect ammount of elements ");
        }

        String surname = array[0];
        String name = array[1];
        String fathername = array[2];

        double phone;
        try {
            phone = Double.parseDouble(array[3]);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Incorrect phone format");
        }

        String fileName = "HW03\\files\\" + surname.toLowerCase() + ".txt";
        File file = new File(fileName);
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.write(String.format("%s %s %s %.0f\n", surname, name, fathername, phone));
        } catch (IOException e) {
            throw new FileSystemException("Error working with a file");
        }
    }
}
