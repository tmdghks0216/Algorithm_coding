import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalScore = 0;
        int totalCredits = 0;


        for(int i = 0; i<20; i++){
        String[] str = sc.nextLine().split(" ");
        double  grade = Double.parseDouble(str[1]);
        String rating = str[2];
        double score = 0;
        if(!rating.equals("P")){
        switch (rating) {
            case "A+":
                score = 4.5;
                break;
            case "A0":
                score = 4.0;
                break;
            case "B+":
                score = 3.5;
                break;
            case "B0":
                score = 3.0;
                break;
            case "C+":
                score = 2.5;
                break;
            case "C0":
                score = 2.0;
                break;
            case "D+":
                score = 1.5;
                break;
            case "D0":
                score = 1.0;
                break;
            case "F":
                score = 0.0;
                break;
        }
        
        totalScore += score * grade;  
        totalCredits += grade;  
        }
    }
        System.out.printf("%.6f\n",totalScore / totalCredits);
    }
}