package skills;

import ru.ifmo.se.pokemon.*;

public class Sing extends StatusMove {
    public Sing(){
        super (Type.NORMAL, 0, 0.55); // 0 - power, Accuracy(точность)
    }

    @Override
    protected String describe(){
        return "Sing усыпляет цель, если она попадает. Спящие покемоны не могут двигаться (за некоторыми исключениями, такими как Snore). Сон длится 1-3 хода.";
    }

    @Override
    protected void  applyOppEffects(Pokemon p){
        Effect.sleep(p);
    }
}