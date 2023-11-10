import java.util.ArrayList;
import java.util.Scanner;

public class GameBoard {

		private static GameBoard gameBoard;
		
		private int[][] board;
		SceneType sceneType; //decorator

		private GameBoard(int width, int length) {
			this.board = new int[width][length];
		}

		public static GameBoard getInstance() {
			if (gameBoard == null) {
				int width, length;
				
				Scanner scanner = new Scanner(System.in);
				width = scanner.nextInt();
				length= scanner.nextInt();
				
				gameBoard = new GameBoard(width, length);
			}

			return gameBoard;
		}
	}
		
}
