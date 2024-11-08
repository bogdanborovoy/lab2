package lab2.mymoves.slakoth;

import ru.ifmo.se.pokemon.*;
import java.util.HashSet;
import java.util.Set;

public final class Facade extends PhysicalMove {
    public Facade(double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    public boolean checkCondition(){
        final Status pokemonStatus = new Effect().condition();
        final Set<Status> STATUSES = new HashSet<Status>();
        STATUSES.add(Status.BURN);
        STATUSES.add(Status.POISON);
        STATUSES.add(Status.PARALYZE);
        return STATUSES.contains(pokemonStatus);
    }


    @Override
    protected void applyOppDamage (Pokemon def, double damage){
        super.applyOppDamage(def, damage);

        if (checkCondition()){
            super.applyOppDamage(def, damage);
            super.applyOppDamage(def, damage);
        }
    }
    @Override
    protected String describe(){
        return "does Facade";
    }
}
