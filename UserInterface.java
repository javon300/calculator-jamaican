package desktop.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;

public class UserInterface {

	private JFrame frame;
	private JPanel topPanel;
	private JTextField AnswerTF;
	private JTextField problemTF;
	private GroupLayout gl_topPanel; 
	
	private JPanel rightPanel;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn0;
	private JButton btnPoint;
	private JButton btnSign; 
	
	private JPanel leftPanel;
	private JButton btnSub;
	private JButton btnAdd;
	private JButton btnDiv;
	private JButton btnMul;
	
	private JPanel bottomPanel;
	private JButton btnAC;
	private JButton btnEqual;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInterface window = new UserInterface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserInterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBounds(100, 100, 323, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		topPanel = new JPanel();
		topPanel.setBackground(Color.GREEN);
		topPanel.setBounds(10, 0, 289, 113);
		frame.getContentPane().add(topPanel);
		
		problemTF = new JTextField();
		problemTF.setFont(new Font("Segoe Print", Font.PLAIN, 20));
		problemTF.setHorizontalAlignment(SwingConstants.TRAILING);
		problemTF.setBackground(Color.LIGHT_GRAY);
		problemTF.setColumns(30);
		
		AnswerTF = new JTextField();
		AnswerTF.setEditable(false);
		AnswerTF.setBackground(Color.GRAY);
		AnswerTF.setColumns(30);
		
		gl_topPanel = new GroupLayout(topPanel);
		gl_topPanel.setHorizontalGroup(
			gl_topPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_topPanel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_topPanel.createParallelGroup(Alignment.TRAILING)
						.addComponent(AnswerTF, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE)
						.addComponent(problemTF, GroupLayout.PREFERRED_SIZE, 266, GroupLayout.PREFERRED_SIZE))
					.addGap(122))
		);	//sets widgets on horizontal axis
		gl_topPanel.setVerticalGroup(
			gl_topPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_topPanel.createSequentialGroup()
					.addGap(18)
					.addComponent(problemTF, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(AnswerTF, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);	//sets widgets on vertical axis
		topPanel.setLayout(gl_topPanel);
		//concatination of top panel
		
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		//right panel settings
		rightPanel = new JPanel();
		rightPanel.setBackground(Color.DARK_GRAY);
		rightPanel.setBounds(85, 123, 214, 256);
		frame.getContentPane().add(rightPanel);
		rightPanel.setLayout(null);
		
		btn1 = new JButton("1");
		btn1.setBackground(Color.GRAY);
		btn1.setForeground(Color.GREEN);
		btn1.setBounds(19, 5, 55, 57);
		btn1.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		btn1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});		
				
		btn2 = new JButton("2");
		btn2.setForeground(Color.GREEN);
		btn2.setBackground(Color.GRAY);
		btn2.setBounds(79, 5, 55, 57);
		btn2.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		btn2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});	
				
		btn3 = new JButton("3");
		btn3.setForeground(Color.GREEN);
		btn3.setBackground(Color.GRAY);
		btn3.setBounds(139, 5, 55, 57);
		btn3.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		btn3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});	
				
		btn4 = new JButton("4");
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.setForeground(Color.GREEN);
		btn4.setBounds(19, 67, 55, 57);
		btn4.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		btn4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});	
		
		btn5 = new JButton("5");
		btn5.setForeground(Color.GREEN);
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.setBounds(79, 67, 55, 57);
		btn5.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		btn5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});	
		
		btn6 = new JButton("6");
		btn6.setForeground(Color.GREEN);
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.setBounds(139, 67, 55, 57);
		btn6.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		btn6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});	
		
		btn7 = new JButton("7");
		btn7.setForeground(Color.RED);
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.setBounds(19, 129, 55, 57);
		btn7.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		btn7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});	
		
		btn8 = new JButton("8");
		btn8.setForeground(Color.RED);
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.setBounds(79, 129, 55, 57);
		btn8.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		btn8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});	
		
		btn9 = new JButton("9");
		btn9.setForeground(Color.RED);
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.setBounds(139, 129, 55, 57);
		btn9.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		btn9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});	
		
		btnPoint = new JButton(".");
		btnPoint.setForeground(Color.RED);
		btnPoint.setBackground(Color.GRAY);
		btnPoint.setBounds(19, 196, 55, 51);
		btnPoint.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		btnPoint.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
			}
		});
				
		btn0 = new JButton("0");
		btn0.setForeground(Color.RED);
		btn0.setBackground(Color.GRAY);
		btn0.setBounds(79, 196, 55, 50);
		btn0.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		btn0.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});
		
		btnSign = new JButton("+/-");
		btnSign.setForeground(Color.RED);
		btnSign.setBackground(Color.GRAY);
		btnSign.setBounds(139, 196, 55, 51);
		btnSign.setFont(new Font("Segoe Print", Font.PLAIN, 10));
		btnSign.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});
		
		//right panel concatination
		rightPanel.add(btn1);
		rightPanel.add(btn2);
		rightPanel.add(btn3);
		rightPanel.add(btn4);
		rightPanel.add(btn5);
		rightPanel.add(btn6);
		rightPanel.add(btn7);
		rightPanel.add(btn8);
		rightPanel.add(btn9);
		rightPanel.add(btnPoint);
		rightPanel.add(btn0);
		rightPanel.add(btnSign);
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@	
		
		//leftPanel
		leftPanel = new JPanel();
		leftPanel.setBackground(Color.DARK_GRAY);
		leftPanel.setBounds(10, 123, 65, 256);
		frame.getContentPane().add(leftPanel);
		leftPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnSub = new JButton("-");
		btnSub.setForeground(Color.GREEN);
		btnSub.setBackground(Color.GRAY);
		btnSub.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		btnSub.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});
				
		btnAdd = new JButton("+");
		btnAdd.setBackground(Color.LIGHT_GRAY);
		btnAdd.setForeground(Color.GREEN);
		btnAdd.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		btnAdd.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});
		
		btnDiv = new JButton("/");
		btnDiv.setForeground(Color.RED);
		btnDiv.setBackground(Color.LIGHT_GRAY);
		btnDiv.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		btnDiv.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});
				
		btnMul = new JButton("x");
		btnMul.setForeground(Color.RED);
		btnMul.setBackground(Color.GRAY);
		btnMul.setFont(new Font("Segoe Print", Font.PLAIN, 25));
		btnMul.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
			}
		});
		
		//concatination of left panel
		leftPanel.add(btnSub);
		leftPanel.add(btnAdd);
		leftPanel.add(btnDiv);
		leftPanel.add(btnMul);
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		
		bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.GREEN);
		bottomPanel.setBounds(10, 389, 289, 70);
		frame.getContentPane().add(bottomPanel);
		bottomPanel.setLayout(null);
		
		btnAC = new JButton("AC");
		btnAC.setForeground(Color.YELLOW);
		btnAC.setBackground(Color.GRAY);
		btnAC.setBounds(32, 5, 69, 45);
		btnAC.setFont(new Font("Segoe Print", Font.PLAIN, 23));
		
		
		btnEqual = new JButton("=");
		btnEqual.setForeground(Color.YELLOW);
		btnEqual.setBackground(Color.GRAY);
		btnEqual.setBounds(122, 5, 157, 45);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEqual.setFont(new Font("Segoe Print", Font.PLAIN, 35));
		
		//concatination of bottom panel
		bottomPanel.add(btnAC);
		bottomPanel.add(btnEqual);
		//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	}
}
