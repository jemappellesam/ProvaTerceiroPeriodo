import java.util.Scanner;

public class QuestaoOito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de palavras contidas na lista:");
        int numberOfWords= scan.nextInt();
        String [] Words = new String[numberOfWords];
        for (int i=0;i<numberOfWords;i++){
            System.out.println("Digite uma palavra:");
            scan.nextLine();
            Words[i]=scan.next();

        }

        System.out.println(OneString(Words));
    }
    public static String OneString(String[] list) {
        String newString = "";
        for (int i = 0; i < list.length; i++) {
            newString += list[i];
        }
        return newString;
    }

}

