import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import swing2swt.layout.FlowLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import javax.swing.JButton;

public class YAMB {

	protected Shell shell;
	private Text text;
	int brBacanja = 0;
    String rezultat = "";

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			YAMB window = new YAMB();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(600, 400);
		shell.setText("SWT Application");
		shell.setLayout(new FormLayout());
		
		ArrayList<Button> sveKockice = new ArrayList<Button>();
		ArrayList<Button> ceoNiz = new ArrayList<Button>();
		
		Composite composite = new Composite(shell, SWT.NONE);
		FormData fd_composite = new FormData();
		fd_composite.top = new FormAttachment(0, 10);
		fd_composite.right = new FormAttachment(100, -31);
		fd_composite.bottom = new FormAttachment(0, 111);
		fd_composite.left = new FormAttachment(0, 43);
		composite.setLayoutData(fd_composite);
		composite.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Composite composite_1 = new Composite(composite, SWT.NONE);
		
		Button kockica1 = new Button(composite_1, SWT.NONE);
		kockica1.setBounds(0, 0, 60, 40);
		sveKockice.add(kockica1);
		
		Button checkKockica1 = new Button(composite_1, SWT.CHECK);
		
		checkKockica1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(checkKockica1.getSelection() == true) {
					sveKockice.remove(kockica1);
				}
				if(checkKockica1.getSelection() == false) {
					sveKockice.add(kockica1);
				}
			}
		});
			 			
		checkKockica1.setBounds(25, 48, 13, 16);
		
		Composite composite_2 = new Composite(composite, SWT.NONE);
		
		Composite composite_11 = new Composite(composite_2, SWT.NONE);
		composite_11.setBounds(0, 0, 60, 64);
		
		Button kockica2 = new Button(composite_11, SWT.NONE);
		kockica2.setBounds(0, 0, 60, 40);
		sveKockice.add(kockica2);
		
		Button checkKockica2 = new Button(composite_11, SWT.CHECK);
		checkKockica2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(checkKockica2.getSelection() == true) {
					sveKockice.remove(kockica2);
				}
				if(checkKockica2.getSelection() == false) {
					sveKockice.add(kockica2);
				}
			}
		});
		checkKockica2.setBounds(25, 48, 13, 16);
		
		Composite composite_3 = new Composite(composite, SWT.NONE);
		
		Composite composite_7 = new Composite(composite_3, SWT.NONE);
		composite_7.setBounds(0, 0, 60, 64);
		
		Button kockica3 = new Button(composite_7, SWT.NONE);
		kockica3.setBounds(0, 0, 60, 40);
		sveKockice.add(kockica3);
		
		Button checkKockica3 = new Button(composite_7, SWT.CHECK);
		checkKockica3.setBounds(25, 48, 13, 16);
		checkKockica3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(checkKockica3.getSelection() == true) {
					sveKockice.remove(kockica3);
				}
				if(checkKockica3.getSelection() == false) {
					sveKockice.add(kockica3);
				}
			}
		});
		
		Composite composite_4 = new Composite(composite, SWT.NONE);
		
		Composite composite_8 = new Composite(composite_4, SWT.NONE);
		composite_8.setBounds(0, 0, 60, 64);
		
		Button kockica4 = new Button(composite_8, SWT.NONE);
		kockica4.setBounds(0, 0, 60, 40);
		sveKockice.add(kockica4);
		
		Button checkKockica4 = new Button(composite_8, SWT.CHECK);
		checkKockica4.setBounds(25, 48, 13, 16);
		checkKockica4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(checkKockica4.getSelection() == true) {
					sveKockice.remove(kockica4);
				}
				if(checkKockica4.getSelection() == false) {
					sveKockice.add(kockica4);
				}
			}
		});
		
		Composite composite_5 = new Composite(composite, SWT.NONE);
		
		Composite composite_9 = new Composite(composite_5, SWT.NONE);
		composite_9.setBounds(0, 0, 60, 64);
		
		Button kockica5 = new Button(composite_9, SWT.NONE);
		kockica5.setBounds(0, 0, 60, 40);
		sveKockice.add(kockica5);
		
		Button checkKockica5 = new Button(composite_9, SWT.CHECK);
		checkKockica5.setBounds(25, 48, 13, 16);
		checkKockica5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(checkKockica5.getSelection() == true) {
					sveKockice.remove(kockica5);
				}
				if(checkKockica5.getSelection() == false) {
					sveKockice.add(kockica5);
				}
			}
		});
		
		Composite composite_6 = new Composite(composite, SWT.NONE);
		
		Composite composite_10 = new Composite(composite_6, SWT.NONE);
		composite_10.setBounds(0, 0, 60, 64);
		
		Button kockica6 = new Button(composite_10, SWT.NONE);
		kockica6.setBounds(0, 0, 60, 40);
		sveKockice.add(kockica6);
		
		Button checkKockica6 = new Button(composite_10, SWT.CHECK);
		checkKockica6.setBounds(25, 48, 13, 16);
		checkKockica6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(checkKockica6.getSelection() == true) {
					sveKockice.remove(kockica6);
				}
				if(checkKockica6.getSelection() == false) {
					sveKockice.add(kockica6);
				}
			}
		});
		
		Composite composite_12 = new Composite(shell, SWT.NONE);
		FormData fd_composite_12 = new FormData();
		fd_composite_12.top = new FormAttachment(composite, 20);
		fd_composite_12.right = new FormAttachment(100, -161);
		composite_12.setLayoutData(fd_composite_12);
		
		Button btnNewButton_1 = new Button(composite_12, SWT.NONE);
		
		btnNewButton_1.setBounds(0, 10, 250, 25);
		btnNewButton_1.setText("Baci preostale kockice");
		btnNewButton_1.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				if(e.type == SWT.Selection) {
					drop(sveKockice);
				} if(brBacanja == 3) {
					btnNewButton_1.setEnabled(false);
				}
			}
		});
		
		Composite composite_13 = new Composite(shell, SWT.NONE);
		FormData fd_composite_13 = new FormData();
		fd_composite_13.top = new FormAttachment(composite_12, 67);
		fd_composite_13.right = new FormAttachment(100, -248);
		composite_13.setLayoutData(fd_composite_13);
		
		text = new Text(composite_13, SWT.BORDER);
		text.setBounds(0, 22, 76, 21);
		text.setEditable(false);
		
		
		Composite composite_14 = new Composite(shell, SWT.NONE);
		FormData fd_composite_14 = new FormData();
		fd_composite_14.bottom = new FormAttachment(100, -10);
		fd_composite_14.right = new FormAttachment(composite, 0, SWT.RIGHT);
		composite_14.setLayoutData(fd_composite_14);
		
		Button btnNewButton_2 = new Button(composite_14, SWT.NONE);
		btnNewButton_2.setBounds(0, 10, 75, 30);
		btnNewButton_2.setText("Ponovo");
		btnNewButton_2.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				if(e.type == SWT.Selection) {
					brBacanja = 0;
					rezultat= "";
					
					btnNewButton_1.setEnabled(true);
					checkKockica1.setSelection(false);
					checkKockica2.setSelection(false);
					checkKockica3.setSelection(false);
					checkKockica4.setSelection(false);
					checkKockica5.setSelection(false);
					checkKockica6.setSelection(false);
					sveKockice.removeAll(sveKockice);
					sveKockice.addAll(ceoNiz);
					drop(sveKockice);
					
					
			}
			}
		});
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		FormData fd_lblNewLabel = new FormData();
		fd_lblNewLabel.bottom = new FormAttachment(100, -89);
		fd_lblNewLabel.right = new FormAttachment(composite_13, -6);
		lblNewLabel.setLayoutData(fd_lblNewLabel);
		lblNewLabel.setText("Bacanje:");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		FormData fd_lblNewLabel_1 = new FormData();
		fd_lblNewLabel_1.top = new FormAttachment(lblNewLabel, 0, SWT.TOP);
		fd_lblNewLabel_1.left = new FormAttachment(composite_13, 17);
		lblNewLabel_1.setLayoutData(fd_lblNewLabel_1);
		lblNewLabel_1.setText("New Label");
		
		
		drop(sveKockice);
		ceoNiz.addAll(sveKockice);

	}
	public void drop(ArrayList<Button> kockice) {
		for(Button b: kockice) {
			int dobijeniBroj = (int) (Math.random()* 6) + 1; 
			b.setText(dobijeniBroj + "");
		}
		++brBacanja;
		text.setText(brBacanja + "");
	}
}
