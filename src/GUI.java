import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		if(isNumeric(tf1.getText())) {
			int id = Integer.parseInt(tf1.getText());
			int tem_idx = -1;
			for(int i=0;i<UseSavingBankAccount.account_arr.length;i++) {
				if(UseSavingBankAccount.account_arr[i].getID() == id) {
					tem_idx = i;
					break;
				}
			}
			if(tem_idx != -1) {
				delByIndex(tem_idx);
				Account.displayAll(UseSavingBankAccount.account_arr);
			}else {
				JOptionPane.showMessageDialog(null, "Delete failed.");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Please input ID, it should be a number.");
		}
	}
	
	private void deleteByName() {
		String name = tf2.getText();
		int tem_idx = -1;
		for(int i=0;i<UseSavingBankAccount.account_arr.length;i++) {
			if(UseSavingBankAccount.account_arr[i].getName().equalsIgnoreCase(name)) {
				tem_idx = i;
				break;
			}
		}
		if(tem_idx != -1) {
			delByIndex(tem_idx);
			Account.displayAll(UseSavingBankAccount.account_arr);
		}else {
			JOptionPane.showMessageDialog(null, "Delete failed.");
		}
	}
	
	private void displayAll(SavingAccount[] arr) {
		Account.displayAll(arr);
	}
	
	public boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if( !isNum.matches() ){
            return false;
        }
        return true;
	}
	
	public boolean delByIndex(int index) {
		int len = UseSavingBankAccount.account_arr.length;
		if(index<0||index>len-1) {
			return false;
		}
		for(int i=index;i<len-1;i++) {
			UseSavingBankAccount.account_arr[i] = UseSavingBankAccount.account_arr[i+1];
		}
		UseSavingBankAccount.account_arr = Arrays.copyOf(UseSavingBankAccount.account_arr, len-1);
		return true;
	}
}
