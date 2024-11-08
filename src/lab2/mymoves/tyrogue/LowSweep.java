package lab2.mymoves.tyrogue;

import ru.ifmo.se.pokemon.*;

public final class LowSweep extends PhysicalMove {
    public LowSweep(double pow, double acc){
        super(Type.FIGHTING, pow, acc);

    }
    @Override
    protected void applyOppDamage (Pokemon def, double damage){
        super.applyOppDamage(def, damage);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect e = new Effect().stat(Stat.SPEED, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe(){
        return "does Low Sweep";
    }
}
