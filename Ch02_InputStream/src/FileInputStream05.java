import java.io.*;

public class FileInputStream05 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis
                = new FileInputStream("H:\\Document\\CSE\\JAVA\\JAVA_Network_Programming\\test.jpeg");
        byte[] b= new byte[1024];
        int count = fis.read(b);
        fis.close();

        System.out.println("Bytes read " + count);

        for (int i = 0; i < count; i++) {
            int alpha = b[i] & 0xff;
            System.out.print(alpha + " ");
            if(i % 8 == 7) System.out.println();
            else System.out.print("\t");
        }
    }
}
