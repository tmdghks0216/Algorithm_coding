import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String S = sc.nextLine();
        S = S.trim();
        String[] split = S.split(" ");
        
        System.out.println(split[0].equals("") ? 0 : split.length);  
    }
}