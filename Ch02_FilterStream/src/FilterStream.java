import java.io.*;
import java.util.*;

public class FilterStream {
    public static void main(String[] args) throws IOException {
        int from = 0;
        int to = 100000;
        long start = new Date().getTime();
        FileOutputStream fos = new FileOutputStream("numbers.dat");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        for(int i = from; i < to; i++) {
            bos.write(i);
        }

        bos.flush();
        bos.close();

        int bytes = 0;
        FileInputStream fis = new FileInputStream("numbers.dat");
        BufferedInputStream bis = new BufferedInputStream(fis);
        int input = bis.read();

        while(input != -1) {
            bytes++;
            input = bis.read();
        }
        bis.close();

        System.out.println("total = " + bytes);

        long end = new Date().getTime();
        System.out.println("Buffered Elapsed time : " + (end - start));
    }
}
