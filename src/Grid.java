import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grid {

    private char[][] gameBoard = {
        {' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '}
    };

    Grid(){

    }

    public void printGameBoard(){

     for(char[] row : gameBoard) {
         for(char c : row){
            System.out.print(c);
        }
            System.out.println();
        }
    }

    public void placePiece(int pos, char symbol){

        switch(pos) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default: 
            break;
           }
    }  

    public char[][] getBoard()
    {
        return gameBoard;
    }

}

