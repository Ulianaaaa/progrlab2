package skills;

import ru.ifmo.se.pokemon.*;

public class QuickAttack extends PhysicalMove {
    public QuickAttack(){
        super(Type.NORMAL, 40, 1);
    }

    @Override
    protected String describe(){

        return "Quick Attack наносит урон и имеет приоритет +1";
    }
}
//