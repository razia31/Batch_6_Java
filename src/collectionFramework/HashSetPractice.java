package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {


   /* Set is an Interface. HashSet is a class. HashSet implements Set.

    HashSet cannot hold duplicate value. It always hold unique value.

    HashSet does not follow insertion order

    Null Value - Research

    */

        public void hashSetDemo(){
            Set<String> students = new HashSet<>();

            boolean isEmptyBeforeAdd = students.isEmpty();
            System.out.println("Empty Before adding elements "+isEmptyBeforeAdd);

            int sizeBeforeAdd = students.size();
            System.out.println("Size before add "+sizeBeforeAdd);


            students.add("Arafat");
            students.add("Jobayda");
            students.add("Sarita");
            students.add("Majed");
            students.add("Suriya");
            students.add("Arafat");

            System.out.println(students);


        }

        public static void main(String[] args) {
           HashSetPractice obj = new HashSetPractice();
            obj.hashSetDemo();
        }
}
