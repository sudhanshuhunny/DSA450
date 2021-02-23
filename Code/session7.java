package Code;
import java.util.Scanner;

public class session7 {
    public static void main(String[] args) {



        // To reslove the problem of the recursion tree in Last Problem
        // optimising the last Problem in session 6
        String word="abc";
        StringBuilder proc=new StringBuilder("");
        StringBuilder unproc=new StringBuilder(word);
        subseq(proc,unproc);

    }

    public static void subseq(StringBuilder proc, StringBuilder unproc) {
        if(unproc.length()==0)
        {
            if(proc.length()!=0)
            {
                System.out.println(proc);
            }
        }

        char ch=unproc.charAt(0);
        unproc.delete(0, 1);
        proc.append(ch);
        subseq(proc,unproc);
        proc.delete(proc.length()-1, proc.length());
        subseq(proc, unproc);
        unproc.insert(0,ch);
    }

    


    





    }

