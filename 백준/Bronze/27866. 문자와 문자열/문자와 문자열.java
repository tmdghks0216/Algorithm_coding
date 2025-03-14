import java.util.*;

public class Main{
    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        String S =sc.nextLine();
        int i = sc.nextInt();

        String[] sp = S.split("");
        System.out.print(sp[i-1]);
    }
}