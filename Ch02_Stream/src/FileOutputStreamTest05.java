import java.io.FileOutputStream;

public class FileOutputStreamTest05 {
    // throws Exception를 이용해서 try를 대체한다.
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("file05.dat");

        // 0보다 작은 음수
        int data = -191;

        System.out.println(-191 & 0xff);

        fos.write(data);
        fos.close();
    }
}
