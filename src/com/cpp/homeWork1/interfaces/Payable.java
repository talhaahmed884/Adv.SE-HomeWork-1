package com.cpp.homeWork1.interfaces;

/**
 * An interface that keep tracks of payables.
 */
public interface Payable {
    /**
     * performs payment calculation operation.
     *
     * @return calculated payment in double format.
     */
    double calculatePayment();

    /**
     * returns the payee name information.
     *
     * @return payee name in String format.
     */
    String getPayeeName();
}