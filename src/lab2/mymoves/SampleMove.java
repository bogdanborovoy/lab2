package lab2.mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class SampleMove extends PhysicalMove {
    public SampleMove(double pow, double acc){
        super(Type.NORMAL, pow, acc);

    }
    @Override
    protected void applyOppDamage (Pokemon def, double damage){
        super.applyOppDamage(def, damage);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
    }

    @Override
    protected String describe(){
        return "does Sample Move";
    }
}
