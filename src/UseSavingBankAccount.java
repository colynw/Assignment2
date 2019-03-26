import javax.swing.*;

public class UseSavingBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame("Assignment 2");
        jf.setSize(200, 200);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JRadioButton radioBtn01 = new JRadioButton("one");
        JRadioButton radioBtn02 = new JRadioButton("two");
        JRadioButton radioBtn03 = new JRadioButton("three");

        ButtonGroup btnGroup = new ButtonGroup();
        btnGroup.add(radioBtn01);
        btnGroup.add(radioBtn02);
        btnGroup.add(radioBtn03);

        radioBtn01.setSelected(true);

        panel.add(radioBtn01);
        panel.add(radioBtn02);
        panel.add(radioBtn03);

        jf.setContentPane(panel);
        jf.setVisible(true);
	}

}
