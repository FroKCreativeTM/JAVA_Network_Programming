import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis
                = new FileInputStream("H:\\Document\\CSE\\JAVA\\JAVA_Network_Programming\\Test.dat");
        int total = 0;
        byte[] temp = new byte[28];
        int count = fis.read(temp);
        while(count != -1) {
            total = total + count;
            System.out.write(temp, 0, count);
            count = fis.read(temp);
        }
        System.out.println(total + "bytes");
    }
}
