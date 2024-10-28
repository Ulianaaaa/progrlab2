package skills;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class FireBlast extends SpecialMove {
    public FireBlast(){
        super (Type.NORMAL, 110, 0.85); // 0 - power, Accuracy(точность)
    }

    @Override
    protected String describe(){
        return "FireBlast наносит урон и имеет 10% шанс сжечь цель";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.1)
            Effect.burn(p);

    }
}
