package Code;

import java.util.ArrayList;


public class arrayListIntro {
    public static void main(String[] args) {
        // Basically we can dynamically allot the size
        // ArrayList<Integer> list =new ArrayList<>();
        // for (int i = 0; i < 100; i++) {
        //     list.add(i);
        // }


        ArrayList list =new ArrayList<>();
            list.add(1);
            list.add("sud");
            list.add('A');
        
        System.out.println(list);
        System.out.println(list.contains(5));
        
    }
    
}
