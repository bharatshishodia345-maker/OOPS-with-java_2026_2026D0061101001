import java.util.*;

public class AgeValidation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int a = sc.nextInt();
        try{
            checkAge(a);
        }
        catch(AgeInvalidExceptation e){
            System.out.println(e);

        }
        finally{
            sc.close();
        }
        
    }
    static void checkAge(int age) throws AgeInvalidExceptation{
        if(age<18) throw new AgeInvalidExceptation("Age is not valid to vote");
        System.out.println("Eligible to vote");
    }
}

class AgeInvalidExceptation extends  Exception{
    AgeInvalidExceptation(String msg){
        super(msg);
    }
}