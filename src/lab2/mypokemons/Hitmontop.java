package lab2.mypokemons;

import lab2.mymoves.tyrogue.Bulldoze;
import lab2.mymoves.tyrogue.LowSweep;
import lab2.mymoves.tyrogue.RollingKick;
import lab2.mymoves.commonmoves.WorkUp;
import ru.ifmo.se.pokemon.Type;

public final class Hitmontop extends Tyrogue {
    public Hitmontop(String name, int level) {
        super(name, level);
        super.setType(Type.FIGHTING);
        super.setStats(50, 95, 95, 35, 110, 70);

        Bulldoze bulldoze = new Bulldoze(60, 100);
        WorkUp workUp = new WorkUp(0,0);
        LowSweep lowSweep = new LowSweep(65, 100);
        RollingKick rollingKick = new RollingKick(60, 85);

        super.setMove(bulldoze, workUp, lowSweep, rollingKick);

    }
}
