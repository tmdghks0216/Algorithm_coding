import java.util.*;


public class Main{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split("");
        int resurt = 1;
        for(int i =0; i<=strArr.length/2; i++){
            if(!strArr[i].equals(strArr[strArr.length -i -1])){
                resurt = 0;
                break;
            }
        }
        System.out.println(resurt);
    }
}
