package lab2.mymoves.tyrogue;

import lab2.Program;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class RollingKick extends PhysicalMove {
    public RollingKick(double pow, double acc){
        super(Type.FIGHTING, pow, acc);

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
        return "does Rolling Kick";
    }
}
