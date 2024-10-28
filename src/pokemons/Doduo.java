package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import skills.Confide;
import skills.QuickAttack;
import skills.Swagger;

public class Doduo extends Pokemon {
    public Doduo (String name, int level){
        super(name, level);
        this.setType(Type.NORMAL, Type.FLYING);
        this.setStats(35, 85, 45, 35, 35, 75);
        this.setMove(new Swagger(), new QuickAttack(), new Confide());
    }
}
