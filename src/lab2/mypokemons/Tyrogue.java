package lab2.mypokemons;

import lab2.mymoves.tyrogue.Bulldoze;
import lab2.mymoves.tyrogue.LowSweep;
import lab2.mymoves.commonmoves.WorkUp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tyrogue extends Pokemon {
    public Tyrogue(String name, int level) {
        super(name, level);
        super.setType(Type.FIGHTING);
        super.setStats(35, 35, 35, 35, 35, 35);

        Bulldoze bulldoze = new Bulldoze(60, 100);
        WorkUp workUp = new WorkUp(0,0);
        LowSweep lowSweep = new LowSweep(65, 100);

        super.setMove(bulldoze, workUp, lowSweep);

    }
}
