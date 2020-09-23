import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStream03 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis
                = new FileInputStream("H:\\Document\\CSE\\JAVA\\JAVA_Network_Programming\\test.jpeg");
        FileOutputStream fos
                = new FileOutputStream("H:\\Document\\CSE\\JAVA\\JAVA_Network_Programming\\test2.jpeg");

        int j = fis.read();

        while(j != -1) {
            fos.write(j);
            j = fis.read();
        }
        System.out.println("Complete!");
    }
}
