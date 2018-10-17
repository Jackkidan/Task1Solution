
import java.util.Map;


public class Magic {

    public static void makeMagic(int a) {

        Map months = Months.getMonths();
        Map days = Months.getDays();
        String s = "" + (a - 250);
        String[] str = s.split("");
        switch (s.length()) {
            case 3:
                if (Integer.parseInt(str[1] + str[2]) > 12 || Integer.parseInt(str[1] + str[2]) <= 0) {
                    System.out.println("Введено неверное число");
                } else
                    System.out.println("Ваш день рождения - " + str[0] + " " + months.get(str[1] + str[2]));
                CheckBirthday.checkBirthday(str[0], str[1] + str[2]);
                break;

            case 4:
                if (Integer.parseInt(str[2] + str[3]) > 12 || Integer.parseInt(str[2] + str[3]) <= 0) {
                    System.out.println("Введено неверное число");
                } else if ((int) days.get(months.get(str[2] + str[3])) >= Integer.parseInt(str[0] + str[1])) {
                    System.out.println("Ваш день рождения - " + str[0] + str[1] + " " + months.get(str[2] + str[3]));
                    CheckBirthday.checkBirthday(str[0] + str[1], str[2] + str[3]);
                } else
                    System.out.println("Введено неверное число");
                break;

            default:
                System.out.println("Введено неверное число");
                break;
        }
    }
}
