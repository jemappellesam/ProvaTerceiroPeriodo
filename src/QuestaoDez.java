import java.util.Scanner;

public class QuestaoDez {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a frase:");
        String phrase = scan.nextLine();
        System.out.println("Digite a palavra:");
        String word=scan.nextLine();
        if(Contain(phrase,word)){
            System.out.println("Verdadeiro");
        }
        else {
            System.out.println("Falso");
        }


    }
    public static boolean Contain(String phrase, String word){
        if(phrase.contains(word)){
            return true;
        }
        else {
            return false;
        }

    }
}
