package com.cc.fitforlife;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;


public class FitForLife extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAddress;
	private JTextField txtAddressTwo;
	private JComboBox ddlAge;
	private JComboBox ddlType;
	private JComboBox ddlDuration;
	private JCheckBox cbFamily;
	private JLabel lblFeeResult;
	private JLabel lblMonthlyFeeResult;
	private JLabel lblFee;
	private JLabel lblMonthlyFee;
	private JButton bCalculate;
	private JFileChooser fileChooser;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FitForLife frame = new FitForLife();
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
	public FitForLife() {
		setResizable(false);
		setTitle("Fit for Life");
		fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Specify a file to save");   
		FileNameExtensionFilter filter = new FileNameExtensionFilter("CSV Files", "CSV", "text");
		fileChooser.setFileFilter(filter);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(java.awt.event.WindowEvent e) {
				validateForm();
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,},
				new RowSpec[] {
						FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("default:grow"),
						FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("default:grow"),
						FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("default:grow"),
						FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("default:grow"),
						FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("default:grow"),
						FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("default:grow"),
						FormSpecs.RELATED_GAP_ROWSPEC,
						RowSpec.decode("default:grow(2)"),}));

		JLabel lblNewLabel_1 = new JLabel("Fit For Life");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1, "2, 2, 11, 1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));

		JLabel lblNewLabel = new JLabel("Customer Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel, "2, 4, 3, 1");

		txtName = new JTextField();
		txtName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validateForm();
			}
		});
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(txtName, "6, 4, 3, 1");
		txtName.setColumns(10);

		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblAge, "10, 4, right, default");

		ddlAge = new JComboBox();
		ddlAge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validateForm();
			}
		});
		ddlAge.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ddlAge.setModel(new DefaultComboBoxModel(new String[] {"Select Age", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120", "121", "122", "123", "124", "125", "126", "127", "128", "129", "130"}));
		contentPane.add(ddlAge, "12, 4, fill, default");

		JLabel lblNewLabel_2 = new JLabel("Customer Address");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_2, "2, 6, 3, 1, left, default");

		txtAddress = new JTextField();
		txtAddress.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validateForm();
			}
		});
		txtAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAddress.setColumns(10);
		contentPane.add(txtAddress, "6, 6, 3, 1, fill, default");

		txtAddressTwo = new JTextField();
		txtAddressTwo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				validateForm();
			}
		});
		txtAddressTwo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAddressTwo.setColumns(10);
		contentPane.add(txtAddressTwo, "10, 6, 3, 1, fill, default");

		JLabel lblNewLabel_5 = new JLabel("Membership_________________________________________________________");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_5, "2, 8, 11, 1");

		JLabel lblNewLabel_3 = new JLabel("Type");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_3, "2, 10, right, default");

		ddlType = new JComboBox();
		ddlType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validateForm();
			}
		});
		ddlType.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ddlType.setModel(new DefaultComboBoxModel(new String[] {"Select Type", "Full", "Country", "Day"}));
		contentPane.add(ddlType, "4, 10, fill, default");

		JLabel lblNewLabel_3_1 = new JLabel("Duration");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblNewLabel_3_1, "6, 10, right, default");

		ddlDuration = new JComboBox();
		ddlDuration.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				validateForm();
			}
		});
		ddlDuration.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ddlDuration.setModel(new DefaultComboBoxModel(new String[] {"Select Duration", "3 Months", "6 Months", "9 Months", "12 Months"}));
		contentPane.add(ddlDuration, "8, 10, fill, default");

		cbFamily = new JCheckBox("Family");
		cbFamily.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbFamily.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(cbFamily, "12, 10");

		lblFee = new JLabel("Membership Fee");
		lblFee.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblFee, "2, 12, 3, 1");

		lblFeeResult = new JLabel("");
		lblFeeResult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblFeeResult, "6, 12");

		lblMonthlyFee = new JLabel("Monthly Fee");
		lblMonthlyFee.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblMonthlyFee, "8, 12");

		lblMonthlyFeeResult = new JLabel("");
		lblMonthlyFeeResult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblMonthlyFeeResult, "10, 12, 3, 1");

		bCalculate = new JButton("Calculate");
		bCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculateButtonPressed();
			}
		});
		bCalculate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(bCalculate, "2, 14, 3, 1");

		btnNewButton_1 = new JButton("Save Details");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveForm();

			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(btnNewButton_1, "8, 14, 3, 1");

		btnNewButton = new JButton("Print Details");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				printDetails();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(btnNewButton, "12, 14");
	}
	public void calculateButtonPressed()
	{		
		double cost = calculateCost(ddlType.getSelectedIndex(),getDdlAge().getSelectedIndex(),40,(getDdlDuration().getSelectedIndex())*3,getCbFamily().isSelected());
		double monthlyCost = calculateMonthlyCost(cost,(getDdlDuration().getSelectedIndex())*3);
		getLblFeeResult().setText(String.format("£%.2f",cost));
		getLblMonthlyFeeResult().setText(String.format("£%.2f",monthlyCost));
	}
	public static double calculateCost(int type,int age,int visits,double duration,boolean family)
	{
		double cost = 0;
		if(type==1)
		{
			cost=400*(duration/12);
			if(age>40)cost*=0.8;
		}
		else if(type==2)
		{
			cost=200*(duration/12);
			if(visits>40)cost+=20;
		}
		else if(type==3)
		{
			cost=275*(duration/12);
			if(age>40)cost*=0.85;
		}
		if(family)cost*=0.95;
		return cost;
	}
	public static double calculateMonthlyCost(double cost,int duration)
	{
		return (cost+5)/duration;
	}
	public void validateForm()
	{
		boolean valid = true;
		if(getDdlAge().getSelectedIndex()==0)valid=false;
		if(getDdlType().getSelectedIndex()==0)valid=false;
		if(getDdlDuration().getSelectedIndex()==0)valid=false;
		if(getTxtName().getText().equals(""))valid=false;
		if(getTxtAddress().getText().equals("")&&getTxtAddressTwo().getText().equals(""))valid=false;

		if(valid)
		{
			getLblFeeResult().setVisible(true);
			getLblMonthlyFeeResult().setVisible(true);
			getLblFee().setVisible(true);
			getLblMonthlyFee().setVisible(true);
			getBCalculate().setVisible(true);
			getBtnNewButton_1().setVisible(true);
			getBtnNewButton_2().setVisible(true);
		}
		else {
			getLblFeeResult().setVisible(false);
			getLblMonthlyFeeResult().setVisible(false);
			getLblFee().setVisible(false);
			getLblMonthlyFee().setVisible(false);
			getBCalculate().setVisible(false);
			getBtnNewButton_1().setVisible(false);
			getBtnNewButton_2().setVisible(false);
		}
	}
	public void saveForm()
	{
		int userSelection = fileChooser.showSaveDialog(getFocusOwner());

		if (userSelection == JFileChooser.APPROVE_OPTION) {
			File fileToSave = fileChooser.getSelectedFile();
			PrintStream stream;
			try {
				stream = new PrintStream(fileToSave);
				stream.print(getTxtName().getText()+",");
				stream.print(getTxtAddress().getText()+",");
				stream.print(getTxtAddressTwo().getText()+",");
				stream.print(getDdlAge().getSelectedItem()+",");
				stream.print(getDdlType().getSelectedItem()+",");
				stream.print(getDdlDuration().getSelectedItem()+",");
				stream.print(String.valueOf(getCbFamily().isSelected())+",");
				double cost = calculateCost(ddlType.getSelectedIndex(),getDdlAge().getSelectedIndex(),40,(getDdlDuration().getSelectedIndex())*3,getCbFamily().isSelected());
				double monthlyCost = calculateMonthlyCost(cost,(getDdlDuration().getSelectedIndex())*3);
				stream.print(String.valueOf(cost)+",");
				stream.print(String.valueOf(monthlyCost));
				stream.close();
				resetForm();

			} catch (FileNotFoundException e) {			
				e.printStackTrace();

			}

		}
	}
	public void resetForm()
	{
		getTxtName().setText("");
		getTxtAddress().setText("");
		getTxtAddressTwo().setText("");
		getDdlAge().setSelectedIndex(0);
		getDdlType().setSelectedIndex(0);
		getDdlDuration().setSelectedIndex(0);
		getCbFamily().setSelected(false);
		getLblFeeResult().setText("");
		getLblMonthlyFeeResult().setText("");

		validateForm();
	}
	public void printDetails()
	{
		double cost = calculateCost(ddlType.getSelectedIndex(),getDdlAge().getSelectedIndex(),40,(getDdlDuration().getSelectedIndex())*3,getCbFamily().isSelected());
		double monthlyCost = calculateMonthlyCost(cost,(getDdlDuration().getSelectedIndex())*3);
		Printing print = new Printing(getTxtName().getText(),getTxtAddress().getText(),getTxtAddressTwo().getText(),
				getDdlType().getSelectedItem().toString(),getDdlDuration().getSelectedItem().toString(),getDdlAge().getSelectedIndex(),
				cost,monthlyCost,getCbFamily().isSelected());
		
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(print);
        boolean ok = job.printDialog();
        if (ok) {
            try {
                 job.print();
         		resetForm();
            } catch (PrinterException ex) {
             /* The job did not successfully complete */
            }
        }
		

	}
//public Printing(String Customer,String Address1,String Address2,String Type, String Duration,int Age,double Cost,double MonthlyCost,boolean Family)
	public JComboBox getDdlAge() {
		return ddlAge;
	}
	public JComboBox getDdlType() {
		return ddlType;
	}
	public JComboBox getDdlDuration() {
		return ddlDuration;
	}
	public JTextField getTxtName() {
		return txtName;
	}
	public JCheckBox getCbFamily() {
		return cbFamily;
	}
	public JTextField getTxtAddressTwo() {
		return txtAddressTwo;
	}
	public JTextField getTxtAddress() {
		return txtAddress;
	}
	public JLabel getLblFeeResult() {
		return lblFeeResult;
	}
	public JLabel getLblMonthlyFeeResult() {
		return lblMonthlyFeeResult;
	}
	public JLabel getLblFee() {
		return lblFee;
	}
	public JLabel getLblMonthlyFee() {
		return lblMonthlyFee;
	}
	public JButton getBCalculate() {
		return bCalculate;
	}
	public JButton getBtnNewButton_1() {
		return btnNewButton;
	}
	public JButton getBtnNewButton_2() {
		return btnNewButton_1;
	}
}
