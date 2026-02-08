package Day17;

import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListClass {
    public static void main(String[] args) {
        // Wrapper Class
        Integer in = Integer.valueOf(5);
        System.out.println(in);
        Float f = Float.valueOf(5.5f);
        System.out.println(f);

        // Creating ArrayList
        ArrayList<Integer> l1 = new ArrayList<>();

        // Adding elements at last index
        l1.add(2);
        l1.add(4);
        l1.add(6);
        l1.add(8);
        l1.add(1);
        l1.add(7);

        // Adding element at index i
        l1.add(0, 100);
        System.out.println(l1.get(0));
        System.out.println(l1);

        // Removing element at index i
        l1.remove(0);

        // Removing element x
        System.out.println(l1.remove(Integer.valueOf(7)));
        l1.remove(Integer.valueOf(7));
        System.out.println(l1.remove(Integer.valueOf(17)));

        // Checking if element exists
        System.out.println(l1.contains(3));

        // Updating element at index i
        l1.set(l1.size()-1, 10);

        // Printing single arrayList element
        System.out.println(l1.get(1));
        System.out.println(l1.get(2));

        // Printing the arrayList directly
        System.out.println(l1);

        // Print the arrayList using for loop
        for(int i = 0; i < l1.size(); i++){
            System.out.print(l1.get(i) +  " ");
        }

        //If you don't specify class, you can put anything inside the List
        ArrayList l2 = new ArrayList();
        l2.add("Sumant");
        l2.add(10);
        l2.add(true);
        l2.add(0.1);
        System.out.println(l2);
    }
}
