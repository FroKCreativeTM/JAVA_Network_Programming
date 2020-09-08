import java.io.*;

public class FileOutputStreamTest01 {
    // throws Exception를 이용해서 try를 대체한다.
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("file01.dat");

        for(int i = 65; i < 65 + 26; i++) {
            fos.write(i);
        }

        fos.close();
    }
}
