import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Main r = new Main();
    static Scanner n = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("""
                ЛАБОРАТОРНАЯ РАБОТА №1
                ВЫПОЛНИЛ - КУЛАКОВ МАКСИМ ПМИ-10/2023
                ВАРИАНТ 1
                
                Номера заданий с 1 по 5 - нечетные (1,3,5,7,9) задания 1 темы
                Номера заданий с 6 по 10 - нечетные (1,3,5,7,9) задания 2 темы
                Номера заданий с 11 по 15 - нечетные (1,3,5,7,9) задания 3 темы
                Номера заданий с 16 по 20 - нечетные (1,3,5,7,9) задания 4 темы
                Что-бы выйти - введите 0
                
                Чтобы просмотреть интересующее вас задание - введите его номер.
                """);
        r.choise();
    }

    public void choise() {
        while(true){
            System.out.println("\nВведите число для выбора дальнейшего действия:");
            int choisenum = n.nextInt();
            if (choisenum == 0) {
                System.out.println("\nРабота программы завершена!");
                break;
            }
            else if ( 0 < choisenum && choisenum < 21){
                System.out.println(tasks(choisenum));
            }
            else{
                System.out.print("\nВведите число в указанном диапазоне");
            }
        }
    }

    public String tasks(int args) {

        switch (args) {

            case 1:
                System.out.println("""
                        Текст задания 1 темы 1
                        
                        Необходимо реализовать метод таким образом, чтобы он возвращал только
                        дробную часть числа х. Подсказка: вещественное число может быть
                        преобразовано к целому путем отбрасывания дробной части.
                        
                        """);
                System.out.println("Введите дробное число, от которого хотите узнать его часть:");
                double num0 = n.nextDouble();
                System.out.println(fraction(num0));
                break;

            case 2:
                System.out.println("""
                        Текст задания 3 темы 1
                        
                        Метод принимает символ х, который представляет собой один из “0 1 2 3 4 5 6 7
                        8 9”. Необходимо реализовать метод таким образом, чтобы он преобразовывал
                        символ в соответствующее число. Подсказка: код символа ‘0’ — это число 48.
                        
                        """);
                System.out.println("Введите число от 0 до 9, чтобы узнать его код:");
                String input = n.next();
                char num1 = input.charAt(0);
                System.out.println(charToNum(num1));
                break;

            case 3:
                System.out.println("""
                        Текст задания 5 темы 1
                        
                        Необходимо реализовать метод таким образом, чтобы он принимал число x и
                        возвращал true, если оно двузначное.
                        
                        """);
                int num3 = n.nextInt();
                System.out.println(is2Digits(num3));
                break;

            case 4:
                System.out.println("""
                        Текст задания 7 темы 1
                        
                        Метод принимает левую и правую границу (a и b) некоторого числового
                        диапазона. Необходимо реализовать метод таким образом, чтобы он возвращал
                        true, если num входит в указанный диапазон (включая границы). Обратите
                        внимание, что отношение a и b заранее неизвестно (неясно кто из них больше, а
                        кто меньше)
                        
                        """);
                System.out.println("Введите число a:");
                int num41 = n.nextInt();
                System.out.println("Введите число b:");
                int num42 = n.nextInt();
                System.out.println("Введите искомое число:");
                int num43 = n.nextInt();
                System.out.println(isInRange(num41,num42,num43));
                break;

            case 5:
                System.out.println("""
                        Текст задания 9 темы 1
                        
                        Необходимо реализовать метод таким образом, чтобы он возвращал true, если
                        все три полученных методом числа равны
                        
                        """);
                System.out.println("Введите первое число:");
                int num51 = n.nextInt();
                System.out.println("Введите второе число:");
                int num52 = n.nextInt();
                System.out.println("Введите третье число:");
                int num53 = n.nextInt();
                System.out.println(isEqual(num51,num52,num53));
                break;

            case 6:
                System.out.println("""
                        Текст задания 1 темы 2
                        
                        Необходимо реализовать метод таким образом, чтобы он возвращал модуль
                        числа х (если оно было положительным, то таким и остается, если он было
                        отрицательным – то необходимо вернуть его без знака минус).
                        
                        """);
                int num6 = n.nextInt();
                System.out.println(abs(num6));
                break;

            case 7:
                System.out.println("""
                        Текст задания 3 темы 2
                        
                        Необходимо реализовать метод таким образом, чтобы он возвращал true, если
                        число x делится нацело на 3 или 5. При этом, если оно делится и на 3, и на 5, то
                        вернуть надо false. Подсказка: оператор % позволяет получить остаток от
                        деления.
                        
                        """);
                int num7 = n.nextInt();
                System.out.println(is35(num7));
                break;

            case 8:
                System.out.println("""
                        Текст задания 5 темы 2
                        
                        Необходимо реализовать метод таким образом, чтобы он возвращал
                        максимальное из трех полученных методом чисел. Подсказка: идеальное
                        решение включает всего две инструкции if и не содержит вложенных if.
                        
                        """);
                System.out.println("Введите первое число:");
                int num81 = n.nextInt();
                System.out.println("Введите второе число:");
                int num82 = n.nextInt();
                System.out.println("Введите третье число:");
                int num83 = n.nextInt();
                System.out.println(max3(num81,num82,num83));
                break;

            case 9:
                System.out.println("""
                        Текст задания 7 темы 2
                        
                        Необходимо реализовать метод таким образом, чтобы он возвращал сумму
                        чисел x и y. Однако, если сумма попадает в диапазон от 10 до 19, то надо вернуть
                        число 20.
                        
                        """);
                System.out.println("Введите первое число:");
                int num91 = n.nextInt();
                System.out.println("Введите второе число:");
                int num92 = n.nextInt();
                System.out.println(sum2(num91,num92));
                break;

            case 10:
                System.out.println("""
                        Текст задания 9 темы 2
                        
                        Метод принимает число x, обозначающее день недели. Необходимо реализовать
                        метод таким образом, чтобы он возвращал строку, которая будет обозначать
                        текущий день недели, где 1- это понедельник, а 7 – воскресенье. Если число не
                        от 1 до 7 то верните текст “это не день недели”. Вместо if в данной задаче
                        используйте switch.
                        
                        """);
                System.out.println("Введите число:");
                int num10 = n.nextInt();
                System.out.println(day(num10));
                break;

            case 11:
                System.out.println("""
                        Текст задания 1 темы 3
                        
                        Необходимо реализовать метод таким образом, чтобы он возвращал строку, в
                        которой будут записаны все числа от 0 до x (включительно).
                        
                        """);
                int num11 = n.nextInt();
                System.out.println(listNums(num11));
                break;

            case 12:
                System.out.println("""
                        Текст задания 3 темы 3
                        
                        Необходимо реализовать метод таким образом, чтобы он возвращал строку, в
                        которой будут записаны все четные числа от 0 до x (включительно).
                        
                        """);
                System.out.println("Введите кол-во чисел:");
                int num12 = n.nextInt();
                System.out.println(chet(num12));
                break;

            case 13:
                System.out.println("""
                        Текст задания 5 темы 3
                        
                        Необходимо реализовать метод таким образом, чтобы он возвращал количество
                        знаков в числе x.
                        
                        """);
                System.out.println("Введите число:");
                long num13 = n.nextLong();
                System.out.println(numLen(num13));
                break;

            case 14:
                System.out.println("""
                        Текст задания 7 темы 3
                        
                        Необходимо реализовать метод таким образом, чтобы он выводил на экран
                        квадрат из символов ‘*’ размером х, у которого х символов в ряд и х символов в
                        высоту
                        
                        """);
                System.out.println("Введите длину квадрата:");
                int num14 = n.nextInt();
                square(num14);
                break;

            case 15:
                System.out.println("""
                        Текст задания 9 темы 3
                        
                        Необходимо реализовать метод таким образом, чтобы он выводил на экран
                        треугольник из символов ‘*’ у которого х символов в высоту, а количество
                        символов в ряду совпадает с номером строки, при этом треугольник выровнен
                        по правому краю. Подсказка: перед символами ‘*’ следует выводить
                        необходимое количество пробелов.
                        
                        """);
                System.out.println("Введите высоту треугольник:");
                int num15 = n.nextInt();
                rightTriangle(num15);
                break;

            case 16:
                System.out.println("""
                        Текст задания 1 темы 4
                        
                        Необходимо реализовать метод таким образом, чтобы он возвращал индекс
                        первого вхождения числа x в массив arr. Если число не входит в массив –
                        возвращается -1.
                        
                        """);
                System.out.println("Введите длину массива: ");
                int num161 = n.nextInt();
                int[] arr16 = new int[num161];
                System.out.println("Введите элементы массива: ");
                for (int i = 0; i < num161; i++) {
                    arr16[i] = n.nextInt();
                }
                System.out.print("Введите значение x: ");
                int num162 = n.nextInt();
                System.out.println(findFirst(arr16, num162));
                break;

            case 17:
                System.out.println("""
                        Текст задания 3 темы 4
                        
                        Необходимо реализовать метод таким образом, чтобы он возвращал
                        наибольшее по модулю (то есть без учета знака) значение массива arr
                        
                        """);
                System.out.println("Введите длину массива: ");
                int num171 = n.nextInt();
                int[] arr17 = new int[num171];
                System.out.println("Введите элементы массива: ");
                for (int i = 0; i < num171; i++) {
                    arr17[i] = n.nextInt();
                }
                System.out.println(maxAbs(arr17));
                break;

            case 18:
                System.out.println("""
                        Текст задания 5 темы 4
                        
                        Необходимо реализовать метод таким образом, чтобы он возвращал новый
                        массив, который будет содержать все элементы массива arr, однако в позицию
                        pos будут вставлены значения массива ins.
                        
                        """);
                System.out.println("Введите длину массива arr: ");
                int num181 = n.nextInt();
                int[] arr181 = new int[num181];
                System.out.println("Введите элементы массива arr: ");
                for (int i = 0; i < num181; i++) {
                    arr181[i] = n.nextInt();
                }
                System.out.println("Введите длину массива ins: ");
                int num182 = n.nextInt();
                int[] arr182 = new int[num182];
                System.out.println("Введите элементы массива ins: ");
                for (int i = 0; i < num182; i++) {
                    arr182[i] = n.nextInt();
                }
                System.out.println("Введите позицию pos: ");
                int num183 = n.nextInt();
                int[] arr184 = add(arr181,arr182,num183);
                Arrays.stream(arr184).forEach(System.out::println);
                break;

            case 19:
                System.out.println("""
                        Текст задания 7 темы 4
                        
                        Необходимо реализовать метод таким образом, чтобы он возвращал новый
                        массив, в котором значения массива arr записаны задом наперед.
                        
                        """);
                System.out.println("Введите длину массива arr: ");
                int num191 = n.nextInt();
                int[] arr191 = new int[num191];
                System.out.println("Введите элементы массива arr: ");
                for (int i = 0; i < num191; i++) {
                    arr191[i] = n.nextInt();
                }
                int[] arr192 = reverseBack(arr191);
                Arrays.stream(arr192).forEach(System.out::println);
                break;

            case 20:
                System.out.println("""
                        Текст задания 9 темы 4
                        
                        Необходимо реализовать метод таким образом, чтобы он возвращал новый
                        массив, в котором записаны индексы всех вхождений числа x в массив arr.
                        
                        """);
                System.out.println("Введите длину массива arr: ");
                int num201 = n.nextInt();
                int[] arr201 = new int[num201];
                System.out.println("Введите элементы массива arr: ");
                for (int i = 0; i < num201; i++) {
                    arr201[i] = n.nextInt();
                }
                System.out.println("Введите число:");
                int num202 = n.nextInt();
                int[] arr202 = findAll(arr201,num202);
                Arrays.stream(arr202).forEach(System.out::println);
                break;

        }
        return("Задание выполнено.");
    }

    public double fraction (double x) {
        int y = (int) x;
        return (x - y);
    }

    public int charToNum (char x)  {
        return (Character.getNumericValue(x)+48);
    }

    public boolean is2Digits (int x) {
        return 10 <= x && x <= 99;
    }

    public boolean isInRange (int a, int b, int num) {
        if (a > b) {
            return b <= num && num <= a;
        } else if (a < b) {
            return a <= num && num <= b;
        } else return a == num;
    }

    public boolean isEqual(int a, int b, int c) {
        return (a == b) && (b == c);
    }

    public int abs (int x) {
        if (0 <= x) {
            return x;
        } else {
            return -x;
        }
    }

    public boolean is35 (int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return false;
        }
        else if (x % 3 == 0 || x % 5 == 0) {
            return true;
        } else {
            return  false;
        }
    }

    public int max3 (int x, int y, int z) {
        int min = 0;
        if (x > y) {
            min = x;
        } else {
            min = y;
        }
        if (z > min) {
            return z;
        } else {
            return  min;
        }
    }

    public int sum2 (int x, int y) {
        int sum = x + y;
        if (10 <= sum && sum <= 19) {
            return 20;
        }
        else {
            return sum;
        }
    }

    public String day (int x) {
        return switch (x) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "Неверный день недели";
        };
    }

    public String listNums (int x) {
        String result = "";
        for (int i = 0; i <= x; i++) {
            result += i + " ";
        };
        return result;
    }

    public String chet (int x) {
        String result = "";
        int max = 0;
        while (x >= max) {
            result += max + " ";
            max += 2;
        };
        return result;

    }

    public int numLen (long x) {
        int count = 0;
        while (x != 0) {
            x /= 10;
            count++;
        }
        return count;

    }

    public void square (int x) {
        for (int i = 0; i < x; i++) {
            String result = "";
            for (int y = 0; y < x; y++) {
                result += "*";
            };
            System.out.println(result);
        };
    }

    public void rightTriangle (int x) {
        int number = 0;
        for (int i = 0; i < x; i++) {
            String result = "";
            for (int y = 0; y < x; y++) {
                if (i <= number) {
                    result += "*";
                } else {
                    result += " ";
                }
                ;
                System.out.println(result);
            }
            ;
        }
    }

    public int findFirst (int[] arr, int x) {
        int id = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                id = i;
                return id;
            }
        } return id;
    }

    public int maxAbs (int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(max)) {
                max = arr[i];
            }
        }
        return max;
    }

    public int[] add(int[] arr, int[] ins, int pos) {
        if (pos < 0 || pos > arr.length) {
            System.out.println("Данная позиция не может быть использована");
            int[] result = new int[0];
            return result;
        } else {
            int[] result = new int[arr.length + ins.length];
            System.arraycopy(arr, 0, result, 0, pos);
            System.arraycopy(ins, 0, result, pos, ins.length);
            System.arraycopy(arr, pos, result, pos + ins.length, arr.length - pos);
            return result;
        }
    }

    public int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];
        int result_id = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[result_id] = arr[i];
            result_id++;
        }
        return result;
    }

    public int[] findAll (int[] arr, int x) {
        int id = -1;
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                num1++;
            }
        }
        int[] result = new int[num1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[num2] = i;
                num2++;
            }
        }
        return result;
    }
}