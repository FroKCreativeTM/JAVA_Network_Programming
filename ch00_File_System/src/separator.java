public class separator {
    public static void main(String[] args) {
        System.out.println(System.getProperties());
        String separator = System.getProperty("file.separator");
        System.out.println(separator.charAt(0));
        System.out.println(separator);
    }
}
