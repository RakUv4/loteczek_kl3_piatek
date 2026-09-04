import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        //losowanie listy bez powtórzeń
        HashSet<Integer> zbior = new HashSet<>();
        int liczba;
        while(zbior.size()<6){
            liczba = rand.nextInt(1,50);
            zbior.add(liczba);
        }



        //wypisywanie tablicy
        System.out.println("Wylosowana lista");
        System.out.println(zbior);
        }

    }
