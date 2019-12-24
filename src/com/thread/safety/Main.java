import java.util.Scanner;
import java.util.HashSet;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int i = 0,count = 0;
        while (str.charAt(i) == 'L'){
            count++;
            i++;
        }
        i = str.length() - 1;
        while (str.charAt(i) == 'L'){
            count++;
            i--;
        }
        System.out.println(count + 1);
/*
        int[] nums = new int[str.split(" ").length];
        for (int i = 0; i < str.split(" ").length; i++)
            nums[i] = Integer.parseInt(str.split(" ")[i]);
        System.out.println(longCon(nums));*/
    }

    public static int longCon(int[] nums){
        HashSet<Integer> sets = new HashSet<>();
        for(int num : nums){
            if(!sets.add(num))
                sets.add(num);
        }
        int maxN = 0;
        for(int num : sets){
            if(!sets.contains(num - 1)){
                int tmp = num;
                int len = 1;
                while(sets.contains(++tmp)) len++;
                maxN = Math.max(maxN, len);
            }
        }
        return maxN;
    }

}