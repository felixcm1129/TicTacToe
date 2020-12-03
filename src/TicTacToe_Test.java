import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.allOf;

public class TicTacToe_Test {

	@Test
	public void checkPlayerPositionnNumeroValideTest() {
		TicTacToe tictactoe = new TicTacToe();
		//Arrange
		var expected = true;
		//Act
		var actual = tictactoe.playTurn(1);
		//Assert
		assertEquals(expected, actual);
	}

	@Test
	public void checkPlayerPositionNumeroInvalideTest() {
		TicTacToe tictactoe = new TicTacToe();
		//Arrange
		var expected = false;
		//Act
		var actual = tictactoe.playTurn(10);
		//Assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkPlayerPositionDisponibleTest() {
		TicTacToe tictactoe = new TicTacToe();
		//Arrange
		var expected = false;
		//Act
		tictactoe.playTurn(1);
		var actual = tictactoe.playTurn(1);
		//Assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkWinPlayer1Condition()
	{
		TicTacToe tictactoe = new TicTacToe();
		//Arrange
		var expected = "Congratulations Player 1 you won!";
		//Act
		//player1
		tictactoe.playTurn(1);
		var actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player2
		tictactoe.playTurn(4);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player1
		tictactoe.playTurn(2);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player2
		tictactoe.playTurn(7);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player1
		tictactoe.playTurn(3);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//Assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkWinPlayer2Condition()
	{
		TicTacToe tictactoe = new TicTacToe();
		//Arrange
		var expected = "Congratulations Player 2 you won!";
		//Act
		//player1
		tictactoe.playTurn(4);
		var actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player2
		tictactoe.playTurn(1);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player1
		tictactoe.playTurn(7);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player2
		tictactoe.playTurn(2);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player1
		tictactoe.playTurn(5);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player2
		tictactoe.playTurn(3);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//Assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkTieCondition()
	{
		TicTacToe tictactoe = new TicTacToe();
		//Arrange
		var expected = "Tie!";
		//Act
		//player1
		tictactoe.playTurn(1);
		var actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player2
		tictactoe.playTurn(2);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player1
		tictactoe.playTurn(3);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player2
		tictactoe.playTurn(4);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player1
		tictactoe.playTurn(6);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player2
		tictactoe.playTurn(5);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player1
		tictactoe.playTurn(7);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player2
		tictactoe.playTurn(9);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player1
		tictactoe.playTurn(8);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//Assert
		assertEquals(expected, actual);
	}
	
	@Test
	public void checkWinPlayer1SiTouslesToursJouer() 
	{
		TicTacToe tictactoe = new TicTacToe();
		//Arrange
		var expected = "Congratulations Player 1 you won!";
		//player1
		tictactoe.playTurn(1);
		var actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player2
		tictactoe.playTurn(2);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player1
		tictactoe.playTurn(5);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player2
		tictactoe.playTurn(4);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player1
		tictactoe.playTurn(6);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player2
		tictactoe.playTurn(8);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player1
		tictactoe.playTurn(3);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player2
		tictactoe.playTurn(7);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//player1
		tictactoe.playTurn(9);
		actual = tictactoe.checkWinner();
		System.out.println(actual);
		//Assert
		assertEquals(expected, actual);
	}
	
}
