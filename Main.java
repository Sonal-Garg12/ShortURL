import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShortUrlGenerator tinyUrlGenerator = new ShortUrlGenerator();

        while (true) {
            System.out.println("1. Generate Tiny URL");
            System.out.println("2. Get Long URL");
            System.out.println("3. Exit");
            System.out.print(" Please Enter your choice how can I help you: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the long URL: ");
                    String longUrl = sc.nextLine();
                    String shortUrl = tinyUrlGenerator.generateTinyUrl(longUrl);
                    System.out.println("Tiny URL: " + shortUrl);
                    break;
                case 2:
                    System.out.print("Enter the Tiny URL: ");
                    String inputUrl = sc.nextLine();
                    String originalUrl = tinyUrlGenerator.getLongUrl(inputUrl);
                    System.out.println("Original URL: " + originalUrl);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please Try again.");
            }
        }
    }
}
