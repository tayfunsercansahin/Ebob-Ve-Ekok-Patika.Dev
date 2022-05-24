import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, ebob = 1, ekok = 1;

        System.out.print("n1 sayisini giriniz: ");
        n1 = input.nextInt();

        System.out.print("n2 sayisini giriniz: ");
        n2 = input.nextInt();

        int k = n1;
        while (k >= 1){
            k--;
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                System.out.println("Ebob = " + ebob);
                break;
            }
        }

        int i = 1;
        while (i <= (n1 * n2)){
            i++;
            if (i % n1 == 0 && i % n2 == 0){
                ekok = i;
                System.out.println("Ekok = " + ekok);
                System.out.println("Isleme gore: " + (n1 * n2) / ebob);
                break;
            }
        }

        /*
        for (int k = n1; k >= 1; k--) {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                System.out.println("Ebob = " + ebob);
                break;
            }
        }

        for (int i = 1; i <= (n1 * n2); i++){
            if (i % n1 == 0 && i % n2 == 0){
                ekok = i;
                System.out.println("Ekok = " + ekok);
                System.out.println("Isleme gore: " + (n1 * n2) / ebob);
                break;
            }
        }*/
    }
}
