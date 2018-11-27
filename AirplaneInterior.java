package client;
import client.ServicesService;
import client.SOAPServerInterface;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;

import java.awt.GridLayout;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;


public class AirplaneInterior extends JFrame {
	private static String[] delimsplit;
	private static String[] commasplit;
	private static JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AirplaneInterior frame = new AirplaneInterior("Airbus319","Monday","11:00");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */
	public AirplaneInterior(String FlightNumber, String username) {
		
		setTitle("Please select the desirable seat for reservation!");
		setBounds(100, 100, 500, 600);
		contentPane = new JPanel(new GridLayout(15, 4));
		JPanel btnPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    setContentPane(contentPane);
	    
		
		
//		setBounds(100, 100, 450, 300);
//		GridLayout gridLayout = new GridLayout();
//		gridLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
//		gridLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//		gridLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
//		gridLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
//		getContentPane().setLayout(gridLayout);
		
		
		/*
		JLabel lblSelectTheRadio = new JLabel("Select the radio button to add to cart");
		GridBagConstraints gbc_lblSelectTheRadio = new GridBagConstraints();
		gbc_lblSelectTheRadio.insets = new Insets(0, 0, 5, 0);
		gbc_lblSelectTheRadio.gridx = 4;
		gbc_lblSelectTheRadio.gridy = 1;
		getContentPane().add(lblSelectTheRadio, gbc_lblSelectTheRadio);
		
		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 3;
		gbc_label.gridy = 2;
		getContentPane().add(label, gbc_label);
		
		JLabel lblSeatNumber = new JLabel("Seat Number");
		GridBagConstraints gbc_lblSeatNumber = new GridBagConstraints();
		gbc_lblSeatNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeatNumber.gridx = 0;
		gbc_lblSeatNumber.gridy = 3;
		getContentPane().add(lblSeatNumber, gbc_lblSeatNumber);
		
		JLabel lblSeatPrice = new JLabel("Seat Price ");
		GridBagConstraints gbc_lblSeatPrice = new GridBagConstraints();
		gbc_lblSeatPrice.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeatPrice.gridx = 1;
		gbc_lblSeatPrice.gridy = 3;
		getContentPane().add(lblSeatPrice, gbc_lblSeatPrice);
		
		JLabel lblSeatType = new JLabel("Seat Type");
		GridBagConstraints gbc_lblSeatType = new GridBagConstraints();
		gbc_lblSeatType.insets = new Insets(0, 0, 5, 5);
		gbc_lblSeatType.gridx = 2;
		gbc_lblSeatType.gridy = 3;
		getContentPane().add(lblSeatType, gbc_lblSeatType);
		
		
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 4;
		
		
		JToggleButton tglbtnNewToggleButton;
		GridBagConstraints gbc_tglbtnNewToggleButton = new GridBagConstraints();
		gbc_tglbtnNewToggleButton.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnNewToggleButton.gridx = 0;
		gbc_tglbtnNewToggleButton.gridy = 4;
		*/
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(100, 100, 450, 300);
		//getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		ServicesService newcall = new ServicesService();
		SOAPServerInterface call  = newcall.getServicesPort();
		
		String abc = call.boeingList();
		delimsplit = abc.split(";");
		for(int i=0; i<delimsplit.length; i++){
			commasplit = delimsplit[i].split(",");
			
			  final JToggleButton button = new JToggleButton(commasplit[0]+" "+commasplit[1]+" "+commasplit[2]);
//              button.setSize(new Dimension(10, 20));
			  button.setSize(100,200);
			  button.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent actionEvent) {
                      AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
                      boolean selected = abstractButton.getModel().isSelected();
                      
                      
                      
                     }
                  });
			  contentPane.add(button);
              
              
              
	}
		JButton button = new JButton("Reserve Seat!");
		btnPnl.add(button);
		contentPane.add(btnPnl, BorderLayout.SOUTH);

}
}
