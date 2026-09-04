import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] wylosowanaTablica = new int[6];

        for (int i = 0; i < wylosowanaTablica.length; i++) {
            wylosowanaTablica[i] = rand.nextInt(1, 50);
        }
        //wypisywanie tablicy
        System.out.println("Tablica losowana: ");
        for (int elementTablicy:wylosowanaTablica){
            System.out.println(elementTablicy);
        }

    }
}