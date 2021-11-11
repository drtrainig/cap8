package com.itfactory;

import com.itfactory.stack.Utils;

import java.util.Objects;

public class Persoana {
    String nume;
    String prenume;



    public Persoana(String nume, String prenume) {
        this.nume = nume;
        this.prenume = prenume;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoana persoana = (Persoana) o;
        return Objects.equals(nume, persoana.nume) &&
                Objects.equals(prenume, persoana.prenume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, prenume);
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                '}';
    }
}
