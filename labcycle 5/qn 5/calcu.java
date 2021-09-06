import java.applet.*;
import java.awt.event.*;
import java.awt.*;
//<applet code="calcu" height=300 width=200></applet>
public class calcu extends Applet implements ActionListener
{
	TextField t;
	Button b[];
	Panel p;
	String c, arr[]={"1","2","3","+","4","5","6","-","7","8","9","*","0",".","=","/"};
	double n1,n2,ans;
	public void init()
	{
		t= new TextField(20);
		b=new Button[16];
		p= new Panel();
		for(int i=0;i<16;i++)
			b[i]=new Button(arr[i]);
		p.setLayout(new GridLayout(4, 4, 10, 10));
		p.setSize(700,1500);
		
	}
	public void start()
	{
		add(t);
		for(int i=0;i<16;i++)
		{
			p.add(b[i]);
			b[i].addActionListener(this);
		}
		add(p);
	}
	public void actionPerformed(ActionEvent ae)
	{
		switch (ae.getActionCommand())
		{
			case "1": insert("1"); break;
			case "2": insert("2"); break;
			case "3": insert("3"); break;
			case "4": insert("4"); break;
			case "5": insert("5"); break;
			case "6": insert("6"); break;
			case "7": insert("7"); break;
			case "8": insert("8"); break;
			case "9": insert("9"); break;
			case "0": insert("0"); break;
			case ".": insert("."); break;
			case "+": addition(); break;
			case "-": substract(); break;
			case "*": multiply(); break;
			case "/": divide(); break;
			case "=": cal(); break;
		}
	}
	void insert(String n)
	{
		if (t.getText().equals(""))
				t.setText(n);
			else
				t.setText(t.getText()+n);
	}
	void addition()
	{
		n1=Double.parseDouble(t.getText());
		t.setText(t.getText()+"+");
		c="+";
	}
	void substract()
	{
		n1=Double.parseDouble(t.getText());
		t.setText(t.getText()+"-");
		c="-";
	}
	void multiply()
	{
		n1=Double.parseDouble(t.getText());
		t.setText(t.getText()+"*");
		c="*";
	}
	void divide()
	{
		n1=Double.parseDouble(t.getText());
		t.setText(t.getText()+"/");
		c="/";
	}
	void cal()
	{
		n2=Double.parseDouble(t.getText().substring(t.getText().indexOf(c)+1,t.getText().length()));
		if(c.equals("+"))
		{
			t.setText(Double.toString(n1+n2));
			n1=n1+n2;
		}
		if(c.equals("-"))
		{
			t.setText(Double.toString(n1-n2));
			n1=n1-n2;
		}
		if(c.equals("*"))
		{
			t.setText(Double.toString(n1*n2));
			n1=n1*n2;
		}
		if(c.equals("/"))
		{
			t.setText(Double.toString(n1/n2));
			n1=n1/n2;
		}
	}
}
