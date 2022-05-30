package com.masai;

public class OLA {

	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		if(numberOfPassenger<=3) {
			HatchBack hatch=new HatchBack(numberOfPassenger, numberOfKMs);
		
			return hatch ;
		}else {
			Sedan Sedan=new Sedan(numberOfPassenger, numberOfKMs);
	
			return Sedan;
		}
	
		
	}
	


	public int calculateBill(Car car) {
		
		int Totalfare=car.getNumberOfKms()*car.farePerKm;
		return Totalfare;
	}
	
}
