<<<<<<< HEAD
//This is Employee Daily Wage
public class EmpDailyWage{
//This is Part_Full time  //
=======
//This is Class refactorization code
>>>>>>> codeRefactorization


public class empTotalWage
{
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
		
			//COMPUTATION
			double empCheck=Math.floor(Math.random()*10)%3;
			switch ((int)empCheck){

	public static final int MAX_HRS_IN_MONTH=100;

public static void main(String[ ] args)
{
	//variables
	int empHrs = 0;
	int empWage = 0;
	int totalEmpWage = 0, totalWorkingDays=0, totalEmpHrs=0;
	while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
	{
		totalWorkingDays++;
		int empCheck =(int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck)
		{
>>>>>>> limitReachedTo100Hrsand20Days
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
		}
		totalEmpHrs += empHrs;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		totalEmpWage += empWage;
		System.out.println("Employee Wage : "+empWage);
	}
	System.out.println("Total Employee Wage: "+totalEmpWage);
	}
}

<<<<<<< HEAD
=======

///This is end of Class refactorization code
>>>>>>> codeRefactorization
