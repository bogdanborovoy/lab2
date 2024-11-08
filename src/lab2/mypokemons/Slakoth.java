package lab2.mypokemons;

import lab2.mymoves.slakoth.ShadowClaw;
import lab2.mymoves.commonmoves.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slakoth extends Pokemon {
    public Slakoth(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(60, 60, 60, 35, 35, 30);

        WorkUp workUp = new WorkUp(0,  0);
        ShadowClaw shadowClaw = new ShadowClaw(70, 100);

        super.setMove(workUp, shadowClaw);
    }
}
