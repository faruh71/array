

public class Main {
    public static void main(String[] args) {
       //    task();
       // task13();
       task14();
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
}