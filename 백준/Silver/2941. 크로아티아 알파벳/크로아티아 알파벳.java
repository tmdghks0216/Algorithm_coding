import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String st = sc.nextLine();

        String[] list= {"c=","c-","dz=","d-","lj","nj","s=","z="};
    
        for(String filter : list){
            if( st.matches("(.*)" + filter + "(.*)")){
                st = st.replace(filter,"a");
            }
        }
        String trim =st.trim();
    
        System.out.println( trim.length());
       
    }
}




