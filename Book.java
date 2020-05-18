/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
class Book {
    private String Book_ID;
    private String Book_Name;
    private String Author;
    private float Price;
    private int Amount;
    
    public Book(String Book_ID, String Book_Name, String Author, float Price, int Amount) {
        this.Book_ID = Book_ID;
        this.Book_Name = Book_Name;
        this.Author = Author;
        this.Price = Price;
        this.Amount = Amount;
    }
    public String getBook_ID() {
        return Book_ID;
    }
    public String getBook_Name() {
        return Book_Name;
    }
    public String getAuthor() {
        return Author;
    }
    public float getPrice() {
        return Price;
    }
    public int getAmount() {
        return Amount;
    }
}
