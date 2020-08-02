package day29_CustomMethods;
//   4. check eligibility to vote (age,citizen,ID)
//   5. check eligibility to buy alcohol
public class Eligibility {

    public static void main(String[] args) {
        vote("John",28,true,"Biden");
        eligibleToBuyAlcohol(true,54);
        calculator(100,'/',2000);
    }

    public static void vote(String name,int age,boolean citizen,String candidateName){
        boolean eligibleToVote = age >= 18 && citizen == true;
        if(eligibleToVote){
            System.out.println(name +" is eligible to vote for " +candidateName);
        }else{
            System.out.println(name + " is not eligible to vote for "+ candidateName);
        }

    }

    public static void eligibleToBuyAlcohol(boolean hasID,int age){
        if(hasID && age >=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are eligible to buy milk");
        }
    }

    public static void calculator(double num1,char operator,double num2){
        switch (operator){
            case '+':
                System.out.println("Addition: "+(num1+num2));
                break;
            case '-':
                System.out.println("Substraction: "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication: "+(num1*num2));
                break;
            case '/':
                System.out.println("Division: "+(num1/num2));
                break;
            case '%':
                System.out.println("Remainder: "+(num1 % num2));
                break;
            default:
                System.out.println("Invalid entry");
        }
    }

}
