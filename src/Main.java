import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        //losowanie listy bez powtórzeń
        ArrayList<Integer> listaWylosowana = new ArrayList<>();
        int liczba;
       while(listaWylosowana.size()< 6){
           liczba = rand.nextInt(1,50);
           if(listaWylosowana.contains(liczba)){
               continue;
           }
           listaWylosowana.add(liczba);
       }


        //wypisywanie tablicy
        System.out.println("Wylosowana lista");
        System.out.println(listaWylosowana);
        }

    }
