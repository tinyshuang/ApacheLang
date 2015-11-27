package test;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * @author Administrator
 * @description
 *2015-5-9  下午5:23:19
 */
public class StringsUtil {
    public static void main(String[] args) {
	random();
    }
    
    
    /**
     * @description 测试是否为空字符串或者为null	
     *2015-5-9  下午5:36:35
     *返回类型:void
     */
    public static void isEmpty(){
	System.out.println(StringUtils.isEmpty(null));		//true
	System.out.println(StringUtils.isEmpty(""));		//true
	System.out.println(StringUtils.isEmpty(" "));		//false
	System.out.println(StringUtils.isEmpty("b"));		//false
    }
    
    
    /**
     * @description 测试是否有有效字符	
     *2015-5-9  下午5:37:00
     *返回类型:void
     */
    public static void isBlank(){
	System.out.println(StringUtils.isBlank(null));		//true
	System.out.println(StringUtils.isBlank(""));		//true
	System.out.println(StringUtils.isBlank(" "));		//true
	System.out.println(StringUtils.isBlank("b"));		//false
    }
    
    /**
     * @description 关于字符串的切割
     * 	split是清除空字符的
     *  splitPreserveAllTokens是包含空字符的
     *  split(str,sep,max)可以指定分割的最大次数
     *2015-5-9  下午5:46:22
     *返回类型:void
     */
    public static void split(){
	String str = "a,,b,,c";
	System.out.println("StringUtils的split是清除空字符 : " + StringUtils.split(str, ",").length);
	System.out.println("StringUtils的splitPreserveAllTokens是包含空字符 : "+StringUtils.splitPreserveAllTokens(str, ",").length);
	String string = "a,b,c,d,e";
	System.out.println("指定分割的最大次数（超过后不分割）");
	String[] value = StringUtils.split(string, ",", 2);
	System.out.println("value有多少个值 : " + value.length);
	System.out.println("切割后的最后一个值 :" + value[1]);
    }
    
    /**
     * @description 拼接List或者数组的值到一个字符串里面	
     *2015-5-9  下午6:03:24
     *返回类型:void
     */
    public static void append(){
	String[] value = {"a","b","c"};
	System.out.println("拼接数组的值 : " + StringUtils.join(value, ","));
	List<String> list = Arrays.asList(value);
	System.out.println("拼接List的值 : " + StringUtils.join(list, ","));
    }
    
    /**
     * @description 返回随机数	
     *2015-5-9  下午6:05:13
     *返回类型:void
     */
    public static void random(){
	// 10位英字  
	System.out.println(RandomStringUtils.randomAlphabetic(10)); //这里是包括大小写字母的 
	// 10位英数  
	System.out.println(RandomStringUtils.randomAlphanumeric(10));  
	//10位数字
	System.out.println(RandomStringUtils.randomNumeric(10));
	// 10位ASCII码  
	System.out.println(RandomStringUtils.randomAscii(10));  
	// 指定文字10位  
	System.out.println(RandomStringUtils.random(10, "abcde"));  
    }
}
