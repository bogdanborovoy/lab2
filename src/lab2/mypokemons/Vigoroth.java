package lab2.mypokemons;

import lab2.mymoves.slakoth.FurySwipes;
import lab2.mymoves.commonmoves.WorkUp;
import lab2.mymoves.slakoth.ShadowClaw;
import ru.ifmo.se.pokemon.Type;

public class Vigoroth extends Slakoth{
    public Vigoroth(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(80, 80, 80, 55, 55, 90);

        WorkUp workUp = new WorkUp(0,  0);
        ShadowClaw shadowClaw = new ShadowClaw(70, 100);
        FurySwipes furySwipes = new FurySwipes(18, 80);

        super.setMove(workUp, shadowClaw, furySwipes);
    }
}
