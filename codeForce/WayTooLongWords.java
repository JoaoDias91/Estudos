import java.util.Scanner;

public class WayTooLongWords {
    int quantity;
    String [] words;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] input = new String [5];
        for(int i = 0; i < 5; i++){
             input[i] = scan.nextLine();
        }
        int quantityOfWords = Integer.valueOf(input[0]);
        for(int i = 1; i <= 5; i++){
            if(input[i].length() > 10){
                
            }
       }
        scan.close(); 
    }
}
