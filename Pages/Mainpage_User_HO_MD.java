import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mainpage_User_HO_MD extends JFrame {

	private JPanel contentPane;
	private JTextField txtDdmonyyyy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainpage_User_HO_MD frame = new Mainpage_User_HO_MD();
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
	public Mainpage_User_HO_MD() {
		setTitle("Mainpage_User_HO_MD");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700,400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 182, 193));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User-Depot Login");
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 26));
		lblNewLabel.setBounds(0, 10, 686, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter the Date :");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 22));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(25, 118, 200, 26);
		contentPane.add(lblNewLabel_1);
		
		txtDdmonyyyy = new JTextField();
		txtDdmonyyyy.setHorizontalAlignment(SwingConstants.CENTER);
		txtDdmonyyyy.setFont(new Font("SansSerif", Font.PLAIN, 20));
		txtDdmonyyyy.setToolTipText("");
		txtDdmonyyyy.setBounds(212, 113, 280, 38);
		contentPane.add(txtDdmonyyyy);
		txtDdmonyyyy.setColumns(10);
		
		JButton btnNewButton = new JButton("Sell Milk");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 // Hide the current frame
                setVisible(false);

                // Create and show the next frame
                Mainpage_User_HO_MD_Q nextFrame = new Mainpage_User_HO_MD_Q();
                nextFrame.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(173, 255, 47));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnNewButton.setBounds(236, 254, 218, 32);
		contentPane.add(btnNewButton);
	}
}
