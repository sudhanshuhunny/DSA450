package Code;

public class anujava {
    public static void main(String [] args)
    {
        //Hello world Program
        System.out.println("Hello World this is from java ");
        //DATA TYPES
        //int ,float,char,String,long,double,boolean
        int age_$1=23; //only _ and $ is accepted in the variable name and can't start with numbers
        /* more aboout int 
        int is 4 BYTES 1 Byte = 8 bits ,i.e = 32 bits
        2^32 numbers can be stored in that 
        1st bit is used to denote negative or positive numbers if 1 = - & 0=+
        so the remaining number is 2^31
        
        */
        float per=75.345f; //always put f to denote it as a float otherwise its a double value
        char Grade='A';
        String name="Sudhanshu";
        Boolean isvalid = false;
        long bigNumber=8237847823648l; // same as float i.e l to end to let complier know it is a long number 
        System.out.println(age_$1+per+name+isvalid+bigNumber+Grade); // + is used to print different DT in single line 



    }
    
}
