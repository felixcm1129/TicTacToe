import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    
    private Grid grid;
    private Player[] player;
    private Boolean end;
    private ArrayList<Integer> player1Positions = new ArrayList<Integer>();
    private ArrayList<Integer> player2Positions = new ArrayList<Integer>();
    private ArrayList<Integer> positionsDisponible = new ArrayList<Integer>();
    private String user;
    private int turn;
    private char symbol;
    private Boolean play = false;
    private State state;
    Scanner scan = new Scanner(System.in);

    enum State{
        ConfigGame,
        Playing,
        End
    }

    public Boolean Playing()
    {
        if(state == State.ConfigGame)
        {
            state = State.Playing;
            return true;
        }
        else return false;
    }

    public Boolean End()
    {
        if(state == State.Playing || state == State.ConfigGame)
        {
            state = State.End;
            return true;
        }
        else return false;
    }

    public TicTacToe()
    {
        state = State.ConfigGame;
        System.out.println("Ã‰tat : " + state + "\n");

        this.player = new Player[2];
        this.player[0] = new Player('X');
        this.player[1] = new Player('O');
        setPositionsDisponible();

        this.grid = new Grid();

        end = false;

        turn = 0;

        System.out.println("\nJeux TicTacToe!\n");
        System.out.println("Ã‰tat : " + state + "\n");
    }

    public boolean playTurn(int pos)
    {
        user = playerTurn();

        System.out.println("Grille avant placement : ");
        this.grid.printGameBoard();
            
        //System.out.println(user + " enter your position (1-9) : ");
        //int playerPos = scan.nextInt();
        int playerPos = pos;

        if(player1Positions.contains(playerPos) || player2Positions.contains(playerPos) || !positionsDisponible.contains(playerPos))
        {
           System.out.println("Position prise par l'autre joueur ou numéro de position invalide!");
           return false;
        }
        else if(user.equals("player1"))
        {
            symbol = player[0].getSymbol();
            this.grid.placePiece(playerPos, symbol);
            player1Positions.add(playerPos);
        }
        else
        {
            symbol = player[1].getSymbol();
            this.grid.placePiece(playerPos, symbol);
            player2Positions.add(playerPos);
        }
        
        System.out.println("\n--------------------------------------");
        System.out.println("Résultat après placement : ");
        this.grid.printGameBoard();
                
        System.out.println("--------------------------------------");
        
        return true;
    }



    public String playerTurn(){

        turn ++;
        int reste = turn % 2;

        if(reste == 0) user = "player2";
            else user = "player1";
        return user;
    }

    public String checkWinner() {
        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List bottomRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(7, 5, 3);

        List<List> winningConditions = new ArrayList<List>();
        winningConditions.add(topRow);
        winningConditions.add(midRow);
        winningConditions.add(bottomRow);
        winningConditions.add(leftCol);
        winningConditions.add(midCol);
        winningConditions.add(rightCol);
        winningConditions.add(cross1);
        winningConditions.add(cross2);

        for(List l : winningConditions){
            if(player1Positions.containsAll(l)){
                return "Congratulations Player 1 you won!";
            } else if(player2Positions.containsAll(l)){
                return "Congratulations Player 2 you won!";
            } 
        }

        if(player1Positions.size() + player2Positions.size() == 9){
            return "Tie!";
        }

        return "Keep playing";
    }


    public static void main(String[] args)
    {
    	int i = 1;
        TicTacToe tictactoe = new TicTacToe();
        tictactoe.Playing();
        while(tictactoe.state == State.Playing)
        {
        	tictactoe.playTurn(i);
        	
            String result = tictactoe.checkWinner();
            System.out.println(result);
            if(!tictactoe.checkWinner().equals(""))
            {
                tictactoe.End();
                System.out.println("\nÃ‰tat : " + tictactoe.state + "\n");
                tictactoe.end = true;
            }
            i++;
        }
    }
    
    public int getTurn() {
    	return turn;
    }
    
    public ArrayList<Integer> getPlayer1Posisitions()
    {
    	return player1Positions;
    }
    
    public ArrayList<Integer> getPlayer2Posisitions()
    {
    	return player2Positions;
    }
    
    private void setPositionsDisponible()
    {
    	for(int i = 1; i < 10; i++)
    	{
    		positionsDisponible.add(i);
    	}
    }
}
