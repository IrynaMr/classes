//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
  Dog Labrador = new Dog("labrador",3,7,19500);
  Dog Spitz = new Dog("spitz",2,4,21000);
        System.out.println("Яку вагу вам потрібно?");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(Labrador.isWeight(i));
        System.out.println(Spitz.isWeight(i));

        Shop shop = new Shop ("PetsShop","чорний,білий");
        System.out.println("Який колір вам потрібно?");
        Scanner scanner1 = new Scanner(System.in);
        String i1 = scanner1.nextLine();
        System.out.println(shop.isColor(i1));
        System.out.println(shop.isColor(i1));

       ThankYou messege = new ThankYou("");
       messege.displayMessange();

    }
}