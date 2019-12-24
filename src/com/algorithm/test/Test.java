package com.algorithm.test;

/**
 * @program: Test
 * @description:
 * @author: liu yuanwen
 * @create: 2019/8/28
 */
import java.util.*;
public class  Test {
    List<int[]> salaryfrequency(int num, int[] salaries){
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < num; i++) {
            if (map.containsKey(salaries[i])) {
                int count = map.get(salaries[i]);
                map.put(salaries[i], ++count);
            } else {
                map.put(salaries[i], 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> i, Map.Entry<Integer, Integer> j) {
                return j.getValue().compareTo(i.getValue());
            }
        });
        int index = 0, pos = 0;
        while (index < num && pos < list.size()) {
            int num2 = list.get(pos).getValue();
            while (num2 > 0) {
                salaries[index] = list.get(pos).getKey();
                index++;
                num2--;
                list.get(pos).setValue(num2);
            }
            pos++;
        }
        return Arrays.asList(salaries);
    }
}