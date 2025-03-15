import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int[] result = new int[26];
        for(int i =0; i<26; i++){
            result[i] = -1;
        }
        String S = sc.nextLine();
        char[] sp = S.toCharArray(); 

        for(int i = 0; i<sp.length; i++){
            int index =(int) sp[i] -(int) 'a';

            if(result[index] == -1){
             result[index] = i;
            }
          
        }        
        for(int a : result){
            System.out.print(a + " ");
        }
    }
}