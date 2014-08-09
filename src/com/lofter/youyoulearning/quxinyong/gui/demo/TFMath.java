package com.lofter.youyoulearning.quxinyong.gui.demo;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class TFMath {
	public static void main(String[] args) {
		new TFFrame2().launchFrame();
//		System.out.println("hello");
	}
}

class TFFrame2 extends Frame {
	public void launchFrame() {
		TextField num1 = new TextField(10);
		TextField num2 = new TextField(10);
		TextField num3 = new TextField(15);
		Label lblPlus = new Label("+");
		Button btnEqual = new Button("#");
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
