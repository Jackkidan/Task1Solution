
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        int userNumb = 0;

        System.out.println("Умножьте на 2 число дня своего рождения.");
        System.out.println("Затем сложите получившееся произведение и число 5 и умножьте на 50 полученную сумму.");
        System.out.println("К этому результату прибавьте номер месяца рождения (июль — 7, январь — 1).");
        System.out.println("Введите получившееся число в консоль:");

        boolean check = false; //пока false, предлагает ввести число
        while (check == false) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                userNumb = sc.nextInt();
                System.out.println("Магия загружается");
                Magic.makeMagic(userNumb);
                check = true;
                sc.close();

            } else {
                System.out.println("Вы ввели не целое число");
            }
        }
    }
}

// (день рождения*2+5)*50+месяц рождения