package org.project;

import java.util.Scanner;

/* В этом классе будет управление нашим приложением. Все остальные классы подтягиваются тут. */
public class App {
    private static String data = ""; // поле, которое будет постоянно принимать команды с клавиатуры.
    private static String path = ""; // Поле, которое будет принимать путь к методу.
    private static Scanner scanner = new Scanner(System.in);

    /* Метод run, который запустит приложение. Он не должен что либо возвращать. */
    public static void run() {
        /* Ниже этой строки будут вызываться не статические классы. */
        Flat flat = new Flat(); // Класс от Даниила.
        Info info = new Info(); // Класс от Дарии.
        /* Далее идет цикл do while, в котором и будем обрабатывать команды. */
        do {
            String module = Tools.module(path, 1);
            Tools.pathBar(path); // Метод выводит адрес бар
            switch (module) {
                case "/info":
                    System.out.println("Информация о приложение");
                    break;
                case "/history":
                    System.out.println("История последних пятнадцати команд");
                    break;
                case "/help":
                    System.out.println("Справка по командам");
                    break;
                default:
                    System.out.println("Приложение работает");
            }


            data = scanner.nextLine();
            path = Tools.redirect(data, path);
        } while (!"exit".equals(data));

    }
}
