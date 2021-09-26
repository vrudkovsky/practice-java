package introduction;

import java.io.*;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        //Read file line by line using Buffered reader

        try {
            File f = new File("test.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            String line = "";
            while ((line = br.readLine()) != null) {
                sb.append(line);
                sb.append('\n');
            }
            fr.close();
            System.out.println("Contents of the file:");
            System.out.println(sb.toString());

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
