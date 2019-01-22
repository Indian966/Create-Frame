package wwee;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

class MyListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
}

class frameCreat extends JFrame {
	public frameCreat() {
		Container ct = getContentPane();
		JButton jb = new JButton("start");
		JLabel jl = new JLabel("ют╥б");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		ct.add(jb);
		ct.add(jl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 600);
		setVisible(true);
	}
}

public class asdf {
	public static void main(String[] args) {
		new frameCreat();
	}
	
	
}
