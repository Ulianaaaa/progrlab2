package skills;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70, 1);
    }
    @Override
    protected String describe(){
        return "Facade наносит урон и бьет с двойной силой";
    }
    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def){
        if (att.getCondition()==Status.BURN | att.getCondition()==Status.POISON | att.getCondition()==Status.PARALYZE){
            return 2*super.calcBaseDamage(att, def);
        }
        else {
            return super.calcBaseDamage(att, def);
        }
    }
}
