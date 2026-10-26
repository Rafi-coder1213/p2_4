import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Wybierz funckje: ");
    System.out.print("Wybierz działanie (1-suma, 2-różnica, 3-iloczyn, 4-iloraz): ");
            int wybor = scanner.nextInt();

            System.out.print("Podaj pierwszą liczbę: ");
            double liczba1 = scanner.nextDouble();

            System.out.print("Podaj drugą liczbę: ");
            double liczba2 = scanner.nextDouble();

            switch (wybor) {
                case 1:
                    System.out.println("Wynik sumy: " + (liczba1 + liczba2));
                    break;
                case 2:
                    System.out.println("Wynik różnicy: " + (liczba1 - liczba2));
                    break;
                case 3:
                    System.out.println("Wynik iloczynu: " + (liczba1 * liczba2));
                    break;
                case 4:
                    if (liczba2 == 0) {
                        System.out.println("Błąd: Nie można dzielić przez 0!");
                    } else {
                        System.out.println("Wynik ilorazu: " + (liczba1 / liczba2));
                    }
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór. Wybierz cyfrę od 1 do 4.");
                    break;
            }

            scanner.close();
        }
    }
    

