public class MethodsExercises {

    public static String addition(long num1, long num2) {
        long sum = num1 + num2;
        return num1 + " + " + num2 + " = " + sum;
        }

    public static String subtraction(long num1, long num2) {
        long difference = num1 - num2;
        return num1 + " - " + num2 + " = " + difference;
    }

   public static String multipliction(long num1, long num2) {
        long product = num1 * num2;
        return num1 + " * " + num2 + " = " + product;
        }

    public static String division(long num1, long num2) {
        long quotient = num1 / num2;
        return "Your numbers divided are " + quotient;
    }






    public static String multipliction2(long num1, long num2) {
        long product = 0;
        if(num2 == 0 || num1 == 0) {
            return num1 + " * " + num2 + " = " + product;

        } else if (num1 > 0 && num2 > 0) {
            for (int i = 0; i != num2; i++) {
                product += num1;
            }
        } else if (num2 < 0 && num1 < 0) {
            for (int i = 0; i != num2; i--) {
                product -= num1;
            }

        } else if(num1 < 0){
            for (int i = 0; i != num2; i++) {
                product += num1;
            }

        } else {
            for (int i = 0; i != num1; i++) {
                product += num2;
            }
        }
        return num1 + " * " + num2 + " = " + product;
    }

    public static void main(String[] args) {
//        System.out.println(addition(5, 5));
//        System.out.println(subtraction(5, 5));
//        System.out.println(multipliction(5, 5));
        System.out.println(multipliction2(-5, -2));
        System.out.println(multipliction2(5, 2));
        System.out.println(multipliction2(-5, 2));
        System.out.println(multipliction2(5, -2));
        System.out.println(multipliction2(5, 0));
        System.out.println(multipliction2(0, 5));
        System.out.println(multipliction2(0, 0));

//        System.out.println(division(5, 5));
    }
}
