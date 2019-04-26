import java.util.Arrays;
public class JconsoleTest {
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    public int minNumberOfProjects(int num, int projCmptDec, int restDec,
                                   int[] errorScore) {
        // WRITE YOUR CODE HERE

        int count = 0;
        boolean flag = true;
        while (flag) {

            flag = false;

            int[] tmp = errorScore;
            Arrays.sort(tmp);
            tmp[0] -= projCmptDec;
            for (int i = 1; i < num; i++) {
                tmp[i] -= restDec;
            }
            count++;
            for (int t : tmp) {
                if (t > 0) {
                    flag = true;
                    break;

                }
            }
        }


        return count;
    }
    public void mian(String[] args){

    }
}