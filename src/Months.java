import java.util.HashMap;
import java.util.Map;

public class Months {
    public static Map<String, String> getMonths() {
        HashMap<String, String> months = new HashMap<>();
        months.put("01", "Января");
        months.put("02", "Февраля");
        months.put("03", "Марта");
        months.put("04", "Апреля");
        months.put("05", "Мая");
        months.put("06", "Июня");
        months.put("07", "Июля");
        months.put("08", "Августа");
        months.put("09", "Сентября");
        months.put("10", "Октября");
        months.put("11", "Ноября");
        months.put("12", "Декабря");
        return months;
    }

    //Актуально на 2018 год
    public static Map<String, Integer> getDays() {
        HashMap<String, Integer> days = new HashMap<>();
        days.put("Января", 31);
        days.put("Февраля", 28);
        days.put("Марта", 31);
        days.put("Апреля", 30);
        days.put("Мая", 31);
        days.put("Июня", 30);
        days.put("Июля", 31);
        days.put("Августа", 31);
        days.put("Сентября", 30);
        days.put("Октября", 31);
        days.put("Ноября", 30);
        days.put("Декабря", 31);
        return days;
    }
}
