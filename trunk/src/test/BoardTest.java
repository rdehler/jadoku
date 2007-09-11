package test;

import static org.junit.Assert.*;

import jadoku.Board;
import jadoku.Tile;

/**
 * Board Test - junit tests for class Board
 * @author wds
 * 
 * TODO: JUNIT automatic test calls, needs setup
 */
public class BoardTest 
{
	
	public static void main(String[] args){
		//should automate the test calls eventually
		BoardTest bt = new BoardTest();
		
		bt.testBoardCreation();
		bt.success();
	}
	
	/*
	 * Lame test, just to get things working
	 */
	public void testBoardCreation() {
		//setup
		Board brd = new Board();
		for (int x = 0; x < 9; x++)
		{
			for(int y = 0; y < 9; y++)
			{
				Tile curTile = brd.getTileAt(x, y);
					if(curTile.getValue() != 0)
						fail("Tile "+ x + "," + y + " is a non-Zero value");
			}
		}
	}
	
	public void success(){
		System.out.println("Tests successfully PASSED");
	}
}
