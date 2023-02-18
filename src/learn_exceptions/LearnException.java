package learn_exceptions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LearnException {
    public static void main(String[] args) throws IOException {
        //checked exception just use throws keyword
        String path = System.getProperty("user.dir") + File.separator + "test.txt";
        File f = new File(path);
        FileWriter fileWriter = new FileWriter(f);
        fileWriter.write("malek");
        fileWriter.close();

    }
}
