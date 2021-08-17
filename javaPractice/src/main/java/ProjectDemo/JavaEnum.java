package ProjectDemo;

public enum JavaEnum {
	
	public static void main(String[] args) {

        Day myDay = DayOfWeek.FRIDAY;
        System.out.println(myDay);	//print a day from the enum
}
}

enum DayOfWeek {

	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY

}
