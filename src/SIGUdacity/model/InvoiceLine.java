/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIGUdacity.model;

/**
 *
 * @author DELL
 */
public class InvoiceLine {
    private String item;
    private double price;
    private int count;
    private InvoiceHeader invoice;

    public InvoiceLine(String item, double price, int count, InvoiceHeader invoice) {
        this.item = item;
        this.price = price;
        this.count = count;
        this.invoice = invoice;
    }

    public String toCSV() {
        return invoice.getNum() + "," + item + "," + price + "," + count;
    }
    
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public InvoiceHeader getInvoice() {
        return invoice;
    }

    public void setInvoice(InvoiceHeader invoice) {
        this.invoice = invoice;
    }
    
    public double getTotal() {
        return getCount() * getPrice();
    }

    @Override
    public String toString() {
        return "Line{" + "item=" + item + ", price=" + price + ", count=" + count + '}';
    }
    
}
