package Day18;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProblems {
    //Reverse the ArrayList
    static void ReverseArrayList(ArrayList<Integer> l){
        int i = 0, j = l.size()-1;
        while(i < j){
            int temp = l.get(i);
            l.set(i, l.get(j));
            l.set(j, temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(5);
        l.add(3);
        l.add(2);
        l.add(4);
        System.out.println("Original List - " + l);
        ReverseArrayList(l);
        System.out.println("Reversed List - " + l);
        Collections.reverse(l);
        System.out.println("Reversed List - " + l);
        Collections.sort(l);
        System.out.println("Ascending Order Sorted List - " + l);
        Collections.sort(l, Collections.reverseOrder());
        System.out.println("Descending Order Sorted List - " + l);

        //Reverse String ArrayList
        ArrayList<String> ls = new ArrayList<>();
        ls.add("Apple");
        ls.add("Google");
        ls.add("Microsoft");
        System.out.println("OG - " + ls);
        Collections.reverse(ls);
        System.out.println("Reversed String List - " + ls);
        Collections.sort(ls);
        System.out.println("Sorted String List - " + ls);
        Collections.sort(ls, Collections.reverseOrder());
        System.out.println("Reverse Sorted String List - " + ls);

    }
}
