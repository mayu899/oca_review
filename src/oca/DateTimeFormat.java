package oca;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d = LocalDate.of(2015, 5, 7);
		Period p = Period.of(1, 2, 3);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(f.format(d));//format takes a Date as parameter and throw exception no compile error
	}

}
