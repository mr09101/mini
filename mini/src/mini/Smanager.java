package mini;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class Smanager {

	private JFrame frame;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Smanager window = new Smanager();
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
	public Smanager() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 760, 130);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uD68C\uC6D0 ID");
		lblNewLabel.setBounds(140, 53, 57, 15);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(206, 50, 116, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\uAC80\uC0C9");
		btnNewButton.setBounds(455, 24, 109, 37);
		panel.add(btnNewButton);
		
		JButton btnWjscprjator = new JButton("\uC804\uCCB4 \uAC80\uC0C9");
		btnWjscprjator.setBounds(455, 71, 109, 37);
		panel.add(btnWjscprjator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 171, 760, 248);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setBounds(0, 10, 760, 228);
		panel_1.add(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 442, 760, 109);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("\uCD94\uAC00");
		btnNewButton_2.setBounds(52, 21, 133, 60);
		panel_2.add(btnNewButton_2);
		
		JButton button = new JButton("\uC218\uC815");
		button.setBounds(298, 21, 133, 60);
		panel_2.add(button);
		
		JButton button_1 = new JButton("\uC0AD\uC81C");
		button_1.setBounds(530, 21, 133, 60);
		panel_2.add(button_1);
	}
}
