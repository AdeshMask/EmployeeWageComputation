import java.util.Random;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int HALF_DAY_HOURS = 4;
    static final int IS_PART_TIME = 0;
    static final int IS_FULL_TIME = 1;
    public static void main(String[] args){
        Random random = new Random();
        int wagePerDay = 0;
        int attendance = (int)Math.floor(Math.random()*10)%3;
        switch (attendance){
            case IS_FULL_TIME -> {
                System.out.println("Employee is Present..");
                wagePerDay = WAGE_PER_HOUR * FULL_DAY_HOUR;
                System.out.println(wagePerDay);
                break;
            }
            case IS_PART_TIME -> {
                System.out.println("Employee is Present for the Half Day...");
                wagePerDay = WAGE_PER_HOUR * HALF_DAY_HOURS;
                System.out.println(wagePerDay);
                break;
            }
            default -> {
                System.out.println("Employee is Absent for the  Day...");

            }
        }

    }
}
