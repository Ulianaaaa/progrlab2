package skills;

import ru.ifmo.se.pokemon.*;

public class TriAttack extends SpecialMove {
    public TriAttack(){
        super (Type.NORMAL, 80, 1); // 0 - power, Accuracy(точность)
    }

    @Override
    protected String describe(){
        return "TriAttack наносит урон и имеет 20% шанс парализовать, сжечь или заморозить цель";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.0667)
            Effect.paralyze(p);
        if (Math.random() <= 0.0667)
            Effect.burn(p);
        if (Math.random() <= 0.0667)
            Effect.freeze(p);
    }

}
