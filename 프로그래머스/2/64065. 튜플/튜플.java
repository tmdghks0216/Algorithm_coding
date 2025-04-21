import java.util.*;
class Solution {
    public int[] solution(String s) {
        s=s.replaceAll("\\{","").replaceAll("\\}","");
        String[] sp=s.split(",");
        Map<String, Integer> map = new HashMap<>();
        for (String num : sp) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 정렬: 값(등장 횟수) 기준으로 내림차순
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        // 결과 배열 생성
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = Integer.parseInt(list.get(i).getKey());
        }
        return answer;
    }
}