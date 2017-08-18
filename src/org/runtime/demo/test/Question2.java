package org.runtime.demo.test;


/**
 * 编写一个交错合并列表元素的函数
 */
public class Question2 {

	public static void main(String[] args) {

		String[] arr1 = new String[]{"s","2","f","3","1"};
		String[] arr2 = new String[]{"s","2","f","3","1"};
		doJoin(arr1,arr2);
		
	}
	
	public static String[] doJoin(String[] arr1, String[] arr2){
		String[] result = new String[arr1.length+arr2.length];
		
		for(int i=0;i<arr1.length+arr2.length;i++){
			if(i%2==0){
				result[i] = arr1[i/2];
			}else{
				result[i] = arr1[i/2];
			}
			System.out.println(result[i]);
		}
		
		return result;
	}
	
}
