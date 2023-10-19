package interviewPrep;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSetDemo {
    List<Integer> list1 = new ArrayList<>();

    public void listPractice(){
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(4);
        list1.add(5);

        System.out.println(list1);

//        list1.remove(4);
//        System.out.println(list1);
try {
    System.out.println(list1.get(10));
}
catch (Exception e){
    e.printStackTrace();
   // System.out.println(e);
}
finally {
    Set<Integer> set1 = new HashSet<>(list1);
    System.out.println(set1);
}


    }

    public static void main(String[] args) {
        ListSetDemo obj = new ListSetDemo();
        obj.listPractice();
    }
}
