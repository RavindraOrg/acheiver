package com.inheritance.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Hello {

    public static void main(String[] args) {

        /*Laptop lappy = new Laptop();


        Processor p= new Processor();
        p.setBrand("reee");
        p.setCores(5);
       lappy.setProcessor(p);

        System.out.println(lappy);*/
        /*Addition a= new Addition();
        a.add(2,3);
        a.add(2,3,4);
        a.add(2.3f,3.4f);*/
       /* Phone s = new Nokia3310("nok");
        s.features();
        System.out.println(s.getModel());

        SamsungNote8 se = new SamsungNote8("sss");
        Nokia3310 ne = new Nokia3310("sss");

        List<Phone> sam= new ArrayList<>();
        sam.add(se);
        sam.add(ne);
        */



        Phone note8 = getPhone("a");
        System.out.println(note8);

        Phone note = getPhone("b");
        System.out.println(note);


        /*
        List<String> i = new LinkedList<>();
        i.add("22");*/

        /*LinkedList<String> k = new LinkedList<>();
        k.add("45");*/
    }






      /*  Phone nokia3310 = new Nokia3310("Nokia 3310");
        System.out.println(nokia3310.getModel());
        nokia3310.features();*/

   // }

    public static Phone getPhone(String a) {

        switch (a) {
            case "a":
                return new SamsungNote8("2333");
            case "b":
                return new Nokia3310("nokia2344");
        }
        return null;
    }

}
