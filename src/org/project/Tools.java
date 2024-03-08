package org.project;

/* Этот класс имеет методы, которые могут дать возможность для управления приложением. */
public class Tools {
    /* Метод выводит адрес бар в консоль */
    public static void pathBar(String data) {
        if (data.length() > 0) {
            System.out.println("PATH: " + data);
        }
    }

    /* Метод, который может получить конкретное значение */
    /* Этот метод нужен для поиска модуля в адресе. */
    public static String module(String path, int n) {
        String[] s = path.split("/"); // превратили путь в массив строк
        String str = ""; // Строка, которая будет собирать результат из цикла

        for (int i = 1; i <= s.length - 1; i++) {
            if (i == n) {
                str += "/" + s[i];
                break;
            }
        }
        return str;
    }

    /* Метод, который вернет адрес для возврата. */
    public static String backPath(String path) {
        String[] s = path.split("/"); // превратили путь в массив строк
        String str = ""; // Строка, которая будет собирать результат из цикла

        for (int i = 1; i <= s.length - 2; i++) {
            str += "/" + s[i];
        }
        return str;
    }

    /* Метод, который формирует адрес к модулям */
    public static String redirect(String d, String path) {
        if (d.length() > 0) { // откроется,  когда не пустая строка
            // Возврат пользователя
            if ("index".equals(d)) {
                return "";
            } else if ("back".equals(d)) {
                return backPath(path);
            } else {
                return path + "/" + d;
            }
        }
        return path;
    }


}