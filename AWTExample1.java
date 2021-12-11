package uvaze;
	import javax.swing.*;      
	public class AWTExample1{    
	AWTExample1(){    
	JFrame f=new JFrame("Button Example");            
	JButton b=new JButton(new ImageIcon("D:\\reg.jpg"));    
	b.setBounds(100,100,100,94);    
	f.add(b);    
	f.setSize(300,400);    
	f.setLayout(null);    
	f.setVisible(true);    
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
	    }         
	public static void main(String[] args) {    
	    new AWTExample1();    
	}    
	}    
