import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mainpage_depot.Mainpage_depotpage;
import mainpage_doctor.Mainpage_doctor_options;
import mainpage_manufacturer.Mainpage_manufacaturer_manu;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	public MainPage() {
		setResizable(false);
		setAlwaysOnTop(true);
		setTitle("MainPage");
		setFont(new Font("SansSerif", Font.PLAIN, 14));
		setSize(750,650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Milk Mangament Sytem !");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 10, 736, 56);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("USER ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 // Hide the current frame
                setVisible(false);

                // Create and show the next frame
                User nextFrame = new User();
                nextFrame.setVisible(true);
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 204));
		btnNewButton.setForeground(new Color(0, 100, 0));
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnNewButton.setBounds(182, 138, 355, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DOCTOR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 // Hide the current frame
                setVisible(false);

                // Create and show the next frame
                Mainpage_doctor_options nextFrame = new Mainpage_doctor_options();
                nextFrame.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(new Color(102, 51, 255));
		btnNewButton_1.setBackground(new Color(255, 255, 204));
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnNewButton_1.setBounds(182, 262, 355, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("FEED MANUFACTURER");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 // Hide the current frame
                setVisible(false);

                // Create and show the next frame
                Mainpage_manufacaturer_manu nextFrame = new Mainpage_manufacaturer_manu();
                nextFrame.setVisible(true);
			}
		});
		btnNewButton_2.setForeground(new Color(46, 139, 87));
		btnNewButton_2.setBackground(new Color(255, 255, 204));
		btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnNewButton_2.setBounds(182, 387, 355, 35);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("MILK DEPOT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 // Hide the current frame
                setVisible(false);

                // Create and show the next frame
                Mainpage_depotpage nextFrame = new Mainpage_depotpage();
                nextFrame.setVisible(true);
			}
		});
		btnNewButton_3.setForeground(new Color(102, 51, 255));
		btnNewButton_3.setBackground(new Color(255, 255, 204));
		btnNewButton_3.setFont(new Font("SansSerif", Font.BOLD, 20));
		btnNewButton_3.setBounds(182, 515, 355, 35);
		contentPane.add(btnNewButton_3);
	}
}
