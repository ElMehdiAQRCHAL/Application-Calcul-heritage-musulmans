import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;


import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JList;
import java.awt.Toolkit;

public class IHM {

	JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_41_1;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_4_1;
	private JTextField textField_4_2;
	private JTextField textField_4_3;
	private JTextField textField_4_4;
	private JTextField textField_4_5;
	private JTextField textField_4_6;
	
	
	
	private double v_somme;
	private double v_credit=0;
	private int v_wassiya=0;
	private int choix=0;
	private String v_hf;
	private String ex_homme="Non";
	private String ex_femme="Non";
	private String ex_fils="Non";
	private String ex_filsdefils="Non";
	private String ex_fille="Non";
	private String ex_filledefils="Non";
	private String ex_pere="Non";
	private String ex_mere="Non";
	private String ex_gdmm="Non";
	private String ex_gdmp="Non";
	private String ex_gdpp="Non";
	private String ex_frere="Non";
	private String ex_filsdefrere="Non";
	private String ex_soeur="Non";
	private String ex_freredepere="Non";
	private String ex_filsdefreredepere="Non";
	private String ex_soeurdepere="Non";
	private String ex_freredemere="Non";
	private String ex_soeurdemere="Non";
	private String ex_oncle="Non";
	private String ex_filsoncle="Non";
	private String ex_oncledepere="Non";
	private String ex_filsoncledepere="Non";
	
	private int nbr_femme=0;
	private int nbr_fils=0;
	private int nbr_filsdefils=0;
	private int nbr_fille=0;
	private int nbr_filledefils=0;
	private int nbr_frere=0;
	private int nbr_soeur=0;
	private int nbr_freredepere=0;
	private int nbr_soeurdepere=0;
	private int nbr_freredemere=0;
	private int nbr_soeurdemere=0;
	private int nbr_filsdefrere=0;
	private int nbr_filsdefreredepere=0;
	private int nbr_oncle=0;
	private int nbr_oncledepere=0;
	private int nbr_filsoncle=0;
	private int nbr_filsoncledepere=0;
	
	Object[][] data = new Object[40][4];
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IHM window = new IHM();
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
	public IHM() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("image\\icone3.png"));
		frame.getContentPane().setForeground(new Color(220, 220, 220));
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(220, 220, 220));
		frame.setTitle("حساب الميراث");
		frame.setBounds(100, 10, 1000, 700);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		initialize(frame,0);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(JFrame frame,int i) {
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, -43, 994, 809);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
			JComboBox comboBox = new JComboBox();
			comboBox.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
			comboBox.setBackground(Color.WHITE);
			comboBox.setEnabled(false);
			comboBox.setForeground(Color.BLACK);
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "ابن ابن", "بنت ابن", "الجد", "الجدة لأم", "الجدة لأب", "الأخ الشقيق", "الأخت الشقيقة", "الأخ لأم", "الأخت لأم", "الأخ لأب", "الأخت لأب", "ابن الأخ الشقيق", "ابن الأخ لأب", "العم الشقيق", "العم لأب", "ابن العم الشقيق", "ابن العم لأب", "شخص آخر"}));
			comboBox.setBounds(200, 495, 140, 30);
			panel.add(comboBox);
			
			JRadioButton rdbtnNewRadioButton1 = new JRadioButton("نعم");
			JRadioButton rdbtnNewRadioButton2 = new JRadioButton("لا");
			rdbtnNewRadioButton1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					rdbtnNewRadioButton2.setSelected(false);
					textField_41_1.setEnabled(true);
					if(rdbtnNewRadioButton1.isSelected()==false){
						textField_41_1.setEnabled(false);
					}
				    rdbtnNewRadioButton1.setSelected(true);
					textField_41_1.setEnabled(true);
				}
			});
			rdbtnNewRadioButton1.setHorizontalAlignment(SwingConstants.CENTER);
			rdbtnNewRadioButton1.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
			rdbtnNewRadioButton1.setBounds(500, 395, 60, 30);
			panel.add(rdbtnNewRadioButton1);
			panel.add(rdbtnNewRadioButton1);
			
			
			rdbtnNewRadioButton2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					rdbtnNewRadioButton1.setSelected(false);
					textField_41_1.setEnabled(false);
					if(rdbtnNewRadioButton2.isSelected()==false){
						textField_41_1.setEnabled(false);
					}
				    rdbtnNewRadioButton2.setSelected(true);
				    textField_41_1.setText("");
				    v_credit=0;
				}
			});
			rdbtnNewRadioButton2.setHorizontalAlignment(SwingConstants.CENTER);
			rdbtnNewRadioButton2.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
			rdbtnNewRadioButton2.setBounds(400, 395, 60, 30);
			panel.add(rdbtnNewRadioButton2);
			
			JRadioButton rdbtnNewRadioButton3 = new JRadioButton("نعم");
			JRadioButton rdbtnNewRadioButton4 = new JRadioButton("لا");
			rdbtnNewRadioButton3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					v_wassiya=1;
					rdbtnNewRadioButton4.setSelected(false);
					if(rdbtnNewRadioButton3.isSelected()==false){
						comboBox.setEnabled(false);
					}
					rdbtnNewRadioButton3.setSelected(true);
					comboBox.setEnabled(true);
				}
			});
			rdbtnNewRadioButton3.setHorizontalAlignment(SwingConstants.CENTER);
			rdbtnNewRadioButton3.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
			rdbtnNewRadioButton3.setBounds(500, 495, 60, 30);
			panel.add(rdbtnNewRadioButton3);
			panel.add(rdbtnNewRadioButton3);
			
			
			rdbtnNewRadioButton4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					rdbtnNewRadioButton3.setSelected(false);
					comboBox.setEnabled(false);
					if(rdbtnNewRadioButton4.isSelected()==false){
						comboBox.setEnabled(false);
					}
					rdbtnNewRadioButton4.setSelected(true);
					comboBox.setSelectedIndex(0);
					v_wassiya=0;
				}
			});
			rdbtnNewRadioButton4.setHorizontalAlignment(SwingConstants.CENTER);
			rdbtnNewRadioButton4.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
			rdbtnNewRadioButton4.setBounds(400, 495, 60, 30);
			panel.add(rdbtnNewRadioButton4);
			
			
			textField_41 = new JTextField();
			textField_41.setText("قيمة التركة");
			textField_41.setEditable(false);
			textField_41.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
			textField_41.setHorizontalAlignment(SwingConstants.CENTER);
			textField_41.setBounds(517, 295, 140, 30);
			textField_41.setColumns(10);
			panel.add(textField_41);
			
			textField_43 = new JTextField();
			textField_43.setHorizontalAlignment(SwingConstants.CENTER);
			textField_43.setText("هل للهالك دين ؟");
			textField_43.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
			textField_43.setEditable(false);
			textField_43.setBounds(600, 395, 140, 30);
			textField_43.setColumns(10);
			panel.add(textField_43);
			
			textField_44 = new JTextField();
			textField_44.setHorizontalAlignment(SwingConstants.CENTER);
			textField_44.setText("هل للهالك وصية ؟");
			textField_44.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
			textField_44.setEditable(false);
			textField_44.setBounds(600, 495, 140, 30);
			textField_44.setColumns(10);
			panel.add(textField_44);
			
			textField_41_1 = new JTextField();
			textField_41_1.setEnabled(false);
			textField_41_1.setForeground(Color.BLACK);
			textField_41_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
			textField_41_1.setHorizontalAlignment(SwingConstants.CENTER);
			textField_41_1.setBounds(200, 395, 140, 30);
			textField_41_1.setColumns(10);
			panel.add(textField_41_1);
			textField_41_1.addKeyListener(new KeyAdapter() {
				public void keyTyped(KeyEvent evt) {
					char c = evt.getKeyChar();
					if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)) {
						evt.consume();
					}
				}
			});

			
			textField_40 = new JTextField();
			textField_40.setHorizontalAlignment(SwingConstants.CENTER);
			textField_40.setFont(new Font("Times New Roman", Font.BOLD, 16));
			textField_40.setBounds(350, 295, 150, 30);
			panel.add(textField_40);
			textField_40.setColumns(10);
			textField_40.addKeyListener(new KeyAdapter() {
				public void keyTyped(KeyEvent evt) {
					char c = evt.getKeyChar();
					if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)) {
						evt.consume();
					}
				}
			});
			
			JButton btnNewButton2 = new JButton("التالي");
			btnNewButton2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int delay = 2500;
					int i=1;
					if(!textField_40.getText().equals("") && ((rdbtnNewRadioButton1.isSelected()==true && !textField_41_1.getText().equals("")) || rdbtnNewRadioButton2.isSelected()==true) && ((rdbtnNewRadioButton3.isSelected()==true && !comboBox.getSelectedItem().equals("")) || rdbtnNewRadioButton4.isSelected()==true)) {
						v_somme = Double.parseDouble(textField_40.getText()); 
						if(textField_41_1.getText().equals("")==false) {
							v_credit = Double.parseDouble(textField_41_1.getText());
						}
					    if(v_somme==0) {
					    	textField_4_3 = new JTextField();
							textField_4_3.setForeground(Color.WHITE);
							textField_4_3.setBackground(Color.RED);
							textField_4_3.setText("التركة منعدمة*");
							textField_4_3.setEditable(false);
							textField_4_3.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
							textField_4_3.setHorizontalAlignment(SwingConstants.CENTER);
							textField_4_3.setBounds(517, 617, 140, 30);
							textField_4_3.setColumns(10);
							panel.add(textField_4_3);
							Timer timer = new Timer( delay, new ActionListener(){
								  public void actionPerformed( ActionEvent e ){
									  panel.revalidate();
									  panel.repaint();
								  }
								} );
								timer.setRepeats( false );
								timer.start();
					    }else if(Math.max(v_somme,v_credit)==v_credit){
							textField_4_6 = new JTextField();
							textField_4_6.setForeground(Color.WHITE);
							textField_4_6.setBackground(Color.RED);
							textField_4_6.setText("التركة استهلكها الدين*");
							textField_4_6.setEditable(false);
							textField_4_6.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
							textField_4_6.setHorizontalAlignment(SwingConstants.CENTER);
							textField_4_6.setBounds(517, 617, 140, 30);
							textField_4_6.setColumns(10);
							panel.add(textField_4_6);
							Timer timer = new Timer( delay, new ActionListener(){
								  public void actionPerformed( ActionEvent e ){
									  panel.revalidate();
									  panel.repaint();
								  }
								} );
								timer.setRepeats( false );
								timer.start();
						}else {
							tabbedPane.setSelectedIndex(1);
						}
						
					}
					if(textField_40.getText().equals("")) {
						textField_4_1 = new JTextField();
						textField_4_1.setForeground(Color.WHITE);
						textField_4_1.setBackground(Color.RED);
						textField_4_1.setText("أدخل قيمة التركة*");
						textField_4_1.setEditable(false);
						textField_4_1.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
						textField_4_1.setHorizontalAlignment(SwingConstants.CENTER);
						textField_4_1.setBounds(200, 295, 140, 30);
						textField_4_1.setColumns(10);
						panel.add(textField_4_1);
						Timer timer = new Timer( delay, new ActionListener(){
						  public void actionPerformed( ActionEvent e ){
							  panel.revalidate();
							  panel.repaint();
						  }
						} );
						timer.setRepeats( false );
						timer.start();
					}
					if((rdbtnNewRadioButton1.isSelected()==false && rdbtnNewRadioButton2.isSelected()==false) || (rdbtnNewRadioButton1.isSelected()==true && textField_41_1.getText().equals(""))) {
						textField_4_4 = new JTextField();
						textField_4_4.setForeground(Color.WHITE);
						textField_4_4.setBackground(Color.RED);
						textField_4_4.setText("أدخل الدين*");
						textField_4_4.setEditable(false);
						textField_4_4.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
						textField_4_4.setHorizontalAlignment(SwingConstants.CENTER);
						textField_4_4.setBounds(50, 395, 140, 30);
						textField_4_4.setColumns(10);
						panel.add(textField_4_4);
						Timer timer = new Timer( delay, new ActionListener(){
							  public void actionPerformed( ActionEvent e ){
								  panel.revalidate();
								  panel.repaint();
							  }
							} );
							timer.setRepeats( false );
							timer.start();
					}
					if((rdbtnNewRadioButton3.isSelected()==false && rdbtnNewRadioButton4.isSelected()==false) || (rdbtnNewRadioButton3.isSelected()==true && comboBox.getSelectedItem().equals(""))) {
						textField_4_5 = new JTextField();
						textField_4_5.setForeground(Color.WHITE);
						textField_4_5.setBackground(Color.RED);
						textField_4_5.setText("أدخل الوصية*");
						textField_4_5.setEditable(false);
						textField_4_5.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
						textField_4_5.setHorizontalAlignment(SwingConstants.CENTER);
						textField_4_5.setBounds(50, 495, 140, 30);
						textField_4_5.setColumns(10);
						panel.add(textField_4_5);
						Timer timer = new Timer( delay, new ActionListener(){
							  public void actionPerformed( ActionEvent e ){
								  panel.revalidate();
								  panel.repaint();
							  }
							} );
							timer.setRepeats( false );
							timer.start();
					}
				}	
			});
			btnNewButton2.setForeground(Color.BLACK);
			btnNewButton2.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnNewButton2.setBounds(74, 626, 149, 35);
			panel.add(btnNewButton2);
			
			JButton btnNewButton_7 = new JButton(" <<< السابق    ");
			btnNewButton_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tabbedPane.setSelectedIndex(3);
				}
			});
			btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnNewButton_7.setForeground(Color.BLACK);
			btnNewButton_7.setBounds(775, 626, 149, 35);
			panel.add(btnNewButton_7);
			
			
			JLabel lblNewLabel_55 = new JLabel("");
			lblNewLabel_55.setIcon(new ImageIcon("image\\logo.png"));
			lblNewLabel_55.setBounds(284, 21, 401, 193);
			panel.add(lblNewLabel_55);
			
			JLabel lblNewLabel_56 = new JLabel("");
			lblNewLabel_56.setFont(new Font("Simplified Arabic Fixed", Font.PLAIN, 11));
			lblNewLabel_56.setForeground(Color.BLACK);
			lblNewLabel_56.setIcon(new ImageIcon("image\\background2.jpg"));
			lblNewLabel_56.setBounds(-24, 0, 1209, 693);
			panel.add(lblNewLabel_56);
			
			
			
			
			
			
			

////////////////////////////////////////////////////////////////////////////////////////////////////
			
		
			JLabel lblNewLabel_73 = new JLabel("");
			lblNewLabel_73.setIcon(new ImageIcon("image\\logo.png"));
			lblNewLabel_73.setBounds(284, 21, 401, 193);
			panel1.add(lblNewLabel_73);
			
			JLabel lblNewLabel_100 = new JLabel("");
			lblNewLabel_100.setIcon(new ImageIcon("image\\logo.png"));
			lblNewLabel_100.setBounds(284, 21, 401, 193);
			panel2.add(lblNewLabel_100);
			
			
		tabbedPane.addTab("New tab", null, panel1, null);
		panel1.setLayout(null);
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEnabled(false);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1"}));
		
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setBounds(649, 290, 45, 30);
		panel1.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setEnabled(false);
		comboBox_2.setForeground(Color.BLACK);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBox_2.setBounds(649, 330, 45, 30);
		panel1.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setEnabled(false);
		comboBox_3.setForeground(Color.BLACK);
		comboBox_3.setMaximumRowCount(10);
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_3.setBounds(649, 370, 45, 30);
		panel1.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setEnabled(false);
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_4.setMaximumRowCount(10);
		comboBox_4.setBounds(649, 410, 45, 30);
		panel1.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setMaximumRowCount(10);
		comboBox_5.setForeground(Color.BLACK);
		comboBox_5.setEnabled(false);
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_5.setBounds(649, 450, 45, 30);
		panel1.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setMaximumRowCount(10);
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_6.setForeground(Color.BLACK);
		comboBox_6.setEnabled(false);
		comboBox_6.setBounds(649, 490, 45, 30);
		panel1.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setEnabled(false);
		comboBox_7.setForeground(Color.BLACK);
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"1"}));
		comboBox_7.setBounds(649, 530, 45, 30);
		panel1.add(comboBox_7);
		
		JComboBox comboBox_8 = new JComboBox();
		comboBox_8.setEnabled(false);
		comboBox_8.setForeground(Color.BLACK);
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"1"}));
		comboBox_8.setBounds(649, 570, 45, 30);
		panel1.add(comboBox_8);
		
		JComboBox comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"1"}));
		comboBox_9.setMaximumRowCount(10);
		comboBox_9.setForeground(Color.BLACK);
		comboBox_9.setEnabled(false);
		comboBox_9.setBounds(374, 290, 45, 30);
		panel1.add(comboBox_9);
		
		JComboBox comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"1"}));
		comboBox_11.setMaximumRowCount(10);
		comboBox_11.setForeground(Color.BLACK);
		comboBox_11.setEnabled(false);
		comboBox_11.setBounds(374, 370, 45, 30);
		panel1.add(comboBox_11);
		
		JComboBox comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"1"}));
		comboBox_10.setMaximumRowCount(10);
		comboBox_10.setForeground(Color.BLACK);
		comboBox_10.setEnabled(false);
		comboBox_10.setBounds(374, 330, 45, 30);
		panel1.add(comboBox_10);
		
		JComboBox comboBox_12 = new JComboBox();
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_12.setMaximumRowCount(10);
		comboBox_12.setForeground(Color.BLACK);
		comboBox_12.setEnabled(false);
		comboBox_12.setBounds(374, 410, 45, 30);
		panel1.add(comboBox_12);
		
		JComboBox comboBox_13 = new JComboBox();
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_13.setMaximumRowCount(10);
		comboBox_13.setForeground(Color.BLACK);
		comboBox_13.setEnabled(false);
		comboBox_13.setBounds(374, 450, 45, 30);
		panel1.add(comboBox_13);
		
		JComboBox comboBox_15 = new JComboBox();
		comboBox_15.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_15.setMaximumRowCount(10);
		comboBox_15.setForeground(Color.BLACK);
		comboBox_15.setEnabled(false);
		comboBox_15.setBounds(374, 530, 45, 30);
		panel1.add(comboBox_15);
		
		JComboBox comboBox_16 = new JComboBox();
		comboBox_16.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_16.setMaximumRowCount(10);
		comboBox_16.setForeground(Color.BLACK);
		comboBox_16.setEnabled(false);
		comboBox_16.setBounds(374, 570, 45, 30);
		panel1.add(comboBox_16);
		
		JComboBox comboBox_14 = new JComboBox();
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_14.setMaximumRowCount(10);
		comboBox_14.setForeground(Color.BLACK);
		comboBox_14.setEnabled(false);
		comboBox_14.setBounds(374, 490, 45, 30);
		panel1.add(comboBox_14);
		
		JComboBox comboBox_17 = new JComboBox();
		comboBox_17.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_17.setMaximumRowCount(10);
		comboBox_17.setForeground(Color.BLACK);
		comboBox_17.setEnabled(false);
		comboBox_17.setBounds(101, 290, 45, 30);
		panel1.add(comboBox_17);
		
		JComboBox comboBox_18 = new JComboBox();
		comboBox_18.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_18.setMaximumRowCount(10);
		comboBox_18.setForeground(Color.BLACK);
		comboBox_18.setEnabled(false);
		comboBox_18.setBounds(101, 330, 45, 30);
		panel1.add(comboBox_18);
		
		JComboBox comboBox_19 = new JComboBox();
		comboBox_19.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_19.setMaximumRowCount(10);
		comboBox_19.setForeground(Color.BLACK);
		comboBox_19.setEnabled(false);
		comboBox_19.setBounds(101, 370, 45, 30);
		panel1.add(comboBox_19);
		
		JComboBox comboBox_20 = new JComboBox();
		comboBox_20.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_20.setMaximumRowCount(10);
		comboBox_20.setForeground(Color.BLACK);
		comboBox_20.setEnabled(false);
		comboBox_20.setBounds(101, 410, 45, 30);
		panel1.add(comboBox_20);
		
		JComboBox comboBox_21 = new JComboBox();
		comboBox_21.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_21.setMaximumRowCount(10);
		comboBox_21.setForeground(Color.BLACK);
		comboBox_21.setEnabled(false);
		comboBox_21.setBounds(101, 450, 45, 30);
		panel1.add(comboBox_21);
		
		JComboBox comboBox_22 = new JComboBox();
		comboBox_22.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_22.setMaximumRowCount(10);
		comboBox_22.setForeground(Color.BLACK);
		comboBox_22.setEnabled(false);
		comboBox_22.setBounds(101, 490, 45, 30);
		panel1.add(comboBox_22);
		
		JComboBox comboBox_23 = new JComboBox();
		comboBox_23.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboBox_23.setMaximumRowCount(10);
		comboBox_23.setForeground(Color.BLACK);
		comboBox_23.setEnabled(false);
		comboBox_23.setBounds(101, 530, 45, 30);
		panel1.add(comboBox_23);
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("الزوج        ");
		rdbtnNewRadioButton_2.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		rdbtnNewRadioButton_2.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_1.setEnabled(true);
				ex_homme="Oui";
				if(rdbtnNewRadioButton_2.isSelected()==false){
					comboBox_1.setEnabled(false);
					ex_homme="Non";
				}
			}
		});
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("الزوجة        ");
		rdbtnNewRadioButton_3.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		rdbtnNewRadioButton_3.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_2.setEnabled(true);
				ex_femme = "Oui";
				if(rdbtnNewRadioButton_3.isSelected()==false){
					comboBox_2.setEnabled(false);
					ex_femme = "Non";
				}
			}
		});
		rdbtnNewRadioButton_3.setForeground(Color.BLACK);
		rdbtnNewRadioButton_3.setBounds(700, 330, 109, 30);
		panel1.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_2.setForeground(Color.BLACK);
		rdbtnNewRadioButton_2.setBounds(700, 290, 109, 30);
		panel1.add(rdbtnNewRadioButton_2);
		
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("أنثى");
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ذكر");
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("الابن          ");
		rdbtnNewRadioButton_4.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		rdbtnNewRadioButton_4.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_3.setEnabled(true);
				ex_fils="Oui";
				if(rdbtnNewRadioButton_4.isSelected()==false) {
					comboBox_3.setEnabled(false);
					ex_fils="Non";
				}
			}
		});
		rdbtnNewRadioButton_4.setForeground(Color.BLACK);
		rdbtnNewRadioButton_4.setBounds(700, 370, 109, 30);
		panel1.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("ابن الابن      ");
		rdbtnNewRadioButton_5.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		rdbtnNewRadioButton_5.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_4.setEnabled(true);
				ex_filsdefils="Oui";
				if(rdbtnNewRadioButton_5.isSelected()==false) {
					comboBox_4.setEnabled(false);
					ex_filsdefils="Non";
				}
			}
		});
		rdbtnNewRadioButton_5.setForeground(Color.BLACK);
		rdbtnNewRadioButton_5.setBounds(700, 410, 109, 30);
		panel1.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("البنت          ");
		rdbtnNewRadioButton_6.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		rdbtnNewRadioButton_6.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_5.setEnabled(true);
				ex_fille="Oui";
				if(rdbtnNewRadioButton_6.isSelected()==false) {
					comboBox_5.setEnabled(false);
					ex_fille="Non";
				}
			}
		});
		rdbtnNewRadioButton_6.setForeground(Color.BLACK);
		rdbtnNewRadioButton_6.setBounds(700, 450, 109, 30);
		panel1.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("بنت الابن     ");
		rdbtnNewRadioButton_7.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		rdbtnNewRadioButton_7.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_6.setEnabled(true);
				ex_filledefils="Oui";
				if(rdbtnNewRadioButton_7.isSelected()==false) {
					comboBox_6.setEnabled(false);
					ex_filledefils="Non";
				}
			}
		});
		rdbtnNewRadioButton_7.setForeground(Color.BLACK);
		rdbtnNewRadioButton_7.setBounds(700, 490, 109, 30);
		panel1.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("الأب          ");
		rdbtnNewRadioButton_8.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		rdbtnNewRadioButton_8.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_7.setEnabled(true);
				ex_pere="Oui";
				if(rdbtnNewRadioButton_8.isSelected()==false) {
					comboBox_7.setEnabled(false);
					ex_pere="Non";
				}
			}
		});
		rdbtnNewRadioButton_8.setForeground(Color.BLACK);
		rdbtnNewRadioButton_8.setBounds(700, 530, 109, 30);
		panel1.add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_9 = new JRadioButton("الأم            ");
		rdbtnNewRadioButton_9.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		rdbtnNewRadioButton_9.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_8.setEnabled(true);
				ex_mere="Oui";
				if(rdbtnNewRadioButton_9.isSelected()==false) {
					comboBox_8.setEnabled(false);
					ex_mere="Non";
				}
			}
		});
		rdbtnNewRadioButton_9.setForeground(Color.BLACK);
		rdbtnNewRadioButton_9.setBounds(700, 570, 109, 30);
		panel1.add(rdbtnNewRadioButton_9);
		
		JRadioButton rdbtnNewRadioButton_10 = new JRadioButton("الجد لأب     ");
		rdbtnNewRadioButton_10.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		rdbtnNewRadioButton_10.setForeground(Color.BLACK);
		rdbtnNewRadioButton_10.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_9.setEnabled(true);
				ex_gdpp="Oui";
				if(rdbtnNewRadioButton_10.isSelected()==false) {
					comboBox_9.setEnabled(false);
					ex_gdpp="Non";
				}
			}
		});
		rdbtnNewRadioButton_10.setBounds(430, 290, 109, 30);
		panel1.add(rdbtnNewRadioButton_10);
		
		JRadioButton rdbtnNewRadioButton_11 = new JRadioButton("الأخ لأب     ");
		rdbtnNewRadioButton_11.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		rdbtnNewRadioButton_11.setForeground(Color.BLACK);
		rdbtnNewRadioButton_11.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_14.setEnabled(true);
				ex_freredepere="Oui";
				if(rdbtnNewRadioButton_11.isSelected()==false) {
					comboBox_14.setEnabled(false);
					ex_freredepere="Non";
				}
			}
		});
		rdbtnNewRadioButton_11.setBounds(430, 490, 109, 30);
		panel1.add(rdbtnNewRadioButton_11);
		
		JRadioButton rdbtnNewRadioButton_12 = new JRadioButton("الجدة لأب    ");
		rdbtnNewRadioButton_12.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		rdbtnNewRadioButton_12.setForeground(Color.BLACK);
		rdbtnNewRadioButton_12.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_10.setEnabled(true);
				ex_gdmp="Oui";
				if(rdbtnNewRadioButton_12.isSelected()==false) {
					comboBox_10.setEnabled(false);
					ex_gdmp="Non";
				}
			}
		});
		rdbtnNewRadioButton_12.setBounds(430, 330, 109, 30);
		panel1.add(rdbtnNewRadioButton_12);
		
		JRadioButton rdbtnNewRadioButton_13 = new JRadioButton("الجدة لأم     ");
		rdbtnNewRadioButton_13.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		rdbtnNewRadioButton_13.setForeground(Color.BLACK);
		rdbtnNewRadioButton_13.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_11.setEnabled(true);
				ex_gdmm="Oui";
				if(rdbtnNewRadioButton_13.isSelected()==false) {
					comboBox_11.setEnabled(false);
					ex_gdmm="Non";
				}
			}
		});
		rdbtnNewRadioButton_13.setBounds(430, 370, 109, 30);
		panel1.add(rdbtnNewRadioButton_13);
		
		JRadioButton rdbtnNewRadioButton_14 = new JRadioButton("الأخ الشقيق   ");
		rdbtnNewRadioButton_14.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		rdbtnNewRadioButton_14.setForeground(Color.BLACK);
		rdbtnNewRadioButton_14.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_12.setEnabled(true);
				ex_frere="Oui";
				if(rdbtnNewRadioButton_14.isSelected()==false) {
					comboBox_12.setEnabled(false);
					ex_frere="Non";
				}
			}
		});
		rdbtnNewRadioButton_14.setBounds(430, 410, 109, 30);
		panel1.add(rdbtnNewRadioButton_14);
		
		JRadioButton rdbtnNewRadioButton_15 = new JRadioButton("الأخت الشقيقة");
		rdbtnNewRadioButton_15.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		rdbtnNewRadioButton_15.setForeground(Color.BLACK);
		rdbtnNewRadioButton_15.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_13.setEnabled(true);
				ex_soeur="Oui";
				if(rdbtnNewRadioButton_15.isSelected()==false) {
					comboBox_13.setEnabled(false);
					ex_soeur="Non";
				}
			}
		});
		rdbtnNewRadioButton_15.setBounds(430, 450, 109, 30);
		panel1.add(rdbtnNewRadioButton_15);
		
		JRadioButton rdbtnNewRadioButton_16 = new JRadioButton("الأخت لأب  ");
		rdbtnNewRadioButton_16.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		rdbtnNewRadioButton_16.setForeground(Color.BLACK);
		rdbtnNewRadioButton_16.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_15.setEnabled(true);
				ex_soeurdepere="Oui";
				if(rdbtnNewRadioButton_16.isSelected()==false) {
					comboBox_15.setEnabled(false);
					ex_soeurdepere="Non";
				}
			}
		});
		rdbtnNewRadioButton_16.setBounds(430, 530, 109, 30);
		panel1.add(rdbtnNewRadioButton_16);
		
		JRadioButton rdbtnNewRadioButton_17 = new JRadioButton("الأخ لأم      ");
		rdbtnNewRadioButton_17.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		rdbtnNewRadioButton_17.setForeground(Color.BLACK);
		rdbtnNewRadioButton_17.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_16.setEnabled(true);
				ex_freredemere="Oui";
				if(rdbtnNewRadioButton_17.isSelected()==false) {
					comboBox_16.setEnabled(false);
					ex_freredemere="Non";
				}
			}
		});
		rdbtnNewRadioButton_17.setBounds(430, 570, 109, 30);
		panel1.add(rdbtnNewRadioButton_17);
		
		JRadioButton rdbtnNewRadioButton_18 = new JRadioButton("الأخت لأم    ");
		rdbtnNewRadioButton_18.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		rdbtnNewRadioButton_18.setForeground(Color.BLACK);
		rdbtnNewRadioButton_18.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_17.setEnabled(true);
				ex_soeurdemere="Oui";
				if(rdbtnNewRadioButton_18.isSelected()==false) {
					comboBox_17.setEnabled(false);
					ex_soeurdemere="Non";
				}
			}
		});
		rdbtnNewRadioButton_18.setBounds(160, 290, 109, 30);
		panel1.add(rdbtnNewRadioButton_18);
		
		JRadioButton rdbtnNewRadioButton_19 = new JRadioButton("ابن الأخ الشقيق ");
		rdbtnNewRadioButton_19.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
		rdbtnNewRadioButton_19.setForeground(Color.BLACK);
		rdbtnNewRadioButton_19.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_18.setEnabled(true);
				ex_filsdefrere="Oui";
				if(rdbtnNewRadioButton_19.isSelected()==false) {
					comboBox_18.setEnabled(false);
					ex_filsdefrere="Non";
				}
			}
		});
		rdbtnNewRadioButton_19.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnNewRadioButton_19.setBounds(160, 330, 109, 30);
		panel1.add(rdbtnNewRadioButton_19);
		
		JRadioButton rdbtnNewRadioButton_20 = new JRadioButton("ابن الأخ لأب ");
		rdbtnNewRadioButton_20.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		rdbtnNewRadioButton_20.setForeground(Color.BLACK);
		rdbtnNewRadioButton_20.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_19.setEnabled(true);
				ex_filsdefreredepere="Oui";
				if(rdbtnNewRadioButton_20.isSelected()==false) {
					comboBox_19.setEnabled(false);
					ex_filsdefreredepere="Non";
				}
			}
		});
		rdbtnNewRadioButton_20.setBounds(160, 370, 109, 30);
		panel1.add(rdbtnNewRadioButton_20);
		
		JRadioButton rdbtnNewRadioButton_21 = new JRadioButton("العم الشقيق   ");
		rdbtnNewRadioButton_21.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		rdbtnNewRadioButton_21.setForeground(Color.BLACK);
		rdbtnNewRadioButton_21.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_20.setEnabled(true);
				ex_oncle="Oui";
				if(rdbtnNewRadioButton_21.isSelected()==false) {
					comboBox_20.setEnabled(false);
					ex_oncle="Non";
				}
			}
		});
		rdbtnNewRadioButton_21.setBounds(160, 410, 109, 30);
		panel1.add(rdbtnNewRadioButton_21);
		
		JRadioButton rdbtnNewRadioButton_22 = new JRadioButton("العم لأب      ");
		rdbtnNewRadioButton_22.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		rdbtnNewRadioButton_22.setForeground(Color.BLACK);
		rdbtnNewRadioButton_22.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_21.setEnabled(true);
				ex_oncledepere="Oui";
				if(rdbtnNewRadioButton_22.isSelected()==false) {
					comboBox_21.setEnabled(false);
					ex_oncledepere="Non";
				}
			}
		});
		rdbtnNewRadioButton_22.setBounds(160, 450, 109, 30);
		panel1.add(rdbtnNewRadioButton_22);
		
		JRadioButton rdbtnNewRadioButton_23 = new JRadioButton("ابن العم الشقيق ");
		rdbtnNewRadioButton_23.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
		rdbtnNewRadioButton_23.setForeground(Color.BLACK);
		rdbtnNewRadioButton_23.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_22.setEnabled(true);
				ex_filsoncle="Oui";
				if(rdbtnNewRadioButton_23.isSelected()==false) {
					comboBox_22.setEnabled(false);
					ex_filsoncle="Non";
				}
			}
		});
		rdbtnNewRadioButton_23.setBounds(160, 490, 109, 30);
		panel1.add(rdbtnNewRadioButton_23);
		
		JRadioButton rdbtnNewRadioButton_24 = new JRadioButton("ابن العم لأب ");
		rdbtnNewRadioButton_24.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		rdbtnNewRadioButton_24.setForeground(Color.BLACK);
		rdbtnNewRadioButton_24.setBackground(new Color(220, 220, 220));
		rdbtnNewRadioButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_23.setEnabled(true);
				ex_filsoncledepere="Oui";
				if(rdbtnNewRadioButton_24.isSelected()==false) {
					comboBox_23.setEnabled(false);
					ex_filsoncledepere="Non";
				}
			}
		});
		rdbtnNewRadioButton_24.setBounds(160, 530, 109, 30);
		panel1.add(rdbtnNewRadioButton_24);
		
		
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButton.setSelected(false);
				rdbtnNewRadioButton_3.setEnabled(false);
				rdbtnNewRadioButton_2.setEnabled(true);
				rdbtnNewRadioButton_1.setSelected(true);
				v_hf="f";
				rdbtnNewRadioButton_4.setEnabled(true);
				rdbtnNewRadioButton_5.setEnabled(true);
				rdbtnNewRadioButton_6.setEnabled(true);
				rdbtnNewRadioButton_7.setEnabled(true);
				rdbtnNewRadioButton_8.setEnabled(true);
				rdbtnNewRadioButton_9.setEnabled(true);
				rdbtnNewRadioButton_10.setEnabled(true);
				rdbtnNewRadioButton_11.setEnabled(true);
				rdbtnNewRadioButton_12.setEnabled(true);
				rdbtnNewRadioButton_13.setEnabled(true);
				rdbtnNewRadioButton_14.setEnabled(true);
				rdbtnNewRadioButton_15.setEnabled(true);
				rdbtnNewRadioButton_16.setEnabled(true);
				rdbtnNewRadioButton_17.setEnabled(true);
				rdbtnNewRadioButton_18.setEnabled(true);
				rdbtnNewRadioButton_19.setEnabled(true);
				rdbtnNewRadioButton_20.setEnabled(true);
				rdbtnNewRadioButton_21.setEnabled(true);
				rdbtnNewRadioButton_22.setEnabled(true);
				rdbtnNewRadioButton_23.setEnabled(true);
				rdbtnNewRadioButton_24.setEnabled(true);
			}
		});
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1.setForeground(Color.BLACK);
		rdbtnNewRadioButton_1.setBounds(280, 242, 109, 25);//561, 210, 133, 30
		panel1.add(rdbtnNewRadioButton_1);
		
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNewRadioButton_1.setSelected(false);
				rdbtnNewRadioButton_2.setEnabled(false);
				rdbtnNewRadioButton_3.setEnabled(true);
				rdbtnNewRadioButton.setSelected(true);
				v_hf="h";
				rdbtnNewRadioButton_4.setEnabled(true);
				rdbtnNewRadioButton_5.setEnabled(true);
				rdbtnNewRadioButton_6.setEnabled(true);
				rdbtnNewRadioButton_7.setEnabled(true);
				rdbtnNewRadioButton_8.setEnabled(true);
				rdbtnNewRadioButton_9.setEnabled(true);
				rdbtnNewRadioButton_10.setEnabled(true);
				rdbtnNewRadioButton_11.setEnabled(true);
				rdbtnNewRadioButton_12.setEnabled(true);
				rdbtnNewRadioButton_13.setEnabled(true);
				rdbtnNewRadioButton_14.setEnabled(true);
				rdbtnNewRadioButton_15.setEnabled(true);
				rdbtnNewRadioButton_16.setEnabled(true);
				rdbtnNewRadioButton_17.setEnabled(true);
				rdbtnNewRadioButton_18.setEnabled(true);
				rdbtnNewRadioButton_19.setEnabled(true);
				rdbtnNewRadioButton_20.setEnabled(true);
				rdbtnNewRadioButton_21.setEnabled(true);
				rdbtnNewRadioButton_22.setEnabled(true);
				rdbtnNewRadioButton_23.setEnabled(true);
				rdbtnNewRadioButton_24.setEnabled(true);
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setForeground(Color.BLACK);
		rdbtnNewRadioButton.setBounds(420, 242, 109, 25);
		panel1.add(rdbtnNewRadioButton);
		
		textField_45 = new JTextField();
		textField_45.setHorizontalAlignment(SwingConstants.CENTER);
		textField_45.setText("جنس الهالك");
		textField_45.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
		textField_45.setEditable(false);
		textField_45.setBounds(561, 240, 133, 30);
		textField_45.setColumns(10);
		panel1.add(textField_45);
		
		JButton btnNewButton = new JButton("توزيع التركة");
		
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(100, 626, 149, 35);
		panel1.add(btnNewButton);
		
		
		
		rdbtnNewRadioButton_2.setEnabled(false);
		rdbtnNewRadioButton_3.setEnabled(false);
		rdbtnNewRadioButton_4.setEnabled(false);
		rdbtnNewRadioButton_5.setEnabled(false);
		rdbtnNewRadioButton_6.setEnabled(false);
		rdbtnNewRadioButton_7.setEnabled(false);
		rdbtnNewRadioButton_8.setEnabled(false);
		rdbtnNewRadioButton_9.setEnabled(false);
		rdbtnNewRadioButton_10.setEnabled(false);
		rdbtnNewRadioButton_11.setEnabled(false);
		rdbtnNewRadioButton_12.setEnabled(false);
		rdbtnNewRadioButton_13.setEnabled(false);
		rdbtnNewRadioButton_14.setEnabled(false);
		rdbtnNewRadioButton_15.setEnabled(false);
		rdbtnNewRadioButton_16.setEnabled(false);
		rdbtnNewRadioButton_17.setEnabled(false);
		rdbtnNewRadioButton_18.setEnabled(false);
		rdbtnNewRadioButton_19.setEnabled(false);
		rdbtnNewRadioButton_20.setEnabled(false);
		rdbtnNewRadioButton_21.setEnabled(false);
		rdbtnNewRadioButton_22.setEnabled(false);
		rdbtnNewRadioButton_23.setEnabled(false);
		rdbtnNewRadioButton_24.setEnabled(false);
		
		JButton btnNewButton_1 = new JButton(" <<< السابق    ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(775, 626, 149, 35);
		panel1.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setIcon(new ImageIcon("image\\background2.jpg"));
		lblNewLabel_2.setBounds(-21, 0, 1209, 697);
		panel1.add(lblNewLabel_2);
		
		
		
		tabbedPane.addTab("New tab", null, panel2, null);
		panel2.setLayout(null);
		JLabel lblNewLabel_21 = new JLabel("علم المواريث");
		lblNewLabel_21.setBackground(new Color(0, 128, 0));
		lblNewLabel_21.setForeground(new Color(0, 0, 0));
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNewLabel_21.setBounds(343, 0, 260, 92);
		panel2.add(lblNewLabel_21);
		
		JButton btnNewButton_22 = new JButton(" إغلاق    ");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				frame.dispose();
			}
		});
		btnNewButton_22.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_22.setForeground(Color.BLACK);
		btnNewButton_22.setBounds(775, 626, 149, 35);
		panel2.add(btnNewButton_22);
		


		
		
		
		
		

		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1.isSelected()==true || rdbtnNewRadioButton.isSelected()==true) {
					tabbedPane.setSelectedIndex(2);
					
					/*********** La recuperation des nombres des heritiers **********/
					nbr_femme=Integer.parseInt(comboBox_2.getSelectedItem().toString());
					if(rdbtnNewRadioButton_3.isSelected()==false) {nbr_femme=0;}
					nbr_fils=Integer.parseInt(comboBox_3.getSelectedItem().toString());
					if(rdbtnNewRadioButton_4.isSelected()==false) {nbr_fils=0;}
					nbr_filsdefils=Integer.parseInt(comboBox_4.getSelectedItem().toString());
					if(rdbtnNewRadioButton_5.isSelected()==false) {nbr_filsdefils=0;}
					nbr_fille=Integer.parseInt(comboBox_5.getSelectedItem().toString());
					if(rdbtnNewRadioButton_6.isSelected()==false) {nbr_fille=0;}
					nbr_filledefils=Integer.parseInt(comboBox_6.getSelectedItem().toString());
					if(rdbtnNewRadioButton_7.isSelected()==false) {nbr_filledefils=0;}
					nbr_frere=Integer.parseInt(comboBox_12.getSelectedItem().toString());
					if(rdbtnNewRadioButton_14.isSelected()==false) {nbr_frere=0;}
					nbr_soeur=Integer.parseInt(comboBox_13.getSelectedItem().toString());
					if(rdbtnNewRadioButton_15.isSelected()==false) {nbr_soeur=0;}
					nbr_freredepere=Integer.parseInt(comboBox_14.getSelectedItem().toString());
					if(rdbtnNewRadioButton_11.isSelected()==false) {nbr_freredepere=0;}
					nbr_soeurdepere=Integer.parseInt(comboBox_15.getSelectedItem().toString());
					if(rdbtnNewRadioButton_16.isSelected()==false) {nbr_soeurdepere=0;}
					nbr_freredemere=Integer.parseInt(comboBox_16.getSelectedItem().toString());
					if(rdbtnNewRadioButton_17.isSelected()==false) {nbr_freredemere=0;}
					nbr_soeurdemere=Integer.parseInt(comboBox_17.getSelectedItem().toString());
					if(rdbtnNewRadioButton_18.isSelected()==false) {nbr_soeurdemere=0;}
					nbr_filsdefrere=Integer.parseInt(comboBox_18.getSelectedItem().toString());
					if(rdbtnNewRadioButton_19.isSelected()==false) {nbr_filsdefrere=0;}
					nbr_filsdefreredepere=Integer.parseInt(comboBox_19.getSelectedItem().toString());
					if(rdbtnNewRadioButton_20.isSelected()==false) {nbr_filsdefreredepere=0;}
					nbr_oncle=Integer.parseInt(comboBox_20.getSelectedItem().toString());
					if(rdbtnNewRadioButton_21.isSelected()==false) {nbr_oncle=0;}
					nbr_oncledepere=Integer.parseInt(comboBox_21.getSelectedItem().toString());
					if(rdbtnNewRadioButton_22.isSelected()==false) {nbr_oncledepere=0;}
					nbr_filsoncle=Integer.parseInt(comboBox_22.getSelectedItem().toString());
					if(rdbtnNewRadioButton_23.isSelected()==false) {nbr_filsoncle=0;}
					nbr_filsoncledepere=Integer.parseInt(comboBox_23.getSelectedItem().toString());
					if(rdbtnNewRadioButton_24.isSelected()==false) {nbr_filsoncledepere=0;}
					
					/********** Le choix de la personne concernee au testament **********/
					choix = comboBox.getSelectedIndex();
					
					// Connexion entre l'algorithme du calcul et l'interface
					Game game = new Game(v_somme,v_credit,v_wassiya,choix,v_hf,ex_homme,ex_femme,ex_fils,ex_filsdefils,ex_fille,ex_filledefils,ex_pere,ex_mere,ex_gdmm,ex_gdmp,ex_gdpp,ex_frere,ex_filsdefrere,ex_soeur,ex_freredepere,ex_filsdefreredepere,ex_soeurdepere,ex_freredemere,ex_soeurdemere,ex_oncle,ex_filsoncle,ex_oncledepere,ex_filsoncledepere,nbr_femme,nbr_fils,nbr_filsdefils,nbr_fille,nbr_filledefils,nbr_frere,nbr_soeur,nbr_freredepere,nbr_soeurdepere,nbr_freredemere,nbr_soeurdemere,nbr_filsdefrere,nbr_filsdefreredepere,nbr_oncle,nbr_oncledepere,nbr_filsoncle,nbr_filsoncledepere);
					
					/********** Tracage du tableau selon les cas **********/
					int nbrt=0;
					if(rdbtnNewRadioButton_2.isSelected()==true)
					{
						AddLigne("الزوج",game.H1(),game.H2(),game.TotalCoef(),nbrt);
						nbrt++;
					}
					if(rdbtnNewRadioButton_3.isSelected()==true)
					{
						for(int j=0;j<nbr_femme;j++)
						{
							if(nbr_femme==1)
							{
								AddLigne("الزوجة",game.Fe1(),game.Fe2(),game.TotalCoef(),nbrt);
								nbrt++;
							}
							else
							{
								AddLigne("الزوجة",game.Fe1(),game.Fe2(),j+1,game.TotalCoef(),nbrt);
								nbrt++;
							}
						}
					}
					if(rdbtnNewRadioButton_9.isSelected()==true)
					{
						AddLigne("الأم",game.M1(),game.M2(),game.TotalCoef(),nbrt);
						nbrt++;
					}
					if(rdbtnNewRadioButton_8.isSelected()==true)
					{
						AddLigne("الأب",game.P1(),game.P2(),game.TotalCoef(),nbrt);
						nbrt++;
					}
					if(rdbtnNewRadioButton_4.isSelected()==true)
					{
						for(int j=0;j<nbr_fils;j++)
						{
							if(nbr_fils==1)
							{
								AddLigne("الابن",game.G1(),game.G2(),game.TotalCoef(),nbrt);
								nbrt++;	
							}
							else
							{
								AddLigne("الابن",game.G1(),game.G2(),j+1,game.TotalCoef(),nbrt);
								nbrt++;	
							}
						}
					}
					if(rdbtnNewRadioButton_6.isSelected()==true)
					{
						for(int j=0;j<nbr_fille;j++)
						{
							if(nbr_fille==1)
							{
								AddLigne("البنت",game.Fi1(),game.Fi2(),game.TotalCoef(),nbrt);
								nbrt++;	
							}
							else
							{
								AddLigne("البنت",game.Fi1(),game.Fi2(),j+1,game.TotalCoef(),nbrt);
								nbrt++;
							}
						}
					}
					if(rdbtnNewRadioButton_13.isSelected()==true)
					{
						AddLigne("الجدة لأم",game.Gmm1(),game.Gmm2(),game.TotalCoef(),nbrt);
						nbrt++;
					}
					if(rdbtnNewRadioButton_12.isSelected()==true)
					{
						AddLigne("الجدة لأب",game.Gmp1(),game.Gmp2(),game.TotalCoef(),nbrt);
						nbrt++;
					}
					if(rdbtnNewRadioButton_10.isSelected()==true)
					{
						AddLigne("الجد",game.Gp1(),game.Gp2(),game.TotalCoef(),nbrt);
						nbrt++;
					}
					if(rdbtnNewRadioButton_5.isSelected()==true)
					{
						for(int j=0;j<nbr_filsdefils;j++)
						{
							if(nbr_filsdefils==1)
							{
								AddLigne("ابن الابن",game.Gg1(),game.Gg2(),game.TotalCoef(),nbrt);
								nbrt++;
							}
							else
							{
								AddLigne("ابن الابن",game.Gg1(),game.Gg2(),j+1,game.TotalCoef(),nbrt);
								nbrt++;	
							}
						}
					}
					if(rdbtnNewRadioButton_7.isSelected()==true)
					{
						for(int j=0;j<nbr_filledefils;j++)
						{
							if(nbr_filledefils==1)
							{
								AddLigne("بنت الابن",game.Fig1(),game.Fig2(),game.TotalCoef(),nbrt);
								nbrt++;
							}
							else
							{
								AddLigne("بنت الابن",game.Fig1(),game.Fig2(),j+1,game.TotalCoef(),nbrt);
								nbrt++;	
							}
						}
					}
					if(rdbtnNewRadioButton_17.isSelected()==true)
					{
						for(int j=0;j<nbr_freredemere;j++)
						{
							if(nbr_freredemere==1)
							{
								AddLigne("الأخ لأم",game.Frm1(),game.Frm2(),game.TotalCoef(),nbrt);
								nbrt++;
							}
							else
							{
								AddLigne("الأخ لأم",game.Frm1(),game.Frm2(),j+1,game.TotalCoef(),nbrt);
								nbrt++;	
							}
						}
					}
					if(rdbtnNewRadioButton_18.isSelected()==true)
					{
						for(int j=0;j<nbr_soeurdemere;j++)
						{
							if(nbr_soeurdemere==1)
							{
								AddLigne("الأخت لأم",game.Som1(),game.Som2(),game.TotalCoef(),nbrt);
								nbrt++;
							}
							else
							{
								AddLigne("الأخت لأم",game.Som1(),game.Som2(),j+1,game.TotalCoef(),nbrt);
								nbrt++;	
							}
						}
					}
					if(rdbtnNewRadioButton_14.isSelected()==true)
					{
						for(int j=0;j<nbr_frere;j++)
						{
							if(nbr_frere==1)
							{
								AddLigne("الأخ الشقيق",game.Fr1(),game.Fr2(),game.TotalCoef(),nbrt);
								nbrt++;
							}
							else
							{
								AddLigne("الأخ الشقيق",game.Fr1(),game.Fr2(),j+1,game.TotalCoef(),nbrt);
								nbrt++;	
							}
						}
					}
					if(rdbtnNewRadioButton_15.isSelected()==true)
					{
						for(int j=0;j<nbr_soeur;j++)
						{
							if(nbr_soeur==1)
							{
								AddLigne("الأخت الشقيقة",game.So1(),game.So2(),game.TotalCoef(),nbrt);
								nbrt++;
							}
							else
							{
								AddLigne("الأخت الشقيقة",game.So1(),game.So2(),j+1,game.TotalCoef(),nbrt);
								nbrt++;	
							}
						}
					}
					if(rdbtnNewRadioButton_19.isSelected()==true)
					{
						for(int j=0;j<nbr_filsdefrere;j++)
						{
							if(nbr_filsdefrere==1)
							{
								AddLigne("ابن الأخ الشقيق",game.Gfr1(),game.Gfr2(),game.TotalCoef(),nbrt);
								nbrt++;
							}
							else
							{
								AddLigne("ابن الأخ الشقيق",game.Gfr1(),game.Gfr2(),j+1,game.TotalCoef(),nbrt);
								nbrt++;	
							}
						}
					}
					if(rdbtnNewRadioButton_11.isSelected()==true)
					{
						for(int j=0;j<nbr_freredepere;j++)
						{
							if(nbr_freredepere==1)
							{
								AddLigne("الأخ لأب",game.Frp1(),game.Frp2(),game.TotalCoef(),nbrt);
								nbrt++;
							}
							else
							{
								AddLigne("الأخ لأب",game.Frp1(),game.Frp2(),j+1,game.TotalCoef(),nbrt);
								nbrt++;	
							}
						}
					}
					if(rdbtnNewRadioButton_16.isSelected()==true)
					{
						for(int j=0;j<nbr_soeurdepere;j++)
						{
							if(nbr_soeurdepere==1)
							{
								AddLigne("الأخت لأب",game.Sop1(),game.Sop2(),game.TotalCoef(),nbrt);
								nbrt++;
							}
							else
							{
								AddLigne("الأخت لأب",game.Sop1(),game.Sop2(),j+1,game.TotalCoef(),nbrt);
								nbrt++;	
							}
						}
					}
					if(rdbtnNewRadioButton_20.isSelected()==true)
					{
						for(int j=0;j<nbr_filsdefreredepere;j++)
						{
							if(nbr_filsdefreredepere==1)
							{
								AddLigne("ابن الأخ لأب",game.Gfrp1(),game.Gfrp2(),game.TotalCoef(),nbrt);
								nbrt++;
							}
							else
							{
								AddLigne("ابن الأخ لأب",game.Gfrp1(),game.Gfrp2(),j+1,game.TotalCoef(),nbrt);
								nbrt++;	
							}
						}
					}
					if(rdbtnNewRadioButton_21.isSelected()==true)
					{
						for(int j=0;j<nbr_oncle;j++)
						{
							if(nbr_oncle==1)
							{
								AddLigne("العم الشقيق",game.On1(),game.On2(),game.TotalCoef(),nbrt);
								nbrt++;
							}
							else
							{
								AddLigne("العم الشقيق",game.On1(),game.On2(),j+1,game.TotalCoef(),nbrt);
								nbrt++;	
							}
						}
					}
					if(rdbtnNewRadioButton_23.isSelected()==true)
					{
						for(int j=0;j<nbr_filsoncle;j++)
						{
							if(nbr_filsoncle==1)
							{
								AddLigne("ابن العم الشقيق",game.Gon1(),game.Gon2(),game.TotalCoef(),nbrt);
								nbrt++;
							}
							else
							{
								AddLigne("ابن العم الشقيق",game.Gon1(),game.Gon2(),j+1,game.TotalCoef(),nbrt);
								nbrt++;	
							}
						}
					}
					if(rdbtnNewRadioButton_22.isSelected()==true)
					{
						for(int j=0;j<nbr_oncledepere;j++)
						{
							if(nbr_oncledepere==1)
							{
								AddLigne("العم لأب",game.Onp1(),game.Onp2(),game.TotalCoef(),nbrt);
								nbrt++;	
							}
							else
							{
								AddLigne("العم لأب",game.Onp1(),game.Onp2(),j+1,game.TotalCoef(),nbrt);
								nbrt++;
							}
						}
					}
					if(rdbtnNewRadioButton_24.isSelected()==true)
					{
						for(int j=0;j<nbr_filsoncledepere;j++)
						{
							if(nbr_filsoncledepere==1)
							{
								AddLigne("ابن العم لأب",game.Gonp1(),game.Gonp2(),game.TotalCoef(),nbrt);
								nbrt++;
							}
							else
							{
								AddLigne("ابن العم لأب",game.Gonp1(),game.Gonp2(),j+1,game.TotalCoef(),nbrt);
								nbrt++;	
							}
						}
					}
					if(choix==18)
					{
						AddLigne("الموصى له بالثلث",game.AutreSolde(),game.AutreX(),game.TotalCoef(),nbrt);
						nbrt++;
					}
					int d=193;
					switch(nbrt)
					{
						case 0:
							d=73;
							break;
						case 1:
							d=73;
							break;
						case 2:
							d=103;
							break;
						case 3:
							d=133;
							break;
						case 4:
							d=163;
							break;
					}
					JPanel panel3 = new JPanel();
					panel3.setBounds(90, 260, 800, d);
					panel2.add(panel3);
					panel3.setLayout(new BorderLayout(0, 0));
					
					int i=0;
				    while(data[i][0]!=null)
				    {
				    	i++;
				    }
				    Object data1[][] =new String[i][4];
				    for(int k=0;k<i;k++)
				    {
				    	data1[k][0]=data[k][0];
				    	data1[k][1]=data[k][1];
				    	data1[k][2]=data[k][2];
				    	data1[k][3]=data[k][3];
				    }
				    
					String  title[] = {"نصيبه بالدرهم","النسبة المئوية","عددالأسهم", "الوارث"};
					JTable tableau = new JTable(data1, title);
					tableau.setFont(new Font("Traditional Arabic", Font.BOLD, 18));
					tableau.getTableHeader().setFont(new Font("Traditional Arabic", Font.BOLD, 22));
					tableau.setEnabled(false);
					tableau.getTableHeader().setBackground(new Color(184, 134, 11));
					tableau.setRowHeight(30);
					DefaultTableCellRenderer custom = new DefaultTableCellRenderer();
					custom.setHorizontalAlignment(JLabel.CENTER);
					for (int l=0 ; l<tableau.getColumnCount() ; l++)
					tableau.getColumnModel().getColumn(l).setCellRenderer(custom);
					JScrollPane scrollpane = new JScrollPane(tableau);
					panel3.add(scrollpane);
					
					String sf1="قيمة التركة   : "+v_somme+" درهم";
					JLabel lblNewLabelf1 = new JLabel(sf1);
					lblNewLabelf1.setFont(new Font("Traditional Arabic", Font.BOLD, 30));
					lblNewLabelf1.setHorizontalAlignment(SwingConstants.RIGHT);
					lblNewLabelf1.setBounds(235, d+287, 400, 27);
					panel2.add(lblNewLabelf1);
					
					String sf2="قيمة الدين    : "+v_credit+" درهم";
					JLabel lblNewLabelf2 = new JLabel(sf2);
					lblNewLabelf2.setFont(new Font("Traditional Arabic", Font.BOLD, 30));
					lblNewLabelf2.setHorizontalAlignment(SwingConstants.RIGHT);
					lblNewLabelf2.setBounds(235, d+327, 400, 27);
					panel2.add(lblNewLabelf2);
					
					String sf3="صافي التركة : "+(v_somme-v_credit)+" درهم";
					JLabel lblNewLabelf3 = new JLabel(sf3);
					lblNewLabelf3.setFont(new Font("Traditional Arabic", Font.BOLD, 30));
					lblNewLabelf3.setHorizontalAlignment(SwingConstants.RIGHT);
					lblNewLabelf3.setBounds(235, d+370, 400, 35);
					panel2.add(lblNewLabelf3);

					String sf4="مجموع الأسهم   : ";
					if(nbrt==0) {sf4+=0;}
					else {sf4+=game.TotalCoef();}

					JLabel lblNewLabelf4 = new JLabel(sf4);
					lblNewLabelf4.setFont(new Font("Traditional Arabic", Font.BOLD, 30));
					lblNewLabelf4.setHorizontalAlignment(SwingConstants.RIGHT);
					lblNewLabelf4.setBounds(235, d+420, 400, 30);
					panel2.add(lblNewLabelf4);
					
					
					JLabel lblNewLabel_23 = new JLabel("");
			        lblNewLabel_23.setForeground(Color.BLACK);
					lblNewLabel_23.setIcon(new ImageIcon("image\\background2.jpg"));
					lblNewLabel_23.setBounds(-21, 0, 1209, 697);
					panel2.add(lblNewLabel_23);
					
					
				}else {
					textField_4_2 = new JTextField();
					textField_4_2.setForeground(Color.WHITE);
					textField_4_2.setBackground(Color.RED);
					textField_4_2.setText("اختر جنس الهالك*");
					textField_4_2.setEditable(false);
					textField_4_2.setFont(new Font("Traditional Arabic", Font.BOLD, 20));
					textField_4_2.setHorizontalAlignment(SwingConstants.CENTER);
					textField_4_2.setBounds(517, 617, 140, 30);
					textField_4_2.setColumns(10);
					panel1.add(textField_4_2);
					int delay=2500;
					Timer timer = new Timer( delay, new ActionListener(){
						  public void actionPerformed( ActionEvent e ){
							  panel1.revalidate();
							  panel1.repaint();
						  }
						} );
						timer.setRepeats( false );
						timer.start();
				}
				
				
			}
		});
		JButton btnNewButton5 = new JButton("حساب جديد");
		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<40;i++){
					for(int j=0;j<4;j++){
						data[i][j]=null;
					}
				}
				v_credit=0;
				v_wassiya=0;
				choix=0;
				ex_homme="Non";
				ex_femme="Non";
				ex_fils="Non";
				ex_filsdefils="Non";
				ex_fille="Non";
				ex_filledefils="Non";
				ex_pere="Non";
				ex_mere="Non";
				ex_gdmm="Non";
				ex_gdmp="Non";
				ex_gdpp="Non";
				ex_frere="Non";
				ex_filsdefrere="Non";
				ex_soeur="Non";
				ex_freredepere="Non";
				ex_filsdefreredepere="Non";
				ex_soeurdepere="Non";
				ex_freredemere="Non";
				ex_soeurdemere="Non";
				ex_oncle="Non";
				ex_filsoncle="Non";
				ex_oncledepere="Non";
				ex_filsoncledepere="Non";
				nbr_femme=0;
				nbr_fils=0;
				nbr_filsdefils=0;
				nbr_fille=0;
				nbr_filledefils=0;
				nbr_frere=0;
				nbr_soeur=0;
				nbr_freredepere=0;
				nbr_soeurdepere=0;
				nbr_freredemere=0;
				nbr_soeurdemere=0;
				nbr_filsdefrere=0;
				nbr_filsdefreredepere=0;
				nbr_oncle=0;
				nbr_oncledepere=0;
				nbr_filsoncle=0;
				nbr_filsoncledepere=0;
				frame.getContentPane().removeAll();
				frame.revalidate();
			    frame.repaint();
				initialize(frame,1);
			}	
		});
		btnNewButton5.setForeground(Color.BLACK);
		btnNewButton5.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton5.setBounds(74, 626, 149, 35);
		panel2.add(btnNewButton5);	
		

		JPanel panel5 = new JPanel();
		tabbedPane.addTab("", null, panel5, null);
		panel5.setLayout(null);
		
		JButton rdbtnNewRadioButton80  = new JButton("دخول");
		rdbtnNewRadioButton80.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(0);
			}
		});
		rdbtnNewRadioButton80.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton80.setFont(new Font("Traditional Arabic", Font.BOLD, 24));
		rdbtnNewRadioButton80.setBounds(428, 390, 149, 40);
		panel5.add(rdbtnNewRadioButton80);
		
		JButton rdbtnNewRadioButton81  = new JButton("خروج");
		rdbtnNewRadioButton81.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		rdbtnNewRadioButton81.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton81.setFont(new Font("Traditional Arabic", Font.BOLD, 24));
		rdbtnNewRadioButton81.setBounds(428, 455,  149, 40);
		panel5.add(rdbtnNewRadioButton81);
		
		JLabel lblNewLabel = new JLabel("برنامج حساب الميراث");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Traditional Arabic", Font.BOLD, 40));
		lblNewLabel.setBounds(357, 233, 274, 62);
		panel5.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("حسب الشريعة الإسلامية");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Traditional Arabic", Font.BOLD, 40));
		lblNewLabel_1.setBounds(369, 292, 304, 48);
		panel5.add(lblNewLabel_1);
		
		JLabel lblNewLabel80 = new JLabel("");
        lblNewLabel80.setForeground(Color.BLACK);
		lblNewLabel80.setIcon(new ImageIcon("image\\background1.png"));
		lblNewLabel80.setBounds(-11, 15, 1209, 697);
		panel5.add(lblNewLabel80);
		
		
		
		
		
		if(i==0) {tabbedPane.setSelectedIndex(3);}
		
	}
	public void AddLigne(String a,Double b,int c,int cf,int i)
	  {
		double d=((double)c/(double)cf)*100;
		String ss= Double.toString(d);
		String s = b.toString(); 
		String k = Integer.toString(c); 
		data[i][0]=s;
		data[i][1]=ss+" %";
		data[i][2]=k;
		data[i][3]=a;
	  }
	  public void AddLigne(String a,Double b,int c,int h,int cf,int i)
	  {
		double d=((double)c/(double)cf)*100;
		String ss= Double.toString(d);
		String s = b.toString(); 
		String k = Integer.toString(c); 
		data[i][0]=s;
		data[i][1]=ss+" %";
		data[i][2]=k;
		data[i][3]=a+"  "+Integer.toString(h);
	  }
}