import java.io.*;

public class FileReader {
    public static void main(String[] args)throws Exception {

        String fileName = "/tmp/Serialization.txt";
        File file = new File(fileName);
        java.io.FileReader fr = new java.io.FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            //process the line
            System.out.println(line);
        }
    }
}
