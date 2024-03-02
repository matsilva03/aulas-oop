package appGrafico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
static Frame01 frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Frame01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame01() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnExemplos = new JMenu("Exemplos");
		menuBar.add(mnExemplos);
		
		JMenuItem miFor = new JMenuItem("For");
		miFor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(miFor, "For");
				PainelFor p = new PainelFor();
				frame.setContentPane(p);
				frame.revalidate(); // Refresh
				frame.repaint();
				
			}
		});
		mnExemplos.add(miFor);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Média");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PainelMedia p = new PainelMedia();
				frame.setContentPane(p);
				frame.revalidate(); // Refresh
				frame.repaint();
			}
		});
		mnExemplos.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("If");
		mnExemplos.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
