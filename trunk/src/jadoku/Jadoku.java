package jadoku;

public class Jadoku {
	private static View view;
	private static Board board;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		view = new CommandLineView();
		board = view.create();
		view.update();
	}

}
