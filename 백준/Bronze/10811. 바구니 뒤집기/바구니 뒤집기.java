import java.util.*;
public class Main {

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        //바구니
        int N = sc.nextInt();
        //시행 횟수
        int M = sc.nextInt();
        int[] arr = new int[N];
        int temp = 0;
        for(int i =0; i<N; i++){
            arr[i] = i+1;
        }

        for(int k = 0; k<M; k++){
            int i = sc.nextInt() -1;
            int j = sc.nextInt() -1;
            
            while(i<j) { 
				temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
				i++;	
				j--;	
			}
        }
        Arrays.stream(arr).forEach( i -> System.out.print(i + " "));
    }
}
