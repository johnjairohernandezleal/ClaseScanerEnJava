import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Por favor nombre del libro");
        var titulo = scanner.nextLine();
        System.out.println("Por favor nombre del autor");
        var autor = scanner.nextLine();
        System.out.println(titulo + " fue escrito por: " + autor);
    }
}
