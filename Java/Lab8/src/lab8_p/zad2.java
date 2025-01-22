package lab8_p;

import java.util.ArrayList;
import java.util.List;

class Student{
    private String imie;
    private String nazwisko;
    private String nr_indeksu;

    public Student(String imie, String nazwisko, String nr_indeksu){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
    }

    public String getNr_indeksu() {
        return nr_indeksu;
    }

    public void setNr_indeksu(String nr_indeksu) {
        this.nr_indeksu = nr_indeksu;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }



}

public class zad2 {
    public static void main(String[] args) {
        //Stwórz klasę opisującą studenta (imię, nazwisko, numer indeksu), a następnie stwórz jej listę obiektów. Podaj ile elementów zawiera lista, oraz co znajduje się w 3 elemencie tej listy.

        List<Student> listaStudentow = new ArrayList<>();

        listaStudentow.add(new Student("Jan", "Kowalski", 12345));
        listaStudentow.add(new Student("Anna", "Nowak", 54321));
        listaStudentow.add(new Student("Piotr", "Wiśniewski", 67890));

        System.out.println("Liczba elementów w liście: " + listaStudentow.size());

        System.out.println("Trzeci element listy: " + listaStudentow.get(2));
    }
}
