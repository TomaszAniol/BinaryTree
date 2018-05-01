package com.tomasaniol;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        boolean quite = false;
        int choose = 0;

        Lista lista = new Lista();
        lista.AddName("cos1");
        lista.AddName("cos2");
        lista.AddName("cos3");
        lista.AddName("cos4");
        lista.AddName("cos5");
        lista.AddName("cos6");
        lista.AddName("cos7");
        lista.AddName("cos8");
        lista.AddName("cos9");
        lista.AddName("cos10");
        lista.AddName("cos11");
        lista.AddName("cos12");
        lista.AddName("cos13");
        lista.AddName("cos14");
        lista.AddName("cos15");
        lista.AddName("cos16");
        lista.AddName("cos17");
        lista.AddName("cos18");

        Tree tree = new Tree(30);
        tree.AddValue(20);
        tree.AddValue(43);
        tree.AddValue(13);
        tree.AddValue(4);
        tree.AddValue(6);
        tree.AddValue(3);
        tree.AddValue(1);
        tree.AddValue(9);
        tree.AddValue(8);
        tree.AddValue(13);
        tree.AddValue(21);
        tree.AddValue(24);
        tree.AddValue(26);
        tree.AddValue(24);
        tree.AddValue(26);
        tree.AddValue(13);
        tree.AddValue(26);
        tree.AddValue(28);
        tree.AddValue(26);
        tree.AddValue(32);
        tree.AddValue(26);
        tree.AddValue(23);
        tree.AddValue(21);
        tree.AddValue(56);
        tree.AddValue(68);
        tree.AddValue(41);


        PrintOutMenu();
        System.out.println("Wybierz:");
        while (!quite){
            choose = in.nextInt();
            switch (choose){
                case 0:
                    PrintOutMenu();
                case 1:
                    lista.TakeOutNext();
                    break;
                case 2:
                    lista.TakeOutPrevious();
                    break;
                case 3:
                    lista.TakeOut();
                    break;
                case 4:
                    System.out.println("Dodaj element");
                    lista.AddName(in.next());
                    break;
                case 5:
                    System.out.println("Dodaj element do listy sortującej");
                    tree.AddValue(in.nextInt());
                    break;
                case 6:
                    tree.SortIncrease();
                    break;
                case 7:
                    tree.SortDecrease();
                    break;
                case 8:
                    quite = true;
            }
        }


    }
    static void PrintOutMenu(){
        System.out.println("**********");
        System.out.println("   Menu  ");
        System.out.println("**********");
        System.out.println("0 - Menu");
        System.out.println("1 - Iteruj po liście do przodu");
        System.out.println("2 - Iteruj po liście do tyłu");
        System.out.println("3 - Wyświetl całą listę");
        System.out.println("4 - Dodaj element do listy");
        System.out.println("5 - Dodaj element do listy sortującej");
        System.out.println("6 - Sortuj rosnąco");
        System.out.println("7 - Sortuj malejąco");
        System.out.println("8 - Wyjdź");
    }
}
