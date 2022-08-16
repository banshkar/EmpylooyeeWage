import java.util.Random;

public class CheckEmp {
    public static void main(String[] args) {
        double checkemp =Math.floor(Math.random()*10%2);
        if(checkemp ==1){
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }
}
