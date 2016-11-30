package converter;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Canvas;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;

public class ConverterGUI extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtWelcomeUsingMy;
	private JTextField userInput;
	private JTextField systemOutput;
	static final String DEGREE = "\u00b0";
	private JRadioButton lengthRadioButton;
	private JRadioButton weightRadioButton;
	
	static final String[] UNIT = {"M", "CM","Pound","Gram","Kg",DEGREE+"C",DEGREE+"F"};

	/**
	 * Create the frame.
	 */
	public ConverterGUI() {
		setTitle("Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtWelcomeUsingMy = new JTextField();
		txtWelcomeUsingMy.setForeground(Color.WHITE);
		txtWelcomeUsingMy.setBackground(Color.PINK);
		txtWelcomeUsingMy.setBounds(5, 5, 424, 37);
		txtWelcomeUsingMy.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 21));
		txtWelcomeUsingMy.setHorizontalAlignment(SwingConstants.CENTER);
		txtWelcomeUsingMy.setText("Welcome using My Converter!!");
		contentPane.add(txtWelcomeUsingMy);
		txtWelcomeUsingMy.setColumns(10);
		
		userInput = new JTextField();
		userInput.setBounds(10, 72, 181, 32);
		contentPane.add(userInput);
		userInput.setColumns(10);
		
		systemOutput = new JTextField();
		systemOutput.setColumns(10);
		systemOutput.setBounds(10, 136, 181, 32);
		contentPane.add(systemOutput);
		
		JComboBox inputBox = new JComboBox(UNIT);
		inputBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		inputBox.setBounds(215, 72, 77, 32);
		contentPane.add(inputBox);
		
		JComboBox outputBox = new JComboBox();
		outputBox.setBounds(215, 136, 77, 32);
		contentPane.add(outputBox);
		
		JButton convertButton = new JButton("Let's Convert !");
		convertButton.setForeground(Color.WHITE);
		convertButton.setBackground(Color.PINK);
		convertButton.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 24));
		convertButton.setBounds(10, 199, 414, 51);
		contentPane.add(convertButton);
		
		Panel type = new Panel();
		type.setBounds(316, 72, 108, 121);
		contentPane.add(type);
		
		lengthRadioButton = new JRadioButton("Length", true);
		lengthRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		lengthRadioButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		type.add(lengthRadioButton);
		
		weightRadioButton = new JRadioButton("Weight", false);
		weightRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		weightRadioButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		type.add(weightRadioButton);
		
		JRadioButton tempRadioButton = new JRadioButton("Temperature", false);
		tempRadioButton.setHorizontalAlignment(SwingConstants.LEFT);
		tempRadioButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		type.add(tempRadioButton);
		
		convertButton.addActionListener(this);
		lengthRadioButton.addActionListener(this);
		weightRadioButton.addActionListener(this);
		tempRadioButton.addActionListener(this);
		
		/* Make sure there is only one selected */
		ButtonGroup unitType = new ButtonGroup();
		unitType.add(lengthRadioButton);
		unitType.add(weightRadioButton);
		unitType.add(tempRadioButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String input = userInput.getText();
		if (e.getSource() == lengthRadioButton) {
			System.out.println("Length");
		}
		if (e.getSource() == weightRadioButton) {
			System.out.println("weight");
		}
		
	}
}
