import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.List;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField edtName;
	private JTextField edtNickname;
	private JTextField edtSurname;
	private JTextField edtAddress;
	private JTextField edtCity;
	private JTextField edtPostalCode;
	private JTextField edtOutput;
	private JTextField edtAge;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setUndecorated(true);
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
	public Register() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 452);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Button button = new Button("REGISTER");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String Name = edtName.getText();
				String NickName = edtNickname.getText();
				String Surname = edtSurname.getText();
				int age = Integer.parseInt(null);

				if (age > 15) {
					JOptionPane.showMessageDialog(rootPane, "You cannot be registered");
				}
			}
		});

		button.setForeground(Color.WHITE);
		button.setBackground(SystemColor.textHighlight);
		button.setBounds(380, 366, 100, 48);
		contentPane.add(button);

		edtName = new JTextField();
		edtName.setBounds(369, 102, 157, 20);
		contentPane.add(edtName);
		edtName.setColumns(10);

		JLabel lblNewLabel = new JLabel("First Name ");
		lblNewLabel.setBounds(266, 105, 93, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Middle Name \r\n");
		lblNewLabel_1.setBounds(266, 136, 93, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setBounds(266, 171, 63, 14);
		contentPane.add(lblNewLabel_2);

		edtNickname = new JTextField();
		edtNickname.setBounds(369, 133, 157, 20);
		contentPane.add(edtNickname);
		edtNickname.setColumns(10);

		edtSurname = new JTextField();
		edtSurname.setBounds(369, 168, 157, 20);
		contentPane.add(edtSurname);
		edtSurname.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Student Registration Form");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(266, 11, 239, 33);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Birth Date");
		lblNewLabel_4.setBounds(266, 212, 63, 14);
		contentPane.add(lblNewLabel_4);

		JComboBox cbxYear = new JComboBox();
		cbxYear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Year = (int) cbxYear.getSelectedItem();

			}
		});
		cbxYear.setModel(new DefaultComboBoxModel(
				new String[] { "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017",
						"2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027" }));
		cbxYear.setMaximumRowCount(2020);
		cbxYear.setBounds(369, 209, 63, 20);
		cbxYear.setSelectedItem(null);
		contentPane.add(cbxYear);

		JComboBox cbxMonth = new JComboBox();
		cbxMonth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Month = (String) cbxMonth.getSelectedItem();
			}
		});
		cbxMonth.setModel(new DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November", "December" }));
		cbxMonth.setMaximumRowCount(12);
		cbxMonth.setBounds(436, 209, 90, 20);
		cbxMonth.setSelectedItem(null);
		contentPane.add(cbxMonth);

		JComboBox cbxDay = new JComboBox();
		cbxDay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int Day = (int) cbxDay.getSelectedItem();

			}
		});
		cbxDay.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
				"12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24 ", "25 ", "26 ", "27 ",
				"28 ", "29", "30 ", "31" }));
		cbxDay.setBounds(528, 209, 46, 20);
		cbxDay.setSelectedItem(null);
		contentPane.add(cbxDay);

		JLabel lblNewLabel_5 = new JLabel("Year");
		lblNewLabel_5.setBounds(369, 230, 46, 14);
		contentPane.add(lblNewLabel_5);

		JLabel lblMonth = new JLabel("Month");
		lblMonth.setBounds(452, 230, 74, 14);
		contentPane.add(lblMonth);

		JLabel lblDay = new JLabel("Day");
		lblDay.setBounds(538, 230, 46, 14);
		contentPane.add(lblDay);

		JLabel lblNewLabel_6 = new JLabel("Gender");
		lblNewLabel_6.setBounds(266, 307, 46, 14);
		contentPane.add(lblNewLabel_6);

		JComboBox cbxGender = new JComboBox();
		cbxGender.setModel(new DefaultComboBoxModel(new String[] { "Male", "Female" }));
		cbxGender.setBounds(369, 304, 63, 20);
		cbxGender.setSelectedItem(null);
		contentPane.add(cbxGender);

		JLabel lblNewLabel_7 = new JLabel("Address");
		lblNewLabel_7.setBounds(266, 338, 46, 14);
		contentPane.add(lblNewLabel_7);

		edtAddress = new JTextField();
		edtAddress.setBounds(367, 335, 86, 20);
		contentPane.add(edtAddress);
		edtAddress.setColumns(10);

		edtCity = new JTextField();
		edtCity.setColumns(10);
		edtCity.setBounds(462, 335, 86, 20);
		contentPane.add(edtCity);

		edtPostalCode = new JTextField();
		edtPostalCode.setColumns(10);
		edtPostalCode.setBounds(552, 335, 86, 20);
		contentPane.add(edtPostalCode);

		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(266, 258, 86, 14);
		contentPane.add(lblAge);

		JLabel lblNewLabel_8 = new JLabel("  X");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				System.exit(0);
			}
		});

		lblNewLabel_8.setForeground(Color.RED);
		lblNewLabel_8.setBounds(633, 11, 24, 26);
		contentPane.add(lblNewLabel_8);

		edtOutput = new JTextField();
		edtOutput.setBounds(10, 21, 233, 366);
		contentPane.add(edtOutput);
		edtOutput.setColumns(10);

		edtAge = new JTextField();
		edtAge.setColumns(10);
		edtAge.setBounds(362, 255, 157, 20);
		contentPane.add(edtAge);
	}
}
