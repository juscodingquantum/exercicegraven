import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // créer une liste qui va stocker plusieurs objet
        List<Toy> Toys = new ArrayList<>();
        Toys.add(new Toy("Yugiho Card", 20, "card", 5));
        Toys.add(new Toy("Pokemon card", 70, "card", 5));
        Toys.add(new Toy("Arthur the Game", 80, "Switch Video game", 15));
        Toys.add(new Toy("Barbie", 49, "Toy", 5));



        // si on veut que cela soit plus lisible , on va utiliser uen boucle
        for(Toy toy : Toys) {
            System.out.println("Toy:" + toy.getName() + " (" + toy.getPrice() + "$) " + toy.getDescription() + " (promo : " + toy.getPromo() +"% de réduction) ");
        }

        // Afficher par ordre alphabétique

    }
}