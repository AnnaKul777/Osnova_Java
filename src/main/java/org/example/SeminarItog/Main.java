/**
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
 * Реализовать в java.
 *         • Создать множество ноутбуков.
 *         • Написать метод, который будет запрашивать у пользователя критерий
 *         (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
 *         Критерии фильтрации можно хранить в Map. Например:
 *         “Введите цифру, соответствующую необходимому критерию:
 *         1 - ОЗУ
 *         2 - Объем ЖД
 *         3 - Операционная система
 *         4 - Цвет …
 *         • Далее нужно запросить минимальные значения для указанных критериев -
 *         сохранить параметры фильтрации можно также в Map.
 *         • Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
  */

package org.example.SeminarItog;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Laptop lap1 = new Laptop("MSI", "pink","Windows", 16, 512, "h208", 150000);
        Laptop lap2 = new Laptop("Apple", "green","macOS", 16, 256, "302-y", 130000);
        Laptop lap3 = new Laptop("Samsung", "black","Windows", 8, 256, "114A", 85000);
        Laptop lap4 = new Laptop("Lenovo", "black","Windows", 8, 1000, "s35", 63000);
        Laptop lap5 = new Laptop("Apple", "white","macOS", 8, 1000, "g023", 180000);
        Laptop lap6 = new Laptop("HP", "black","Windows", 16, 512, "883u", 98000);
        Laptop lap7 = new Laptop("Samsung", "black","Windows", 32, 512, "50E", 75000);
        Laptop lap8 = new Laptop("Apple", "yellow","macOS", 32, 512, "79R", 95000);
        Laptop lap9 = new Laptop("MSI", "white","Windows", 16, 512, "A-89", 115000);
        Laptop lap10 = new Laptop("MSI", "blue","Windows", 32, 1000, "ip577", 84000);

        Set<Laptop> laptops = new HashSet<>();
        laptops.add(lap1);
        laptops.add(lap2);
        laptops.add(lap3);
        laptops.add(lap4);
        laptops.add(lap5);
        laptops.add(lap6);
        laptops.add(lap7);
        laptops.add(lap8);
        laptops.add(lap9);
        laptops.add(lap10);

        System.out.println(laptops);
        Map<Integer, Set<Laptop>> choose = new HashMap<>();
        boolean checkEnd = true;
        System.out.print("Выберите критерии поиска для ноутбука: " +
                "\n1. Наименование ноутбука " +
                "\n2. Модель ноутбука" +
                "\n3. Оперативная память" +
                "\n4. Объем жесткого диска" +
                "\n5. Операционная система" +
                "\n6. Цвет " +
                "\n7. Цена\n"
        );

        while (checkEnd) {
            System.out.print("Введите пункт меню поиска: ");
            int whatSearch = mainChoose();
            if (whatSearch == 1) {
                choose.put(1, searchName(laptops));
            }
            if (whatSearch == 2) {
                choose.put(2, searchModel(laptops));
            }
            if (whatSearch == 3) {
                choose.put(3, searchOZU(laptops));
            }
            if (whatSearch == 4) {
                choose.put(4, searchHD(laptops));
            }
            if (whatSearch == 5) {
                choose.put(5, searchSystem(laptops));
            }
            if (whatSearch == 6) {
                choose.put(6, searchColor(laptops));
            }
            if (whatSearch == 7) {
                choose.put(7, searchPrice(laptops));
            }
            checkEnd = circleAnswer();
        }

        Set<Laptop> tmpSet = new HashSet<>(choose.values().iterator().next());
        for (Map.Entry<Integer, Set<Laptop>> entry : choose.entrySet()) {
            tmpSet.retainAll(entry.getValue());
        }
        int numbers = 1;
        if (!tmpSet.isEmpty()) {
            System.out.println("Ноутбуки по выбранным параментам: ");
            for (Laptop text : tmpSet) {
                System.out.println(numbers + ". " + text);
                numbers++;
            }
        } else System.out.println("Ноутбуков по выбранным параметрам нет.");
    }

    public static Integer mainChoose() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int nunMenu = scanner.nextInt();
            if (nunMenu > 0 && nunMenu < 8) return nunMenu;
            else {
                System.out.print("Введен неверный пункт меню, повторите ввод: ");
                return mainChoose();
            }
        } else {
            System.out.print("Введен неверный пункт меню, повторите ввод: ");
            return mainChoose();
        }
    }


    public static Set<Laptop> searchName(Set<Laptop> someSet) {
        Scanner scanner = new Scanner(System.in);
        Set<Laptop> control = new HashSet<>();
        System.out.print("Выберите название ноутбука: ");
        String whatLookingFor = scanner.next();
        for (Laptop note : someSet) {
            if (note.getName().equals(whatLookingFor)) {
                control.add(note);
            }
        }
        return control;
    }

    public static Set<Laptop> searchModel(Set<Laptop> someSet) {
        Scanner scanner = new Scanner(System.in);
        Set<Laptop> control = new HashSet<>();
        System.out.print("Выберите модель ноутбука: ");
        String whatLookingFor = scanner.next();
        for (Laptop note : someSet) {
            if (note.getModel().equals(whatLookingFor)) {
                control.add(note);
            }
        }
        return control;
    }

    public static Set<Laptop> searchOZU(Set<Laptop> someSet) {
        Scanner scanner = new Scanner(System.in);
        Set<Laptop> control = new HashSet<>();
        System.out.print("Выберите объем оперативной памяти: ");
        int whatLookingFor = scanner.nextInt();
        for (Laptop note : someSet) {
            if (note.getRam() == whatLookingFor) {
                control.add(note);
            }
        }
        return control;
    }

    public static Set<Laptop> searchHD(Set<Laptop> someSet) {
        Scanner scanner = new Scanner(System.in);
        Set<Laptop> control = new HashSet<>();
        System.out.print("Выберите объем жесткого диска: ");
        int whatLookingFor = scanner.nextInt();
        for (Laptop note : someSet) {
            if (note.getHdd() == whatLookingFor) {
                control.add(note);
            }
        }
        return control;
    }

    public static Set<Laptop> searchSystem(Set<Laptop> someSet) {
        Scanner scanner = new Scanner(System.in);
        Set<Laptop> control = new HashSet<>();
        System.out.print("Выберите операционную систему: ");
        String whatLookingFor = scanner.nextLine();
        for (Laptop note : someSet) {
            if (note.getOperSyst().equals(whatLookingFor)) {
                control.add(note);
            }
        }
        return control;
    }

    public static Set<Laptop> searchColor(Set<Laptop> someSet) {
        Scanner scanner = new Scanner(System.in);
        Set<Laptop> control = new HashSet<>();
        System.out.print("Выберите цвет ноутбука: ");
        String whatLookingFor = scanner.nextLine();
        for (Laptop note : someSet) {
            if (note.getColor().equals(whatLookingFor)) {
                control.add(note);
            }
        }
        return control;
    }

    public static Set<Laptop> searchPrice(Set<Laptop> someSet) {
        Scanner scanner = new Scanner(System.in);
        Set<Laptop> control = new HashSet<>();
        System.out.print("Выберите стоимость товара: ");
        int whatLookingFor = scanner.nextInt();
        for (Laptop note : someSet) {
            if (note.getHdd() == whatLookingFor) {
                control.add(note);
            }
        }
        return control;
    }


    public static boolean circleAnswer() {
        System.out.print("Вы хотите попробовать добавить ещё один критерий поиска " +
                "ноутбука? Ответьте 'YES' или 'NO': ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();
        if (text.equals("yes")) {
            return true;
        } else if (text.equals("no")) {
            return false;
        } else {
            System.out.println("Введено неверное значение");
            return circleAnswer();
        }
    }

}

