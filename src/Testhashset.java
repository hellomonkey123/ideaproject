import java.util.HashSet;
import java.util.Iterator;

public class Testhashset {

    public static void main(String[] args){

        HashSet<Integer> set = new HashSet<>();
        /*set.add("123");
        set.add("12");
        set.add("12");*/
        int[] num = {1,2,3,4,1,2,3};
        set.add(num[0]);
        for (int i = 1; i < num.length; i++){
            if(!set.add(num[i])){
                set.remove(num[i]);
            }
        }
        for (Integer s : set)
            System.out.println(s);
        /*Iterator iter = set.iterator();
        while(iter.hasNext()){
            String value = (String)iter.next();
            System.out.println(value);
        }*/
    }
}
