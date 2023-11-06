package lecture02;

public class check {

    int i;

    void gakuseki(String[][] x, String n) {
        for(i = 0; i < 5; i++) {
            if (x[i][0].equals(n)) {
                return;
            }
        }
        System.out.println("error!!");
        System.exit(0);
    }

    void pass(String[][] x, String n) {
        if(x[i][1].equals(n)) {
            System.out.println("ログイン完了");
        }
        else {
            System.out.println("不正なアクセス");
        }
    }
}
