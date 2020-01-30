package workshop3;

import java.util.*;

public class Collections {

    public static void main(String[] args) {
        // List
        // pastreaza ordinea in care s au adaugat elementele
        List<String> arrayList = new ArrayList<>();
        arrayList.add("caine");
        arrayList.add("pisica");
        arrayList.add("iepure");
        arrayList.add("caine");

        arrayList.forEach(element -> System.out.println(element)); // afiseaza unul sub altul

        System.out.println(arrayList); // afiseaza ca un vector

        System.out.println(" ");
        // Set
        // TreeSet este o colectie sortata default sau dupa anumite criterii date
        Set<String> treeset = new TreeSet<>();
        treeset.add("masina");
        treeset.add("casa");
        treeset.add("a");
        treeset.add("masina"); // nu putem adauga duplicate

        treeset.forEach(element -> System.out.println(element));

        System.out.println(" ");
        // HashSet nu le mai sorteaza, ordine aleatoare
        Set<String> hashSet = new HashSet<>();
        hashSet.add("masina");
        hashSet.add("casa");
        hashSet.add("a");
        hashSet.add("masina");

        hashSet.forEach(element -> System.out.println(element));

        System.out.println(" ");
        // Map
        // cheie, valoare
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Doggo");
        map.put(2,"Cato");

        map.forEach((e1,e2)-> System.out.println(e1 + "..." + e2));

        System.out.println(map);
    }
}
