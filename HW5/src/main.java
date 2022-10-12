import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileSystemView;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 609, 361);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number Analyzer");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(156, 29, 292, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Choose input file");
		btnNewButton.setBounds(188, 114, 232, 41);
		frame.getContentPane().add(btnNewButton);
		
		JTextPane mean = new JTextPane();
		mean.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		mean.setEditable(false);
		mean.setBounds(188, 220, 232, 30);
		frame.getContentPane().add(mean);
		
		JTextPane standardDeviation = new JTextPane();
		standardDeviation.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		standardDeviation.setEditable(false);
		standardDeviation.setBounds(188, 266, 232, 30);
		frame.getContentPane().add(standardDeviation);
		
		JLabel lblNewLabel_1 = new JLabel("Mean");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(48, 220, 68, 24);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Standard Deviation");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(48, 272, 108, 24);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView());
				j.showSaveDialog(null);
				// Open the save dialog
				
				File f = j.getSelectedFile();
				LinkedList l = new LinkedList();
				l.add(f);
				
				mean.setText(""+l.mean());
				standardDeviation.setText(""+l.standardDeviation());
			}
		});
		
	}
}
