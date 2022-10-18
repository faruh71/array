import java.util.Random;

public class Main {
    public static void main(String[] args) {
       //    task();
       // task13();
      // task14();
       //  task21();
        //   task22();
        //   task23();
      //  task24();
    }
    public static void task1() {
        //1 Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
//2 объявление целочисленного массива, заполненного 12 элементами
//3 Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите
// способ создания массива:с помощью ключевого слова или сразу заполненный элементами.
        int[] weinght = new int[]{1, 2, 3};
        double[] weinght2 = {1.57, 7.654, 9.986};
        char[] cha = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < weinght.length; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(weinght[i]);
        }
        System.out.println();
        for (int i = 0; i < weinght2.length; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(weinght2[i]);
        }
        System.out.println();
        for (int i = 0; i < cha.length; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(cha[i]);
        }
    }
        public static void task13() {
            int[] weinght = new int[]{1, 2, 3};
            double[] weinght2 = {1.57, 7.654, 9.986};
            char[] cha = {'a', 'b', 'c', 'd'};
            for (int i = weinght.length -1;i >= 0;  i--) {
                System.out.print(weinght[i]);
                if (i>0){
                    System.out.print(",");
                }
            }
            System.out.println();
            for (int i = weinght2.length-1;i >= 0;  i--) {
                System.out.print(weinght2[i]);
                if (i>0) {
                    System.out.print(",");
                }
            }
            System.out.println();
            for (int i = cha.length-1;i >= 0;  i--) {
                System.out.print(cha[i]);
                if (i>0){
                    System.out.print(",");
                }

            }
        }
        public static void task14(){
            int[] weinght = new int[]{1, 2, 3};
            for (int i = 0; i < weinght.length; i++) {
               if (weinght[i]%2 != 0){
                   weinght[i]++;
               }
               if (i>0){
                   System.out.print(",");
               }
                System.out.print(weinght[i]);
            }
        }
    private static int[] generateRandomArray() {
        int[] arr = new int[30];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(100000) + 100000;
        return arr;
    }
    public static void task21() {
        int sum = 0;
        int[] arr = generateRandomArray();
        for (int value : arr) {
            sum += value;
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        }
    }

    public static void task22() {
        //Следующая задача — найти минимальную и максимальную трату за день.
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма
        // трат за день составила … рублей».Следующая задача — найти минимальную и максимальную трату за день.
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int element : arr) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.\n Максимальная сумма трат за день составила " + max + " рублей");
    }
    public static void task23() {
        //А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        //Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить
        // на количество дней), и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        //**Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).


        int[]arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Средняя сумма трат за месяц составила рублей " + sum / (float) arr.length);

    }
    public static void task24(){
        //Отойдем от подсчетов.
        //В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф.И.О. сотрудников начали отображаться в обратную сторону.
        // Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
        //Данные с именами сотрудников хранятся в виде массива символов (char[]).
        //Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде.
        // В качестве данных для массива используйте:
        //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //В результате в консоль должно быть выведено "Ivanov Ivan".
        //**Важно**: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по массиву циклом
        // и распечатать его элементы в правильном порядке.
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1;i >=0 ;i--){
            System.out.print(reverseFullName[i]);
        }
    }

}