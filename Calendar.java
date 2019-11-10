package by.ad.les10_2.bean;

import java.util.List;
import java.util.ArrayList;

public class Calendar {
	private List<InfoDay> calendar;

	public Calendar() {
		calendar = new ArrayList<InfoDay>();
	}

	public List<InfoDay> getCalendar() {
		return calendar;
	}

	public void setCalendar(List<InfoDay> calendar) {
		this.calendar = calendar;
	}

	public void addHoliday(InfoDay day) {
		calendar.add(day);
	}

	@Override
	public String toString() {
		return "Calendar [calendar=" + calendar + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((calendar == null) ? 0 : calendar.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calendar other = (Calendar) obj;
		if (calendar == null) {
			if (other.calendar != null)
				return false;
		} else if (!calendar.equals(other.calendar))
			return false;
		return true;
	}

}
