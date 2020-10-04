package Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Tester {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();

        //Remove the Cs with for loops [doesn't work correctly]

        items.clear();
        items.add("Apple");
        items.add("Pear");
        items.add("Banana");
        items.add("Cherry");
        items.add("Cucumber");
        items.add("Eggplant");
        items.add("Berries");
        for(int i = 0; i < items.size(); i++){
            if(items.get(i).substring(0,1).equals("C")){
                items.remove(i);
            }
        }
        System.out.println(items);
        //Skips over Cucumber



        //ITERATORS

        items.clear();
        items.add("Apple");
        items.add("Pear");
        items.add("Banana");
        items.add("Cherry");
        items.add("Cucumber");
        items.add("Eggplant");
        items.add("Berries");

        Iterator<String> iter = items.iterator();

        while(iter.hasNext()){
            if(iter.next().substring(0,1).equals("C")){
                iter.remove();
            }
        }
        System.out.println(items);

        //Removes all Cs. Because Iterators do no rely on index, but relative position.

        items.clear();
        items.add("Apple");
        items.add("Pear");
        items.add("Banana");
        items.add("Cherry");
        items.add("Cucumber");
        items.add("Eggplant");
        items.add("Berries");

        ListIterator<String> listIter = items.listIterator();

        while(listIter.hasNext()){
            if(listIter.next().contains("C")){
                listIter.remove();
            }
        }
        System.out.println(items);

        //Same as Iterator for removal of items

        items.clear();
        items.add("Apple");
        items.add("Pear");
        items.add("Banana");
        items.add("Cherry");
        items.add("Cucumber");
        items.add("Eggplant");
        items.add("Berries");

        ListIterator<String> listIterForward = items.listIterator();

        while(listIterForward.hasNext()){
            System.out.println(listIterForward.next());
        }

        //Parses the list forwards

        ListIterator<String> listIterBackwards = items.listIterator(items.size());

        while(listIterBackwards.hasPrevious()){
            System.out.println(listIterBackwards.previous());
        }

        //Parses list backwards
    }
}
