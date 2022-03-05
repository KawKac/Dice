package kostka;

import java.util.Scanner;

public class PlayerHuman extends Player{
    private Scanner s = new Scanner(System.in);
    
    public PlayerHuman(){}
    
    public PlayerHuman(String name){
        super(name);
    }
    
    public int guess(){
        System.out.println("Wpisz liczbe 1-6: ");
        return s.nextInt();
    }
}
