import java.io.FileInputStream;
        import java.io.IOException;

public class InputStream01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis;
        fis = new FileInputStream("H:\\Document\\CSE\\JAVA\\JAVA_Network_Programming\\file01.dat");

        int total = 0;
        int j = fis.read();

        while (j != -1) {
            total++;
            j = fis.read();
        }
        fis.close();
        System.out.println(total + "bytes");
    }
}
