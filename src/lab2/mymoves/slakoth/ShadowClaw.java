package lab2.mymoves.slakoth;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class ShadowClaw extends PhysicalMove {
    public ShadowClaw(double pow, double acc){
        super(Type.GHOST, pow, acc);
    }

    @Override
    protected void applyOppDamage (Pokemon def, double damage){
        super.applyOppDamage(def, damage);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        return 1d/8d;
    }

    @Override
    protected String describe(){
        return "does Shadow Claw";
    }
}
