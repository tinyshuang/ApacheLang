package test;

import java.util.Arrays;
import java.util.Objects;

import org.apache.commons.lang3.ArrayUtils;

/**
 * @author Administrator
 * @description
 *2015-5-9  下午6:19:41
 */
public class ArrayUtil {
    public static void main(String[] args) {
	reverse();
    }
    
    /**
     * @description 在数组末尾添加值	
     *2015-5-9  下午6:29:21
     *返回类型:void
     */
    public static void append(){
	//追加元素到末尾
	int[] num = {1,2};
	num  = ArrayUtils.add(num, 3); //必须重新赋值给num
	System.out.println(Arrays.toString(num));
    }
    
    
    /**
     * @description 删除数组指定位置的值	
     *2015-5-9  下午6:31:22
     *返回类型:void
     */
    public static void remove(){
	int[] num = {1,2,3,4,5,6};
	num  = ArrayUtils.remove(num, 2);
	num  = ArrayUtils.removeElement(num, 6);
	System.out.println(Arrays.toString(num));
    }
    
    /**
     * @description 截取数组的指定位置的值	
     * statr包括,end不包括
     *2015-5-9  下午6:35:00
     *返回类型:void
     */
    public static void sub(){
	int[] num = {1,2,3,4,5,6};
	num = ArrayUtils.subarray(num, 1, 4);
	System.out.println(Arrays.toString(num));
    }
    
    /**
     * @description 是深拷贝数组	
     *2015-5-9  下午6:56:29
     *返回类型:void
     */
    public static  void copy(){
	String[] value = {"a","b","c","d"};
	String[] copy = ArrayUtils.clone(value);
	copy[1] = "1";
	System.out.println(value[0] + copy[1] );
    }
    
    /**
     * @description 判断数组是否含有某个字符	
     *2015-5-9  下午7:04:27
     *返回类型:void
     */
    public static void contain(){
	String[] value = {"a","b","c","d"};
	System.out.println(ArrayUtils.contains(value, "w"));
    }
    
    /**
     * @description 判断某元素在数组中出现的位置	
     *2015-5-12  上午9:28:51
     *返回类型:void
     */
    public static void indexof(){
	String[] value = {"a","b","c","d"};
	int index = ArrayUtils.indexOf(value, "c");
	System.out.println(index);
    }
    
    /**
     * @description 返回某元素在数组中最后一个元素的下标	
     *2015-5-12  上午9:36:26
     *返回类型:void
     */
    public static void lastindexof(){
	String[] value = {"a","b","c","d","a","c"};
	int index = ArrayUtils.lastIndexOf(value, "a");
	System.out.println(index);
    }
    
    /**
     * @description 测试数组是否为空	
     *2015-5-12  上午9:37:13
     *返回类型:void
     */
    public static void isEmpty(){
	String[] b = null;
	String[] value = {};
	String[] a = {"a"};
	System.out.println("测速null数组 : "+ArrayUtils.isEmpty(b));
	System.out.println("测试{}数组 : " + ArrayUtils.isEmpty(value));
	System.out.println("测试非空数组" + ArrayUtils.isNotEmpty(a));
    }
    
    /**
     * @description 判断两个数组是否相等	
     *2015-5-12  上午9:40:51
     *返回类型:void
     */
    public static void isEqual(){
	String[] a = {"a","b","c"};
	String[] b = {"a","b","c"};
	System.out.println(Objects.deepEquals(a, b));
    }
    
    /**
     * @description 反转数组	
     *2015-5-12  上午11:15:30
     *返回类型:void
     */
    public static void reverse(){
	String[] value = {"a","b","c","d"};
	ArrayUtils.reverse(value);
	System.out.println(Arrays.toString(value));
    }
    
    
}
