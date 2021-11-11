package com.itfactory.set;

import com.itfactory.Persoana;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {

        Set<Persoana> persoanaSet = new HashSet<>();
        persoanaSet.add(new Persoana("Dragos", "Roban"));
        persoanaSet.add(new Persoana("Dragos", "Roban"));
        persoanaSet.add(new Persoana("Dragos", "Roban"));
        persoanaSet.add(new Persoana("Dragos", "Roban"));
        for (Persoana persoana : persoanaSet) {
            System.out.println(persoana);
        }
    }
}
