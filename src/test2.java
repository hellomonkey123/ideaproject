import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        String n=input.nextLine();

        String[] str = n.split("\\s+");
        for (int i = 0; i<str.length;i++) {

            if(str[i].substring(str[i].length()-4,str[i].length()).equals("kill") ){
                str[i] = str[i].substring(0,str[i].length()-4) + "killed;";
            }
            if(str[i].substring(str[i].length()-5,str[i].length()).equals("start") ){
                str[i] = str[i].substring(0,str[i].length()-5) + "submitted;";
            }
            if (str[i].length()>8) {
            if(str[i].substring(str[i].length()-8,str[i].length()).equals("finished") ){
                str[i] = str[i] + ";";
            }

                if (str[i].substring(str[i].length() - 8, str[i].length()).equals("launched")) {
                    str[i] = str[i].substring(0, str[i].length() - 8) + "running;";
                }
            }
            if (str[i].length()>12) {
                if (str[i].substring(str[i].length() - 12, str[i].length()).equals("app_accepted")) {
                    str[i] = str[i].substring(0, str[i].length() - 12) + "scheduled;";
                }
            }
            if (str[i].length()>19) {
                if (str[i].substring(str[i].length() - 19, str[i].length()).equals("container_allocated")) {
                    str[i] = str[i].substring(0, str[i].length() - 19) + "allocated;";
                }
            }
            System.out.print(str[i]);
        }
        //System.out.print(str[0].substring(str[0].length()-5,str[0].length()));

    }
}
