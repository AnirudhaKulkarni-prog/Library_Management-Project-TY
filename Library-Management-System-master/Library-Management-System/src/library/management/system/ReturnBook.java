package library.management.system;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

public class ReturnBook extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JButton b1,b2,b3;
    private JDateChooser dateChooser;

    String name1;
	String isbn1;
	String publisher1;
	String edition1;
	String price1;
	String pages1 ;
	 String checkDOR;
    public static void main(String[] args) {
	new ReturnBook().setVisible(true);
    }

    

    
    public ReturnBook() {
        setBounds(450, 300, 617, 363);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);
	Calendar cal = Calendar.getInstance();
	JLabel lblNewLabel = new JLabel("Book_id");
	lblNewLabel.setForeground(new Color(0, 0, 0));
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblNewLabel.setBounds(52, 52, 87, 24);
	contentPane.add(lblNewLabel);

	JLabel lblStudentid = new JLabel("Student_id");
	lblStudentid.setForeground(Color.BLACK);
	lblStudentid.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblStudentid.setBounds(243, 52, 87, 24);
	contentPane.add(lblStudentid);

	JLabel lblBook = new JLabel("Book");
	lblBook.setForeground(Color.BLACK);
	lblBook.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblBook.setBounds(52, 98, 71, 24);
	contentPane.add(lblBook);

	JLabel lblName = new JLabel("Name");
	lblName.setForeground(Color.BLACK);
	lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblName.setBounds(300, 98, 71, 24);
	contentPane.add(lblName);

        JLabel lblCourse = new JLabel("Course");
	lblCourse.setForeground(Color.BLACK);
	lblCourse.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblCourse.setBounds(52, 143, 87, 24);
	contentPane.add(lblCourse);

        JLabel lblBranch = new JLabel("Branch");
	lblBranch.setForeground(Color.BLACK);
	lblBranch.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblBranch.setBounds(303, 144, 68, 24);
	contentPane.add(lblBranch);

	JLabel lblDateOfIssue = new JLabel("Date of Issue");
	lblDateOfIssue.setForeground(Color.BLACK);
	lblDateOfIssue.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblDateOfIssue.setBounds(52, 188, 105, 29);
	contentPane.add(lblDateOfIssue);

	JLabel lblDateOfReturn = new JLabel("Date of Return");
	lblDateOfReturn.setForeground(Color.BLACK);
	lblDateOfReturn.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblDateOfReturn.setBounds(52, 234, 118, 29);
	contentPane.add(lblDateOfReturn);
	
	JLabel lblTodayDate = new JLabel("Today's Date");
	lblTodayDate.setForeground(Color.BLACK);
	lblTodayDate.setFont(new Font("Tahoma", Font.BOLD, 14));
	lblTodayDate.setBounds(52, 280, 105, 29);
	contentPane.add(lblTodayDate);

        textField = new JTextField();
	textField.setForeground(new Color(105, 105, 105));
	textField.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	textField.setBounds(128, 56, 105, 20);
	contentPane.add(textField);
	textField.setColumns(10);

	textField_1 = new JTextField();
	textField_1.setForeground(new Color(105, 105, 105));
	textField_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	textField_1.setBounds(340, 56, 93, 20);
	contentPane.add(textField_1);
	textField_1.setColumns(10);

	b1 = new JButton("Search");
	b1.addActionListener(this);
	b1.setBounds(443, 52, 105, 29);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
	contentPane.add(b1);

	textField_2 = new JTextField();
	textField_2.setEditable(false);
	textField_2.setForeground(new Color(0, 100, 0));
	textField_2.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_2.setBounds(128, 102, 162, 20);
	contentPane.add(textField_2);
	textField_2.setColumns(10);

	textField_3 = new JTextField();
	textField_3.setEditable(false);
	textField_3.setForeground(new Color(0, 100, 0));
	textField_3.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_3.setColumns(10);
	textField_3.setBounds(369, 102, 179, 20);
	contentPane.add(textField_3);

        textField_4 = new JTextField();
	textField_4.setEditable(false);
	textField_4.setForeground(new Color(0, 100, 0));
	textField_4.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_4.setColumns(10);
	textField_4.setBounds(128, 147, 162, 20);
	contentPane.add(textField_4);

	textField_5 = new JTextField();
	textField_5.setForeground(new Color(0, 100, 0));
	textField_5.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_5.setEditable(false);
	textField_5.setColumns(10);
	textField_5.setBounds(369, 147, 179, 20);
	contentPane.add(textField_5);

	textField_6 = new JTextField();
	textField_6.setForeground(new Color(0, 100, 0));
	textField_6.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_6.setEditable(false);
	textField_6.setColumns(10);
	textField_6.setBounds(167, 194, 162, 20);
	contentPane.add(textField_6);
	
	textField_7 = new JTextField();
	textField_7.setForeground(new Color(0, 100, 0));
	textField_7.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_7.setEditable(false);
	textField_7.setColumns(10);
	textField_7.setBounds(167, 234, 162, 20);
	contentPane.add(textField_7);
	
	textField_8 = new JTextField();
	textField_8.setForeground(new Color(0, 100, 0));
	textField_8.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
	textField_8.setEditable(false);
	textField_8.setColumns(10);
	textField_8.setBounds(167, 280, 172, 29);
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	textField_8.setText(sdf.format(cal.getTime()));
	contentPane.add(textField_8);
	
	
	

	/*dateChooser = new JDateChooser();
	dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
	dateChooser.setBounds(167, 234, 172, 29);
	contentPane.add(dateChooser);*/

	b2 = new JButton("Return");
	b2.addActionListener(this);
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b2.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
	b2.setBounds(369, 179, 149, 30);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

	contentPane.add(b2);

	b3 = new JButton("Back");
	b3.addActionListener(this);
	b3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
	b3.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
	b3.setBounds(369, 231, 149, 30);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
	contentPane.add(b3);

	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 69, 0), 2, true), "Return-Panel",
			TitledBorder.LEADING, TitledBorder.TOP, null, new Color(220, 20, 60)));
	panel.setBounds(10, 24, 569, 300);
        panel.setBackground(Color.WHITE);
	contentPane.add(panel);
    }
    public void delete(String catchDOR) {
        try {
            conn con = new conn();
            String sql = "delete from issueBook where book_id=?";
            PreparedStatement st = con.c.prepareStatement(sql);
            st.setString(1, textField.getText());
            int i = st.executeUpdate();
            if (i > 0)
            {
            	
            	
            	String DOI = textField_6.getText();
                String DOR = textField_7.getText();
                //String DOR = "2020/11/29";
            	 SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
            	 
               
                 try {

                     Date dateIssue = formatter.parse(DOI);
                     Date dateReturn1 = formatter.parse(DOR);
                     Date catchdor = formatter.parse(checkDOR);
                  // long diff = dateIssue.getTime()-dateReturn1.getTime();
                   
                  // long sec = diff / 1000 % 60;
                  /// long min = diff/ (60*1000) % 60;
                  // long hours = diff / (60*60*1000);
                  // long days = hours/24;
                   
                  // System.out.println(days);
                   if(dateReturn1.after(catchdor))         //check if date is passed or not !!!!!!!! IMP for Pay fine
                   {
                	   JOptionPane.showMessageDialog(null, "Overdue : Pay Fine");
                	   
                   }
                   else
                   {
                	   JOptionPane.showMessageDialog(null, "In Due");
                	   JOptionPane.showConfirmDialog(null, "Book Returned");
                	   try {
                   		String sql1 = "select * from track_book where book_id =?";
                           PreparedStatement st1 = con.c.prepareStatement(sql1);
                           st1.setString(1, textField.getText());
                           ResultSet rs = st1.executeQuery();
                           
                           while (rs.next()) {
                           	 name1 = rs.getString(2);
                                isbn1 = rs.getString(3);
                           	 publisher1 = rs.getString(4);
                           	 edition1 = rs.getString(5);
                                price1 = rs.getString(6);
                           	 pages1 = rs.getString(7);
                              // st1.setText(rs.getString("name"));
                              // t10.setText(rs.getString("father"));
                              // t11.setText(rs.getString("course"));
                              // t12.setText(rs.getString("branch"));
                             //  t13.setText(rs.getString("year"));
                             //  t14.setText(rs.getString("semester"));
           		}
                           String sql3 = "insert into book(book_id, name, isbn, publisher,edition, price, pages) values(?, ?, ?, ?, ?, ?, ?)";
                   		PreparedStatement st3 = con.c.prepareStatement(sql3);
                   		st3.setString(1, textField.getText());
                   		st3.setString(2, name1);
                   		st3.setString(3, isbn1);
                   		st3.setString(4, publisher1);
                   		st3.setString(5, edition1);
                   		st3.setString(6, price1);
                   		st3.setString(7, pages1); 
                   		int l = st3.executeUpdate();
                   		System.out.println("Ok Jhala "+ l);
                   	}catch(Exception e){
                           System.out.println("select from trck_book error or null eoor");
                       }
                       
                       try {
                       	String sql4 = "delete from track_book where book_id=?";
                           PreparedStatement st4 = con.c.prepareStatement(sql4);
                           st4.setString(1, textField.getText());
                           int m = st4.executeUpdate();
                       }catch(Exception e) {
                       	 System.out.println(e);
                       }
                   }
                   
                 } catch (ParseException e) {
                     e.printStackTrace();
                 }
            	
            	
            	
            	
                
            }
                
            else
                JOptionPane.showMessageDialog(null, "error in Return Book");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
	}
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            conn con = new conn();
            if(ae.getSource() == b1){
                String sql = "select * from issueBook where student_id = ? and book_id =?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, textField_1.getText());
		st.setString(2, textField.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    textField_2.setText(rs.getString("bname"));
                    textField_3.setText(rs.getString("sname"));
                    textField_4.setText(rs.getString("course"));
                    textField_5.setText(rs.getString("branch"));
                    textField_6.setText(rs.getString("dateOfIssue"));
                    textField_7.setText(rs.getString("dateOfReturn"));
                     checkDOR = rs.getString("dateOfReturn");
                    
		}
		st.close();
		rs.close();
		
            }
            if(ae.getSource() == b2){
                String sql = "insert into returnBook(book_id, student_id, bname, sname,course, branch, dateOfIssue, dateOfReturn) values(?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, textField.getText());
		st.setString(2, textField_1.getText());
		st.setString(3, textField_2.getText());
		st.setString(4, textField_3.getText());
		st.setString(5, textField_4.getText());
		st.setString(6, textField_5.getText());
		st.setString(7, textField_6.getText());
        st.setString(8, textField_7.getText());
		int i = st.executeUpdate();
		if (i > 0) {
                    JOptionPane.showMessageDialog(null, "Processing..");
                    delete(checkDOR);
		} else
                    JOptionPane.showMessageDialog(null, "error");
		
            }
            if(ae.getSource() == b3){
                this.setVisible(false);
		new Home().setVisible(true);
			
            }
        }catch(Exception e){
            
        }
    }
}
