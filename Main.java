import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        semallest();
        qq();
        hh();
    }

    public static void semallest() {
        int first_num = 25;
        int second_num = 37;
        int third_num = 29;

        if (first_num <= second_num) {

            System.out.println(first_num);
        } else if (second_num <= third_num) {
            System.out.println(second_num);
        } else {
            System.out.println(third_num);
        }
    }

    //q2
    public static void qq() {
        Scanner g = new Scanner(System.in);
        System.out.println(" enter the number:  ");
        int num= g.nextInt();;

        if (num > 0) {
            System.out.println("the number positive");

        } else if (num < 0) {
            System.out.println("the number negative");
        } else{
            System.out.println("the number zero");


        }

    }


        //q3

        public static void hh() {

            Scanner H = new Scanner(System.in);
            System.out.println("1.password must have at least ten character");
            System.out.println("2.password consist of only letters and digits");
            System.out.println("3.password must contain at least tow digits");
            System.out.println(" enter the password: ");
            String pass = H.next();

            int password = 8;

            if (pass.length() < password) {
                System.out.println("error");

            }
            else if (pass.length() >= password) {
                System.out.println("you are agreeing to the above terms and coditions:"+pass);
                System.out.println("password is valid :"+pass);

            }



            }





}











