import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите двузначное число или больше :");
        int number = scanner.nextInt();
        while (number < 10){
            System.out.println("Это не двузначное число. Введите двузначное число, :");
            number = scanner.nextInt();
        }
        int sum = 0;
        int oddSum = 0;
        int maxDigit = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            if (digit % 2 != 0) {
                oddSum += digit;
            }
            if (digit> maxDigit){
                maxDigit = digit;
            }
            number = number / 10;
        }
        System.out.println("Сумма цифр вашего числа: " + sum);
        System.out.println("Сумма нечетных цифр вашего числа: " + oddSum);
        System.out.println("Максимальная цифра в вашем числе: " + maxDigit);
    }
}