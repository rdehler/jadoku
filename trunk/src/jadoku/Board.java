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
	
	public void setTile(int x, int y, int val) throws InvalidValueException, ImpossibleValueException{
		if(val > 9 || val < 1){
			throw new InvalidValueException();
		}
		Tile tile = getTileAt(x,y);
		
		if(!tile.getValuePossible(val)){
			throw new ImpossibleValueException();
		}
		tile.setValue(val);
		
		
		//make this val impossible for all in this row
		for(int i = 0; i < 9; i++){
			getTileAt(x,i).setValueImpossible(val);
		}
		//make this val impossible for all in this col
		for(int i = 0; i < 9; i++){
			getTileAt(i,y).setValueImpossible(val);
		}
		//make this val impossible for all in this block
		int blockX = x/3; //truncates to floor(x/3)
		int blockY = y/3;
		for(int i = blockX; i < blockX+3; i++){
			for(int j = blockY; j < blockY+3; j++){
				getTileAt(i,j).setValueImpossible(val);
			}
		}
	}
}
