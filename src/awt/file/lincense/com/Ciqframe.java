package awt.file.lincense.com;

import java.awt.EventQueue;


import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.Handler;

import javax.swing.JFrame;

//import sat.com.cq.Read;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;


//import file.name.FileName;
//import license.key.com.Test;
//import logger.cq1.com.LoggerExample;

import java.awt.Toolkit;
import javax.swing.JTextArea;

public class Ciqframe {
	
	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());

	private JFrame frmWelcome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Handler fileHandler  = null;
			    	 fileHandler  = new FileHandler("Loggerfile.txt");
			    	 LOGGER.addHandler(fileHandler);
			    	 fileHandler.setLevel(Level.ALL);
			    		
			            LOGGER.setLevel(Level.ALL);
			            
			            LOGGER.config("Configuration done.");
			        	
					
					Ciqframe window = new Ciqframe();
					window.frmWelcome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ciqframe() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Read r = new Read();
		frmWelcome = new JFrame();
		frmWelcome.getContentPane().setFont(new Font("Arial Black", Font.BOLD, 14));
		frmWelcome.setSize(500, 300);
		frmWelcome.setResizable(false);
		frmWelcome.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\esatnir\\Desktop\\Welcome-Were-Glad-Youre-Here.jpg"));
		frmWelcome.setFont(new Font("Arial", Font.BOLD, 14));
		frmWelcome.setForeground(new Color(0, 128, 0));
		frmWelcome.setTitle("                                                         WELCOME");
		frmWelcome.getContentPane().setForeground(Color.GREEN);
		frmWelcome.getContentPane().setBackground(new Color(95, 158, 160));
		frmWelcome.setBackground(Color.YELLOW);
		frmWelcome.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("                   SAT.N");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBackground(new Color(255, 127, 80));
		lblNewLabel.setFont(new Font("Algerian", Font.ITALIC, 30));
		lblNewLabel.setBounds(39, 23, 351, 30);
		frmWelcome.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 14));
		textArea.setBackground(Color.ORANGE);
		textArea.setForeground(Color.BLACK);
		textArea.setBounds(117, 171, 248, 43);
		frmWelcome.getContentPane().add(textArea);
		
		
		
		
		JButton btnCq = new JButton(" Audit");
		btnCq.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			//new FileName().fileName();
			
			String s= new Test().test();
			if(s.equals("Process Complete"))
			{
				textArea.setText(s);
				new FileName().fileName();
				
			}
			else if(s.equals("License Expire"))
			{
				textArea.setText(s);
				btnCq.setEnabled(false);
			}
				
			else 
				textArea.setText(s);
			
		}
		
		});
		btnCq.setForeground(new Color(34, 139, 34));
		btnCq.setFont(new Font("Arial", Font.ITALIC, 13));
		btnCq.setBackground(new Color(255, 255, 0));
		btnCq.setBounds(174, 95, 122, 30);
		frmWelcome.getContentPane().add(btnCq);
		
		JLabel lblNewLabel_1 = new JLabel("  @CopyRight<2018,ESATNIR>");
		lblNewLabel_1.setBounds(293, 248, 181, 14);
		frmWelcome.getContentPane().add(lblNewLabel_1);
		
		
		
		
		
	}
}
