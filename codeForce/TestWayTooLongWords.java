import java.util.Scanner;

public class TestWayTooLongWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        System.out.println(word);
        scan.close();
        char[] wordToCharArray =  word.toCharArray();
        String finalWord = Character.toString(word.charAt(0)) + 
                       String.valueOf(word.substring(1, wordToCharArray.length -1).length()) + 
                       Character.toString(word.charAt(word.length() - 1));
        System.out.println(finalWord);
    }
}

