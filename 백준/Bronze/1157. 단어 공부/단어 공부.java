import java.util.*;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toUpperCase();
        String[] arr = str.split("");
        Map<String,Integer> map = new HashMap<>();
        for(String st: arr){
            if (map.get(st) != null){
                map.put(st,map.get(st)+1);
            }else {
                map.put(st,1);
            }
        }
        int maxValue = map.values().stream().max(Integer::compare).orElseThrow(NoSuchElementException::new);
        
        List<Map.Entry<String, Integer>> maxEntries = map.entrySet().stream()
            .filter(entry -> entry.getValue() == maxValue)
            .collect(Collectors.toList());

        if (maxEntries.size() >1){
            System.out.println("?");
        }else {
            System.out.println(maxEntries.get(0).getKey());
        }
            
    }
}
