package com.lofter.youyoulearning.quxinyong.gui.demo;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TFActionEvent {
	public static void main(String[] args) {
		new TFFrame();
	}
}

class TFFrame extends Frame {
	public TFFrame() {
		TextField tf = new TextField();
		add(tf);
		tf.addActionListener(new TFActionListener());
		tf.setEchoChar('*');
		pack();
		setVisible(true);
	}
}

class TFActionListener implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		TextField tf = (TextField) e.getSource();
		System.out.println(tf.getText());
		tf.setText("");
	}

}
