package jadoku;

public class Jadoku {
	private static View view;
	private static Board board;
	private static Model model;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		model = new Model();
		view = new CommandLineView();
		board = new Board();
		model.setBoard(board);
		view.setBoard(board);
		view.setModel(model);
		view.update();
		
		while(view.getInput()){
			view.update();
		}
	}

}
