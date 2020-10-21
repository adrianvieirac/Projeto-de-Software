import java.util.Scanner;

public class week1 {

    public static void main(String[] args) {
        int age;
        System.out.print("Vamos calcuar quantos dias você esta neste planeta!\nDigite sua idade: ");
        Scanner teclado = new Scanner(System.in);
        String sage = teclado.nextLine();
        age = Integer.parseInt(sage);
        System.out.println("Você está neste planeta há: " + age*365 + " dias aproximadamente.");
        teclado.close();
    }
}