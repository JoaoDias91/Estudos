import java.util.Scanner;

public class WayTooLongWords {
    /*A quantidade de palavras a serem abreviadas deve ser definida pelo inteiro inserido na primeira linha 
        ex
        4
        word
        localization
        internationalization
        pneumonoultramicroscopicsilicovolcanoconiosis

        saida:
        
        word
        l10n
        i18n
        p43s

        */
    
    public static void main(String[] args) {
        //t0do Tentar trocar o array de String por um ArrayList
        Scanner scan = new Scanner(System.in);
        String [] input = new String [100];
        for(int i = 0; i < 5; i++){
             input[i] = scan.nextLine();
        }
        String [] modifiedWords = new String[input.length - 1];
        for(int i = 1, j = 0; i <= 5; i++, j++){
            if(input[i].length() > 10){
                String word = input[i];
                char[] wordToCharArray =  word.toCharArray();
                String modifiedWord = Character.toString(word.charAt(0)) + 
                       String.valueOf(word.substring(1, wordToCharArray.length -1).length()) + 
                       Character.toString(word.charAt(word.length() - 1));
                modifiedWords[j] = modifiedWord; 
                //trata com String e add na lista 
            }else{
                modifiedWords[j] = input[i];
                //add na lista somente
            }
       }
        scan.close(); 
    }
}
