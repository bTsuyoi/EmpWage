public class EmpWageBuilder {

	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 5;
	public static final int MAX_HRS_IN_MONTH = 10;
	public static int empHrs = 0;
	public static int empWage = 0;

	public static int findEmpWage() {
		empWage =  empHrs * EMP_RATE_PER_HOUR;
        return empWage;
    }

	public static void main(String[] args) {

		int totalEmpWage =0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		while (totalEmpHrs <= MAX_HRS_IN_MONTH &&
				totalWorkingDays < NUM_OF_WORKING_DAYS) {

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
			totalEmpWage += findEmpWage();
			System.out.println("Emp Wage: " + findEmpWage());
		}
		System.out.println("Total Emp Wage: " + totalEmpWage);
	}
}
