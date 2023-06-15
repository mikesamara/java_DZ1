import java.util.Scanner;

/**
 * task
 *  Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
1 + 2 + 3 1*2*3
 */
public class task {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = sc.nextInt();
        int sum=0;
        int product=1;
        for (int i = 1; i <= num; i++) {
            sum = sum+i;
            product = product * i;
            
        }
        System.out.println(sum);
        System.out.println(product);
    }
}