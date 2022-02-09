package myproject;

import java.io.Serializable;
import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;

/**
 *
 * @author Abdelaziz
 */
public class MyException extends Exception implements Serializable {

    public MyException() {
        super();
    }

    public MyException(String s) {
        super(s);
    }

    @Override
    public String toString() {
        return "My Exception";
    }

    public String checkPositive(String x) {
        int number=Integer.parseInt(x);
       
        do {
            
            if (number < 0) {
                JOptionPane.showMessageDialog(null, "Not valid Input for Positive Int... Try Again ");
                number = Integer.parseInt(JOptionPane.showInputDialog("Enter a Positive Number"));
            }
        } while (number <= 0);

        return Integer.toString(number);
    }

    public String checkEmail(String x,String p) {
        String email = x;
        

        do { if (!email.contains("@") || !email.contains(".")) {
                JOptionPane.showMessageDialog(null, "Not valid Input for Email Try Again ");
                    
               email = JOptionPane.showInputDialog("Enter Valid input for " + p + " !");
        
        
        }
        } while (!email.contains("@") || !email.contains("."));
        return email;
    }
    
    public String checkPassLength(String x,String p) {
        String pass = x;

        do {    if (pass.length() < 8) {
                JOptionPane.showMessageDialog(null, "Not valid Password length Try Again ");

            pass = JOptionPane.showInputDialog("Enter more than 8 char for " + p + " !");
        }
        } while (pass.length() < 8);

        return pass;
    }
    
    
    
    public String ISnumeric(String p,String x)
    {
        int number=0;

            boolean b=true;
        
        try
            {
           number = Integer.parseInt(p);
           b=true;
           }
            catch (NumberFormatException e) 
            {
            b=false;
                System.out.println(e); 
        }
        if(!b){
        do
        {   
            try
            {
           number=Integer.parseInt(JOptionPane.showInputDialog("Enter a numeric value for" + x ));
           b=true;
           }
            catch (NumberFormatException e) 
            {
            b=false;
             
        }
        }
        while(b==false);
            
       return Integer.toString(number);
        
    }
        else 
            return Integer.toString(number);
    }
}
