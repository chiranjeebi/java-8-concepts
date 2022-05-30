package com.mycompany.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateTimeOne {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		LocalDate localdate = LocalDate.now();
		System.out.println(localdate);

		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);

		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

		System.out.println(localdate.getDayOfMonth());
		System.out.println(localdate.getMonthValue());
		System.out.println(localdate.getYear());

		System.out.println(localdate.getDayOfWeek());
		System.out.println(localTime.getHour());
		System.out.println(localTime.getMinute());
		System.out.println(localTime.getSecond());

		LocalDateTime futureTDateTime = LocalDateTime.of(2080, 5, 5, 12, 12);
		System.out.println(futureTDateTime);

	}
}
