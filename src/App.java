public class App {
    public static void main(String[] args) {
        String input = "Ol� Mundo";
        String hash = SHA256Helper.getSHA256(input);
        System.out.println(hash);
    }
}
