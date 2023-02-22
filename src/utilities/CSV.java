package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV
{
    // This method will read data from csv file and return as a list
    public static List<String[]> read(String file)
    {
        List<String[]> data = new LinkedList<String[]>();
        String dataRow;

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            // To read ech line
            while((dataRow = br.readLine()) != null)
            {
                // To split lines
                String[] dataRecords = dataRow.split(",");

                data.add(dataRecords);
            }

        } catch (FileNotFoundException e) {
            System.out.println("COULD NOT FIND THE FILE!!");
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("COULD NOT READ THE FILE!!");
            throw new RuntimeException(e);
        }

        return data;
    }
}
