package skills;

import ru.ifmo.se.pokemon.*;

public class EarthPower extends SpecialMove {
    public EarthPower(){
        super (Type.NORMAL, 90, 1); // 0 - power, Accuracy(точность)
    }

    @Override
    protected String describe(){
        return "EarthPower наносит урон и с вероятностью 10% снижает специальную защиту цели на одну ступень";
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if(Math.random() <= 0.1)
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
    }
}
