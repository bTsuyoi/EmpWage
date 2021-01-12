public class EmpWageBuilder {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	public static int findEmpWage(int empHrs, int Emp_Rate_Per_Hour) {
		int empWage =  empHrs * Emp_Rate_Per_Hour;
        return empWage;
    }

	public static void findTotal_EmpWage(int Emp_Rate_Per_Hour, int Max_Hrs_In_Month, int Num_Of_Working_Days, String company) {
		int empHrs = 0;
		int totalEmpWage =0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		while (totalEmpHrs <= Max_Hrs_In_Month &&
				totalWorkingDays < Num_Of_Working_Days) {

			totalWorkingDays++;

			double empCheck = Math.floor(Math.random() * 10) % 3;

			switch ((int) empCheck) {
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
			totalEmpWage += findEmpWage(empHrs, Emp_Rate_Per_Hour);
			System.out.println("Emp Wage for "+ company +" is: " + findEmpWage(empHrs, Emp_Rate_Per_Hour));
		}
		System.out.println("Total Emp Wage for "+ company + " is: "  + totalEmpWage);
	}

	public static void main(String[] args) {
		findTotal_EmpWage(500, 200, 25, "Amazon");
		findTotal_EmpWage(600, 180, 20, "Google");
		findTotal_EmpWage(400, 220, 22, "Microsoft");

	}
}


