package org.runtime.demo.test;


/**
 * 使用for循环、while循环、递归写出3个函数来计算给定数列的总和
 */
public class Question1 {

	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,4,5};
		
		System.out.println("for:"+doSum(nums));
		System.out.println("while:"+doSum2(nums));
		System.out.println("递归:"+doSum3(0,nums));
		
	}
	
	// for
	public static int doSum(int[] nums){
		int sum = 0;
		for(int num : nums){
			sum = sum(sum, num);
		}
		return sum;
	}

	// while
	public static int doSum2(int[] nums){
		int sum = 0;
		int index = 0;
		while(index < nums.length){
			sum = sum(sum, nums[index++]);
		}
		return sum;
	}
	
	// 递归
	public static int doSum3(int index, int[] nums){
		if(index < nums.length-1){
			return sum(nums[index++], doSum3(index,nums));
		}else{
			return nums[index];
		}
	}
	
	// 求和函数
	public static int sum(int num1, int num2){
		return num1+num2;
	}
	
}
