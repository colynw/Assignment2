import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

public class GUI extends JFrame{
	
	private JRadioButton rBtn1;
	private JRadioButton rBtn2;
	private JRadioButton rBtn3;
	
	JTextField tf1;
    JTextField tf2;
    JTextField tf3;
	
	private JButton btn;
	
	public GUI() {
		setLayout(new FlowLayout());
		init();
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void init() {
		rBtn1 = new JRadioButton("Delete By ID");
	    rBtn2 = new JRadioButton("Delete By Name");
	    rBtn3 = new JRadioButton("Display All");
	    
	    tf1 = new JTextField(10);
	    tf2 = new JTextField(10);
	    tf3 = new JTextField(10);
	    
	    ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(rBtn1);
        btnGroup.add(rBtn2);
        btnGroup.add(rBtn3);
        
        rBtn1.setSelected(true);
        
        btn = new JButton("Submit");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	onClickBtn();
            }
        });
        
        Box box = Box.createVerticalBox();
        Box mid = Box.createHorizontalBox();
        Box box_left = Box.createVerticalBox();
        Box box_right = Box.createVerticalBox();
        Box box_bottom = Box.createVerticalBox();
        
        box_left.add(rBtn1);
        box_left.add(rBtn2);
        box_left.add(rBtn3);
        
        box_right.add(tf1);
        box_right.add(tf2);
        box_right.add(tf3);
        
        box_bottom.add(btn);
        
        mid.add(box_left);
        mid.add(Box.createHorizontalStrut(200));
        mid.add(box_right);
        box.add(mid);
		box.add(Box.createVerticalStrut(50));
		box.add(box_bottom);
		
		add(box);
	}
	
	private void onClickBtn() {
		if (rBtn1.isSelected()) {
			deleteByID();
		}else if (rBtn2.isSelected()) {
			deleteByName();
		}else if (rBtn3.isSelected()) {
			displayAll(UseSavingBankAccount.account_arr);
		}
	}
	
	private void deleteByID() {
		
	}
	
	private void deleteByName() {
		
	}
	
	private void displayAll(SavingAccount[] arr) {
		String str = "";
		for (int i=0;i<arr.length;i++) {
			str += arr[i].getName() + " " +arr[i].getAccountType() + " " +arr[i].getBalance() + "\n";
		}
		JOptionPane.showMessageDialog(null, str);
	}
}
