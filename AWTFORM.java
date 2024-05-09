package pr1;
	import java.awt.*;

	public class AWTform extends Frame{
		public AWTform() {
			
			setLayout(new FlowLayout());
			
			Label name=new Label("Enter the name");
			add(name);
			TextField namefield=new TextField(20);
			add(namefield);
			
			Label age=new Label("Enter your age");
		    add(age);
		    TextField agefield=new TextField(20);
			add(agefield);
			
			
		    Label address=new Label("enter your Address");
		    add(address);
		    TextField adressfield=new TextField(20);
			add(adressfield);
		    
		    Label pinno=new Label("Enter your Pincode");
		    add(pinno);
			TextField pinfield=new TextField(20);
		    add(pinfield);
			
		     
		    Label mobileno=new Label("Enter your Mobile number");
		    add(mobileno);
		    TextField mobilenofield=new TextField(20);
			add(mobilenofield);
						
			setTitle("Personnel details");
			
			setSize(300,100);
			
			setVisible(true);
		}
		public static void main (String []args) {
			new AWTform();
			
			
		}
		

	}



