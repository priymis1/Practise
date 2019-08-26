package comm.handsOn;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.awt.event.ActionEvent;

public class NetworkingClientFactorialSwing extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NetworkingClientFactorialSwing frame = new NetworkingClientFactorialSwing();
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
	public NetworkingClientFactorialSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumberToCalculate = new JLabel("Number to calculate Factorial");
		lblNumberToCalculate.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNumberToCalculate.setBounds(10, 21, 168, 20);
		contentPane.add(lblNumberToCalculate);
		
		textField = new JTextField();
		textField.setBounds(180, 21, 153, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		JTextArea textArea = new JTextArea();
		textArea.setBounds(33, 93, 315, 45);
		contentPane.add(textArea);
		JButton btnCalculate = new JButton("CALCULATE");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Socket client = null;
				int portnumber = 1234;
				
				for (int i = 0; i< 10; i++)
				{
					String msg = "";
					
					try {
						client = new Socket(InetAddress.getLocalHost(),portnumber);
						
						System.out.println("Client socket is created" +client);
						
						OutputStream clientOut = client.getOutputStream();
						PrintWriter pw = new PrintWriter(clientOut,true);
						
						InputStream clientIn = client.getInputStream();
						BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));
						
	
						msg =textField.getText();	
						pw.println(msg);
						
						System.out.println("Mesage returned from the server = "+br.readLine());
						String str=br.readLine();
						textArea.setText(str);
						
						br.close();
						pw.close();
						client.close();
						
						if(msg.equalsIgnoreCase("bye"))

					{
							break;
					}
						} catch (IOException ie) {
							System.out.println("IO Error - Start server and turn off firewall" +ie);
					}
						
					}
			}
		});
		btnCalculate.setBounds(138, 56, 89, 23);
		contentPane.add(btnCalculate);
		
		
		
	}
}
