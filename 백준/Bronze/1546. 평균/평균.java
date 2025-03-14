import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);    
        int N = sc.nextInt();
        int[] arr = new int[N];
        
        for(int i =0; i<N; i++){
            arr[i] = sc.nextInt();
        }
       int max = Arrays.stream(arr).max().getAsInt();
       double avg = Arrays.stream(arr)
       .mapToDouble(i ->  ((i / (double) max) * 100))
       .sum();
       System.out.print(avg/N);
    }
}
