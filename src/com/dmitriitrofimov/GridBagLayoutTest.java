package com.dmitriitrofimov;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Авторизация в системе: ");

		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridBagLayout());

		JLabel loginLabel = new JLabel("Login: ");
		JLabel passwordLabel = new JLabel("Password: ");

		JButton loginButton = new JButton("Login in");
		JButton registrationButton = new JButton("Registration");

		JTextField loginTextField = new JTextField(15);
		JPasswordField passwordField = new JPasswordField(15);

//		GridBagConstraints c = new GridBagConstraints();
//		c.gridx = 0;
//		c.gridy = 0;
//		c.gridwidth = 1;
//		c.gridheight = 1;
//		c.weightx = 0.0;
//		c.weighty = 0.9;
//		c.anchor = GridBagConstraints.NORTH;
//		c.fill = GridBagConstraints.HORIZONTAL;
//		c.insets = new Insets(0, 2, 2, 2);
//		c.ipadx = 0;
//		c.ipady = 0;
//
//		frame.add(loginButton, c);

		frame.add(loginLabel, new GridBagConstraints(0, 0, 1, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(2, 2, 2, 2), 0, 0));

		frame.add(loginTextField, new GridBagConstraints(1, 0, 1, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(2, 2, 2, 2), 0, 0));

		frame.add(passwordLabel, new GridBagConstraints(0, 1, 1, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(2, 2, 2, 2), 0, 0));

		frame.add(passwordField, new GridBagConstraints(1, 1, 1, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(2, 2, 2, 2), 0, 0));

		frame.add(loginButton, new GridBagConstraints(0, 2, 1, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(2, 2, 2, 2), 0, 0));

		frame.add(registrationButton, new GridBagConstraints(1, 2, 1, 1, 1, 1,
				GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
				new Insets(2, 2, 2, 2), 0, 0));

		frame.setVisible(true);
		frame.pack();
	}
}