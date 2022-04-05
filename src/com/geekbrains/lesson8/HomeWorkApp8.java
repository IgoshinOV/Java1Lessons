package com.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeWorkApp8 extends JFrame {
    private int value;

    public HomeWorkApp8(int initialValue) {
        setBounds(500, 500, 320, 150);
        setTitle("Simple Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Font font = new Font("Arial", Font.BOLD, 20);

        JPanel panelDecrem = new JPanel();
        JButton decrement10Button = new JButton("<<");
        decrement10Button.setFont(font);
        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        panelDecrem.add(decrement10Button);
        panelDecrem.add(decrementButton);
        getContentPane().add(BorderLayout.WEST, panelDecrem);

        JPanel panelIncrem = new JPanel();
        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        JButton increment10Button = new JButton(">>");
        increment10Button.setFont(font);
        panelIncrem.add(incrementButton);
        panelIncrem.add(increment10Button);
        getContentPane().add(BorderLayout.EAST, panelIncrem);

        JPanel panelReset = new JPanel();
        JButton resetButton = new JButton("Reset");
        resetButton.setFont(font);
        panelReset.add(resetButton);
        getContentPane().add(BorderLayout.NORTH, panelReset);

        JPanel panelCounterValue = new JPanel();
        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        value = initialValue;
        counterValueView.setText(String.valueOf(value));
        panelCounterValue.add(counterValueView);
        getContentPane().add(BorderLayout.CENTER, panelCounterValue);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == incrementButton) {
                    value++;
                } else if (e.getSource() == decrementButton) {
                    value--;
                } else if (e.getSource() == increment10Button) {
                    value += 10;
                } else if (e.getSource() == decrement10Button) {
                    value -= 10;
                } else if (e.getSource() == resetButton){
                    value = 0;
                }
                counterValueView.setText(String.valueOf(value));
            }
        };

        incrementButton.addActionListener(actionListener);
        increment10Button.addActionListener(actionListener);
        decrementButton.addActionListener(actionListener);
        decrement10Button.addActionListener(actionListener);
        resetButton.addActionListener(actionListener);
        setVisible(true);
    }

    public static void main(String[] args) {
        new HomeWorkApp8(0);
    }
}
