import java.util.Scanner;

public class watermelon {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int kg = scan.nextInt();
        scan.close();
        if(kg >= 1 && kg <= 100){
            if(kg % 2 == 0 && kg != 2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}