package javaswingT;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
 
public class Main extends JFrame{
    private JTextArea textArea = new JTextArea(7, 20);
    private JSlider sl = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
    public Main(){
        super("TextArea Practice Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        this.setLayout(new BorderLayout());
        textArea.setLineWrap(true);
        this.add(textArea, BorderLayout.NORTH);
        this.add(sl, BorderLayout.SOUTH);
 
        // label 보이기/ 감추기
        sl.setPaintLabels(true);
        // track 보이기(큰거)
        sl.setPaintTrack(true);
        // tick 보이기(작은거)
        sl.setPaintTicks(true);
        // 큰 눈금 간격
        sl.setMajorTickSpacing(20);
        // 작은 눈금 간격
        sl.setMinorTickSpacing(5);
 
        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                if(textArea.getText().length() >= 100){
                    textArea.setText(textArea.getText().substring(0, 99));
                }
                else{
                    sl.setValue(textArea.getText().length());
                }
            }
        });
 
        sl.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // 글자수보다 많이 늘어나지 못하도록 하는 코드
                if(textArea.getText().length() < sl.getValue()){
                    sl.setValue(textArea.getText().length());
                }
                else{
                    textArea.setText(textArea.getText().substring(0, sl.getValue()));
                }
            }
        });
 
        setSize(300, 300);
        setVisible(true);
 
    }
    public static void main(String[] args){
        new Main();
    }
}