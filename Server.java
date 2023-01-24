package chatapp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Server extends JFrame implements ActionListener{
	
	JTextField text;
	
	Server(){
		
		setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setBackground(new Color(7,138,94));
		p1.setBounds(0, 0, 450, 70);
		p1.setLayout(null);
		add(p1);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/return.png"));
		Image i2 = i1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel back = new JLabel(i1);
		back.setBounds(5,20,30,30);
		p1.add(back);
		
		back.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent ae)
			{
				System.exit(0);
			}
		});
		
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/dp.png"));
		Image i5 = i4.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);
		JLabel profile = new JLabel(i6);
		profile.setBounds(35,3,70,70);
		p1.add(profile);
		
		ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/videocall.png"));
		Image i8 = i7.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		ImageIcon i9 = new ImageIcon(i8);
		JLabel video = new JLabel(i9);
		video.setBounds(270,20,30,30);
		p1.add(video);
		
		ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
		Image i11 = i10.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		ImageIcon i12 = new ImageIcon(i11);
		JLabel phone = new JLabel(i12);
		phone.setBounds(330,20,30,30);
		p1.add(phone);
		
		ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/3dot.png"));
		Image i14 = i13.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT);
		ImageIcon i15 = new ImageIcon(i14);
		JLabel more = new JLabel(i15);
		more.setBounds(380,22,30,30);
		p1.add(more);
		
		
		JLabel name = new JLabel("Aryan");
		name.setBounds(110,10,100,20);
		name.setForeground(Color.WHITE);
		name.setFont(new Font("Tahoma",Font.BOLD,16));
		p1.add(name);
		
		JLabel status = new JLabel("Active now");
		status.setBounds(110,35,100,20);
		status.setForeground(Color.WHITE);
		status.setFont(new Font("Tahoma",Font.BOLD,12));
		p1.add(status);
		
		JPanel a1 = new JPanel();
		a1.setBounds(5,75,440,500);
		add(a1);
		
	    text = new JTextField();
		text.setBounds(5,558,314,35);
		text.setFont(new Font("Tahoma",Font.PLAIN,14));
		add(text);
		
		
		setSize(450,650);
		setLocation(200,70);
		getContentPane().setBackground(Color.WHITE);
		setVisible(true);
		
		
		JButton send = new JButton("Send");
		send.setBounds(320,558,120,35);
		send.setBackground(new Color(7,138,94));
		send.setForeground(Color.WHITE);
		send.setFont(new Font("SAN_SERIF",Font.PLAIN,14));
		send.addActionListener(this);
		add(send);
		
		
	}
     public void actionPerformed(ActionEvent ae)
     {
    	 String out=text.getText();
     }
	
	public static void main(String[] args) {
		new Server();

	}

}
