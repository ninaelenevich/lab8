package main;

import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class list {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> laba8 = new ArrayList<String>();
        laba8.add(0,"laba8");

        int choice;

        Scanner scan=new Scanner(System.in);
        System.out.println("Меню");

        System.out.println("1 Добавить");
        System.out.println("2 Удалить");
        System.out.println("3 Поиск одинаковых элементов");


        do {
            System.out.println("Введите ваш выбор");
            choice=scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Введите новый элемент");
                    Scanner novoe = new Scanner(System.in);
                    String addtext = novoe.nextLine();
                    laba8.add( addtext);
                    System.out.println(laba8);
                    break;

                case 2:
                    System.out.println("Введите индекс элемента , который хотите удалить");
                    Scanner del = new Scanner(System.in);
                    int del1 = del.nextInt();
                    laba8.remove(del1);
                    System.out.println(laba8);
                    break;

                case 3:
                    HashMap<String,Integer> hm = new HashMap<String, Integer>();
                    Integer am;
                    for(String i: laba8){
                        am=hm.get(i);
                        hm.put(i,am==null? 1:am+1);
                    }
                    System.out.println(hm);
                    break;

                

                default:
                    System.out.println("Неверный ввод");
            }
        }while (choice!=15);
    }
}
