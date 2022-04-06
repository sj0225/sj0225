package day3.com.capg;
class OnlyPositiveNumber extends Exception {
    OnlyPositiveNumber(String msg) {
        super(msg);
    }
}
class Sum {

    public int add(int a, int b) throws OnlyPositiveNumber {
        if (a > 0 && b > 0) {
            System.out.println(a + b);
        } else {
            throw new OnlyPositiveNumber("Enter Positive Number");
        }
        return a+b;
    }
}
public class MyChainException {
    public static void main(String[] args) throws OnlyPositiveNumber{  
            callingMEthod();   
    }
    public static void callingMEthod() throws OnlyPositiveNumber
    {
        Sum sum=new Sum();
        int num=sum.add(10, 20);
        //result
        //exception
    }
}
 
//add()--> callingMEthod()-->main-->JVM

 

//if use try/catch ---handling the exception
//if use throws -- sending the exception object to calling method
                //What ever exception is throws by method needs to handle at some point