package org.example;
import java.util.ArrayList;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        Zivocich zviera= new Zivocich("Pes",4);
        ArrayList<Object> arr= new ArrayList<Object>();
        arr.add(66);
        arr.add("Simon");
        arr.add("Sedivy");
        arr.add(21.5);
        arr.add(zviera.meno);
        arr.add(zviera.pocet_noh);

        Iterator<Object> it= arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        }
    }
