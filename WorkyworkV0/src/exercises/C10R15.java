package exercises;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class C10R15 {
public static void main(String[] args) {
	Date date = new Date();


	SimpleDateFormat formatter = new SimpleDateFormat("EEEE, MMM dd yyyy h:mm:ss");
	String strDate = formatter.format(date);
	System.out.println("Current date and time: : "+strDate);
}
}
