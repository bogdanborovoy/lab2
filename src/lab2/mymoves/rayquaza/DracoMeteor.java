package lab2.mymoves.rayquaza;

import ru.ifmo.se.pokemon.*;

public final class DracoMeteor extends SpecialMove {
    public DracoMeteor(double pow, double acc){
        super(Type.DRAGON, pow, acc);

    }
    @Override
    protected void applyOppDamage (Pokemon def, double damage){
        super.applyOppDamage(def, damage);
    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, -2);
        p.addEffect(e);
    }

    @Override
    protected String describe(){
        return "does Draco Meteor";
    }

}
