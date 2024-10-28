package pokemons;

import ru.ifmo.se.pokemon.Type;
import skills.Confide;
import skills.QuickAttack;
import skills.Swagger;
import skills.TriAttack;

public class Dodrio extends Doduo{
    public Dodrio (String name, int level){
        super(name, level);
        this.setType(Type.NORMAL, Type.FLYING);
        this.setStats(60, 110, 70, 60, 60, 110);
        this.setMove(new Swagger(), new QuickAttack(), new Confide(), new TriAttack());
    }
}
