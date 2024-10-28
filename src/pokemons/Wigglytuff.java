package pokemons;

import ru.ifmo.se.pokemon.Type;
import skills.DisarmingVoice;
import skills.DreamEater;
import skills.ShadowBall;
import skills.Sing;

public class Wigglytuff extends Jigglypuff{
    public Wigglytuff (String name, int level){
        super(name, level);
        this.setType(Type.NORMAL, Type.FAIRY);
        this.setStats(140, 70, 45, 85, 50, 45);
        this.setMove(new Sing(), new ShadowBall(), new DisarmingVoice(), new DreamEater());
    }
}
