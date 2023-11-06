package lecture02;

import java.util.Scanner;

public class prac3 {
    public static void main(String[] args) {

        String[][] stu = new String[5][2];
        for(int i = 0; i < 5; i++) {
            stu[i][0] = "B222000" + i;
            stu[i][1] = "pass" + i;
        }

        Scanner scan = new Scanner(System.in);
        check che = new check();

        System.out.print("学籍番号: ");
        String gaku = scan.next();
        che.gakuseki(stu,gaku);

        System.out.print("パスワード: ");
        String pass = scan.next();
        che.pass(stu, pass);
    }
}
