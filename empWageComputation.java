<<<<<<< HEAD
//This is Employee Daily Wage
public class EmpDailyWage{
//This is Part_Full time  //
=======
>>>>>>> empUsingSwitchCase

//This is EmpSwitchCase

public class EmpSwitchCase{

	 //Constants
         public static final int IS_FULL_TIME=1;
         public static final int IS_PART_TIME=2;
         public static final int EMP_RATE_PER_HOUR=20;

	public static void main(String args[]){
<<<<<<< HEAD
		//Constants
		int IS_FULL_TIME=1;
		int EMP_RATE_PER_HOUR=20;
=======
>>>>>>> empUsingSwitchCase
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
		System.out.println(" Employee Wage "+empWage);
	}
}

<<<<<<< HEAD
//This is Employee daily wage end
//This is end of Part_Full time  //
=======
//This is end of EmpSwitchCase
>>>>>>> empUsingSwitchCase
