import java.io.*;
import java.util.Date;

public class Nonbuffered {
    public static void main(String[] args) throws IOException {
        int from = 0;
        int to = 100000;
        long start = new Date().getTime();
        FileOutputStream fos = new FileOutputStream("numbers.dat");

        for(int i = from; i < to; i++) {
            fos.write(i);
        }

        fos.flush();
        fos.close();

        int bytes = 0;
        FileInputStream fis = new FileInputStream("numbers.dat");
        int input = fis.read();

        while(input != -1) {
            bytes++;
            input = fis.read();
        }
        fis.close();

        System.out.println("total = " + bytes);

        long end = new Date().getTime();
        System.out.println("Buffered Elapsed time : " + (end - start));
    }
}
