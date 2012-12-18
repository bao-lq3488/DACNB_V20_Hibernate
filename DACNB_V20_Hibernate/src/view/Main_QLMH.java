package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.hibernate.type.TextType;

import com.mysql.jdbc.EscapeTokenizer;

public class Main_QLMH {
	
	Shell shell;
	Menu menuBar, menuQLMH, menuQLSV, menuInAn;
	MenuItem quanLy_MH, lietKe_MH, them_MH, xoa_MH, sua_MH, xem_MH, capNhat_MH;
	MenuItem quanLy_SV, lietKe_SV, them_SV, xoa_SV, sua_SV, xem_SV, capNhatDiem_SV, inDanhSach_SV, inDiem_MH, inDiem_SV;
	MenuItem inAn;

	public Main_QLMH(Display display) {
		shell = new Shell(display);
		
		createUI();
		
		shell.open();
		keepShell(display);
	}

	public void keepShell(Display display) {
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}

	public void createUI() {
		
		shell.setText("Quan Ly");
		shell.setSize(400, 300);
		shell.addKeyListener(escShell());
		
		// Tao menu quan ly mon hoc
		menuBar = new Menu(shell, SWT.BAR);
		
		menuQLMH = new Menu(menuBar);
		
		quanLy_MH = new MenuItem(menuBar, SWT.CASCADE);
		quanLy_MH.setMenu(menuQLMH);
		quanLy_MH.setText("&Mon Hoc");

		lietKe_MH = new MenuItem(menuQLMH, SWT.PUSH);
		lietKe_MH.setText("&Liet Ke");
		
		lietKe_MH.addListener(SWT.Selection, btn_LietKe_MH_Clicked());
		
		them_MH = new MenuItem(menuQLMH, SWT.PUSH);
		them_MH.setText("&Them");
		
		xoa_MH = new MenuItem(menuQLMH, SWT.PUSH);
		xoa_MH.setText("&Xoa");
		xoa_MH.addListener(SWT.Selection, btn_Xoa_MH_Clicked());
		
		sua_MH = new MenuItem(menuQLMH, SWT.PUSH);
		sua_MH.setText("&Sua");
		sua_MH.addListener(SWT.Selection, btn_Sua_MH_Clicked());
		
		xem_MH = new MenuItem(menuQLMH, SWT.PUSH);
		xem_MH.setText("X&em");
		
		capNhat_MH = new MenuItem(menuQLMH, SWT.PUSH);
		capNhat_MH.setText("&Cap Nhat Diem");

		// Tao menu quan ly sinh vien
		
		menuQLSV = new Menu(menuBar);
		quanLy_SV = new MenuItem(menuBar, SWT.CASCADE);
		quanLy_SV.setText("&Sinh Vien");
		quanLy_SV.setMenu(menuQLSV);

		lietKe_SV = new MenuItem(menuQLSV, SWT.PUSH);
		lietKe_SV.setText("&Liet Ke");
		
		them_SV = new MenuItem(menuQLSV, SWT.PUSH);
		them_SV.setText("&Them");
		them_SV.addListener(SWT.Selection, btn_Them_SV_Clicked());

		xoa_SV = new MenuItem(menuQLSV, SWT.PUSH);
		xoa_SV.setText("&Xoa");
		
		sua_SV = new MenuItem(menuQLSV, SWT.PUSH);
		sua_SV.setText("&Sua");
		
		xem_SV = new MenuItem(menuQLSV, SWT.PUSH);
		xem_SV.setText("X&em");
		
		capNhatDiem_SV = new MenuItem(menuQLSV, SWT.PUSH);
		capNhatDiem_SV.setText("&Cap Nhat Diem");

		// Tao menu quan ly in an
		menuInAn = new Menu(menuBar);

		inAn = new MenuItem(menuBar, SWT.CASCADE);
		inAn.setText("&In An");
		inAn.setMenu(menuInAn);

		inDanhSach_SV = new MenuItem(menuInAn, SWT.PUSH);
		inDanhSach_SV.setText("&Danh Sach Sinh Vien");
		inDiem_MH = new MenuItem(menuInAn, SWT.PUSH);
		inDiem_MH.setText("Diem &Mon Hoc");
		inDiem_SV = new MenuItem(menuInAn, SWT.PUSH);
		inDiem_SV.setText("Diem &Sinh Vien");

		shell.setMenuBar(menuBar);
	}

	public KeyListener escShell() {
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

	// Listener cho button

	public Listener btn_Them_SV_Clicked() {
		return new Listener() {
			public void handleEvent(Event arg0) {
				new Form_ThemSV(shell);
			}
		};
	}

	public Listener btn_Sua_MH_Clicked() {
		return new Listener() {
			public void handleEvent(Event arg0) {
				new Form_XoaSua(shell);
			}
		};
	}

	public Listener btn_Xoa_MH_Clicked() {
		return new Listener() {
			public void handleEvent(Event arg0) {
				new Form_XoaSua(shell);
			}
		};
	}

	public Listener btn_LietKe_MH_Clicked() {
		return new Listener() {
			public void handleEvent(Event arg0) {
				new Form_LietKe(shell);
			}
		};
	}

//	public static void main(String args[]) {
//		new Main_QLMH();
//	}
	
}