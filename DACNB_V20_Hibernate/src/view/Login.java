package view;


import org.eclipse.swt.SWT;

import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.TraverseListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Login {
	
	Shell shell;
	Label labelAcc, labelPass, thongBaoChao;
	Text textAcc, textPass;
	Button buttonOk, buttonRetry, buttonGhiNho;
	
	public Login(Display display) {
		display.addFilter(SWT.KeyUp, globalLoginButtonClicked());
		shell = new Shell(display);

		creatUI();

		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	public Listener globalLoginButtonClicked() {
		return new Listener() {
			
			@Override
			public void handleEvent(Event arg0) {
				// TODO Auto-generated method stub
				if(arg0.keyCode == SWT.ESC)
				{
					System.exit(0);
				}
				if(arg0.keyCode == SWT.CR)
				{
					if ("".equals(textAcc.getText().toString()) || ("".equals(textPass.getText().toString()))) {
						MessageBox messageBox = new MessageBox(shell, SWT.ICON_ERROR);
						messageBox.setMessage("Enter the your Account or Password");
						messageBox.open();
					} else {
						MessageBox messageBox = new MessageBox(shell, SWT.OK);
						messageBox.setText("Login Form");
						messageBox.setMessage("Welcome " + textAcc.getText());
						messageBox.open();
						
						shell.getDisplay().dispose();
						Display display = new Display();
						new Main_QLMH(display);
					}
				}
			}
		};
	}

	public void creatUI() {
		
		GridLayout gl = new GridLayout(3,true);
		gl.marginTop = 5;
		gl.marginTop = 5;

		shell.setText("Quan Ly Sinh Vien");
		shell.setLayout(gl);
		
		Label lb = new Label(shell, SWT.NONE);
		
		thongBaoChao = new Label(shell, SWT.BORDER);
		thongBaoChao.setText("Moi Dang Nhap");
		
		lb = new Label(shell, SWT.NONE);

		labelAcc = new Label(shell, SWT.LEFT);
		labelAcc.setText("Account");

		textAcc = new Text(shell, SWT.LEFT | SWT.BORDER);
		
		lb = new Label(shell, SWT.NONE);

		labelPass = new Label(shell, SWT.LEFT);
		labelPass.setText("Password");
		
		textPass = new Text(shell, SWT.BORDER | SWT.LEFT);
		textPass.setText("");
		textPass.setEchoChar('*');
		textPass.pack();
		
		buttonGhiNho = new Button(shell, SWT.RADIO);
		buttonGhiNho.setText("Ghi Nho");
		
		lb = new Label(shell, SWT.NONE);
		
		buttonOk = new Button(shell, SWT.RIGHT);
		buttonOk.setText("Login");
		buttonOk.addListener(SWT.Selection, btn_Ok_Clicked());
		
		buttonRetry = new Button(shell, SWT.LEFT);
		buttonRetry.setText("Try Again");
		buttonRetry.addListener(SWT.Selection, btn_Cancle_Clicked());
		
		shell.pack();
	}

	public Listener btn_Cancle_Clicked() {
		return new Listener() {
			public void handleEvent(Event event) {
				textAcc.setText("");
				textPass.setText("");
				textAcc.setFocus();
			}
		};
	}

	public Listener btn_Ok_Clicked() {
		return new Listener() {
			public void handleEvent(Event event) {
				String Username = textAcc.getText();
				String Password = textPass.getText();

				if ("".equals(Username) || ("".equals(Password))) {
					MessageBox messageBox = new MessageBox(shell, SWT.ICON_ERROR);
					messageBox.setMessage("Enter the your Account or Password");
					messageBox.open();
				} else {
					MessageBox messageBox = new MessageBox(shell, SWT.OK);
					messageBox.setText("Login Form");
					messageBox.setMessage("Welcome " + textAcc.getText());
					messageBox.open();
					
					shell.getDisplay().dispose();
					Display display = new Display();
					new Main_QLMH(display);
				}
				
			}
		};
	}

	protected String TextPass() {
		return null;
	}

	protected String TextAcc() {
		return null;
	}
	
	public static void main(String args[]) {
		
		Display display = new Display();
		
		new Login(display);
		
		display.dispose();
	}
}
