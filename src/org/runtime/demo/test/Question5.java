package org.runtime.demo.test;

/**
 * 编写一个1,2，....，9（顺序不变）数字之间插入+或者-或者什么都不插入，使得计算结果总和是100的程序，并输出所有可能性
 */
public class Question5 {

	public static void main(String[] args) {
		int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
		doJoin("1","1",1,1,nums);
	}

	public static void doJoin(String formula, String lastNum, int result, int index, int[] nums) {
		
		if(index < nums.length){
			
			doJoin(formula+"+"+nums[index],"+"+nums[index],sum(result,nums[index]),index+1,nums);
			doJoin(formula+"-"+nums[index],"-"+nums[index],sub(result,nums[index]),index+1,nums);
			doJoin(formula+""+nums[index],lastNum+nums[index],and(result,lastNum,nums[index]),index+1,nums);
			
		}else{
			if(result==100){
				System.out.println(formula+"=100");
			}
		}
		
	}
	
	public static int sum(int num1, int num2){
		return num1+num2;
	}
	
	public static int sub(int num1, int num2){
		return num1-num2;
	}
	
	// 串，这里需要在结果中减去上一次加上的数字，再将结果与本次的串起来再求和得到新的结果
	// 比如1+2要变成1+23要看成3-2+23，因为1+2在与3做串连时2是已经加在结果中去了的
	public static int and(int num1,String lastNum, int num2){
		return sum(sub(num1,Integer.valueOf(lastNum)),Integer.valueOf(lastNum+num2).intValue());
	}
}
