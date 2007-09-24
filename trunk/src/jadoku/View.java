package jadoku;

public interface View {
	void update();
	void destroy();
	boolean getInput();
	void setModel(Model model);
	void setBoard(Board board);
}
