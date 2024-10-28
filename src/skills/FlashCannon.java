package skills;

import ru.ifmo.se.pokemon.*;

public class FlashCannon extends SpecialMove {
    public FlashCannon(){
        super (Type.NORMAL, 80, 1); // 0 - power, Accuracy(точность)
    }

    @Override
    protected String describe(){
        return "FlashCannon наносит урон и имеет 10% шанс снизить специальную защиту цели на один уровень";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.1)
            p.setMod(Stat.SPECIAL_DEFENSE, -1);

    }
}
