import java.util.Scanner;

public class BMExercicio07 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int x;
        do {
            System.out.print("Informe um numero: ");
            x = entrada.nextInt();
        } while(x <= 0);
        System.out.print('\n');

        int y = 0;
        while(y != 1) {
            if(x % 2 == 0) {
                y = x / 2;
            } else {
                y = 3 * x + 1;
            }

            System.out.print(y);
            if(y != 1) {
                System.out.print(" -> ");
            }

            x = y;
        }
    }

}