package Code;

import java.util.Scanner;

public class anujava {
    public static void main(String [] args)
    {
        //Hello world Program
     //   System.out.println("Hello World this is from java ");
        //DATA TYPES
                     //int ,float,char,String,long,double,boolean
       // int age_$1=23;              //only _ and $ is accepted in the variable name and can't start with numbers
        /* Some More facts about integer DataType 
        >> int is 4 BYTES 1 Byte = 8 bits ,i.e = 32 bits
        >> 2^32 numbers can be stored in that 
        >> 1st bit is used to denote negative or positive numbers if 1 = - & 0=+ so the remaining number is 2^31 */
        
       // float per=75.345f; //always put f to denote it as a float otherwise its a double value
       // char Grade='A';
       // String name="Sudhanshu";
       // Boolean isvalid = false;
       // long bigNumber=8237847823648l; // same as float i.e l to end to let complier know it is a long number 
        //System.out.println(age_$1+per+name+isvalid+bigNumber+Grade); // + is used to print different DT in single line 

        //DATA TYPES EN DED */


        //Operator

        // // Arithmetic operator : +,-,/,* , %, ++ , --
        // int FirstNumber =123;
        // int SecondNumber = 234;
        // //int sum =FirstNumber/SecondNumber;
        // double sum =(double)FirstNumber/(double)SecondNumber;  // Type Casting
        // System.out.println(sum);
        // int a=12;
        // a++;
        // System.out.println(a);

    //Taking user input
        //scanner class is used to take user input
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Your Age ");
        // int age =sc.nextInt();
        // float agef=sc.nextFloat();
        // String name =sc.nextLine();
        // System.out.println(agef,age);


     // Conditional Statement 
    // >,<,>=,<=,==,!= all are conditional operator
    // int age = 12;
    // if(age > 18)
    // {
    //     System.out.println("You can vote");
    // }
    // else {
    //     System.out.println("You can't vote");

    // }

    // char grade = 'A';
    // if(grade=='A')
    // {
    //     System.out.println("Garde is good");

    // }else if(grade=='B')
    // {
    //     System.out.println("Nice work ");
    // }
    // else 
    // {
    //     System.out.println("Inavalid grade");
    // }
    

    // SWITCH CASE

    // char grade='A';
    // switch(grade)
    // {
    //     case 'A': System.out.println("Good work");
    //     break;
    //     case 'B': System.out.println("Nice work");
    //     break;
    //     default:
    //         System.out.println("wrong grade");
    // }

    // Logical Operator 
        // &&,||,!

    //    int age=12;
       
    //    if(age==18 || age==50 )
    //    {
    //        System.out.println("You can vote");
    //    }
    //    else 
    //    {
    //        System.out.println("You can't vote");
    //    }
    

    // Loops 
        //for,while,do-while
    
    // for(int i=0;i<10;i++)
    // {
    //     System.out.println("This is the "+i+" Line");
    // }
    // int i=0;
    // while(i<10)
    // {   i++;
    //     if(i==5)
    //     {
    //         continue; // skip this particular itterration 
    //     }
    //     System.out.println("This is the "+i+" Line of while loop");
    
    //  }
    // do{
    //     System.out.println(i);
    //     i++;
    // }while(i<=100);



    // Array
    // int marks[]=new int[5];
    // marks[0]=23;
    // marks[1]=12;
    // marks[2]=56;
    // marks[3]=34;
    // marks[4]=99;

    // int marks[]={23,12,56,34,99};

    

    // for(int i=0;i<marks.length;i++)
    // {
    //     System.out.println(marks[i]);
    // }

    

    // Matrix

    //int a[][]=new int[2][3];
    // int a[][]={
    //     {
    //         1,2
    //     },
    //     {
    //         3,4
    //     }
    // };
    // System.out.println(a[0][0]);

      //  System.out.println(average(3,6));
    

    // Exception Handling 
    int a[]=new int[3];
    try{
        System.out.println(a[4]);
    }catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Error should not there");
        System.out.println(e.getLocalizedMessage());
    }
    System.out.println("Main Line that should be executed");

    
    
    
    }
    
    // Methods or Function 
    // returnType functionName (arguments){}
    // static int average (int Firstnumber, int SecondNumber)
    // {
    //     int sum=Firstnumber+SecondNumber;
    //     return sum/2;

    // }




}


