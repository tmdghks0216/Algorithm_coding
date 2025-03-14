import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        //바구니 수
        int N = sc.nextInt();
        int[] basket = java.util.stream.IntStream.rangeClosed(1, N)
        .toArray();

        int M = sc.nextInt();
        
        for(int i = 0; i < M; i++) {
            int temp = 0;
            int I = sc.nextInt() -1;
            int J = sc.nextInt() -1;
            temp = basket[I]; 
            basket[I] = basket[J];
            basket[J] = temp;
        }

        Arrays.stream(basket).forEach( i -> System.out.print(i + " "));
    }

}
