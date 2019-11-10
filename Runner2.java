package by.ad.les10_2.main;
/*
 * 2. Создать класс Календарь с внутренним классом, с помощью объектов 
 * которого можно хранить информацию о выходных и праздничных днях. 
 */
import by.ad.les10_2.bean.Calendar;
/*
 * 2. Создать класс Календарь с внутренним классом, с помощью объектов 
 * которого можно хранить информацию о выходных и праздничных днях. 
 */
import by.ad.les10_2.bean.CalendarException;
import by.ad.les10_2.bean.InfoDay;

public class Runner2 {

	public static void main(String[] args) throws CalendarException {

		try {
			InfoDay day1 = new InfoDay(401, 2, 28, "Праздник 1");
			InfoDay day2 = new InfoDay(1501, 5, 1, "Праздник 2");
			InfoDay day3 = new InfoDay(2200, 10, 10, "Праздник 2");

			Calendar calendar = new Calendar();
			calendar.addHoliday(day1);
			calendar.addHoliday(day2);
			calendar.addHoliday(day3);

			
			System.out.println(calendar);

		} catch (CalendarException e) {
			System.out.println(e.getMessage());

		}

	}

}
