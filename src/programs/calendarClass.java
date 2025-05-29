package programs;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class calendarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yy hh:mm:ss");
		System.out.println(sdf.format(c.getTime()));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
	}

}
