package lab2.mypokemons;

import lab2.mymoves.rayquaza.DracoMeteor;
import lab2.mymoves.rayquaza.RockSlide;
import lab2.mymoves.rayquaza.StoneEdge;
import lab2.mymoves.rayquaza.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public final class Rayquaza extends Pokemon {
    public Rayquaza(String name, int level){
        super(name, level);
        super.setType(Type.DRAGON, Type.FLYING);
        super.setStats(105, 150, 90, 150, 90, 95);

        RockSlide rockSlide = new RockSlide(75, 90);
        DracoMeteor dracoMeteor = new DracoMeteor(130, 90);
        StoneEdge stoneEdge = new StoneEdge(100, 80);
        Thunderbolt thunderbolt = new Thunderbolt(90, 100);

        super.setMove(rockSlide, dracoMeteor, stoneEdge, thunderbolt);

    }

}
