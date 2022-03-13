import java.util.Random;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int HALF_DAY_HOURS = 4;
    static final int IS_PART_TIME = 0;
    static final int IS_FULL_TIME = 1;
    static final int WORKING_DAYS_PER_MONTH = 20;
   // static final int WORKING_HOURS_PER_MONTH = 100;

    public static void main(String[] args){
        double totalWorkinDays = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;
        for (int i = 1;i <= WORKING_DAYS_PER_MONTH;i++){
            int attendance = (int)Math.floor(Math.random()*10)%3;
            int wagePerDay = 0;
                switch (attendance) {
                    case IS_FULL_TIME:
                        System.out.print(i+" "+"Wages of Present day..");
                        wagePerDay = WAGE_PER_HOUR * FULL_DAY_HOUR;
                        totalWorkingHours = totalWorkingHours + FULL_DAY_HOUR;
                        System.out.println(wagePerDay);
                        totalWorkinDays = totalWorkinDays + 1;
                        break;
                    case IS_PART_TIME:
                        System.out.print(i+" "+"Wages of Half Day...");
                        wagePerDay = WAGE_PER_HOUR * HALF_DAY_HOURS;
                        totalWorkingHours = totalWorkingHours + HALF_DAY_HOURS;
                        System.out.println(wagePerDay);
                        totalWorkinDays = totalWorkinDays + 0.5;
                        //System.out.println(wagePerDay);
                        break;
                    default:
                        System.out.println(i+" "+"Employee was Absent..");
                        totalWorkingHours = totalWorkingHours + wagePerDay;
                }
            totalWage = totalWage + wagePerDay;
        }
        System.out.println();
        System.out.println("Total Present days: "+totalWorkinDays);
        System.out.println("Total Working Hours: "+totalWorkingHours);
        System.out.println("Total Employee wages for the month: "+totalWage);
    }
}
