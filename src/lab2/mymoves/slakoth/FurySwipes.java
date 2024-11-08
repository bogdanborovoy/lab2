package lab2.mymoves.slakoth;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public final class FurySwipes extends PhysicalMove {
    public FurySwipes(double pow, double acc){
        super(Type.NORMAL, pow, acc);

    }
    public int countHits(){
        double probability = Math.random();
        if (probability <= 3d/8d) {return  2;}
        else if (probability <= 6d/8d) {return  3;}
        else if (probability <= 7d/8d) {return  4;}
        else {return 5;}
    }

    @Override
    protected void applyOppDamage (Pokemon def, double damage){
        int hits = countHits();
        while (hits > 0) {
            super.applyOppDamage(def, damage);
            hits -= 1;}
    }

    @Override
    protected String describe(){
        return "does Fury Swipes";
    }
}
