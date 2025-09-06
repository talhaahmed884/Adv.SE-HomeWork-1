package com.cpp.homeWork1.interfaces;

import java.util.ArrayList;

public class InterfaceDriver {
    public static void main(String[] args) {
        Freelancer freelancerOne = new Freelancer("Mark", "Cuban", 15.67, 41);

        Freelancer freelancerTwo = new Freelancer();
        freelancerTwo.setFirstName("Harry");
        freelancerTwo.setLastName("Potter");
        freelancerTwo.setHourlyRate(25.24);
        freelancerTwo.setHoursWorked(25.5);

        Freelancer freelancerThree = new Freelancer("Emily", "Calvin", 31.35, 40);

        VendorInvoice vendorInvoiceOne = new VendorInvoice("Henry Cavil", "452", 1992.23);

        VendorInvoice vendorInvoiceTwo = new VendorInvoice();
        vendorInvoiceTwo.setVendorName("Christopher Columbus");
        vendorInvoiceTwo.setInvoiceNumber("834");
        vendorInvoiceTwo.setDueAmount(1834.134);

        VendorInvoice vendorInvoiceThree = new VendorInvoice("Samsung", "862", 193472.197);

        ArrayList<Payable> payables = new ArrayList<>();
        payables.add(freelancerOne);
        payables.add(freelancerTwo);
        payables.add(freelancerThree);
        payables.add(vendorInvoiceOne);
        payables.add(vendorInvoiceTwo);
        payables.add(vendorInvoiceThree);

        double calculatedPayment = 0.0;

        for (Payable payable : payables) {
            calculatedPayment += payable.calculatePayment();
            if (payable instanceof Freelancer freelancer) {
                freelancer.print();
            } else if (payable instanceof VendorInvoice vendorInvoice) {
                vendorInvoice.print();
            } else {
                throw new IllegalArgumentException("Invalid payable");
            }

            System.out.println();
        }
        System.out.println("Total Payment: " + calculatedPayment);
    }
}
