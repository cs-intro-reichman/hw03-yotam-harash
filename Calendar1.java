/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0; 
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
	 	while (true) {
	 		//// Write the body of the while 		
	 		advance();
	 		debugDaysCounter++;
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		if (false) { 
	 			break;
	 		}
        }
	 	//// Write the necessary ending code here
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		
		int special=1;
		for(int i=year; i<2000; i++)
		{
			for (int j = month; j <=12; j++) {
				
				int q=dayOfMonth;
				while (q<=nDaysInMonth(j,i)) {
					
					if (q==1&&dayOfWeek==1) {
						special++;
					}
					if (dayOfWeek==1) {
						System.out.println(q + "/" +  j + "/" + i + "Sunday");
					}else{
						System.out.println(q + "/" +  j + "/" + i);
					}
					if (dayOfWeek==7) {
						dayOfWeek=1;
					}else{
						dayOfWeek++;
					}
					q++;
				}
				dayOfMonth=1;
			}

		}
		System.out.println("During the 20th century, "+ special + " Sundays fell on the first day of the month");
	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    return (year%4==0);
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		if (month==1 ) {
			return 31;
		}
		if (month==2&&isLeapYear(year)) {
			return 29;
		}
		if (month==2&&!(isLeapYear(year))) {
			return 28;
		}
		if (month==3) {
			return 31;
		}
		if (month==4) {
			return 30;
		}
		if (month==5) {
			return 31;
		}
		if (month==6) {
			return 30;
		}
		if (month==7 ) {
			return 31;
		}
		if (month==8) {
			return 31;
		}
		if (month==9 ) {
			return 30;
		}
		if (month==10) {
			return 31;
		}
		if (month==11 ) {
			return 30;
		}
		return 31;
		
	}
}