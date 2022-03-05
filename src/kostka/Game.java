package kostka;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    protected List<Player> players = new ArrayList();
    
    Statistics stats = new NullStatistics();
    
    public Game(){}
    
    
    private Random rand = new Random();     

    public Game(Statistics stats)
    {
        if(stats != null)
        {
            this.stats = stats;
        }
    }
    
    public void addPlayer(Player player) {
        if(isNameExists(player))
        {
            player.setName(player.getName() + "1");
            addPlayer(player);
        }
        else
        {
            players.add(player);
        }
    }

    private boolean isNameExists(Player player) {
        //return players.stream().anyMatch(p -> (player.getName().equals(p.getName())));
        
        for(Player p : players)
        {
            if (player.getName().equals(p.getName()))
            {
                return true;
            }
        }
        return false;
    }

    public void play() {
        int number;                     
        int guess;                      

        boolean repeat;

        do {
            System.out.println("---------------------");

            repeat = true;

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            for (Player player : players) {
                guess = player.guess(); 
                System.out.println("Gracz " + player.getName() + ": " + guess);

                if (number != guess) {
                    System.out.println("PUDŁO!");
                } else {
                    System.out.println("BRAWO!");
                    repeat = false;
                }
            }

        } while (repeat);

    }

    void printPlayers() {
        players.forEach(s -> {
            System.out.println(s);
        });
    }

    void removePlayer(String name ) {
        for( int i = 0; i<players.size(); ++i)
        {
            if(players.get(i).getName().equals(name))
            {
                players.remove(i);
                break;
            }   
        }
        
        //players.removeIf(player -> player.getName().equals(name));
         
    }

    void printStats() {
        stats.print();
    }
}