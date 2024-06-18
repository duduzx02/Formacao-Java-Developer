import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, media;

         a = scanner.nextDouble();
         b = scanner.nextDouble();

         media = (a * 3.5 + b * 7.5) / 11;
        System.out.printf("Media = %.5f", media);
    }
}
