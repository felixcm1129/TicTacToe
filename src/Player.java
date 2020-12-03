public class Player {

    private char symbol;
   
    Player(char symbol)
    {
        this.symbol = symbol;
    }

    public char getSymbol()
    {
        return symbol;
    }   

    public void setSymbol(char s)
    {
        this.symbol = s;
    }
}