package ru.mirea.num4;

import java.awt.event.*;
import javax.swing.*;

public class gui extends JFrame
{
        JFrame Window = new JFrame("Матч");
        JButton buttonMilan = new JButton("Milan");
        JButton buttonReal = new JButton("Real");
        JLabel NameMilan = new JLabel("AC Milan");
        JLabel NameReal = new JLabel("Real Madrid");
        JLabel ResMilan = new JLabel("0");
        JLabel ResReal = new JLabel("0");
        JLabel winner = new JLabel("draw");
        JLabel LastScore = new JLabel("");
        int Milan=0, Real=0;

    public void Shet()
    {
        ResMilan.setText(""+Milan);
        ResReal.setText(""+Real);
        if(Milan>Real)
        {
            winner.setText("Milan winner");
        } else if (Milan<Real)
        {
            winner.setText("Real winner");
        }else if(Milan==Real)
        {
            winner.setText("draw");
        }
    }

    public gui()
    {
        buttonMilan.setBounds(40,90,85,20);
        buttonReal.setBounds(200,90,85,20);
        NameMilan.setBounds(40,60,85,30);
        NameReal.setBounds(200,60,85,30);
        ResMilan.setBounds(40,130,90,20);
        ResReal.setBounds(200,130,90,20);
        winner.setBounds(400,130,90,20);
        LastScore.setBounds(400,180,190,20);
        Window.add(ResMilan);
        Window.add(ResReal);
        Window.add(winner);
        Window.add(LastScore);
        Window.add(NameReal);
        Window.add(NameMilan);
        Window.add(buttonMilan);
        Window.add(buttonReal);
        Window.setSize(700,300);
        Window.setLayout(null);
        Window.setVisible(true);
        buttonMilan.addActionListener(new TestActionListener());
        buttonReal.addActionListener(new wqe());
    }

    public class TestActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Milan++;
            ResMilan.setText(""+Milan);
            LastScore.setText("LastScore - Milan");
            Shet();
        }
    }

    public class wqe implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            Real++;
            ResReal.setText(""+Real);
            LastScore.setText("LastScore - Real");
            Shet();
        }
    }

    public static void main(String args[])
    {
        new gui().setVisible(true);
    }
}