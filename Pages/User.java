import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;


class NumberOnlyActionListener implements ActionListener {
    private JTextField textField;
    private JFrame frameToOpen;

    public NumberOnlyActionListener(JTextField textField, JFrame frameToOpen) {
        this.textField = textField;
        this.frameToOpen = frameToOpen;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textField.getText();
        if (!text.matches("\\d*")) {
            // Display error message
            textField.setText("Enter a number");
        } else {
            // Open the next frame
        	textField.setText("Number entered");
            frameToOpen.setVisible(true);
        }
    }
}

public class User extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User frame = new User();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public User() {
		setFont(new Font("SansSerif", Font.PLAIN, 12));
		setResizable(false);
		setTitle("USER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to User Page");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblNewLabel.setBounds(0, 10, 576, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("User id :");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 22));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 125, 115, 38);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("SansSerif", Font.PLAIN, 21));
		textField.setBounds(139, 125, 308, 38);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("");
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("User name :");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(10, 199, 131, 38);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("SansSerif", Font.PLAIN, 21));
		textField_1.setBounds(139, 199, 308, 38);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Head Office");
		btnNewButton.setForeground(new Color(102, 51, 102));
		btnNewButton.setBackground(new Color(255, 204, 255));
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 21));
		btnNewButton.setBounds(20, 310, 248, 38);
		

		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Feed Manufacturer");
		btnNewButton_1.setForeground(new Color(102, 51, 102));
		btnNewButton_1.setBackground(new Color(255, 204, 255));
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 21));
		btnNewButton_1.setBounds(139, 371, 308, 38);
		
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Report");
		btnNewButton_2.setForeground(new Color(102, 51, 102));
		btnNewButton_2.setBackground(new Color(255, 204, 255));
		btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 21));
		btnNewButton_2.setBounds(311, 310, 265, 38);
		contentPane.add(btnNewButton_2);
		NumberOnlyActionListener listener1 = new NumberOnlyActionListener(textField, new MainPage_User_HO());
		NumberOnlyActionListener listener2 = new NumberOnlyActionListener(textField, new Mainpage_user_manufacturer());
		NumberOnlyActionListener listener3 = new NumberOnlyActionListener(textField, new Mainpage_user_report());
		btnNewButton.addActionListener(listener1);
		btnNewButton_1.addActionListener(listener2);
		btnNewButton_2.addActionListener(listener3);


	}
}
