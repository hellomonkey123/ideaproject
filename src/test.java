import java.util.Scanner;

public class test {

    public static int[] sum(int a, int[][] b){
        int[] sum = new int[a];
        int i = 0;
        while (i < a){
            if(b[i][0] == b[i][1]){
                sum[i] = (b[i][0] % 2 == 0)? b[i][0] : (-1)*b[i][0];
            }else {
                if(b[i][0] % 2 == 0 && b[i][1] % 2 == 1){
                    sum[i] = (b[i][0] - b[i][1] + 1) / 2;
                }
                if(b[i][0] % 2 == 1 && b[i][1] % 2 == 1){
                    sum[i] = (b[i][0] - b[i][1]) / 2 - b[i][0];
                }
                if(b[i][0] % 2 == 0 && b[i][1] % 2 == 0){
                    sum[i] = (b[i][1] - b[i][0]) / 2 + b[i][0];
                }
                if(b[i][0] % 2 == 1 && b[i][1] % 2 == 0){
                    sum[i] = b[i][1] / 2;
                }
            }
            i++;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] b = new int[4][2];
        int a = sc.nextInt();
        for (int i = 0; i < a; i++)
            for (int j =0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        int[] sum = sum(a,b);
        for(int i = 0; i < a; i++){
            System.out.print(sum[i] + "\n");
        }
    }
}
