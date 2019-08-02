package core.java.assignment.question20;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReader
{
    /*
     * Reads in from a file and displays each chunk of information stored in the file.
     */
    public static void readTextFromFile(String fileName)
    {
        try
        {
            FileInputStream fstream = new FileInputStream(fileName);

            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

            String strLine;

            //Read File Line By Line
            while ((strLine = br.readLine()) != null)
            {
                String[] stringArray = strLine.split(":");

                System.out.println("Name: " + stringArray[0] + " " + stringArray[1]);
                System.out.println("Age: " + stringArray[2] + " " + "years");
                System.out.println("State: " + stringArray[3] + " " + "State");
            }

            //Close the input stream
            fstream.close();
        }
        catch (IOException e)
        {
            System.out.println("File not found, you need to provide the correct file path.");
        }

    }
}
