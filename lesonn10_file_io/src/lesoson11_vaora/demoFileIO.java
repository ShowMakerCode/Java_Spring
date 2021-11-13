package lesoson11_vaora;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class demoFileIO {

    public static void main(String[] args) {
        File file = new File("demo_character_io.txt");
        try {
            FileWriter writer = new FileWriter(file);
            String txt = " Chào  IT17101 ";
            writer.write(txt);
            writer.close();
            FileReader reader = new FileReader(file);
            while (true) {
                int i = reader.read();
                if (i == -1) {
                    System.out.println("");
                    break;
                } else {
                    System.out.print((char) i);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
