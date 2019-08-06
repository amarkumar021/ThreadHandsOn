package com.amar.learn.dateapi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneClass {

	public static void main(String[] args) {
		ZoneId zone = ZoneId.of("America/Los_Angeles");
		ZonedDateTime dateTime = ZonedDateTime.now(zone);
		System.out.printf("America LA Time : %d-%d-%d : %d:%d", dateTime.getDayOfMonth(),dateTime.getMonthValue(), dateTime.getYear(),dateTime.getHour(),dateTime.getMinute());
	}

}
