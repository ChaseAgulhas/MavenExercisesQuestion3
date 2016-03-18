package com.chase.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by student on 2016/03/18.
 */
public class AnimalImpl
{
public static void main (String[] args)
        {


        Dog d = new Dog("Hachiko");
        Fish f = new Fish("Wobble");

        //Implementing the List Class using ArryList
        List <Animal> animalList = new ArrayList<Animal>();
        animalList.add(d);
        animalList.add(f);
        animalList.add(d);
        animalList.add(f);

        System.out.println("The Array List of the animals");
        System.out.printf("%s", animalList);
        System.out.println("");
        //Implemetning the Set Class using HashSet
        Set <Animal> animalSet = new HashSet<Animal>(animalList);

        System.out.println("The Hash Set of the animals");
        System.out.printf("%s", animalSet);
        System.out.println("");

        HashMap<Animal, Boolean> map = new HashMap<>();
        map.put(d, true);
        map.put(f, false);

        System.out.println("");
        System.out.println("The values in the hashmap that are matched up to a specific animal key/object");
        System.out.println(map.get(d));
        System.out.println(map.get(f));
        System.out.println("");


        }
}
