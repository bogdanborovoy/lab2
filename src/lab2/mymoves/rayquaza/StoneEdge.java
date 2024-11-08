package lab2.mymoves.rayquaza;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class StoneEdge extends PhysicalMove {
    public StoneEdge(double pow, double acc){
        super(Type.ROCK, pow, acc);
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
        return "does Stone Edge";
    }
}
