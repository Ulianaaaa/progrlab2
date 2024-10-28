package skills;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Confide extends StatusMove {
    public Confide(){
        super (Type.NORMAL, 0, 0); // 0 - power, Accuracy(точность)
    }

    @Override
    protected String describe(){
        return "Confide cнижает специальную атаку цели на один уровень.";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, -1);
    }
}
