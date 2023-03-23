

package university.mangement.system;
import java.awt.*;
import javax.swing.*;
import java.sql.ResultSet;
import java.awt.event.*;

public class Marks extends JFrame implements ActionListener {
    
    String rollno;
    JButton cancel;
    
    Marks(String rollno) {
        this.rollno = rollno;
        
        setSize(500, 600);
        setLocation(500, 100);
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        JLabel heading = new JLabel("Bangalore University");
        heading.setBounds(120, 10, 500, 25);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading.setForeground(Color.red);
        add(heading);
        
      /*   JLabel heading1 = new JLabel("a");
        heading1.setBounds(133, 10, 500, 25);
        heading1.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading1.setForeground(Color.pink);
        add(heading1);
        
        JLabel heading2 = new JLabel("n");
        heading2.setBounds(146, 10, 500, 25);
        heading2.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading2.setForeground(Color.yellow);
        add(heading2);
        
        JLabel heading3 = new JLabel("g");
        heading3.setBounds(159, 10, 500, 25);
        heading3.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading3.setForeground(Color.green);
        add(heading3);
        
         JLabel heading4 = new JLabel("a");
        heading4.setBounds(172, 10, 500, 25);
        heading4.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading4.setForeground(Color.orange);
        add(heading4);
        
        JLabel heading5 = new JLabel("l");
        heading5.setBounds(185, 10, 500, 25);
        heading5.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading5.setForeground(Color.yellow);
        add(heading5);
        
        JLabel heading6 = new JLabel("o");
        heading6.setBounds(190, 10, 500, 25);
        heading6.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading6.setForeground(Color.black);
        add(heading6);
        
         JLabel heading7 = new JLabel("r");
        heading7.setBounds(203, 10, 500, 25);
        heading7.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading7.setForeground(Color.blue);
        add(heading7);
        
        JLabel heading8 = new JLabel("e");
        heading8.setBounds(216, 10, 500, 25);
        heading8.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading8.setForeground(Color.yellow);
        add(heading8);
        
        JLabel heading9 = new JLabel("U");
        heading9.setBounds(242, 10, 500, 25);
        heading9.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading9.setForeground(Color.red);
        add(heading9);
        
         JLabel heading10 = new JLabel("n");
        heading10.setBounds(255, 10, 500, 25);
        heading10.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading10.setForeground(Color.pink);
        add(heading10);
        
        JLabel heading11 = new JLabel("i");
        heading11.setBounds(268, 10, 500, 25);
        heading11.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading11.setForeground(Color.green);
        add(heading11);
        
        JLabel heading12 = new JLabel("v");
        heading12.setBounds(275, 10, 500, 25);
        heading12.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading12.setForeground(Color.black);
        add(heading12);
        
        JLabel heading13 = new JLabel("e");
        heading13.setBounds(282, 10, 500, 25);
        heading13.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading13.setForeground(Color.green);
        add(heading13);
        
         JLabel heading14 = new JLabel("r");
        heading14.setBounds(295, 10, 500, 25);
        heading14.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading14.setForeground(Color.yellow);
        add(heading14);
        
        JLabel heading15 = new JLabel("s");
        heading15.setBounds(308, 10, 500, 25);
        heading15.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading15.setForeground(Color.orange);
        add(heading15);
        
        JLabel heading16 = new JLabel("i");
        heading16.setBounds(321, 10, 500, 25);
        heading16.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading16.setForeground(Color.red);
        add(heading16);
        
         JLabel heading17 = new JLabel("t");
        heading17.setBounds(330, 10, 500, 25);
        heading17.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading17.setForeground(Color.pink);
        add(heading17);
        
        JLabel heading18 = new JLabel("y");
        heading18.setBounds(343, 10, 500, 25);
        heading18.setFont(new Font("Tahoma", Font.BOLD, 20));
        heading18.setForeground(Color.yellow);
        add(heading18);*/
        
        
        JLabel subheading = new JLabel("Result of Examination 2022");
        subheading.setBounds(100, 50, 500, 20);
        subheading.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(subheading);
        
        JLabel lblrollno = new JLabel("Roll Number " + rollno);
        lblrollno.setBounds(60, 100, 500, 20);
        lblrollno.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblrollno);
        
        JLabel lblsemester = new JLabel();
        lblsemester.setBounds(60, 130, 500, 20);
        lblsemester.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblsemester);
        
        JLabel sub1 = new JLabel();
        sub1.setBounds(100, 200, 500, 20);
        sub1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub1);
        
        JLabel sub2 = new JLabel();
        sub2.setBounds(100, 230, 500, 20);
        sub2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub2);
        
        JLabel sub3 = new JLabel();
        sub3.setBounds(100, 260, 500, 20);
        sub3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub3);
        
        JLabel sub4 = new JLabel();
        sub4.setBounds(100, 290, 500, 20);
        sub4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub4);
        
        JLabel sub5 = new JLabel();
        sub5.setBounds(100, 320, 500, 20);
        sub5.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub5);
        
        try {
            Conn c = new Conn();
            
            ResultSet rs1 = c.s.executeQuery("select * from subject where rollno = '"+rollno+"'");
            while(rs1.next()) {
                sub1.setText(rs1.getString("subject1"));
                sub2.setText(rs1.getString("subject2"));
                sub3.setText(rs1.getString("subject3"));
                sub4.setText(rs1.getString("subject4"));
                sub5.setText(rs1.getString("subject5"));
            }
            
            ResultSet rs2 = c.s.executeQuery("select * from marks where rollno = '"+rollno+"'");
            while(rs2.next()) {
                sub1.setText(sub1.getText() + "------------" + rs2.getString("marks1"));
                sub2.setText(sub2.getText() + "------------" + rs2.getString("marks2"));
                sub3.setText(sub3.getText() + "------------" + rs2.getString("marks3"));
                sub4.setText(sub4.getText() + "------------" + rs2.getString("marks4"));
                sub5.setText(sub5.getText() + "------------" + rs2.getString("marks5"));
                lblsemester.setText("Semester " + rs2.getString("semester"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        cancel = new JButton("Back");
        cancel.setBounds(250, 500, 120, 25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }
    
    public static void main(String[] args) {
        new Marks("");
    }
}