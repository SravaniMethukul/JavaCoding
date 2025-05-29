package programs;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("M/d/yy hh:mm.ss");
		System.out.println(sdf.format(d));
		System.out.println(sdf1.format(d));
	}

}
