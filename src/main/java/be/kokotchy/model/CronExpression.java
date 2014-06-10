package be.kokotchy.model;

import be.kokotchy.model.fields.*;

/**
 * Created by kokotchY on 10/6/2014.
 */
public class CronExpression {

	private String cronExpression;

	private Seconds secondsField;
	private Minutes minutesField;
	private Hours hoursField;
	private DayMonth dayMonthField;
	private Month monthField;
	private DayWeek dayWeekField;
	private Year yearField;

	public CronExpression() {
		secondsField = new Seconds();
		minutesField = new Minutes();
		hoursField = new Hours();
		dayMonthField = new DayMonth();
		monthField = new Month();
		dayWeekField = new DayWeek();
		yearField = new Year();
	}

	public String getCronExpression() {
		return String.format("%s %s %s %s %s %s %s", secondsField.getValue(), minutesField.getValue(),
				hoursField.getValue(), dayMonthField.getValue(), monthField.getValue(), dayWeekField.getValue(),
				yearField.getValue()).trim();
	}
}
