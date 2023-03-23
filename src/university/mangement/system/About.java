
package university.mangement.system;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/prajwal.jpg"));
        Image i2 = i1.getImage().getScaledInstance(180, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 300, 200);
        add(image);
        
        JLabel heading = new JLabel("<html>University<br/>Management System</html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
        heading.setForeground(Color.orange);
        add(heading);
        
        JLabel name = new JLabel("Developed By: Prajwal A U");
        name.setBounds(70, 180, 550, 40);
        name.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(name);
        
        JLabel rollno = new JLabel("Roll number: 15436017");
        rollno.setBounds(70, 230, 550, 40);
        rollno.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(rollno);
        
        JLabel contact = new JLabel("Contact: prajwalprajju772558@gmail.com");
        contact.setBounds(70, 280, 550, 40);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(contact);
        
        JLabel qualification = new JLabel("Qualification: Bsc(CS)");
        qualification.setBounds(70, 330, 550, 40);
        qualification.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(qualification);
        
        JLabel phone = new JLabel("Phone: 7483981113");
        phone.setBounds(70, 380, 550, 40);
        phone.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(phone);
        
        
        setLayout(null);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new About();
    }
}