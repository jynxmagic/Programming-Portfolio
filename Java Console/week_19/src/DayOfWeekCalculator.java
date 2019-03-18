import javax.swing.JFrame;

public class DayOfWeekCalculator {
	
	public static void main(String[] args)
	{
		DayOfWeekCalculatorWindow dowcw = new DayOfWeekCalculatorWindow();
		
		JFrame frame = new JFrame();
		
		frame.setSize(1500, 100);
	
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    frame.add(dowcw);
	    
	    frame.setVisible(true);
		
	}

}
