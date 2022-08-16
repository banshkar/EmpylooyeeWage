public class EmpPart {
    public static void main(String[] args) {
        int isFullTime = 2;
        int isPartTime = 1;
        int Empwage = 0;
        int EmHour = 0;
        int Emp_Rate_per_dar=20;
        double EmpCheck = Math.floor(Math.random() * 10) % 3;
        if (isPartTime == EmpCheck) {
            EmHour = 4;
            Empwage=Empwage+(EmHour*Emp_Rate_per_dar);
            System.out.println("The Employee Wage is part time:" +Empwage);
        }
        else if (isFullTime == EmpCheck) {
            EmHour = 8;
            Empwage=Empwage+(EmHour*Emp_Rate_per_dar);
            System.out.println("The Employee Wage is Full time:" +Empwage);
        } else {
            EmHour = 0;
            Empwage=Empwage+(EmHour*Emp_Rate_per_dar);
            System.out.println("The Employee Wage is absent:" +Empwage);
        }
    }
}