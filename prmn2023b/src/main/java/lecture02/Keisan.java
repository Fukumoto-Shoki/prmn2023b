package lecture02;

public class Keisan {

    int sum(int[] num) {
        int sum = 0;
        for(int i = 0; i < 5; i++) {
            sum += num[i];
        }
        return sum;
    }

    void sumcheck(int x) {
        if(x >= 100) {
            System.out.println("great!!");
        }
        else if(x >= 50) {
            System.out.println("big");
        }
        else {
            System.out.println("small");
        }
    }
}
