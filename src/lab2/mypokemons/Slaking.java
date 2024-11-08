package lab2.mypokemons;

import lab2.mymoves.commonmoves.WorkUp;
import lab2.mymoves.slakoth.Facade;
import lab2.mymoves.slakoth.FurySwipes;
import lab2.mymoves.slakoth.ShadowClaw;
import ru.ifmo.se.pokemon.Type;

public final class Slaking extends Vigoroth{
    public Slaking(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(150, 160, 100, 95, 65, 100);

        WorkUp workUp = new WorkUp(0,  0);
        ShadowClaw shadowClaw = new ShadowClaw(70, 100);
        FurySwipes furySwipes = new FurySwipes(18, 80);
        Facade facade = new Facade(70,100);

        super.setMove(workUp, shadowClaw, furySwipes, facade);
    }
}
