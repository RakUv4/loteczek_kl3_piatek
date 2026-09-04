import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        //losowanie tablicy bez powtórzeń
        int[] wylosowanaTablica = new int[6];
        int liczba;
        boolean czyZawiera = false;

        for (int i = 0; i < wylosowanaTablica.length; i++) {
            liczba = rand.nextInt();
            wylosowanaTablica[i] = rand.nextInt(1, 50);
            for (int j = 0; j < i; j++) {
                if(wylosowanaTablica[j] == liczba){
                    czyZawiera = true;
                    break;
                }
            }
            if(!czyZawiera){
                wylosowanaTablica[i]=liczba;
            }
        }
        //wypisywanie tablicy
        System.out.println("Tablica losowana: ");
        for (int elementTablicy:wylosowanaTablica){
            System.out.println(elementTablicy);
        }

    }
}