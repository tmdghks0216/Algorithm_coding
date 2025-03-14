import java.util.*;

public class Main{

       public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        int N =sc.nextInt();
        sc.nextLine();
        String num = sc.next();
        
        String[] numArr = num.split("");

        int sum = Arrays.stream(numArr)
                        .mapToInt(i ->  Integer.parseInt(i))
                        .sum(); 

        System.out.println(sum);
    }
}