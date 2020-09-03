import java.io.*;

public class FileIO_01 {
    public static void main(String[] args) throws IOException {
        File f = new File("H:\\Document\\CSE\\JAVA\\JAVA_Network_Programming\\File\\ch01\\text.txt");
        File f2 = new File("H:\\Document\\CSE\\JAVA\\JAVA_Network_Programming\\File\\ch01", "text.txt");
        File dir = new File("H:\\Document\\CSE\\JAVA\\JAVA_Network_Programming\\File\\ch01");
        File f3 = new File(dir, "text.txt");

        // 파일이 존재하는 경우
        if(f.exists())
        {
            System.out.println("file/directory is existed");
            // 파일이 존재하고 파일인 경우
            if(f.isFile())
            {
                System.out.println("This is file");

                FileReader reader = new FileReader(f);
                int cur;

                while((cur = reader.read()) != -1)
                {
                    System.out.print((char)cur);
                }
                reader.close();
            }
            // 폴더가 존재하고 폴더일 때
            else if(f.isDirectory())
            {
                System.out.println("This is directory");
            }
        }
    }
}
