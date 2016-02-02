

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;


public class Publisher_subscriber {
	
	public static void main(String[] args) {
		
		String data;
		String current_date;

		Scanner scanInput = new Scanner(System.in);
		data= scanInput.nextLine();
		scanInput.close();       
		
		DateFormat formatter = new SimpleDateFormat("MM/dd/yy h:mm a");
		//Date date = (Date)formatter.parse(date);
		
		
		 current_date= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());

		
		if(data!=null)
		{
		
		//System.out.println(data);
		
		
		System.out.println("Message from Subscriber: "+data+ "\n Message Recived on : " +current_date);
		 
		}
        
	    
		
		
		
		
		}


}
