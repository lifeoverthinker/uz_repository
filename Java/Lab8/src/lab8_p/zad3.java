package lab8_p;

public class zad3 {
    public static void main(String[] args) {
        System.out.println("Podaj zdanie: ");
        String sentence = System.console().readLine();
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }
    }
}