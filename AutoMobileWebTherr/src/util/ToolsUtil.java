package util;

import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 工具类
 * @author Administrator
 *
 */
public class ToolsUtil {
	/**
	 * 日期时间的格式转换，转换后，日期格式为YY-MM-dd HH:mm:SS
	 * @param datetime 时间格式
	 * @return 格式化后的日期时间
	 */
	public static String datetimeFormaat(String datetime){
		
		try {

			  DateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US);    
			  DateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm", Locale.US);   
			  Date date = inputFormat.parse(datetime);         
			  return outputFormat.format(date);
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
	
	
	public static String datetimeFormaa(String datetime){
		DateFormat df= new SimpleDateFormat("yyyy-MM-dd");
		Date date;
		try {
			date = df.parse(datetime);
			String s = df.format(date);
			return s;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return datetime;
	}
	
	
	public static String datetimeFormaaa(String datetime){
		DateFormat df= new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date date;
		try {
			date = df.parse(datetime);
			String s = df.format(date);
			return s;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return datetime;
	}
	
	
	
	
	/**
	 * 格式化时间字符串
	 * @param Date 一个包含有完整时间信息的Date类型的对象
	 * @return String 格式化后的字符串，包含日期和时间如:"2019-3-17 14:20:10"
	 */
	public static String tranDate2datetime(Date d){
		Format f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = f.format(d);
		return s;		
	}
}
