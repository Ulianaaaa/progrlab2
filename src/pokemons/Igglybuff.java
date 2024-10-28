package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import skills.ShadowBall;
import skills.Sing;

public class Igglybuff extends Pokemon {
    public Igglybuff (String name, int level){
        super(name, level);
        this.setType(Type.NORMAL, Type.FAIRY);
        this.setStats(90, 30, 15, 40, 20, 15);
        this.setMove(new Sing(), new ShadowBall());
    }
}
