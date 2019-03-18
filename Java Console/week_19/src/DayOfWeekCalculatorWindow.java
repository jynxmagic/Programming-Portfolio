import java.awt.event.*;

import javax.swing.*;

public class DayOfWeekCalculatorWindow extends JPanel implements ActionListener
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2753106532359591972L;

	JLabel dayLabel;
	JLabel monthLabel;
	JLabel yearLabel;
	JLabel resultLabel;
	JLabel result;
	JTextField dayField;
	JTextField monthField;
	JTextField yearField;
	JButton calculateButton;
	
	
	
	DayOfWeekCalculatorWindow()
	{
		dayLabel = new JLabel("Day: ");
		monthLabel = new JLabel("Month: ");
		yearLabel = new JLabel("Year: ");
		resultLabel = new JLabel("Result: ");
		result = new JLabel("");
		dayField = new JTextField(20);
		monthField = new JTextField(20);
		yearField = new JTextField(20);
		
		calculateButton = new JButton("calculate");
		calculateButton.addActionListener(this);
		
		add(dayLabel);
		add(dayField);
		add(monthLabel);
		add(monthField);
		add(yearLabel);
		add(yearField);
		add(calculateButton);
		
		add(resultLabel);
		add(result);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int dayNo = 0;
		String day = "invalid return";
		try
		{
			dayNo = Doomsday.GetDayOfWeek(Integer.parseInt(dayField.getText()), Integer.parseInt(monthField.getText()), Integer.parseInt(yearField.getText()));
			String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
			
			if(dayNo == -1)
			{
				day = "Invalid Date";
			}
			else
			{
				day = daysOfWeek[dayNo];
			}
			
		}
		catch(Exception er)
		{
			er.printStackTrace();
			day = er.getMessage();
		}
		
		result.setText(day);
		
	}

}
