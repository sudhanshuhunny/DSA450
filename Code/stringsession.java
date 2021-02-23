package Code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.Flow.Subscriber;

public class stringsession {
    public static void main(String[] args) {
        // // String person="Hunny";
        // // System.out.println(person);// Person refering to the object hunny
        // // // String are immutable but we can deference the object
        // // person="Sud"; // now its pointing to the string sud

        // // String person1="Hunny";
        // // String person2="Hunny";
        // // System.out.println(person1==person2);// actually they both are pointing the same hunny and == checking reference 
        // // System.out.println(person1.equals(person2)); // now its check the value for that reference 
        
        
        

        // // //String pool

       
        // // String P1="hunny";
        // // String p2=P1;
        // // System.out.println(p2);
        
    

        // // String to array
        // String person="Hunny";
        // char[] ar=person.toCharArray();
        // System.out.println(Arrays.toString(ar)); //[H,u,n,n,y]
        // ar[0]='B';
        // System.out.println(Arrays.toString(ar));//[B,u,n,n,y]
        // String name=String.valueOf(ar);
        // System.out.println(name); // Bunny
        // System.out.println(person); //  Hunny
        // System.out.println(name.substring(1)); // unny
        // System.out.println(name.substring(1,4)); //unn
        // System.err.println(name.length()); //5
        // System.out.println("".isEmpty()); // True

        // String names="Hunny,Singh,Ram,kj";
        // String[] namesarr=names.split(","); // array of splited words
        // System.out.println(Arrays.toString(namesarr));
    
        // String temp="Hello in VSC";
        // System.out.println(temp.startsWith("H"));
        // System.out.println(temp.endsWith("VSC"));
        // System.out.println(temp.indexOf('C'));
        

        // String sentence="Hey ,I am good";
        // for (int i = 0; i < sentence.length(); i++) {
        //     System.out.println(sentence.charAt(i));
        // }

        // for(char ch : sentence.toCharArray()){
        //     System.out.println(ch);
        // }
        // System.out.println(sentence.strip());//aage piche k space htana
        // System.out.println(sentence.toUpperCase());
        // System.out.println(sentence.toLowerCase());
        
        // // For-Each Loop
        // int[] nums={1,2,3,4,5,6};
        // for(int num:nums){
        //     System.out.println(num+" ");
        // }

        // // Adding element in String
        // String num="";
        // for (int i = 0; i < 100; i++) {
        //     num+=i;             // yha 100 object bnege original me change nhi hga // waste of memory

        // }
        // System.out.println(num);

        // to overcome this problem we use String Builder


        // StringBuilder builder=new StringBuilder();
        // for (int i = 0; i < 100; i++) {
        //     builder.append(i+"");   // Mutuable Seq of characters
        // }
        // System.out.println(builder.reverse());

        Scanner s=new Scanner(System.in);    
        //String str=s.next(); // it will take token input (Those seprated by _) ( i am me srf i  lega)
        // int t=Integer.parseInt(s.nextLine()); // to reduce error
        // while(t-->0)
        // {
        // // String str=s.nextLine(); // accepts  till enter 
        // // System.out.println(str);
        // }
            String str="abc";
            substrings(str);
            //System.out.println(palindrome(str));
        
    }
    // String is palindrome or not
    private static boolean palindrome(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            {
               return false; 
            }
        }
        return true;
    }

    // Printing all substrings of string
    private static void substrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <str.length()+1 ; j++) {
                System.out.println(str.substring(i,j));
            }
            
        }
    }
    


}
