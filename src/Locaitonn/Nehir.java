package Locaitonn;

import Characters.Player;
import Monsters.Ayi;

public class Nehir  extends Location{
    public Nehir(Player player){
        super(player,"nehir",new Ayi(),"WATER",3);

    }
}
