package comm.example;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class MulticastChatClientUi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MulticastChatClientUi frame = new MulticastChatClientUi();
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
	public MulticastChatClientUi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int portnumber = 1236;


		        // Create a MulticastSocket

		        MulticastSocket chatMulticastSocket;
				try {
					chatMulticastSocket = new MulticastSocket(portnumber);
					
					 // Determine the IP address of a host, given the host name

			        InetAddress group = InetAddress.getByName("225.0.0.1");

			        
			        // Joins a multicast group

			        chatMulticastSocket.joinGroup(group);
			        
			        JLabel lblStartSendingMsg = new JLabel("Start sending msg to the server by clicking send");
					lblStartSendingMsg.setBounds(52, 46, 249, 14);
					contentPane.add(lblStartSendingMsg);
					
					// Prompt a user to enter a message
					
					JTextArea textArea = new JTextArea();
					textArea.setBounds(52, 71, 343, 109);
					contentPane.add(textArea);

			        String msg = "";

			       // System.out.println("Type a message for the server:");

			        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			        //msg = br.readLine();
			        msg = textArea.getText();
			        DatagramPacket data = new DatagramPacket(msg.getBytes(), 0, msg.length(), group, portnumber);
			        
			     // Send the message to Multicast address
			        
			        JButton btnSend = new JButton("SEND");
					btnSend.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							

					        try {
								chatMulticastSocket.send(data);
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}

					        
					        // Close the socket

					        chatMulticastSocket.close();
							
							 

							
							
						}
					});
					btnSend.setFont(new Font("Tahoma", Font.BOLD, 11));
					btnSend.setBounds(169, 203, 89, 23);
					contentPane.add(btnSend);

			        

			        

			       
			        
			        
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				

		        
		       
			}
		});
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnStart.setBounds(169, 11, 89, 23);
		contentPane.add(btnStart);
		
		
		
		
		
		
		
	}

}
