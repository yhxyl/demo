package org.runtime.demo.test;


/**
 * 编写一个能将给定非负数整数列表中数字排列成最大数字的函数
 */
public class Question4 {

	public static void main(String[] args) {

		int[] nums = new int[]{1,201,32,4,5};
		
		doJoin(nums);
		
	}
	
	public static void doJoin(int[] nums){
		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if(getFirstNum(nums[i])<getFirstNum(nums[j])){
					nums[i] = nums[i] + nums[j];
					nums[j] = nums[i] - nums[j];
					nums[i] = nums[i] - nums[j];
				}
			}
		}
		
		for(int num : nums){
			System.out.print(num);
		}
	}
	
	public static int getFirstNum(int num){
		int result = num;
		if(num>10){
			for(int i=0;i<(result+"").length();i++){
				result = result/10;
			}
		}
		return result;
	}
}
