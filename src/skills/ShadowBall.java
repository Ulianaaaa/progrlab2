package skills;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class ShadowBall extends SpecialMove {
    public ShadowBall(){
        super (Type.NORMAL, 80, 1); // 0 - power, Accuracy(точность)
    }

    @Override
    protected String describe(){
        return "ShadowBall наносит урон и с вероятностью 20% снижает специальную защиту цели на один уровень";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.2)
            p.setMod(Stat.SPECIAL_DEFENSE, -1);

    }
}
