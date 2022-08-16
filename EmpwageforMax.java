public class EmpwageforMax {
//    public static final int IsFulltime =2;
//    public static final int IsParttime =1;
//    public static final int Emp_Rate =200;
//    public static final int Emp_max_Hours =100;
//    public static final int Emp_working_day =200;

    public static void main(String[] args) {
        int  EmpHouse=0,totalHouse=0,totalwarkingday=0;
        int Emp_Rate =200;
        int Emp_max_Hours =100;
        int Emp_working_day =200;


        while (totalHouse<=Emp_max_Hours && totalwarkingday<Emp_working_day){
            totalwarkingday++;
            int Empcheck =(int) Math.floor(Math.random()*10)%3;
//            System.out.println(Empcheck);
            switch (Empcheck){
                case 2:
                    EmpHouse=8;
                    break;
                case 1:
                    EmpHouse=4;
                    break;
                default:
                    EmpHouse=0;
            }
            totalHouse+=EmpHouse;
            System.out.println("day:" + totalwarkingday + " "+"totalhouse:" +totalHouse);
        }
         int  totalEmpWage =totalHouse*Emp_Rate;
        System.out.println("..................");
        System.out.println("Total EmpWage:" + totalEmpWage);

    }
}
