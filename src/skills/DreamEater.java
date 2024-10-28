package skills;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    public DreamEater(){
        super (Type.NORMAL, 1, 1); // 0 - power, Accuracy(точность)
    }

    @Override
    protected String describe(){
        return "Dream Eater наносит урон только спящим противникам, и пользователь восстанавливает 50% израсходованного HP";
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.HP, 50);
    }
}
