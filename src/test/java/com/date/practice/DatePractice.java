package com.date.practice;

import java.time.Clock;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

import org.junit.Test;

public class DatePractice {

	@Test
	public void createDate() {
		Date date1 = new Date();
		System.out.println(date1);

		java.sql.Date date2 = new java.sql.Date(2019, 1, 4);
		System.out.println(date2);

		LocalDate date3 = LocalDate.now();
		System.out.println(date3);

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
	}

	@Test
	public void clock() {
		Clock clock = Clock.systemUTC();
		System.out.println("instance : " + clock.instant());
		System.out.println("Time in milli : " + clock.millis());
		System.out.println("Zone : " + clock.getZone());
	}

	@Test
	public void clockLocalDate() {
		Clock clock1 = Clock.systemUTC();
		LocalDateTime dateTime = LocalDateTime.now(clock1);
		System.out.println(dateTime);

		LocalDate localDate = LocalDate.now(clock1);
		System.out.println(localDate);

		LocalTime localTime = LocalTime.now(clock1);
		System.out.println(localTime);

		System.out.println("========================");

		Clock clock2 = Clock.systemDefaultZone();
		LocalDateTime dateTime2 = LocalDateTime.now(clock2);
		System.out.println(dateTime2);

		LocalDate localDate2 = LocalDate.now(clock2);
		System.out.println(localDate2);

		LocalTime localTime2 = LocalTime.now(clock2);
		System.out.println(localTime2);
	}

	@Test
	public void zonedDateTime() {
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);

		Clock clock = Clock.systemUTC();
		ZonedDateTime zonedDateTime2 = ZonedDateTime.now(clock);
		System.out.println(zonedDateTime2);

		ZonedDateTime zonedDateTime3 = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println(zonedDateTime3);
	}

	@Test
	public void duration() {
		LocalDate date = LocalDate.of(2019, 01, 01);
		LocalTime time = LocalTime.of(12, 12);
		LocalDateTime startInclusive = LocalDateTime.of(date, time);
		LocalDateTime endExclusive = LocalDateTime.now();
		Duration duration = Duration.between(startInclusive, endExclusive);
		System.out.println(duration.toDays());
		System.out.println(duration.toHours());
	}

	@Test
	public void period() {
		Period period = Period.ofDays(10);
		System.out.println(period.getDays());

		Period period2 = Period.of(3, 4, 10);
		System.out.println(period2);

		LocalDateTime dateTime = LocalDateTime.now();

		// Period period3=Period.
	}

}
