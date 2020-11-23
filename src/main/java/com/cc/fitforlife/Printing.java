package com.cc.fitforlife;

import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.print.*;

public class Printing implements Printable, ActionListener {
 
	String customerName, address1,address2,type,duration;
	int age;
	boolean family;
	double cost, monthlyCost;
 
	public Printing(String Customer,String Address1,String Address2,String Type, String Duration,int Age,double Cost,double MonthlyCost,boolean Family)
	{
		customerName = Customer;
		address1 = Address1;
		address2 = Address2;
		type = Type;
		duration = Duration;
		cost = Cost;
		monthlyCost = MonthlyCost;
		age= Age;
		family = Family;
	}
	
    public int print(Graphics g, PageFormat pf, int page) throws
                                                        PrinterException {
 
        if (page > 0) { /* We have only one page, and 'page' is zero-based */
            return NO_SUCH_PAGE;
        }
 
        /* User (0,0) is typically outside the imageable area, so we must
         * translate by the X and Y values in the PageFormat to avoid clipping
         */
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());
 
        /* Now we perform our rendering */
        g.drawString("Fit for Life" , 100, 100);
        g.drawString("Customer Name: "+customerName , 100, 130);
        g.drawString("Age: "+age , 400, 130);
        g.drawString("Address: "+address1+", " +address2 , 100, 160);
        g.drawString("Type: "+type , 100, 190);
        g.drawString("Duration: "+duration , 250, 190);
        g.drawString("Family: "+family , 400, 190);
        g.drawString(String.format("Membership Fee: £%.2f",cost) , 100, 220);
        g.drawString(String.format("Monthly Cost: £%.2f",monthlyCost) , 400, 220);
 
        /* tell the caller that this page is part of the printed document */
        return PAGE_EXISTS;
    }
 
    public void actionPerformed(ActionEvent e) {
         PrinterJob job = PrinterJob.getPrinterJob();
         job.setPrintable(this);
         boolean ok = job.printDialog();
         if (ok) {
             try {
                  job.print();
             } catch (PrinterException ex) {
              /* The job did not successfully complete */
             }
         }
    }

}
