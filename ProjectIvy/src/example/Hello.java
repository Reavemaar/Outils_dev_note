
package example;

import org.apache.commons.lang.WordUtils;
import com.opencsv.CSVReader;
import java.io.*;

public class Hello {
    public static void main(String[] args) {
    	int monmax=0;
        String  message = "hello ivy !";
        System.out.println("standard message : " + message);
        System.out.println("capitalized by " + WordUtils.class.getName() 
                                + " : " + WordUtils.capitalizeFully(message));
        CSVReader reader = new CSVReader(new FileReader("data.csv"));
        List<String[]> myEntries = reader.readAll();
        System.out.println("mon max: " + monmax);
    }
}
        