package lab2.mymoves.rayquaza;

import lab2.Program;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public final class Thunderbolt extends SpecialMove {
    public Thunderbolt(double pow, double acc){
        super(Type.ELECTRIC, pow, acc);

    }

    @Override
    protected void applyOppDamage (Pokemon def, double damage){
        super.applyOppDamage(def, damage);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if (Program.chance(0.1)){
            Effect.paralyze(p);
        }
    }
    @Override
    protected String describe(){
        return "does Thunderbolt";
    }
}
