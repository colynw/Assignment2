import javax.swing.*;

public class UseSavingBankAccount {
	public static SavingAccount account_arr[];
	
	public static void initAccounts() {
		account_arr = new SavingAccount[50];
		for (int i=0;i<50;i++) {
			account_arr[i] = new SavingAccount((i+1),"TTU"+(i+1),'C',0.0,5.0);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame("Assignment 2");

        JRadioButton radioBtn01 = new JRadioButton("one");
        JRadioButton radioBtn02 = new JRadioButton("two");
        JRadioButton radioBtn03 = new JRadioButton("three");
        
        JTextField tf1 = new JTextField();
        JTextField tf2 = new JTextField();
        JTextField tf3 = new JTextField();

        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(radioBtn01);
        btnGroup.add(radioBtn02);
        btnGroup.add(radioBtn03);

        radioBtn01.setSelected(true);
        
        JButton btn = new JButton("Submit");
        
        Box hBox01 = Box.createHorizontalBox();
        hBox01.add(radioBtn01);
        hBox01.add(tf1);
        
        Box hBox02 = Box.createHorizontalBox();
        hBox02.add(radioBtn02);
        hBox02.add(tf2);
        
        Box hBox03 = Box.createHorizontalBox();
        hBox03.add(radioBtn03);
        hBox03.add(tf3);
        
        Box vBox = Box.createVerticalBox();
        vBox.add(hBox01);
        vBox.add(hBox02);
        vBox.add(hBox03);
        vBox.add(btn);
        
        
        jf.setContentPane(vBox);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
