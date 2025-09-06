package com.cpp.homeWork1.interfaces;

/**
 * A VendorInvoice class to represent the Vendor name, Invoice number, and amount due on a vendor invoice. It implements
 * Payable interface to calculate the payment and return the name of the Payee (vendor).
 */
public class VendorInvoice implements Payable {
    private String vendorName;
    private String invoiceNumber;
    private double dueAmount;

    /**
     * no-argument constructor of the VendorInvoice class.
     */
    public VendorInvoice() {
        this.vendorName = "";
        this.invoiceNumber = "";
        this.dueAmount = 0.0;
    }

    /**
     * constructor with all the arguments to initialize and assign values to the variables of the class.
     *
     * @param vendorName, invoiceNumber, and dueAmount on a vendor invoice.
     * @throws IllegalArgumentException if the due amount value is negative.
     */
    public VendorInvoice(String vendorName, String invoiceNumber, double dueAmount) {
        this.vendorName = vendorName;
        this.invoiceNumber = invoiceNumber;
        /*
         throws an IllegalArgumentException if the due amount value is negative.
         */
        this.setDueAmount(dueAmount);
    }

    /**
     * getter method to return the vendor name on a vendor invoice.
     *
     * @return vendorName on a vendor invoice.
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * setter method to set the vendor name on a vendor invoice.
     *
     * @param vendorName on a vendor invoice.
     */
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    /**
     * getter method to return the invoice number on a vendor invoice.
     *
     * @return invoiceNumber on a vendor invoice.
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * setter method to set the invoice number on a vendor invoice.
     *
     * @param invoiceNumber on a vendor invoice.
     */
    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    /**
     * getter method to return the due amount on a vendor invoice.
     *
     * @return dueAmount on a vendor invoice.
     */
    public double getDueAmount() {
        return this.dueAmount;
    }

    /**
     * setter method to set the due amount on a vendor invoice.
     *
     * @param dueAmount on a vendor invoice.
     * @throws IllegalArgumentException if the due amount value is negative.
     */
    public void setDueAmount(double dueAmount) {
        if (dueAmount < 0.0) {
            throw new IllegalArgumentException("Due amount value cannot be negative");
        }
        this.dueAmount = dueAmount;
    }

    /**
     * @return dueAmount on a vendor invoice in double format.
     */
    @Override
    public double calculatePayment() {
        return this.dueAmount;
    }

    /**
     * returns the payee name information i.e., vendor name.
     *
     * @return vendorName in String format.
     */
    @Override
    public String getPayeeName() {
        return this.vendorName;
    }

    /**
     * display vendor name, invoice number, and calculated payment on separate lines respectively.
     */
    public void print() {
        System.out.println("Vendor name: " + this.getPayeeName());
        System.out.println("Invoice number: " + this.getInvoiceNumber());
        System.out.println("Calculated payment: " + this.calculatePayment());
    }
}
