package test;

import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

/**
 * @author Administrator
 * @description
 *2015-5-12  上午9:49:07
 */
public class DateUtil {
    public static void main(String[] args) {
	equal();
    }
    
    /**
     * @description 将字符串转换为日期	
     *2015-5-12  上午9:53:55
     *返回类型:void
     */
    public static void parse(){
	Date date;
	try {
	    date = DateUtils.parseDate("2014-12-12", "yyyy-MM-dd");
	    System.out.println(format(date));
	} catch (ParseException e) {
	    e.printStackTrace();
	}
    }
    
    /**
     * @description 关于时间的计算	
     *2015-5-12  上午10:36:43
     *返回类型:void
     */
    public static void count(){
	Date date = new Date();
	Date before = DateUtils.addDays(date, -10);//负数表示过去
	Date after  = DateUtils.addDays(date, 3);  //正数表示未来
	Date week = DateUtils.addWeeks(date, 3);
	Date hour = DateUtils.addHours(date, 5);
	System.out.println("测试addDate添加负数 : " + format(before));
	System.out.println("测试addDate添加正数 : " + format(after));
	System.out.println("测试添加周数 : " + format(week) );
	System.out.println("测试小时数 : " + hour);
    }
    
    /**
     * @description 判断是否是同一天	
     *2015-5-12  上午10:37:39
     *返回类型:void
     */
    public static void equal(){
	Date date1 = new Date();
	Date date2 = new Date();
	System.out.println(DateUtils.isSameDay(date1, date2));
	
    }
    
    
    /**
     * @description 格式化日期	
     *2015-5-12  上午10:26:45
     *返回类型:String
     */
    public static String format(Date date){
	String pattern = "yyyy-MM-dd";
	return DateFormatUtils.format(date, pattern);
    }
}
