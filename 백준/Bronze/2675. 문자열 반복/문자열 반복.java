import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();// 테스트 케이스

        for(int i = 0; i<T; i++){
          int R = sc.nextInt(); // 반복횟수
          String S = sc.next();
          String[] split = S.split("");

          for(int j =0; j<split.length; j++){
            for(int k = 0; k<R; k++){
                System.out.print(split[j]);
            }
          }
          System.out.println();
        }
    }
       
}