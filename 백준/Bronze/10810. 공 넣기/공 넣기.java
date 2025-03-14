import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
        //바구니 수
        int N = sc.nextInt();
        int[] basket = new int[N];
        // 공을 넣는 횟수
        int M = sc.nextInt();

        //, i번 바구니부터 j번 바구니까지에 k번 번호가 적혀져 있는 공을 넣는다는 뜻이다.
        for(int i = 0; i < M; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            int K = sc.nextInt();

            for(int j = I - 1; j < J; j++) {
                basket[j] = K;
            }
        }

        Arrays.stream(basket).forEach( i -> System.out.print(i + " "));
    }

}
