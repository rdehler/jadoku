package test;

import org.eclipse.swt.widgets.*;
import org.eclipse.swt.browser.*;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.events.*;
import org.eclipse.swt.graphics.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.*; 
public class SWTTest {
	/*
	static String SEARCH_STRING = "box";
    public static void main(String[] args) {
        final Display display = new Display();
        final Color RED = display.getSystemColor(SWT.COLOR_RED);
        Shell shell = new Shell(display);
        shell.setBounds(10,10,250,250);
        final StyledText text = new StyledText(shell, SWT.NONE);
        text.setBounds(10,10,200,200);
        text.addListener(SWT.Paint, new Listener() {
			public void handleEvent(Event event) {
				String contents = text.getText();
				int stringWidth = event.gc.stringExtent(SEARCH_STRING).x;
				int lineHeight = text.getLineHeight();
				event.gc.setForeground(RED);
				int index = contents.indexOf(SEARCH_STRING);
				while (index != -1) {
					Point topLeft = text.getLocationAtOffset(index);
					event.gc.drawRectangle(topLeft.x - 1, topLeft.y, stringWidth + 1, lineHeight - 1);
					index = contents.indexOf(SEARCH_STRING, index + 1);
				}
			}
		});
        text.setText("This demonstrates drawing a box\naround every occurrence of the word\nbox in the StyledText");
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) display.sleep();
        }
        display.dispose();
    }
    */
	
	/*
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(new FillLayout());
		StyledText text = new StyledText (shell, SWT.BORDER);
		text.setText("0123456789 ABCDEFGHIJKLM NOPQRSTUVWXYZ");
		// make 0123456789 appear bold
		StyleRange style1 = new StyleRange();
		style1.start = 0;
		style1.length = 10;
		style1.fontStyle = SWT.BOLD;
		text.setStyleRange(style1);
		// make ABCDEFGHIJKLM have a red font
		StyleRange style2 = new StyleRange();
		style2.start = 11;
		style2.length = 13;
		style2.foreground = display.getSystemColor(SWT.COLOR_RED);
		text.setStyleRange(style2);
		// make NOPQRSTUVWXYZ have a blue background
		StyleRange style3 = new StyleRange();
		style3.start = 25;
		style3.length = 13;
		style3.background = display.getSystemColor(SWT.COLOR_BLUE);
		text.setStyleRange(style3);
		
		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
	*/
	
	/*
	public static void main (String [] args) {
		Display display = new Display ();
		Shell shell = new Shell (display);
		Table table = new Table (shell, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		table.setLinesVisible (true);
		table.setHeaderVisible (false);
		String[] titles = {" ", "C", "!", "Description", "Resource", "In Folder", "Location"};
		for (int i=0; i<9; i++) {
			TableColumn column = new TableColumn (table, SWT.NONE);
			//column.setText (titles [i]);
		}	
		int count = 9;
		for (int i=0; i<count; i++) {
			TableItem item = new TableItem (table, SWT.NONE);
			for(int j = 0; j < 9; j++){
				item.setText (j, "val");
			}
		}
		for (int i=0; i<9; i++) {
			table.getColumn (i).setWidth(50); //pack ();
		}	
		table.setSize (table.computeSize (SWT.DEFAULT, 450));
		shell.pack ();
		shell.open ();
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		display.dispose ();
	}
	*/
	
	public static void main(String[] args) {
		Display display = new Display ();
		Shell shell = new Shell (display);
		shell.setLayout (new FillLayout ());
		Table table = new Table (shell, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
		table.setLinesVisible (true);
		for (int i=0; i<9; i++) {
			TableColumn column = new TableColumn(table, SWT.NONE);
			column.setWidth (35);
		}
		for (int i=0; i<9; i++) {
			TableItem item = new TableItem (table, SWT.NONE);
			item.setText("val");
		}
		/*
		TableItem [] items = table.getItems ();
		for (int i=0; i<items.length; i++) {
			TableEditor editor = new TableEditor (table);
			StyledText text = new StyledText (shell, SWT.BORDER);
			text.setText("txt");
			StyleRange style1 = new StyleRange();
			style1.start = 0;
			style1.length = 10;
			style1.fontStyle = SWT.BOLD;
			editor.grabHorizontal = true;
			editor.setEditor(text, items[i], 0);
		}
		*/
		for (int i=0; i<9; i++) {
			table.getColumn (i).setWidth(50); //pack ();
		}	
		
		shell.pack ();
		shell.open ();
		while (!shell.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		display.dispose ();
	}
}
