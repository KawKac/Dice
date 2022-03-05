package kostka;

import java.util.Random;
import java.util.ArrayList;
import java.util.Iterator;

public class Kostka {

    public static void main(String[] args) {
        Game game = new Game(new WinStatistic());
        game.addPlayer(new PlayerComp("Janusz1"));
        game.addPlayer(new PlayerComp("Janusz2"));
        game.addPlayer(new PlayerComp("Janusz3"));
        //game.play();
        game.printPlayers();
        game.removePlayer("Janusz2");
        game.printPlayers();
        
        
        for(int i=0; i<100; ++i)
        {
            game.play();
        }
        
        game.printStats();
        
        /*
        ArrayList<String> list = new ArrayList();
        list.add("jeden");
        list.add("dwa");
        list.add("trzy");
        
        System.out.println(list);
        System.out.println("---------------------------------------");         
        for( int i = 0; i<list.size(); ++i)
        {
            System.out.println(list.get(i));
        }
        System.out.println("---------------------------------------");
        for (String s : list)
        {
            System.out.println(s);
        }
        System.out.println("---------------------------------------");
        
        Iterator<String> it = list.iterator();
        
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        */
    }       
}