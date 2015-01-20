package com.application.main;

import java.awt.Toolkit;

import javax.swing.JFrame;

public class ApplicationFrame extends JFrame{
	
	public ApplicationFrame(){
		super();
		setTitle("Testing App");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height;
		int width = toolkit.getScreenSize().width;
		setLocation(width / 2 - getWidth() / 2, height / 2 - getHeight()/ 2);
		
		setVisible(true);
	}

}
