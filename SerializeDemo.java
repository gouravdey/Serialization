import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

    public static void main(String[] args) {
        Employee e = new Employee(1, "GD", 100000);
        System.out.println(e);
        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/Serialization.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in test.txt");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
