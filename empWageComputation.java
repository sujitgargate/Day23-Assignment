<<<<<<< HEAD
<<<<<<< HEAD
//This is Employee Daily Wage
public class EmpDailyWage{
//This is Part_Full time  //
=======
//This is Class refactorization code
>>>>>>> codeRefactorization
=======
>>>>>>> empWageForMuiltipleCompanies

//This is Employee Wage for muiltiple companies

public class EmpWhile{

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
	public static void calculateEmpWage(String company,int empRate,int numbOfDays,int maxHrs){
		                //Variables
                int empHrs=0,totalWorkingDays=0;
                int empWage=0;
                int totalEmpWage=0,totalEmpHrs=0;
                while(totalEmpHrs<=maxHrs &&  totalWorkingDays < numbOfDays){
                for(int day=0;day<NUM_OF_WORKING_DAYS;day++){
                        totalWorkingDays++;
                        //COMPUTATION
                        double empCheck=Math.floor(Math.random()*10)%3;
                        switch ((int)empCheck){

<<<<<<< HEAD
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
=======
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
                        totalEmpHrs+=empHrs;
                        System.out.println(" Employee Wage "+empWage);
                        System.out.println(totalWorkingDays+ " "+empHrs);
                }
                        //System.out.println(" Total Employee Wage "+totalEmpWage);
                        totalEmpWage=totalEmpHrs*empRate;
                        System.out.println(" Total Employee Wage "+ " " + " Comapny is"+ company +totalEmpWage);
        }
}

		public static void main(String args[]){
		calculateEmpWage("DMart",20,2,10);
		calculateEmpWage("Reliance",30,3,20);
		}
}

//This is end of Muiltiple Companies code
>>>>>>> empWageForMuiltipleCompanies
