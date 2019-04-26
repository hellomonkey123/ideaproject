import java.util.HashSet;
import java.util.Iterator;

public class Testhashset {

    public static void main(String[] args){

        HashSet set = new HashSet();
        set.add("123");
        set.add("12");
        set.add("12");


        Iterator iter = set.iterator();
        while(iter.hasNext()){
            String value = (String)iter.next();
            System.out.println(value);
        }
    }
}
