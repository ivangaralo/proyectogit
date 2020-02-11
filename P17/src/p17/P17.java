/*
Subprogramas Metodos Function Procedimientos
Conversiones
 */
package p17;

import java.util.Scanner;

public class P17 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        keyboard.useDelimiter("\n");

        int option = -1;
        
        while (option != 0) {
            userMenu();
            option = keyboard.nextInt();
            switch (option) {//switch
                
                case 1:
                    p1();
                    /*
                    System.out.println("Euros");
                    euro = keyboard.nextInt();
                    dolars = functionIvan(euro);
                    System.out.println(dolars);
                    */
                    break;

                case 2:
                    p2();
                    break;
                     /*
                    System.out.println("Euros");
                    euro = keyboard.nextInt();
                    dolarsDouble = functionIntToDouble(euro);
                    System.out.println(dolarsDouble);
                    */
                    
                case 3:
                    p3();
                    break;
                    /*
                    System.out.print("Euros:");
                    euro = keyboard.nextInt();
                    String euros = functionIntDouble(euro);
                    System.out.println(euros)                    
                    */
                    
                case 4:
                    p4();
                    break;
                    /*
                    System.out.print("Euros:");
                    euro = keyboard.nextInt();
                    dolarsInt = functionIntString(euro);
                    System.out.println(dolarsInt + "")
                    */

                case 5:
                    p5();
                    break;

                case 6:
                    p6();
                    break;

                case 7:
                    p7();
                    break;

                case 8:
                    p8();
                    break;

                case 9:
                    p9();
                    break;

                case 10:
                    p10();
                    break;

                default:
                    System.out.println("Invalid Option");
            }//end witch
        }
        
        /*
        
        private static double functionIntToDobule (int boxEuro) {
        float result = 0;
        result = (float) (boxEuro * 1.1f);
        
        
        
        private static String functionIntToString(int boxEuro)
        String result;
        String result=String.valueOf(boxEuro*1.1f);
        return result;
*/
    }

    private static void userMenu() {
        System.out.println("");
        System.out.println("Choose one exercise:");
        System.out.println("--Exercise 1--");
        System.out.println("--Exercise 2--");
        System.out.println("--Exercise 3--");
        System.out.println("--Exercise 4--");
        System.out.println("--Exercise 5--");
        System.out.println("--Exercise 6--");
        System.out.println("--Exercise 7--");
        System.out.println("--Exercise 8--");
        System.out.println("--Exercise 9--");
        System.out.println("--Exercise 10--");
        System.out.println("Insert 0 to exit");
        System.out.print("\nYour asnwer: ");
    }

    private static float p1() {

        System.out.print("Insert a value: ");
        int quantity = keyboard.nextInt();
        float converter = (float) quantity;

        System.out.println(quantity + "€ = " + converter + "x");

        return converter;
    }

    private static double p2() {

        System.out.print("Insert a value: ");
        int quantity = keyboard.nextInt();
        double converter = (double) quantity;

        System.out.println(quantity + "€ = " + converter + "x");

        return converter;
    }

    private static String p3() {
        System.out.print("Insert a value: ");
        int quantity = keyboard.nextInt();
        String converter = Integer.toString(quantity);

        System.out.println(quantity + "€ = " + converter + "x");

        return converter;
    }

    private static int p4() {
        System.out.print("Insert a value: ");
        String quantity = keyboard.next();
        int converter = Integer.parseInt(quantity);

        System.out.println(quantity + "€ = " + converter + "x");

        return converter;
    }

    private static int p5() {
        System.out.print("Insert a value: ");
        float quantity = keyboard.nextFloat();
        int converter = (int) quantity;

        System.out.println(quantity + "€ = " + converter + "x");

        return converter;
    }

    private static String p6() {
        System.out.print("Insert a value: ");
        float quantity = keyboard.nextFloat();
        String converter = Float.toString(quantity);

        System.out.println(quantity + "€ = " + converter + "x");

        return converter;
    }

    private static void p7() {
        System.out.println("Insert a value: ");
        String aux = keyboard.next();
        char letter = aux.charAt(0);
        int a = (int) letter;
        System.out.println("Whole equivalence = " + a);
        System.out.println("Binary equivalence = " + Integer.toBinaryString(a));;
    }

    private static String p8() {
        System.out.print("Insert a character: ");
        String aux = keyboard.next();
        char letter = aux.charAt(0);
        int a = (int) letter;

        System.out.println("Binary equivalence = " + Integer.toBinaryString(a));;

        return Integer.toBinaryString(a);
    }

    private static void p9() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private static void p10() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}//FIN DE CLASS
