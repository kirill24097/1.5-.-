public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        ///задание 1
        int[] ints = new int[3];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = i + 1;
        }
        double[] doubles = {1.57, 7.654, 9.989};
        boolean[] booleans = {true, false};

        /// задание2
        for (int i = 0; i < ints.length; i++) {
            System.out.print(i);
            if (i != ints.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < doubles.length; i++) {
            System.out.print(i);
            if (i != doubles.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < doubles.length; i++) {
            System.out.print(i);
            if (i != doubles.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        ///задание 3
        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.print(ints[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = booleans.length -1; i >= 0; i--) {
            System.out.print(booleans[1]);
            if (i != 0.) {
                System.out.print(", ");
            }
        }
          System.out.println();
        System.out.println();
        for (int i = booleans.length -1; i >= 0; i--) {
            System.out.print(booleans[1]);
            if (i != 3) {
                System.out.print(", ");
            }
        }
        System.out.println();
/// задание 4
           for(int i =0; i < ints.length; i++) {
               if (ints[i] % 2 == 1) {
                   ints[i]++;
               }
               System.out.print(ints[i]);
               if (i != ints.length - 1) {
                   System.out.print(", ");
               }
           }
     ///задание 5
         int prevFibonacci1 = 0;
        int prevFibonacci2 = 1;
            System.out.println(prevFibonacci1);
            System.out.println(prevFibonacci2);
            for (int i = 3; i <= 10; i++){
            int currentFibonacci = prevFibonacci1 + prevFibonacci2;
            System.out.println(prevFibonacci1);
            prevFibonacci1 = prevFibonacci2;
            prevFibonacci2 = prevFibonacci1;

        }





    }
}

















