import java.awt.event.*;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class SampleApp extends JFrame{
	
	/**
	 * 
	 */
    private JFrame mainFrame;
    private Container contentPane;
	JTextField text1;
	private JTextField textField;
	private JTextArea textArea;
	private JTextField textField2;
	private JPanel buttonPane;
	private JButton addButton;
	private JButton clearButton;
	private JScrollPane scrollPane;
	/**
	 * 
	 */
	public SampleApp(){
        mainFrame = new JFrame("サンプル");
        mainFrame.setSize(320,200);	
        mainFrame.setTitle("KVSClient");
        contentPane = mainFrame.getContentPane();
		textField = new JTextField();
		textArea = new JTextArea();
		
		addButton = new JButton("追加");
        clearButton = new JButton("消去");
		textField2 = new JTextField();
		buttonPane = new JPanel();
		
		buttonPane.add(addButton);
		buttonPane.add(clearButton);
		contentPane.add(textField,BorderLayout.NORTH);
		contentPane.add(textField2,BorderLayout.CENTER);
		contentPane.add(buttonPane,BorderLayout.SOUTH);
		mainFrame.setVisible(true);
		
		/*
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,640,480);
		setTitle("TCPClient");
		
        textField = new JTextField();
        
		JButton btn1 = new JButton("ボタン１");
		add(btn1);
		add(text1);
		btn1.addActionListener(new ActionListener(){
			@Override 
			public void actionPerformed(ActionEvent e){
				System.out.println("クリック");
			}
		});
		*/						
	}
	
	public static void main(String[] args){
		SampleApp sample = new SampleApp();
		sample.setVisible(true);
	}
	
	
}