import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String S = sc.next();
        String B = sc.next();

         String[] S1 = S.split("");
         String[] B1 = B.split("");

        S1 = reverse(S1);
        B1 = reverse(B1);

        S = String.join("", S1);
        B = String.join("", B1);
        
        int number1 = Integer.parseInt(S);
        int number2 = Integer.parseInt(B);

        System.out.println(number1 > number2 ? number1 : number2);
    }
      
    public static String[] reverse(String[] reverse){
        String temp = "";
        temp =  reverse[0];
        reverse[0] = reverse[2];
        reverse[2] = temp;

        return reverse;
    }
}