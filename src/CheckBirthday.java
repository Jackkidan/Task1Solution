import java.util.Calendar;

public abstract class CheckBirthday {

    public static void checkBirthday(String d, String m){
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH)+1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int userDay = Integer.parseInt(d);
        int userMonth = Integer.parseInt(m);
        if (month == userMonth && day == userDay) {
            System.out.println("Да у вас сегодня день рождения, поздравляю!");
        }
    }
}
