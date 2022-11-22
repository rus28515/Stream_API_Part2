package org.example.Task2;

/*
/*
2. Розробити узагальнений (шаблонний, generic) клас Point<T>, що реалізує точку на координатній площині (x; y).

З розробленого класу Point створити набір об'єктів. Для створеного набору об'єктів реалізувати такі завдання:

    одержати точку (об'єкт) з найбільшим значенням координати x;
    створити новий потік чисел типу double. Кожне число є відстанню від точки до початку координат. Отриманий потік вивести на екран;
    створити новий потік об'єктів. У потоці мають бути точки (об'єкти), відстань від яких до початку координат понад 5;
    сортувати об'єкти в порядку зменшення за критерієм відстані від точки до початку координат.

Розв'язання задач помістити в клас Solution, який міститиме 4 узагальнені методи, які вирішуватимуть завдання згідно з умовою.

Вирішуючи завдання використовувати засоби Stream API.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {

    public Point maxX(ArrayList<Point> arrayList) {
        return arrayList.stream().max((e1, e2) -> e1.getX() - e2.getX()).get();
    }

    public void printDistance(ArrayList<Point> arrayList) {
        arrayList.stream().map(e -> {
                    return Math.sqrt(e.getX() * e.getX() + e.getY() * e.getY());
                })
                .forEach(System.out::println);
    }

    private double distance(Point p) {
        return Math.sqrt(p.getX() * p.getX() + p.getY() * p.getY());
    }

    public void printOuDistanceFive(List<Point> list) {
        list.stream().map(e -> {
            if (distance(e) > 5) {
                return e;
            } else {
                return null;
            }
        }).forEach(e -> {
            if (e != null) {
                System.out.println(e);
            }
        });
    }

    public void printListPoint(List<Point> list) {
        list.stream().forEach(System.out::println);
    }

    public List<Point> sortListPoint(List<Point> list) {
        list = list.stream().sorted(( e1, e2) -> {
            return (int) ((distance(e2) - distance(e1))* 1000) ;
        }).collect(Collectors.toList());
        return list;
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        Task2 t = new Task2();

        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point(rnd.nextInt(10), rnd.nextInt(10)));
        points.add(new Point(rnd.nextInt(10), rnd.nextInt(10)));
        points.add(new Point(rnd.nextInt(10), rnd.nextInt(10)));
        points.add(new Point(rnd.nextInt(10), rnd.nextInt(10)));
        points.add(new Point(rnd.nextInt(10), rnd.nextInt(10)));

//        System.out.println(points);
//        System.out.println(t.maxX(points));

        ArrayList<Point> list;

        List<Point> points2 = Stream.of(new Point(1, 3), new Point(2, 6),
                new Point(1, 4), new Point(3, 3), new Point(4, 3), new Point(5, 3),
                new Point(2, 5), new Point(2, 4), new Point(2, 2), new Point(1, 6),
                new Point(8, 3)).collect(Collectors.toList());

        t.printOuDistanceFive(points2);
        System.out.println("---------");
        t.printListPoint(points2);
        System.out.println("---------");
        t.printListPoint(t.sortListPoint(points2));


    }
}
