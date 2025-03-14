import java.util.*;
import java.util.stream.IntStream;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] students = new int[30];

        for (int i = 0; i < 28; i++){
            int num = sc.nextInt();
            students[num-1] = 1;
        }
       IntStream.range(0, 30)
         .filter(i -> students[i] == 0)
         .forEach(i -> System.out.println(i + 1));
    }
}