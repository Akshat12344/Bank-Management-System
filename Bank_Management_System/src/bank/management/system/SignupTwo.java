package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;


public class SignupTwo extends JFrame implements ActionListener{
	
	JComboBox religion, category, income, education, occupation;
	JTextField pan, aadhar;
	JButton next;
	JRadioButton syes, sno, eyes, eno;
	long random;
	
	SignupTwo(String formno){
		setLayout(null);
		
		
		Random ran = new Random();
		random = Math.abs((ran.nextLong() % 9000L)+ 1000L);
		
		JLabel additionalDetails = new JLabel("Page 2: Additional Details");
		additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
		additionalDetails.setBounds(290, 80, 400, 30);
		add(additionalDetails);
		
		JLabel name = new JLabel("Religion:");
		name.setFont(new Font("Raleway", Font.BOLD, 20));
		name.setBounds(100, 140, 100, 30);
		add(name);
		
		String valreligion[] = {"Hindu","Muslim","Sikh","Christain","Other"};
		religion = new JComboBox(valreligion);
		religion.setBounds(300, 140, 400, 30);
		religion.setBackground(Color.white);	
		add(religion);
		
		JLabel fname = new JLabel("Category:");
		fname.setFont(new Font("Raleway", Font.BOLD, 22));
		fname.setBounds(100, 190, 200, 30);
		add(fname);
		
		String valcategory[] = {"General","SC","ST","BC","Other"};
		category = new JComboBox(valcategory);
		category.setBounds(300, 190, 400, 30);
		category.setBackground(Color.white);
		add(category);
		
		JLabel dob = new JLabel("Income:");
		dob.setFont(new Font("Raleway", Font.BOLD, 20));
		dob.setBounds(100, 240, 200, 30);
		add(dob);
		
        String incomecategory[] = {"<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.white);
		add(income);
		
		JLabel gender = new JLabel("Educational");
		gender.setFont(new Font("Raleway", Font.BOLD, 20));
		gender.setBounds(100, 310, 200, 30);
		add(gender);
		
		JLabel email = new JLabel("Qualification:");
		email.setFont(new Font("Raleway", Font.BOLD, 20));
		email.setBounds(100, 340, 200, 30);
		add(email);
		
		String educationalvalues[] = {"Non-Graduate","Graduated","Post-Graduation","Doctorate","Others"};
		education = new JComboBox(educationalvalues);
		education.setBounds(300, 340, 400, 30);
		education.setBackground(Color.white);
		add(education);
		
		JLabel marital = new JLabel("Occupation:");
		marital.setFont(new Font("Raleway", Font.BOLD, 20));
		marital.setBounds(100, 390, 200, 30);
		add(marital);
		
		String occupationalvalues[] = {"Salaried", "Self-Employed", "Bussiness", "Student", "Other"};		
		occupation = new JComboBox(occupationalvalues);
		occupation.setBounds(300, 390, 400, 30);
		occupation.setBackground(Color.white);
		add(occupation);
		
		JLabel address = new JLabel("PAN Number:");
		address.setFont(new Font("Raleway", Font.BOLD, 20));
		address.setBounds(100, 440, 200, 30);
		add(address);
		
		pan = new JTextField();
		pan.setFont(new Font("Raleways", Font.BOLD, 14));
		pan.setBounds(300, 440, 400, 30);
		pan.setBackground(Color.white);
		add(pan);
		
		JLabel city = new JLabel("Aadhar Number:");
		city.setFont(new Font("Raleway", Font.BOLD, 20));
		city.setBounds(100, 490, 200, 30);
		add(city);
		
		aadhar = new JTextField();
		aadhar.setFont(new Font("Raleways", Font.BOLD, 14));
		aadhar.setBounds(300, 490, 400, 30);
		aadhar.setBackground(Color.white);
		add(aadhar);
		
		JLabel state = new JLabel("Senior Citizen:");
		state.setFont(new Font("Raleway", Font.BOLD, 20));
		state.setBounds(100, 540, 200, 30);
		add(state);
		
		syes = new JRadioButton("Yes");
		syes.setFont(new Font("Raleways", Font.BOLD, 14));
		syes.setBounds(300, 540, 60, 30);
		syes.setBackground(Color.white);
		add(syes);
		
		sno = new JRadioButton("No");
		sno.setFont(new Font("Raleways", Font.BOLD, 14));
		sno.setBounds(450, 540, 70, 30);
		sno.setBackground(Color.white);
		add(sno);
		
		ButtonGroup seniorgroup = new ButtonGroup();
		seniorgroup.add(syes);
		seniorgroup.add(sno);

		JLabel pincode = new JLabel("Existing User:");
		pincode.setFont(new Font("Raleway", Font.BOLD, 20));
		pincode.setBounds(100, 590, 200, 30);
		add(pincode);
		
		eyes = new JRadioButton("Yes");
		eyes.setFont(new Font("Raleways", Font.BOLD, 14));
		eyes.setBounds(300, 590, 60, 30);
		eyes.setBackground(Color.white);
		add(eyes);
		
		eno = new JRadioButton("No");
		eno.setFont(new Font("Raleways", Font.BOLD, 14));
		eno.setBounds(450, 590, 70, 30);
		eno.setBackground(Color.white);
		add(eno);
		
		ButtonGroup eseniorgroup = new ButtonGroup();
		eseniorgroup.add(eyes);
		eseniorgroup.add(eno);
		
		next = new JButton("Next");
		next.setBackground(Color.black);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway", Font.BOLD, 14));
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this);
		add(next);
		
		
		getContentPane().setBackground(Color.white);
		
		setSize(900, 850);
		setLocation(500, 10);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String formno = ""+random;
		String sreligion = (String) religion.getSelectedItem();
		String scategory = (String) category.getSelectedItem();
		String sincome = (String) income.getSelectedItem();
		String seducation = (String) education.getSelectedItem();
		String soccupation = (String) occupation.getSelectedItem();
		String seniorcitizen = null;
		if(syes.isSelected()) {
			seniorcitizen ="Yes";
		}else if (sno.isSelected()) {
			seniorcitizen ="No";
		}
		
		String existingaccount =null;
		if (eyes.isSelected()) {
			existingaccount = "Yes";
		}else if (eno.isSelected()) {
			existingaccount = "No";
		}
		String span =pan.getText();
		String saadhar=aadhar.getText();
		
		try {
			Conn c = new Conn();
			String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
			c.s.executeUpdate(query);

			setVisible(false);
			new SignupThree(formno).setVisible(true);
			}catch (Exception e) {
					System.out.println(e);
			}
	}
	

	public static void main(String[] args) {
		new SignupTwo("");

	}

}
