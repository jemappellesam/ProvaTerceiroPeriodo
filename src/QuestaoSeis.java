public class QuestaoSeis {
    public static void main (String[] args) {

        String string = "String";
        System.out.println(mirrored(string));


    }
    public static String mirrored(String string){
        StringBuilder newString = new StringBuilder();
        for(int i=string.length()-1; i>=0;i--){
            char character = string.charAt(i);
            newString.append(Character.toString(character));

        }
        return newString.toString();
    }
}