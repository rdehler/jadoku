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
	public void setValueImpossible(int val){
		this.possibleValues[val-1] = false;
	}
	public boolean getValuePossible(int value){
		return possibleValues[value-1];
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
		this.possibleValues = noPossibleValues();
	}
	public boolean valueSet(){
		return this.value != 0;
	}
	private boolean[] allPossibleValues() {
		return setAllPossibleValues(true);
	}
	private boolean[] noPossibleValues(){
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
