import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt(); 
        sc.nextLine();
        
        for(int i = 0; i<T; i++){
            String S =sc.nextLine();
            String[] sp = S.split("");

            System.out.println(sp[0]+sp[sp.length-1]);
        }
   
    }
}