package com.basicsstrong.fundamentals.flowcontrol;

public class FlowControl {

	public static void main(String[] args) {
		int val = 25;
		int yearsOfWorkingExperience = 1;
		if(val<=30) {
			System.out.println("val<=30");
		} else if (val > 30 && val <= 70) {
			System.out.println("val > 30 && val <= 70");
		} else {
			System.out.println("else");
		}
		
		switch(yearsOfWorkingExperience){
        case 0:
          System.out.println("Fresher");
          break;
        case 1:
          System.out.println("Junior Developer");
          break;
        case 2:
          System.out.println("Developer");
        case 3:
          System.out.println("Senior Developer");
        break;
      }
	}

}
