package com.mycompany.testtask1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author missa
 */
public class Main {

    public static void main(String[] args) throws Exception {
        int language;
        SimpleDateFormat sdf = new SimpleDateFormat("HH", Locale.getDefault());
        String strTime = sdf.format(new Date());
        int hours = Integer.parseInt(strTime);

        System.out.println("Hello");
        System.out.println("Please, choose your language: ");
        System.out.println("If you prefer English, please enter '1'");
        System.out.println("If you prefer Russian, please enter '2'");
        
        for (int i = 0; i < 5; i++) {
            try {
                Scanner sc = new Scanner(System.in);
                language = sc.nextInt();

                if (language == 1) {
                    System.out.println("You choose English language...");
                    if (hours < 9) {
                        System.out.println("Good morning, World!");
                    } else if (hours < 19) {
                        System.out.println("Good day, World!");
                    } else if (hours < 23) {
                        System.out.println("Good evening, World!");
                    } else {
                        System.out.println("Good night, WOrld!");
                    }
                    System.out.println("Right now is " + strTime + " o'clock");
                    break;
                } 
                else if (language == 2) {
                    System.out.println("Вы выбрали Русский язык");
                    if (hours < 9) {
                        System.out.println("Доброе утро, Мир");
                    } else if (hours < 19) {
                        System.out.println("Добрый день, Мир");
                    } else if (hours < 23) {
                        System.out.println("Добрый вечер, Мир");
                    } else {
                        System.out.println("Доброй ночи, Мир");
                    }
                    System.out.println("Cейчас " + strTime + " часов");
                    break;
                } else {
                    System.out.println("Wrong choose, please try again");
                }
            } catch (InputMismatchException e) {
                System.out.println("exep: " + e);
                System.out.println("Wrong operation, please try again");
            } catch (Exception e) {
                System.out.println("exep: " + e);
                System.out.println("Wrong operation, please try again");
            }
            continue;
        }
    }
}
