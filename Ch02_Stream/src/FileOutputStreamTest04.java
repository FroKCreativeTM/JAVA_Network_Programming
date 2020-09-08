import java.io.FileOutputStream;

public class FileOutputStreamTest04 {
    // throws Exception를 이용해서 try를 대체한다.
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("file04.dat");

        for(int i = 321; i < 321 + 26; i++) {
            fos.write(i);
        }

        fos.close();
    }
}
