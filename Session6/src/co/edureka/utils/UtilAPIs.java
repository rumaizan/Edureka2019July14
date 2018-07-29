package co.edureka.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UtilAPIs {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Age: ");
		int age = scanner.nextInt();
		
		if(age>=18){
			System.out.println("You Can Vote");
		}else{
			System.out.println("You Cannot Vote");
		}
		
		scanner.close();
		
		Date date = new Date();
		System.out.println("Today is: "+date);
		
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		String formattedDate = sdf.format(date);
		
		System.out.println("Today's Date is: "+formattedDate);
		
		Calendar calendar = Calendar.getInstance();
		
		int dd = calendar.get(Calendar.DAY_OF_MONTH);
		int mm = calendar.get(Calendar.MONTH); // 0-11 (0 is Jan and 11 is Dec)
		int yy = calendar.get(Calendar.YEAR);
		
		int hh = calendar.get(Calendar.HOUR_OF_DAY);
		int mi = calendar.get(Calendar.MINUTE);
		int ss = calendar.get(Calendar.SECOND);
		
		System.out.println(hh+":"+mi+":"+ss);
		System.out.println(dd+"/"+(mm+1)+"/"+yy);
		
	}

}
