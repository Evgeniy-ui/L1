package ru.geekbrains.L1;

// 1 Создать переменные всех пройденных типов данных и инициализировать их значения.
// 2 (Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//   где a, b, c, d – аргументы этого метода, имеющие тип float.)
// 3 (Написать метод, принимающий на вход два целых числа и проверяющий,
//   что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.)
// 4 (Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
//   положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.)

// 5 (Написать метод, которому в качестве параметра передается целое число.
//   Метод должен вернуть true, если число отрицательное.)
// 6 (Написать метод, которому в качестве параметра передается строка, обозначающая имя.
//   Метод должен вывести в консоль сообщение «Привет, указанное_имя!».)
// 7 (*Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
//   Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.)

//number 0
/*
public class LessonFirst {
    public static void main(String[] args) {
        System.out.println("Hi");
    }
}

 */

// number1
// 1 Создать переменные всех пройденных типов данных и инициализировать их значения.
/*
public class LessonFirst {
    public static void main(String[] args){
     byte a = 10;
     short b = 300;
     int c = 3000;
     long d = 30000L;
     boolean e, f;
     e = true;
     f = false;
     float g = 3.15f;
     double h = 3.155;
     char ch = '*';  // кодировка юникод

     }
}
*/

//number2
// 2 (Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//   где a, b, c, d – аргументы этого метода, имеющие тип float.)

/*
public class LessonFirst {
    public static void main(String[] args) {
        float a, b, c, d, e;
        a = 2.5f;
        b = 5.2f;
        c = 2.2f;
        d = 1.5f;
        e = (a * (b + (c / d)));
        System.out.println(e);
    }
    public static float summ(float a, float b, float c, float d) {
        a = 2.5f;
        b = 5.2f;
        c = 2.2f;
        d = 1.5f;

        return a + b + c +d;
    }
}
*/


// number 3
// 3 (Написать метод, принимающий на вход два целых числа и проверяющий,
//   что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.)
/*
public class LessonFirst {
    public static void main(String[] args) {
        int a, b;
        a = 8;
        b = 10;

        boolean c, d;
        c = true;
        if ((a + b) >= 10 | (a + b) <= 20) {
            System.out.println(c);
        }

        d = false;
        if ((a + b) <= 10 | (a + b) >= 20) {
            System.out.println(d);
        }

    }
    public static int summ(int a, int b) {
        a = 8;
        b = 10;

        return a + b;
    }
}

 */
// number 4
// 4 (Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
//   положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.)
/*
public class LessonFirst {
    public static void main(String[] args) {
        int a;
        a = 5;
        int b = 0;
        int c = -5;
        if (a <= b) {
            System.out.println("число отрицательное");
        }
        if (a >= b) {
            System.out.println("Число положительное");
        }
        if (b == 0) {
            System.out.println("ноль положителен");
        }
        if (c <= a | c <= b) {
            System.out.println("число отрицательное");
        }
    }
    public static int summ(int a, int b, int c) {
         a = 5;
         b = 0;
         c = -5;
         return a + b + c;
    }
}
*/

// number 5
// 5 (Написать метод, которому в качестве параметра передается целое число.
//   Метод должен вернуть true, если число отрицательное.)
/*
public class LessonFirst {
    public static void main(String[] args) {
        int a;
        a = -5;
        boolean b, c;
        b = true;
        if (a <= 0) {
            System.out.println("число отрицательное");
        }
        c = false;
        if (a >= 0) {
            System.out.println("Число положительное");
        }
    }
}
*/

//number 6
// 6 (Написать метод, которому в качестве параметра передается строка, обозначающая имя.
//   Метод должен вывести в консоль сообщение «Привет, указанное_имя!».)
/*
public class LessonFirst {
    public static void main(String[] args) {
        printMyText("ПРИВЕТ ВСЕМ");
    }

    public static void printMyText(String txtToPrint) {
          System.out.println("ПРИВЕТ ВСЕМ");
      }


     //   public static void greetings(String name){
     //         System.out.println("ПРИВЕТ ВСЕМ");
     //     }  // не понятно

}

 */

// number 7
// 7 (*Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
////   Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.)

public class LessonFirst {
    public static void main(String[] args) {
        int a;
        a = 2020; // точка отчета
        int b = 4;  //интервал между годами, когда високосный
        int d = (a + b);  // след.год високосный
        int c = (a + 100);  // точка отчета, каждый сотый год невисокосный
        int e = (a + 400);  // точка отчета, каждый четырехсотый год високосный
        System.out.println("ГОД ВИСОКОСНЫЙ" + "\t" + a + "г");
        System.out.println("каждый четвертый ГОД ВИСОКОСНЫЙ" + "\t" + d + "г");
        System.out.println("ГОД НЕВИСОКОСНЫЙ" + "\t" + c + "г");
        System.out.println("ГОД ВИСОКОСНЫЙ" + "\t" + e + "г");
        boolean z, x, v;
        z = true;
        if (a == 2020 | d == e) {
            System.out.println("високосный год" + "\t" + a + "г" + "\t" + d + "г" + "\t" + e + "г");

        }

        x = false;
        if (a != c | d != c) {
            System.out.println("невисокосный" + "\n" + "\t\t" + "год" + "\t\t\t" + c + "г");
        }
    }
}

    /*
      int a, b, c, d, e;
      for (a = 2020; b = 4; c = (a + b); d = 100; e = (a + d); c != e | a <= c; a++) {
      System.out.println(a);
      }
      // понять формулу нужно цикла,  но наверно списком нужно выводить года а как ? do while
}
*/
