package com.company;

import java.util.ArrayList;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        ArrayList<City>cities=new ArrayList<>();
        TreeSet<City>cities1=new TreeSet<>();
        City city=new City(1,"Moskva");
        City city1=new City(2,"Piter");
        City city2=new City(3,"Samara");
        City city3=new City(4,"Cochi");
        City city4=new City(5,"Ekaterinburg");
        City city5=new City(6,"Krasnodar");
        City city6=new City(7,"Irkutsk");
        City city7=new City(8,"Yiroslavl");
        cities.add(city);
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);
        cities.add(city4);
        cities.add(city5);
        cities.add(city6);
        cities.add(city7);

        for (int i=0;i<cities.size();i++){
            if (cities.get(i).getCode()%2==1){
                cities1.add(cities.get(1));
            }
        }
        for (City c:cities1){
            System.out.println(c);
        }


    }
}
