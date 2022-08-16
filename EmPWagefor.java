public class EmPWagefor {

    public static void main(String[] args) {
        int  EmpHour, Empwage,totalEmp=0;
         int Emp_Rate_per_day=20;
        int Emp_number_of_day=30;

        for(int day=1; day<=Emp_number_of_day; day++){

            int Empcheck =(int) Math.floor(Math.random()*10)%3;

            switch (Empcheck){
                case 2:
                    EmpHour=8;
                    break;
                case 1:
                    EmpHour=4;
                    break;
                default:
                    EmpHour=0;
            }
            Empwage=(EmpHour*Emp_Rate_per_day);
            totalEmp=totalEmp+Empwage;
            System.out.println("EmplWage:"+day+ "="+Empwage);

        }
        System.out.println();
        System.out.println("Total EmplWage per Month:" + totalEmp);

    }
}
