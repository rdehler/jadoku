package jadoku;

public class Board {
	private Tile[][] tiles;
	
	public Board(){
		tiles = new Tile[9][9];
		for(int i = 0; i < 9; i++){
			for(int j = 0; j < 9; j++){
				tiles[i][j] = new Tile();
			}
		}
	}
	
	public Tile getTileAt(int x, int y){
		return tiles[y][x];
	}
	
	public void setTile(int x, int y, int val){
		getTileAt(x,y).setValue(val);
	}
}
