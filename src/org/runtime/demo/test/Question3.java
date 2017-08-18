package org.runtime.demo.test;


/**
 * 编写一个计算前100位斐波那契数的函数 0,1,1,2,3,5,8,13,21,34
 */
public class Question3 {

	public static void main(String[] args) {

		System.out.println("1:0");
		System.out.println("2:1");
		System.out.println(doSum(3,0,1));
		
	}
	
	public static double doSum(int index, double num, double sum){
		System.out.print(index+":");
		if(index < 100){
			return doSum(++index,sum,sum(num,sum));
		}else{
			return sum;
		}
	}
	
	// 求和函数
	public static double sum(double num1, double num2){
		System.out.println(num1+num2+"");
		return num1+num2;
	}
}
