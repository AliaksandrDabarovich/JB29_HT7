package by.ad.les10_2.bean;

import by.ad.les10_2.bean.CalendarException;

public class InfoDay {
	private int day;
	private int month;
	private int year;
	private String holiday;

	public InfoDay(int year, int month, int day, String holiday) throws CalendarException {
		if (year > 0 && year < 3000) {

			if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
				if (month == 2 && (day > 0 && day <= 29)) {
					this.year = year;
					this.day = day;
					this.month = month;
				} else {
					throw new CalendarException("Некорректный день в ВИСОКОСНОМ году");
				}
			} else {
				this.year = year;
				if (month > 0 && month <= 12) {
					this.month = month;
					if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
							|| month == 12 && (day > 0 && day <= 31)) {
						this.day = day;

					} else if (month == 4 || month == 6 || month == 9 || month == 11 && (day > 0 && day <= 30)) {
						this.day = day;
					} else if (month == 2 && (day > 0 && day <= 28)) {
						this.day = day;
					} else {
						throw new CalendarException("Некорректный день в невисокосном году");
					}
				} else {
					throw new CalendarException("Некорректный месяц");
				}
			}

		} else {
			throw new CalendarException("Некорректный год");

		}

		this.holiday = holiday;
	}

	public void setMonth(int month) throws CalendarException {
		if (month > 0 && month <= 12) {
			this.month = month;
		} else {
			throw new CalendarException("Некорректный месяц");
		}
	}

	public void setHoliday(String holiday) {
		this.holiday = holiday;
	}

	public void setYear(int year) throws CalendarException {

		if (year > 0 && year < 3000) {
			this.year = year;
		} else {
			throw new CalendarException("Некорректный год");
		}
	}

	public InfoDay() {

	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) throws CalendarException {
		if (this.getYear() % 4 == 0 && (this.getYear() % 100 != 0 || this.getYear() % 400 == 0)) {
			if (this.getMonth() == 2 && (day > 0 && day <= 29)) {
				this.day = day;
			} else {
				throw new CalendarException("Некорректный день в ВИСОКОСНОМ году");
			}
		} else {
			if (this.getMonth() == 1 || this.getMonth() == 3 || this.getMonth() == 5 || this.getMonth() == 7
					|| this.getMonth() == 8 || this.getMonth() == 10
					|| this.getMonth() == 12 && (day > 0 && day <= 31)) {
				this.day = day;

			} else if (this.getMonth() == 4 || this.getMonth() == 6 || this.getMonth() == 9
					|| this.getMonth() == 11 && (day > 0 && day <= 30)) {
				this.day = day;
			} else if (this.getMonth() == 2 && (day > 0 && day <= 28)) {
				this.day = day;
			} else {
				throw new CalendarException("Некорректный день в невисокосном году");
			}

		}

		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public String getHoliday() {
		return holiday;
	}

	@Override
	public String toString() {
		return "InfoDay [day=" + day + ", month=" + month + ", year=" + year + ", holiday=" + holiday + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + ((holiday == null) ? 0 : holiday.hashCode());
		result = prime * result + month;
		result = prime * result + year;
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
		InfoDay other = (InfoDay) obj;
		if (day != other.day)
			return false;
		if (holiday == null) {
			if (other.holiday != null)
				return false;
		} else if (!holiday.equals(other.holiday))
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

}
