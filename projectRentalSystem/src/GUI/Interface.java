package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import pack1.*;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;

public class Interface {

	
	private JFrame frame;
	private JTextField textFieldVehicleNumber;
	private JTextField textFieldMake;
	private JTextField textFieldBrand;
	private JTextField textFieldModel;
	private JTextField textFieldYear;
	private JTextField textFieldRate;
	private JTextField textFieldBodyType;
	private JTextField textFieldGearType;
	private JTextField textFieldEngineSize;
	private JTextField textFieldBusNumber;
	private JTextField textFieldBusMake;
	private JTextField textFieldBusBrand;
	private JTextField textFieldBusModel;
	private JTextField textFieldBusYear;
	private JTextField textFieldBusRate;
	private JTextField textFieldBusSeats;
	private JTextField textFieldBusNationality;
	private JTextField textFieldResidentName;
	private JTextField textFieldResidentTel;
	private JTextField textFieldResidentAddress;
	private JTextField textFieldResidentNat;
	private JTextField textFieldResidentIdCard;
	private JTextField textFieldResidentBank;
	private JTextField textFieldResidentNo;
	private JTextField textFieldVisitorName;
	private JTextField textFieldVisitorTel;
	private JTextField textFieldVisitorAddress;
	private JTextField textFieldVisitorNat;
	private JTextField textFieldVisitorPass;
	private JTextField textFieldVisitorStart;
	private JTextField textFieldVisitorEnd;
	private JTextField textFieldVisitorNo;


	
	
	
	String vehicleHeader[] = new String[] { "Number", "Make", "Brand",
		      "Model", "Year", "Available", "Rate", "Seats", "Driver", "Body", "Gear", "Engine" };
	private JTextField textFieldRentCId;
	private JTextField textFieldRentDays;
	private JTextField textFieldReturnCustNum;
	private JTextField textFieldReturnVNum;
	private JTextField textFieldReturnVDamage;
	private JTextField textFieldViewID;
	private JTextField textFieldViewMake;
	private JTextField textFieldViewBrand;
	private JTextField textFieldViewModel;
	private JTextField textFieldViewYear;
	private JTextField textFieldViewAvailable;
	private JTextField textFieldViewBody;
	private JTextField textFieldViewEType;
	private JTextField textFieldViewESize;
	private JTextField textFieldViewDriver;
	private JTextField textFieldViewSeats;
	private JTextField textFieldViewVehicleType;
	private JTextField textFieldViewRate;
	private JTextField textFieldRentalVNum;
	//vehicleNo | make | brand | model | year | available | dailyrate | seats | driver | bodyType | gearType | engineSize

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
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
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Vehicle v1 = new Bus(111,"Tata","Tata","RX12",2007,true,400.00,15,"Bangladesh"); 
		Vehicle v2 = new Car(222,"BMW","BMW","RX12",2007,true,400.00,"Sedan","Automatic","V12");
		Vehicle.registerVehicle(v1);
		Vehicle.registerVehicle(v2);
		

		Customer c1 = new Resident(1111,"Khalood",66557265,"Al Markhiya","Qatari",123456789,"QNB");
		Customer c2 = new Vistor(2222,"Khalood",66557265,"Al Markhiya","Qatari","PF20128344",20190102,20190503);
		Customer.recordDetails(c1);
		Customer.recordDetails(c2);

	    
		
		frame = new JFrame();
		frame.setBounds(100, 100, 664, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 638, 435);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 551, 22);
		panel.add(menuBar);
		
		JMenu mnNew = new JMenu("New");
		menuBar.add(mnNew);
		
		JMenu mnNewVehicle = new JMenu("Vehicle");
		mnNew.add(mnNewVehicle);
		
		JMenuItem mntmNewCar = new JMenuItem("Car");
		mnNewVehicle.add(mntmNewCar);
		
		JMenuItem mntmNewBus = new JMenuItem("Bus");
		mnNewVehicle.add(mntmNewBus);
		
		JMenu mnCustomer = new JMenu("Customer");
		mnNew.add(mnCustomer);
		
		JMenuItem mntmResident = new JMenuItem("Resident");
		mnCustomer.add(mntmResident);
		
		JMenuItem mntmVisitor = new JMenuItem("Visitor");
		mnCustomer.add(mntmVisitor);
		
		
		JMenu mnRentals = new JMenu("Rentals");
		menuBar.add(mnRentals);

		JMenuItem mntmRent = new JMenuItem("Rent a Vehicle");
		mnRentals.add(mntmRent);
		
		JMenuItem mntmReturn = new JMenuItem("Return a Vehicle");
		mnRentals.add(mntmReturn);
		
		JMenu mnInquire = new JMenu("Inquire");
		menuBar.add(mnInquire);
		
		JMenuItem mntmInquireVehicle = new JMenuItem("About specific vehicle");
		mnInquire.add(mntmInquireVehicle);
		
		JMenuItem mntmViewAll = new JMenuItem("All Renters With Cars");
		mnInquire.add(mntmViewAll);
		
		
		JPanel panelCards = new JPanel(new CardLayout());
		panelCards.setBounds(0, 22, 638, 413);
		panel.add(panelCards);
		
		
		//Add car========================================================================================================================
		
		JPanel card1 = new JPanel();
		panelCards.add(card1, "addCar");
		card1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vehicle Number");
		lblNewLabel.setBounds(10, 54, 94, 20);
		card1.add(lblNewLabel);
		
		textFieldVehicleNumber = new JTextField();
		textFieldVehicleNumber.setBounds(114, 54, 96, 20);
		card1.add(textFieldVehicleNumber);
		textFieldVehicleNumber.setColumns(10);
		
		JLabel lblAddNewCar = new JLabel("Add New Car");
		lblAddNewCar.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddNewCar.setBounds(245, 11, 121, 14);
		card1.add(lblAddNewCar);
		
		JLabel lblMake = new JLabel("Make");
		lblMake.setBounds(10, 79, 48, 20);
		card1.add(lblMake);
		
		JLabel lblBrand = new JLabel("Brand");
		lblBrand.setBounds(10, 110, 48, 20);
		card1.add(lblBrand);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setBounds(10, 141, 48, 20);
		card1.add(lblModel);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(10, 172, 48, 20);
		card1.add(lblYear);
		
		JLabel lblRate = new JLabel("Rate");
		lblRate.setBounds(10, 203, 48, 20);
		card1.add(lblRate);
		
		JLabel lblNewLabel_1 = new JLabel("Body Type");
		lblNewLabel_1.setBounds(10, 234, 72, 20);
		card1.add(lblNewLabel_1);
		
		JLabel lblGearType = new JLabel("Gear Type");
		lblGearType.setBounds(10, 265, 72, 20);
		card1.add(lblGearType);
		
		JLabel lblEnginSize = new JLabel("Engin Size");
		lblEnginSize.setBounds(10, 296, 59, 20);
		card1.add(lblEnginSize);
		
		textFieldMake = new JTextField();
		textFieldMake.setBounds(114, 79, 96, 20);
		card1.add(textFieldMake);
		textFieldMake.setColumns(10);
		
		textFieldBrand = new JTextField();
		textFieldBrand.setBounds(114, 110, 96, 20);
		card1.add(textFieldBrand);
		textFieldBrand.setColumns(10);
		
		textFieldModel = new JTextField();
		textFieldModel.setBounds(114, 141, 96, 20);
		card1.add(textFieldModel);
		textFieldModel.setColumns(10);
		
		textFieldYear = new JTextField();
		textFieldYear.setBounds(114, 172, 96, 20);
		card1.add(textFieldYear);
		textFieldYear.setColumns(10);
		
		textFieldRate = new JTextField();
		textFieldRate.setBounds(114, 203, 96, 20);
		card1.add(textFieldRate);
		textFieldRate.setColumns(10);
		
		textFieldBodyType = new JTextField();
		textFieldBodyType.setBounds(114, 234, 96, 20);
		card1.add(textFieldBodyType);
		textFieldBodyType.setColumns(10);
		
		textFieldGearType = new JTextField();
		textFieldGearType.setBounds(114, 265, 96, 20);
		card1.add(textFieldGearType);
		textFieldGearType.setColumns(10);
		
		textFieldEngineSize = new JTextField();
		textFieldEngineSize.setBounds(114, 296, 96, 20);
		card1.add(textFieldEngineSize);
		textFieldEngineSize.setColumns(10);
		
		JButton btnAddNewCar = new JButton("Add New Car");
		btnAddNewCar.setBounds(507, 379, 121, 23);
		card1.add(btnAddNewCar);
		
		//Add Bus=================================================================================================================
		
		JPanel card2 = new JPanel();
		panelCards.add(card2, "addBus");
		card2.setLayout(null);
		
		JLabel lblAddNewBus = new JLabel("Add New Bus");
		lblAddNewBus.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddNewBus.setBounds(228, 11, 119, 14);
		card2.add(lblAddNewBus);
		
		JLabel lblBusNumber = new JLabel("Bus Number");
		lblBusNumber.setBounds(10, 79, 90, 20);
		card2.add(lblBusNumber);
		
		textFieldBusNumber = new JTextField();
		textFieldBusNumber.setBounds(133, 79, 96, 20);
		card2.add(textFieldBusNumber);
		textFieldBusNumber.setColumns(10);
		
		textFieldBusMake = new JTextField();
		textFieldBusMake.setBounds(133, 110, 96, 20);
		card2.add(textFieldBusMake);
		textFieldBusMake.setColumns(10);
		
		JLabel lblMake_1 = new JLabel("Make");
		lblMake_1.setBounds(10, 110, 48, 20);
		card2.add(lblMake_1);
		
		JLabel lblBrand_1 = new JLabel("Brand");
		lblBrand_1.setBounds(10, 141, 48, 20);
		card2.add(lblBrand_1);
		
		textFieldBusBrand = new JTextField();
		textFieldBusBrand.setBounds(133, 141, 96, 20);
		card2.add(textFieldBusBrand);
		textFieldBusBrand.setColumns(10);
		
		JLabel lblModel_1 = new JLabel("Model");
		lblModel_1.setBounds(10, 172, 48, 20);
		card2.add(lblModel_1);
		
		textFieldBusModel = new JTextField();
		textFieldBusModel.setBounds(133, 172, 96, 20);
		card2.add(textFieldBusModel);
		textFieldBusModel.setColumns(10);
		
		JLabel lblYear_1 = new JLabel("Year");
		lblYear_1.setBounds(10, 203, 48, 20);
		card2.add(lblYear_1);
		
		textFieldBusYear = new JTextField();
		textFieldBusYear.setBounds(133, 203, 96, 20);
		card2.add(textFieldBusYear);
		textFieldBusYear.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Rate");
		lblNewLabel_2.setBounds(10, 234, 48, 20);
		card2.add(lblNewLabel_2);
		
		textFieldBusRate = new JTextField();
		textFieldBusRate.setText("");
		textFieldBusRate.setBounds(133, 234, 96, 20);
		card2.add(textFieldBusRate);
		textFieldBusRate.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Seat Number");
		lblNewLabel_3.setBounds(10, 265, 90, 20);
		card2.add(lblNewLabel_3);
		
		textFieldBusSeats = new JTextField();
		textFieldBusSeats.setBounds(133, 265, 96, 20);
		card2.add(textFieldBusSeats);
		textFieldBusSeats.setColumns(10);
		
		JLabel lblDriverNationality = new JLabel("Driver Nationality");
		lblDriverNationality.setBounds(10, 299, 102, 14);
		card2.add(lblDriverNationality);
		
		textFieldBusNationality = new JTextField();
		textFieldBusNationality.setBounds(133, 296, 96, 20);
		card2.add(textFieldBusNationality);
		textFieldBusNationality.setColumns(10);
		
		JButton btnAddNewBus = new JButton("Add New Bus");
		btnAddNewBus.setBounds(509, 379, 119, 23);
		card2.add(btnAddNewBus);
		
		//Add Resident====================================================================================================================
		
		JPanel card3 = new JPanel();
		panelCards.add(card3, "addResident");
		card3.setLayout(null);
		
		JLabel lblAddNewResident = new JLabel("Add New Resident");
		lblAddNewResident.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddNewResident.setBounds(255, 11, 132, 25);
		card3.add(lblAddNewResident);
		
		JLabel lblNewLabel_4 = new JLabel("Name");
		lblNewLabel_4.setBounds(10, 108, 48, 20);
		card3.add(lblNewLabel_4);
		
		textFieldResidentName = new JTextField();
		textFieldResidentName.setBounds(110, 108, 96, 20);
		card3.add(textFieldResidentName);
		textFieldResidentName.setColumns(10);
		
		JLabel lblTelephone = new JLabel("Telephone");
		lblTelephone.setBounds(10, 139, 70, 20);
		card3.add(lblTelephone);
		
		textFieldResidentTel = new JTextField();
		textFieldResidentTel.setBounds(110, 139, 96, 20);
		card3.add(textFieldResidentTel);
		textFieldResidentTel.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(10, 170, 48, 20);
		card3.add(lblAddress);
		
		textFieldResidentAddress = new JTextField();
		textFieldResidentAddress.setBounds(110, 170, 96, 20);
		card3.add(textFieldResidentAddress);
		textFieldResidentAddress.setColumns(10);
		
		JLabel lblNationality = new JLabel("Nationality");
		lblNationality.setBounds(10, 201, 85, 20);
		card3.add(lblNationality);
		
		textFieldResidentNat = new JTextField();
		textFieldResidentNat.setBounds(110, 201, 96, 20);
		card3.add(textFieldResidentNat);
		textFieldResidentNat.setColumns(10);
		
		JLabel lblIdCard = new JLabel("ID Card");
		lblIdCard.setBounds(10, 232, 48, 20);
		card3.add(lblIdCard);
		
		textFieldResidentIdCard = new JTextField();
		textFieldResidentIdCard.setBounds(110, 232, 96, 20);
		card3.add(textFieldResidentIdCard);
		textFieldResidentIdCard.setColumns(10);
		
		JLabel lblBankName = new JLabel("Bank Name");
		lblBankName.setBounds(10, 263, 70, 20);
		card3.add(lblBankName);
		
		textFieldResidentBank = new JTextField();
		textFieldResidentBank.setBounds(110, 263, 96, 20);
		card3.add(textFieldResidentBank);
		textFieldResidentBank.setColumns(10);
		
		textFieldResidentNo = new JTextField();
		textFieldResidentNo.setBounds(110, 294, 96, 20);
		card3.add(textFieldResidentNo);
		textFieldResidentNo.setColumns(10);
		
		JLabel lblCustomerNo = new JLabel("Customer No");
		lblCustomerNo.setBounds(10, 294, 85, 20);
		card3.add(lblCustomerNo);
		
		JButton btnAddNewResident = new JButton("Add New Resident");
		btnAddNewResident.setBounds(488, 379, 140, 23);
		card3.add(btnAddNewResident);
		
		//Add visitor=============================================================================================================================
		
		JPanel card4 = new JPanel();
		panelCards.add(card4, "addVisitor");
		card4.setLayout(null);
		
		JLabel lblAddNewResident_1 = new JLabel("Add New Visitor");
		lblAddNewResident_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAddNewResident_1.setBounds(265, 11, 124, 20);
		card4.add(lblAddNewResident_1);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 106, 48, 20);
		card4.add(lblName);
		
		textFieldVisitorName = new JTextField();
		textFieldVisitorName.setBounds(101, 106, 96, 20);
		card4.add(textFieldVisitorName);
		textFieldVisitorName.setColumns(10);
		
		JLabel lblTelephone_1 = new JLabel("Telephone");
		lblTelephone_1.setBounds(10, 137, 83, 20);
		card4.add(lblTelephone_1);
		
		textFieldVisitorTel = new JTextField();
		textFieldVisitorTel.setBounds(101, 137, 96, 20);
		card4.add(textFieldVisitorTel);
		textFieldVisitorTel.setColumns(10);
		
		JLabel lblAddress_1 = new JLabel("Address");
		lblAddress_1.setBounds(10, 168, 48, 20);
		card4.add(lblAddress_1);
		
		textFieldVisitorAddress = new JTextField();
		textFieldVisitorAddress.setBounds(101, 168, 96, 20);
		card4.add(textFieldVisitorAddress);
		textFieldVisitorAddress.setColumns(10);
		
		JLabel lblNationality_1 = new JLabel("Nationality");
		lblNationality_1.setBounds(10, 199, 83, 20);
		card4.add(lblNationality_1);
		
		textFieldVisitorNat = new JTextField();
		textFieldVisitorNat.setBounds(101, 199, 96, 20);
		card4.add(textFieldVisitorNat);
		textFieldVisitorNat.setColumns(10);
		
		JLabel lblPassport = new JLabel("Passport");
		lblPassport.setBounds(10, 230, 72, 20);
		card4.add(lblPassport);
		
		textFieldVisitorPass = new JTextField();
		textFieldVisitorPass.setBounds(101, 230, 96, 20);
		card4.add(textFieldVisitorPass);
		textFieldVisitorPass.setColumns(10);
		
		JLabel lblVisitStart = new JLabel("Visit Start");
		lblVisitStart.setBounds(10, 260, 83, 20);
		card4.add(lblVisitStart);
		
		textFieldVisitorStart = new JTextField();
		textFieldVisitorStart.setBounds(101, 260, 96, 20);
		card4.add(textFieldVisitorStart);
		textFieldVisitorStart.setColumns(10);
		
		JLabel lblVisitEnd = new JLabel("Visit End");
		lblVisitEnd.setBounds(10, 291, 72, 20);
		card4.add(lblVisitEnd);
		
		textFieldVisitorEnd = new JTextField();
		textFieldVisitorEnd.setBounds(101, 291, 96, 20);
		card4.add(textFieldVisitorEnd);
		textFieldVisitorEnd.setColumns(10);
		
		JLabel lblCustNo = new JLabel("Custumer No");
		lblCustNo.setBounds(10, 322, 83, 14);
		card4.add(lblCustNo);
		
		textFieldVisitorNo = new JTextField();
		textFieldVisitorNo.setBounds(101, 319, 96, 20);
		card4.add(textFieldVisitorNo);
		textFieldVisitorNo.setColumns(10);
		
		JButton btnAddNewVisitor = new JButton("Add New Visitor");
		btnAddNewVisitor.setBounds(514, 379, 124, 23);
		card4.add(btnAddNewVisitor);
		
		//Rent===========================================================================================================================
		
		JPanel card5 = new JPanel();
		panelCards.add(card5, "rent");
		card5.setLayout(null);
		
		
		JLabel lblRenterCustomerNumber = new JLabel("Renter Customer Number");
		lblRenterCustomerNumber.setBounds(10, 282, 167, 20);
		card5.add(lblRenterCustomerNumber);
		
		textFieldRentCId = new JTextField();
		textFieldRentCId.setBounds(187, 282, 96, 20);
		card5.add(textFieldRentCId);
		textFieldRentCId.setColumns(10);
		
		JButton btnRent = new JButton("Rent");
		btnRent.setBounds(539, 379, 89, 23);
		card5.add(btnRent);
		
		JLabel lblDaysToRent = new JLabel("Days to rent");
		lblDaysToRent.setBounds(10, 347, 167, 20);
		card5.add(lblDaysToRent);
		
		textFieldRentDays = new JTextField();
		textFieldRentDays.setBounds(187, 347, 96, 20);
		card5.add(textFieldRentDays);
		textFieldRentDays.setColumns(10);
		
		JLabel lblVehicleNumber_2 = new JLabel("Vehicle Number");
		lblVehicleNumber_2.setBounds(10, 316, 167, 20);
		card5.add(lblVehicleNumber_2);
		
		textFieldRentalVNum  = new JTextField();
		textFieldRentalVNum.setBounds(187, 316, 96, 20);
		card5.add(textFieldRentalVNum);
		textFieldRentalVNum.setColumns(10);
		
		JTextPane textPaneRent = new JTextPane();
		textPaneRent.setBounds(10, 13, 609, 258);
		
		JScrollPane scrollPaneRent = new JScrollPane(textPaneRent);
		scrollPaneRent.setBounds(10, 13, 609, 258);
		card5.add(scrollPaneRent);
		
		
		JPanel card6 = new JPanel();
		panelCards.add(card6, "return");
		card6.setLayout(null);
		
		JLabel lblReturnAVehicle = new JLabel("Return A Vehicle");
		lblReturnAVehicle.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblReturnAVehicle.setBounds(233, 11, 193, 20);
		card6.add(lblReturnAVehicle);
		
		JLabel lblCustomerNumber = new JLabel("Customer Number");
		lblCustomerNumber.setBounds(10, 78, 141, 20);
		card6.add(lblCustomerNumber);
		
		textFieldReturnCustNum = new JTextField();
		textFieldReturnCustNum.setBounds(161, 78, 96, 20);
		card6.add(textFieldReturnCustNum);
		textFieldReturnCustNum.setColumns(10);
		
		JLabel lblVehicleNumber = new JLabel("Vehicle Number");
		lblVehicleNumber.setBounds(10, 147, 96, 20);
		card6.add(lblVehicleNumber);
		
		textFieldReturnVNum = new JTextField();
		textFieldReturnVNum.setBounds(161, 147, 96, 20);
		card6.add(textFieldReturnVNum);
		textFieldReturnVNum.setColumns(10);
		
		JLabel lblVehicleDamage = new JLabel("Vehicle Damage");
		lblVehicleDamage.setBounds(10, 226, 96, 20);
		card6.add(lblVehicleDamage);
		
		textFieldReturnVDamage = new JTextField();
		textFieldReturnVDamage.setBounds(161, 226, 96, 20);
		card6.add(textFieldReturnVDamage);
		textFieldReturnVDamage.setColumns(10);
		
		JButton btnReturnVehicle = new JButton("Return Vehicle");
		btnReturnVehicle.setBounds(456, 379, 172, 23);
		card6.add(btnReturnVehicle);
		
		JPanel card7 = new JPanel();
		panelCards.add(card7, "inquire");
		card7.setLayout(null);
		
		JLabel lblInquireAboutA = new JLabel("Inquire About Vehicle");
		lblInquireAboutA.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblInquireAboutA.setBounds(202, 11, 213, 20);
		card7.add(lblInquireAboutA);
		
		JLabel lblNewLabel_5 = new JLabel("Vehicle Number");
		lblNewLabel_5.setBounds(10, 50, 112, 20);
		card7.add(lblNewLabel_5);
		
		textFieldViewID = new JTextField();
		textFieldViewID.setBounds(132, 50, 96, 20);
		card7.add(textFieldViewID);
		textFieldViewID.setColumns(10);
		
		JLabel lblVehicleNumber_1 = new JLabel("Make:");
		lblVehicleNumber_1.setBounds(74, 107, 48, 20);
		card7.add(lblVehicleNumber_1);
		
		textFieldViewMake = new JTextField();
		textFieldViewMake.setEditable(false);
		textFieldViewMake.setBounds(179, 107, 96, 20);
		card7.add(textFieldViewMake);
		textFieldViewMake.setColumns(10);
		
		JLabel lblBrand_2 = new JLabel("Brand:");
		lblBrand_2.setBounds(74, 135, 48, 20);
		card7.add(lblBrand_2);
		
		textFieldViewBrand = new JTextField();
		textFieldViewBrand.setEditable(false);
		textFieldViewBrand.setBounds(179, 135, 96, 20);
		card7.add(textFieldViewBrand);
		textFieldViewBrand.setColumns(10);
		
		JLabel lblModel_2 = new JLabel("Model");
		lblModel_2.setBounds(74, 166, 48, 20);
		card7.add(lblModel_2);
		
		textFieldViewModel = new JTextField();
		textFieldViewModel.setEditable(false);
		textFieldViewModel.setBounds(179, 166, 96, 20);
		card7.add(textFieldViewModel);
		textFieldViewModel.setColumns(10);
		
		JLabel lblYear_2 = new JLabel("Year");
		lblYear_2.setBounds(74, 197, 48, 20);
		card7.add(lblYear_2);
		
		textFieldViewYear = new JTextField();
		textFieldViewYear.setEditable(false);
		textFieldViewYear.setBounds(179, 197, 96, 20);
		card7.add(textFieldViewYear);
		textFieldViewYear.setColumns(10);
		
		JLabel lblAvailabily = new JLabel("Availabily");
		lblAvailabily.setBounds(74, 228, 80, 14);
		card7.add(lblAvailabily);
		
		textFieldViewAvailable = new JTextField();
		textFieldViewAvailable.setEditable(false);
		textFieldViewAvailable.setBounds(179, 228, 96, 20);
		card7.add(textFieldViewAvailable);
		textFieldViewAvailable.setColumns(10);
		
		JLabel lblBodyType = new JLabel("Body Type");
		lblBodyType.setBounds(37, 279, 85, 20);
		card7.add(lblBodyType);
		
		textFieldViewBody = new JTextField();
		textFieldViewBody.setEditable(false);
		textFieldViewBody.setBounds(132, 279, 96, 20);
		card7.add(textFieldViewBody);
		textFieldViewBody.setColumns(10);
		
		JLabel lblEngineType = new JLabel("Gear Type");
		lblEngineType.setBounds(37, 310, 85, 20);
		card7.add(lblEngineType);
		
		textFieldViewEType = new JTextField();
		textFieldViewEType.setEditable(false);
		textFieldViewEType.setBounds(132, 310, 96, 20);
		card7.add(textFieldViewEType);
		textFieldViewEType.setColumns(10);
		
		JLabel lblEngineSize = new JLabel("Engine Size");
		lblEngineSize.setBounds(37, 341, 85, 20);
		card7.add(lblEngineSize);
		
		textFieldViewESize = new JTextField();
		textFieldViewESize.setEditable(false);
		textFieldViewESize.setBounds(132, 341, 96, 20);
		card7.add(textFieldViewESize);
		textFieldViewESize.setColumns(10);
		
		JLabel lblDriverNationality_1 = new JLabel("Driver Nationality");
		lblDriverNationality_1.setBounds(315, 279, 112, 20);
		card7.add(lblDriverNationality_1);
		
		textFieldViewDriver = new JTextField();
		textFieldViewDriver.setEditable(false);
		textFieldViewDriver.setBounds(437, 279, 96, 20);
		card7.add(textFieldViewDriver);
		textFieldViewDriver.setColumns(10);
		
		textFieldViewSeats = new JTextField();
		textFieldViewSeats.setEditable(false);
		textFieldViewSeats.setBounds(437, 310, 96, 20);
		card7.add(textFieldViewSeats);
		textFieldViewSeats.setColumns(10);
		
		JLabel lblSeats = new JLabel("Number Of Seats");
		lblSeats.setBounds(315, 310, 100, 20);
		card7.add(lblSeats);
		
		JButton btnViewSearch = new JButton("Search");
		btnViewSearch.setBounds(539, 379, 89, 23);
		card7.add(btnViewSearch);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(414, 110, 48, 20);
		card7.add(lblType);
		
		textFieldViewVehicleType = new JTextField();
		textFieldViewVehicleType.setEditable(false);
		textFieldViewVehicleType.setBounds(472, 107, 96, 20);
		card7.add(textFieldViewVehicleType);
		textFieldViewVehicleType.setColumns(10);
		
		JLabel lblRate_1 = new JLabel("Rate");
		lblRate_1.setBounds(414, 141, 48, 20);
		card7.add(lblRate_1);
		
		textFieldViewRate = new JTextField();
		textFieldViewRate.setEditable(false);
		textFieldViewRate.setBounds(472, 135, 96, 20);
		card7.add(textFieldViewRate);
		textFieldViewRate.setColumns(10);
		
		JPanel card8 = new JPanel();
		panelCards.add(card8, "viewAll");
		card8.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(1, 1, 7, 20);
		
		JScrollPane scrollPane_1 = new JScrollPane(textPane);
		scrollPane_1.setBounds(10, 5, 618, 397);
		card8.add(scrollPane_1);
		
		

		

		
		

		
		
		
		
		
		
		
		
		
		CardLayout cl = (CardLayout) (panelCards.getLayout());
		class MenuControlListener implements ActionListener {
			JTable rentTable;

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if(e.getSource() == mntmNewCar)  
					cl.show(panelCards, "addCar");
					
				else if (e.getSource() == mntmNewBus) 
					cl.show(panelCards, "addBus");
				
				else if (e.getSource() == mntmResident)
					cl.show(panelCards, "addResident");
					
				else if (e.getSource() == mntmVisitor) 
					cl.show(panelCards, "addVisitor");
				
				else if (e.getSource() == mntmRent) {
					String vehicleString = VehicleContainer.getAllVehicles();
					
					if(vehicleString.isEmpty())
						vehicleString = "No Vehicles in the system";
					
					textPaneRent.setText(vehicleString);
					cl.show(panelCards, "rent");
				}
				
				
				else if (e.getSource() == mntmReturn)
					cl.show(panelCards, "return");
				
				else if (e.getSource() == mntmInquireVehicle)
					cl.show(panelCards, "inquire");
				
				else if (e.getSource() == mntmViewAll) {
					if (CustomerContainer.getCustomersWithVehicles().isEmpty())
						textPane.setText("No rented vehicles currently in the system!");
					else
						textPane.setText(CustomerContainer.getCustomersWithVehicles());
					cl.show(panelCards, "viewAll");
				}
			}
			
		}
		
		class ButtonControlListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnAddNewCar) {
					Car temp = getNewCar();
					if (temp == null)
						JOptionPane.showMessageDialog(panelCards, "Make sure data is correct and try again", "Error", 0);
					else {
						VehicleContainer.addVehicle(temp);
						JOptionPane.showMessageDialog(panelCards, "Car Added Successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				
				else if (e.getSource() == btnAddNewBus) {
					Bus temp2 = getNewBus();
					if (temp2 == null)
						JOptionPane.showMessageDialog(panelCards, "Make sure data is correct and try again", "Error", 0);
					else {
						VehicleContainer.addVehicle(temp2);
						JOptionPane.showMessageDialog(panelCards, "Bus Added Successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				
				else if (e.getSource() == btnAddNewResident) {
					Resident temp3 = getNewResident();
					
					if (temp3 == null) {
						JOptionPane.showMessageDialog(panelCards, "Make sure data is correct and try again", "Error", 0);
					}
					else {
						CustomerContainer.addCustomer(temp3);
						JOptionPane.showMessageDialog(panelCards, "Resident Added Successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				
				else if (e.getSource() == btnAddNewVisitor) {
					Vistor temp4 = getNewVisitor();
					
					if (temp4 == null) {
						JOptionPane.showMessageDialog(panelCards, "Make sure data is correct and try again", "Error", 0);
					}
					else {
						CustomerContainer.addCustomer(temp4);
						JOptionPane.showMessageDialog(panelCards, "Visitor Added Successfully", "Message", JOptionPane.INFORMATION_MESSAGE);
					}
				}
			
				else if (e.getSource() == btnRent) {
					
					Rental rental = createRental();
					
					if (rental == null)
						JOptionPane.showMessageDialog(panelCards, "Make sure data is correct and try again", "Error", 0);
					else {
						JOptionPane.showMessageDialog(panelCards, "Visitor Added Successfully.\n" + rental.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
						String vehicleString = VehicleContainer.getAllVehicles();
						
						if(vehicleString.isEmpty())
							vehicleString = "No Vehicles in the system";
						
						textPaneRent.setText(vehicleString);
					}
				}
			
				else if (e.getSource() == btnReturnVehicle) {
					if(initiateReturn()) 
						JOptionPane.showMessageDialog(panelCards, "Vehicle returned Successfully.\n", "Message", JOptionPane.INFORMATION_MESSAGE);
					else
						JOptionPane.showMessageDialog(panelCards, "Make sure data is correct and try again", "Error", 0);
				}
				
				else if (e.getSource() == btnViewSearch) {
					if(!searchVehicle())
						JOptionPane.showMessageDialog(panelCards, "Vehicle Does Not Exist", "Error", 0);
				}
					
				
			}
			
		}
		
		MenuControlListener controller = new MenuControlListener();
		ButtonControlListener buttonController = new ButtonControlListener();
		
		//Menu listeners
		mntmNewCar.addActionListener(controller);
		mntmNewBus.addActionListener(controller);
		mntmResident.addActionListener(controller);
		mntmVisitor.addActionListener(controller);
		mntmRent.addActionListener(controller);
		mntmReturn.addActionListener(controller);
		mntmInquireVehicle.addActionListener(controller);
		mntmViewAll.addActionListener(controller);
		
		
		
		//Button Listeners
		btnAddNewCar.addActionListener(buttonController);
		btnAddNewBus.addActionListener(buttonController);
		btnAddNewResident.addActionListener(buttonController);
		btnAddNewVisitor.addActionListener(buttonController);
		btnRent.addActionListener(buttonController);
		btnReturnVehicle.addActionListener(buttonController);
		btnViewSearch.addActionListener(buttonController);
		
		
		
	}
	
	//Validation------------------------------------------------------------------------------------------------------------------------------------------
	private  boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	private  boolean isInteger(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Integer.parseInt(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	
	/*
	 * private boolean NotEmpty(String strVal) { if (strVal == null || strVal ==
	 * " ") return false; return true; }
	 */
	
	
	//Implementation---------------------------------------------------------------------------------------------------------------------------------------
	private Car getNewCar() {
		
		int vNo, modelYear;
		double rate;
		String make,brand,model,body,engine,gear;
		
		if (isInteger(textFieldVehicleNumber.getText()) && isInteger(textFieldYear.getText()) && isNumeric(textFieldRate.getText())) {
			vNo = Integer.parseInt(textFieldVehicleNumber.getText());
			modelYear = Integer.parseInt(textFieldYear.getText());
			rate = Double.parseDouble(textFieldRate.getText());
			make = textFieldMake.getText();
			brand = textFieldBrand.getText();
			model = textFieldModel.getText();
			body = textFieldBodyType.getText();
			engine = textFieldEngineSize.getText();
			gear = textFieldGearType.getText();
			
			return new Car(vNo, make, brand, model, modelYear, true, rate, body, gear,engine);
			
		}
		
		 return null;			
		
	}
	
	private Bus getNewBus() {
		
		int vNo, modelYear, seats;
		double rate;
		String make,brand,model, nationality;
		
		if (isInteger(textFieldBusNumber.getText()) && isInteger(textFieldBusYear.getText()) && isNumeric(textFieldBusRate.getText()) && isInteger(textFieldBusSeats.getText())) {
			vNo = Integer.parseInt(textFieldBusNumber.getText());
			modelYear = Integer.parseInt(textFieldBusYear.getText());
			rate = Double.parseDouble(textFieldBusRate.getText());
			make = textFieldBusMake.getText();
			brand = textFieldBusBrand.getText();
			model = textFieldBusModel.getText();
			nationality = textFieldBusNationality.getText();
			seats = Integer.parseInt(textFieldBusSeats.getText());
			
			return new Bus(vNo, make, brand, model, modelYear, true, rate, seats, nationality);
			
		}
		
		 return null;			
		
	}
	
	
	private Resident getNewResident() {
		int cNo, tel,idCard;
		String name, address, nationality, bank;
		
		if(isInteger(textFieldResidentNo.getText()) && isInteger(textFieldResidentIdCard.getText()) && isInteger(textFieldResidentTel.getText())) {
			cNo = Integer.parseInt(textFieldResidentNo.getText());
			tel = Integer.parseInt(textFieldResidentTel.getText());
			idCard = Integer.parseInt(textFieldResidentIdCard.getText());
			name = textFieldResidentName.getText();
			address = textFieldResidentAddress.getText();
			nationality = textFieldResidentNat.getText();
			bank = textFieldResidentBank.getText();
			
			return new Resident (cNo, name, tel, address, nationality, idCard, bank);
		}
		
		return null;
	}
	
	private Vistor getNewVisitor() {
		int cNo, tel,start, end;
		String name, address, nationality, passport;
		
		if(isInteger(textFieldVisitorNo.getText()) && isInteger(textFieldVisitorStart.getText()) && isInteger(textFieldVisitorEnd.getText()) && isInteger(textFieldVisitorTel.getText())) {
			cNo = Integer.parseInt(textFieldVisitorNo.getText());
			tel = Integer.parseInt(textFieldVisitorTel.getText());
			start = Integer.parseInt(textFieldVisitorStart.getText());
			end = Integer.parseInt(textFieldVisitorEnd.getText());
			name = textFieldVisitorName.getText();
			address = textFieldVisitorAddress.getText();
			nationality = textFieldVisitorNat.getText();
			passport = textFieldVisitorPass.getText();
			
			return new Vistor (cNo, name, tel, address, nationality, passport, start, end);
		}
		
		return null;
	}
	
	private Rental createRental() {
		
		if (isInteger(textFieldRentDays.getText()) && isInteger(textFieldRentCId.getText()) && isInteger(textFieldRentalVNum.getText())) {
		
		Customer customer = CustomerContainer.getCustomerByID(Integer.parseInt(textFieldRentCId.getText()));
		Vehicle vehicle = VehicleContainer.getVehicleByID(Integer.parseInt(textFieldRentalVNum.getText()));
		int days = Integer.parseInt(textFieldRentDays.getText());
		
		
		
		if (customer == null || vehicle == null)
			return null;
		
		if(!isRentValid(customer, vehicle))
			return null;
		
		Rental rental = new Rental (days, vehicle.getVehicleNo());
		customer.addRental(rental);
		
		if (customer instanceof Vistor) {
			Payment payment = new Payment (vehicle.getCharges(days), 15000);
			customer.addPayment(payment);
			System.out.println("Payment Reciept:\n" + payment);
		}
		
		Customer.editCustomer(customer);
		Vehicle.makeUnavailable(vehicle.getVehicleNo());
		
		System.out.println("\nCustomer:\n" + customer + "\n\nRental:\n" + rental + "\n\nPayment:\n");
		
		
		
		
		return rental;
		}
		
		return null;
	}
	
	private  boolean initiateReturn() {
		
		if(isInteger(textFieldReturnCustNum.getText()) && isInteger(textFieldReturnVNum.getText()) && isInteger(textFieldReturnVDamage.getText())) {
			
			Customer customer = CustomerContainer.getCustomerByID(Integer.parseInt(textFieldReturnCustNum.getText()));
			if (customer == null)
				return false;
			
			Vehicle vehicle = VehicleContainer.getVehicleByID(Integer.parseInt(textFieldReturnVNum.getText()));
			if (vehicle == null)
				return false;
			
			int damage = Integer.parseInt(textFieldReturnVDamage.getText());
			
			customer.returnVehichle(vehicle.getVehicleNo(), damage);
			
			if(customer instanceof Vistor) {
				customer.deductFromLastPayment(vehicle.getVehicleNo());
			}
			
			else {
				Payment payment = new Payment(customer.getRental(vehicle.getVehicleNo()).getDamageDeduction() + customer.getRental(vehicle.getVehicleNo()).getLatenessDeduction() + Vehicle.findVehicle(vehicle.getVehicleNo()).getCharges(customer.getRental(vehicle.getVehicleNo()).getNumberOfDays()));
				customer.addPayment(payment);
			}
			
			Customer.editCustomer(customer);
			return true;
		}
		
		return false;
	}
	
	private boolean searchVehicle() {
		
		if (isInteger(textFieldViewID.getText())) {
			Vehicle vehicle = VehicleContainer.getVehicleByID(Integer.parseInt(textFieldViewID.getText()));
			
			if(vehicle instanceof Bus || vehicle instanceof Car) {
				
					textFieldViewMake.setText(vehicle.getMake());
					textFieldViewBrand.setText(vehicle.getBrand());
					textFieldViewModel.setText(vehicle.getModel());
					textFieldViewYear.setText(String.valueOf(vehicle.getModelYear()));
					textFieldViewRate.setText(String.valueOf(vehicle.getDailyRate()));
					if (vehicle.isAvailable())
						textFieldViewAvailable.setText("Available");
					else
						textFieldViewAvailable.setText("Rented");
					
					
				if(vehicle instanceof Car) {
					
					Car car = (Car) vehicle;
					
					textFieldViewVehicleType.setText("Car");
					
					textFieldViewBody.setText(((Car) vehicle).getBodyType());
					textFieldViewEType.setText(((Car) vehicle).getGearType());
					textFieldViewESize.setText(((Car) vehicle).getEngineSize());
					
					textFieldViewDriver.setText("N/A");
					textFieldViewSeats.setText("N/A");
					
					return true;
				}
				
				else if (vehicle instanceof Bus) {
					
					textFieldViewVehicleType.setText("Bus");
					
					textFieldViewDriver.setText(((Bus) vehicle).getDriversNationality());
					textFieldViewSeats.setText(String.valueOf(((Bus) vehicle).getNumberOfSeats()));
					
					textFieldViewBody.setText("N/A");
					textFieldViewEType.setText("N/A");
					textFieldViewESize.setText("N/A");
					
					return true;
				}
				
			}
		}
		
		return false;
	}
	
	

	
	//utility-----------------------------------------------------------------------------------------------------------------------------------------------
	
	private void clearTextFields() {
		
	}
	
	private  boolean isRentValid(Customer customer, Vehicle vehicle) {
		
		if(customer instanceof Vistor && vehicle instanceof Car && vehicle.isAvailable())
			return true;
		if(customer instanceof Resident && vehicle.isAvailable())
			return true;
			
		return false;
	}
}
