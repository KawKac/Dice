package kostka;

import java.util.Random;

public abstract class Player {
    
    private Random r = new Random();
    
    private String name = "GraczX";
    
    public Player(){}
    
    public Player(String name){
        setName(name);
    }
    
    public abstract int guess();
    
    public String getName(){
        return name;
    }
    
    public final void setName(String name){
        if(name != null && name.matches("^[a-zA-Z0-9.\\-_]{3,}$")){
            this.name = name;
        }else{
            throw new IllegalArgumentException("Nieprawidłowe imie.");
        }
    }
}
