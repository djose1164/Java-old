import java.util.Scanner;

public class EnumExample {
    enum set {
        MONDAY("M"), TUESDAY("Tu"), WEDNSDAY("W"), THURSDAY("Th"), FRIDAY("F"), SATURDAY("Sa");

        private set(String abreviationString) {
            /* Hola Mundo
             * This method return the value of
             * a day.
             * Return string.
             * Bye xd.
             */
            abreviation = abreviationString;
        }

        protected String getAbreviationString() {
            /**Return a string
             * yes i do xd
             * adios.
             */
            return abreviation;
        }

        String abreviation;
    }

    public static void main(String[] args) {
        System.out.print("Type a day of the weeek: ");
        Scanner scan = new Scanner(System.in);

        String myDay = scan.next().toUpperCase();
        
        set getDay = Enum.valueOf(set.class, myDay);

        System.out.println("Your day is " + getDay);
        System.out.println("With the abreviation of " + getDay.getAbreviationString());

        scan.close();
    }
}