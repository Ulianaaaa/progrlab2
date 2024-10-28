package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import skills.EarthPower;
import skills.Facade;
import skills.FireBlast;
import skills.FlashCannon;

public class Heatran extends Pokemon {
    public Heatran (String name, int level){
        super(name, level);
        this.setType(Type.FIRE, Type.STEEL);
        this.setStats(91, 90, 106, 130, 106, 77);
        this.setMove(new EarthPower(), new Facade(), new FlashCannon(), new FireBlast());
    }
}
