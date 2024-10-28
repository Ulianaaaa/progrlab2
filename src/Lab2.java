import pokemons.Doduo;
import pokemons.Igglybuff;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Lab2 {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Doduo("Чужой", 1);
        Pokemon p2 = new Igglybuff("Хищник", 4);
        b.addAlly(p1);
        b.addFoe(p2);
        b.go();
    }
}