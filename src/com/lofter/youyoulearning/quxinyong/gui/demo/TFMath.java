package com.lofter.youyoulearning.quxinyong.gui.demo;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TFMath {
	public static void main(String[] args) {
		new TFFrame2().launchFrame();
		// System.out.println("hello");
	}
}

class TFFrame2 extends Frame {
	private TextField num1;
	private TextField num2;
	private TextField num3;

	public void launchFrame() {
		num1 = new TextField(10);
		num2 = new TextField(10);
		num3 = new TextField(15);
		Label lblPlus = new Label("+");
		Button btnEqual = new Button("=");
		btnEqual.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(num1.getText());
				int n2 = Integer.parseInt(num2.getText());
				num3.setText((n1 + n2) + "");
			}
		});
		setLayout(new FlowLayout());
		add(num1);
		add(lblPlus);
		add(num2);
		add(btnEqual);
		add(num3);
		pack();
		setVisible(true);
	}
}
