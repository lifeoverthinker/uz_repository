package lab8_p;

import java.util.ArrayList;

public class Zad2 {
    public static void main(String[] args) {
        ArrayList<Student> studenci = new ArrayList<>();
        studenci.add(new Student("Anna", "Twardowska", 123456));
        studenci.add(new Student("Pawel", "Kowalski", 654321));
        studenci.add(new Student("Marek", "Janczewski", 794392));

        System.out.println("Liczba elementów w liście: " + studenci.size());
        Student trzeciStudent = studenci.get(2);
        System.out.println("3 element listy: " + trzeciStudent.getImie() + " " + trzeciStudent.getNazwisko() + " " + trzeciStudent.getNumerIndeksu());
    }
}
