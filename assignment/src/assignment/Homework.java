package assignment;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] weight = new double[4];
		for (int i = 0; i < 4; i++) {
			System.out.print("몸무게를 입력하시오 : ");
			weight[i] = sc.nextDouble();
		}
		double max = 0;
		double min = 1000;
		double sum = 0;
		for (int i = 0; i < 4; i++) {

			if (max < weight[i]) {
				max = weight[i];
			} else if (min > weight[i]) {
				min = weight[i];
			}
			sum += weight[i];
		}
		double average = sum / 4;
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		System.out.println("합 : "+sum);
		System.out.println("평균 : "+average);
		
	}
}
