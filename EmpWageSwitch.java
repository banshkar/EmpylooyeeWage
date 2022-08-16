public class EmpWageSwitch {


    public static void main(String[] args) {
        int EmpHou=0;
        int EmpWage=0;
        int EmP_Rate_perDay=200;
        int EmpCheck = (int)Math.floor(Math.random()*10)%3;

        switch(EmpCheck){
            case 2:
                EmpHou=8;
                break;
            case 1:
                EmpHou=4;
                break;
            default:
                EmpHou=0;
        }
        EmpWage =EmpWage+(EmpHou*EmP_Rate_perDay);
        System.out.println("Total EmpWage : "+EmpWage);

    }
}
