package skills;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(){
        super (Type.NORMAL, 0, 0.85); // 0 - power, Accuracy(точность)
    }

    @Override
    protected String describe(){
        return "Swagger сбивает цель с толку и повышает ее атаку на два уровня";
    }

    @Override
    protected void  applyOppEffects(Pokemon p){
        Effect.confuse(p);
    }

    @Override
    protected void  applySelfEffects(Pokemon p){
        p.addEffect(new Effect().stat(Stat.ATTACK, 2));
    }
}

