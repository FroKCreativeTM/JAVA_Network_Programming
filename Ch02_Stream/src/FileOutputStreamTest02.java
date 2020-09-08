import java.io.FileOutputStream;

public class FileOutputStreamTest02 {
    // throws Exception를 이용해서 try를 대체한다.
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("file02.dat");

        for(int i = 33; i < 125; i++) {
            fos.write(i);
        }

        fos.close();
    }
}
