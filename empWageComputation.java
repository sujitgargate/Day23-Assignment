//This is Employee Daily Wage
public class EmpDailyWage{
//This is Part_Full time  //

// This is Emp20DayWage

public class Emp20DayWage{

	 //Constants
        public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;
        public static final int EMP_RATE_PER_HOUR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	
	public static void main(String args[]){
		//Constants
		int IS_FULL_TIME=1;
		int EMP_RATE_PER_HOUR=20;
		//Variables
		int empHrs=0;
		int empWage=0;
		//COMPUTATION
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck==IS_FULL_TIME){
			empHrs=8;
		}else{
		double empCheck=Math.floor(Math.random()*10)%3;
		switch ((int)empCheck){
		
		//Variables
		int empHrs=0;
		int empWage=0;
		int totalEmpWage=0;
		for(int day=0;day<NUM_OF_WORKING_DAYS;day++){
		
>>>>>>> emp20DayWage
		
			//COMPUTATION
			double empCheck=Math.floor(Math.random()*10)%3;
			switch ((int)empCheck){

			case IS_FULL_TIME:
				empHrs=8;
				break;

			case IS_PART_TIME:
	                        empHrs=4;
				 break;

			default:
				empHrs=0;
			}
			empWage=EMP_RATE_PER_HOUR*empHrs;
			totalEmpWage+=empWage;
			System.out.println(" Employee Wage "+empWage);
		}
			System.out.println(" Total Employee Wage "+totalEmpWage);
	}
}

