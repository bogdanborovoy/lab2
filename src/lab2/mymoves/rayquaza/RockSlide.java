package lab2.mymoves.rayquaza;

import lab2.Program;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public final class RockSlide extends PhysicalMove {
    public RockSlide(double pow, double acc){
        super(Type.ROCK, pow, acc);
    }

    @Override
    protected void applyOppDamage (Pokemon def, double damage){
        super.applyOppDamage(def, damage);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if (Program.chance(0.3)) {
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe(){
        return "does Rock Slide";
    }
}
