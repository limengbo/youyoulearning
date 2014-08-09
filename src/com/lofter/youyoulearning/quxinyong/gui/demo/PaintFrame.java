package com.lofter.youyoulearning.quxinyong.gui.demo;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class PaintFrame extends Frame {
	public void launchFrame() {
		setBounds(200, 200, 640, 480);
		setVisible(true);
	}

	public void paint(Graphics g) {
		Color c = g.getColor();
		g.setColor(Color.RED);
		g.fillOval(50, 50, 30, 30);
		g.setColor(Color.GREEN);
		g.fillRect(80, 80, 40, 40);
		g.setColor(c);
	}
}
