package kostka;

import java.util.HashMap;
import java.util.Map;


public class WinStatistic implements Statistics{
    Map <Player, Integer> score = new HashMap<>();


    @Override
    public void andTheWinnerIs(Player player)
    {
        Integer wins = score.getOrDefault(player,0);
//        if(wins==null) wins=0;
        score.put(player,++wins);
    }
    @Override
    public void print()
    {
        score.forEach((player,wins)->System.out.println(player.getName() + ": " + wins));
    }
    @Override
    public void clear()
    {
        score.clear();
    }

            
}
