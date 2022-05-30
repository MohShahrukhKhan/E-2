package com.masai;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		//Write logic to get numberOfPassenger and numberOfKms
       System.out.println("Enter numberOfPassenger ");
       int numberOfPassenger=sc.nextInt();
		int numberOfKms=sc.nextInt();
		OLA myOla = new OLA();
		Car myCar = myOla.bookCar(numberOfPassenger, numberOfKms);
		int res = myOla.calculateBill(myCar);

		System.out.println("The total fare amount is"+ res);
	}

}
