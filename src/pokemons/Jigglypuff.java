package pokemons;

import ru.ifmo.se.pokemon.Type;
import skills.*;

public class Jigglypuff extends Igglybuff{
    public Jigglypuff (String name, int level){
        super(name, level);
        this.setType(Type.NORMAL, Type.FAIRY);
        this.setStats(115, 45, 20, 45, 25, 20);
        this.setMove(new Sing(), new ShadowBall(), new DisarmingVoice());
    }
}
