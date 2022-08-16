public class EmpWade {
    public static void main(String[] args) {

        int isFulTime=1;
        int EmpHour =0;
        int EmpWage =0;
        int Emp_Rate_per=20;
        double isEmpCheck =Math.floor(Math.random()*10)%2;
        if(isFulTime == isEmpCheck){
            EmpHour=8;
        }
        else {
            EmpHour=0;
        }
        EmpWage =EmpWage+(EmpHour*Emp_Rate_per);
        System.out.println("EmpWage per day: "+ EmpWage);
    }
}
