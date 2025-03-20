import java.util.*;

public class  Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 0; i<n; i++){
            if(check(sc.next())){
                count += 1;
            }
        }
        System.out.println(count);

    } 
    public static boolean check(String str){
        boolean[] arr = new boolean[26];
        int prv = -1;
        for(int i = 0; i<str.length(); i++){
            int num = str.charAt(i);
            if(prv != num){
                if(arr[num - 'a']){
                    return false;
                } else {
                    arr[num - 'a'] = true;
                    prv =num;
                    continue;
                }


            }else{
                continue;
            }
        }
        return true;
    } 
}