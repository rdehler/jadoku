package jadoku;

public class Tile {
	private int value;
	private boolean[] possibleValues;
	public Tile(int value){
		this.value = value;
		possibleValues = allPossibleValues();
	}
	public Tile(){
		this(0);
	}
	public boolean[] getPossibleValues() {
		return possibleValues;
	}
	public void setPossibleValues(boolean[] possibleValues) {
		this.possibleValues = possibleValues;
	}
	public boolean getValuePossible(int value){
		return possibleValues[value];
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	private boolean[] allPossibleValues() {
		return setAllPossibleValues(true);
	}
	private boolean[] noPossiblevalues(){
		return setAllPossibleValues(false);
	}
	private boolean[] setAllPossibleValues(boolean value){
		boolean ret[] = new boolean[9];
		for(int i = 0; i < 9; i++){
			ret[i] = value;
		}
		return ret;
	}
}
