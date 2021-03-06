package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class Form_XoaSua2 {

	Shell shell;

	public Form_XoaSua2(Display display) {

		shell = new Shell(display, SWT.APPLICATION_MODAL | SWT.CLOSE);

		createUI();

		shell.open();
	}
	
	private void createUI() {

		shell.setSize(300, 180);
		shell.setText("Update");
		shell.setLocation(10, 10);
		shell.addKeyListener(escShell());

		Label lbThongTin = new Label(shell, SWT.CENTER | SWT.BORDER);
		lbThongTin.setText("Thong Tin Mon Hoc");
		lbThongTin.setSize(120, 20);
		lbThongTin.setLocation(80, 20);

		Text txBox = new Text(shell, SWT.LEFT | SWT.READ_ONLY | SWT.V_SCROLL
				| SWT.BORDER);
		txBox.setSize(170, 40);
		txBox.setLocation(60, 50);

		Button btSua = new Button(shell, SWT.CENTER);
		btSua.setSize(50, 25);
		btSua.setLocation(60, 110);
		btSua.setText("Sua");

		Button btXoa = new Button(shell, SWT.CENTER);
		btXoa.setSize(50, 25);
		btXoa.setLocation(120, 110);
		btXoa.setText("Xoa");

		Button btCancel = new Button(shell, SWT.CENTER);
		btCancel.setSize(50, 25);
		btCancel.setLocation(180, 110);
		btCancel.setText("Cancel");
		btCancel.addListener(SWT.Selection, btn_Cancle_Clicked());
	}
	
	private KeyListener escShell() {
		return new KeyListener() {

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				switch (arg0.keyCode) {
				case SWT.ESC:
					shell.close();
					shell.dispose();
					break;

				default:
					break;
				}
			}

			@Override
			public void keyPressed(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}
		};
	}


	public Listener btn_Cancle_Clicked() {
		return new Listener() {
			public void handleEvent(Event event) {
				shell.close();
			}
		};
	}
}
