import java.util.Scanner;

class Simplecalculator{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Value-01");
        int a=in.nextInt();
        System.out.println("Enter the value-02");
        int b=in.nextInt();
    System.out.println("Calculator");
    System.out.println("1.Additon");
    System.out.println("2.Subtraction");
    System.out.println("3.Multiplication");
    System.out.println("4.Division");
    System.out.println("5.Modulus");
    System.out.println("6.Square");
    System.out.println("7.cube");
    System.out.println("8.Square Root");
    System.out.println("9.power");
    System.out.println("10.percentage");
    System.out.println("11.Factorial");
    System.out.println("12.Perform All Opertaion");
    System.out.println("13.Exit");
    System.out.println("Enter the choice");
    int choice=in.nextInt();
    switch(choice)
    {
        case 1: 
            int c=a+b;
            System.out.println("Additon of two number is:"+c);
            break;
        case 2:
            int d=a-b;
            System.out.println("Subtraction of two number is:"+d);
            break;
        case 3:
            int e=a*b;
            System.out.println("Multiplication of two number is:"+e);  
            break;
        case 4:
            if(b==0){
                System.out.println("Division Not Possible");
            }else{
                int f=a/b;
            System.out.println("Division of number is:"+f);
            }
            break;
        case 5:
            int g=a%b;
            System.out.println("Modulus of two number is"+g);
            break;
        case 6:
            System.out.println("The Square of Value 1 is"+a*a);
            System.out.println("The sqaure of value 2 is"+b*b);
            break;
        case 7:
           System.out.println("The cube of Value 1 is"+a*a*a);
            System.out.println("The cube of value 2 is"+b*b*b);   
            break;
        case 8:
            int value01=(int)Math.sqrt(a);
            int value02=(int)Math.sqrt(b);
            System.out.println("Square root of value 01 is:"+value01);
            System.out.println("square root of value 02 is"+value02);
            break;
        case 9:
            double h=Math.pow(a, b);
            System.out.println("The Power Of Number is"+h);
            break;
        case 10:
             if(b==0){
                System.out.println("Division Not Possible");
            }else{
            int i=(a/b)*100; 
            System.out.println("Percentage is"+i);
            }
            break;
        case 11:
            int factval01=1;
            for(int m=1;m<=a;m++){
                factval01=factval01*m;
            }
            System.out.println("Factorial of value-01:"+factval01);
             int factval02=1;
            for(int n=1;n<=b;n++){
                factval02=factval02*n;
            }
            System.out.println("Factorial of value-01:"+factval02); 
            break;
        case 12:
                for(int o=1;o<=11;o++){
                    switch(o){
                        case 1: 
            int val1=a+b;
            System.out.println("Additon of two number is:"+val1);
            break;
        case 2:
            int val2=a-b;
            System.out.println("Subtraction of two number is:"+val2);
            break;
        case 3:
            int val3=a*b;
            System.out.println("Multiplication of two number is:"+val3);  
            break;
        case 4:
            if(b==0){
                System.out.println("Division Not Possible");
            }else{
                int f=a/b;
            System.out.println("Division of number is:"+f);
            }
            break;
        case 5:
            int val4=a%b;
            System.out.println("Modulus of two number is"+val4);
            break;
        case 6:
            System.out.println("The Square of Value 1 is"+a*a);
            System.out.println("The sqaure of value 2 is"+b*b);
            break;
        case 7:
           System.out.println("The cube of Value 1 is"+a*a*a);
            System.out.println("The cube of value 2 is"+b*b*b);   
            break;
        case 8:
            int val5=(int)Math.sqrt(a);
            int val6=(int)Math.sqrt(b);
            System.out.println("Square root of value 01 is:"+val5);
            System.out.println("square root of value 02 is"+val6);
            break;
        case 9:
            double val7=Math.pow(a, b);
            System.out.println("The Power Of Number is"+val7);
            break;
        case 10:
             if(b==0){
                System.out.println("Division Not Possible");
            }else{
            int i=(a/b)*100; 
            System.out.println("Percentage is"+i);
            }
            break;
        case 11:
            int factval8=1;
            for(int m=1;m<=a;m++){
                factval8=factval8*m;
            }
            System.out.println("Factorial of value-01:"+factval8);
             int factval9=1;
            for(int n=1;n<=b;n++){
                factval9=factval9*n;
            }
            System.out.println("Factorial of value-01:"+factval9); 
            break;
                    }
                }
            break;    
        case 13:
                System.exit(0);
                break;
        default:
                System.out.println("Enter Correct Input......!");                
    }
    }
}