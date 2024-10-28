package skills;

import ru.ifmo.se.pokemon.*;

public class DisarmingVoice extends SpecialMove {
    public DisarmingVoice(){
        super(Type.FAIRY, 40, 1);
    }

    @Override
    protected String describe(){
        return "Disarming Voice наносит урон и игнорирует изменения показателей точности и уклонения";
    }
}
