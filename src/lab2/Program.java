package lab2;

import lab2.mypokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Program {

    //https://pokemondb.net/pokedex/rayquaza
    //https://pokemondb.net/pokedex/tyrogue
    //https://pokemondb.net/pokedex/hitmontop
    //https://pokemondb.net/pokedex/slakoth
    //https://pokemondb.net/pokedex/vigoroth
    //https://pokemondb.net/pokedex/slaking



    public static void main(String[] args) {

        Battle b = new Battle();

        Rayquaza rayquaza = new Rayquaza("Рейкваза", 1);
        Tyrogue tyrogue = new Tyrogue("Тайрог", 1);
        Hitmontop hitmontop = new Hitmontop("Хитмонтоп", 1);
        Slakoth slakoth = new Slakoth("Слякоть", 1);
        Vigoroth vigoroth = new Vigoroth("Вигорот", 1);
        Slaking slaking = new Slaking("Слакин", 1);

        b.addAlly(hitmontop);
        b.addAlly(tyrogue);
        b.addAlly(rayquaza);

        b.addFoe(vigoroth);
        b.addFoe(slakoth);
        b.addFoe(slaking);
        
        b.go();

    }
    public static boolean chance(double d){
        return d > Math.random();
    }
}