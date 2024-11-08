package lab2.mymoves.commonmoves;

import ru.ifmo.se.pokemon.*;

public final class WorkUp extends StatusMove {
    public WorkUp(double pow, double acc){
        super(Type.NORMAL, pow, acc);

    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect e1 = new Effect().stat(Stat.ATTACK, 1);
        Effect e2 = new Effect().stat(Stat.SPECIAL_ATTACK, 1);
        p.addEffect(e1);
        p.addEffect(e2);
    }

    @Override
    protected String describe(){
        return "does Work Up";
    }
}
