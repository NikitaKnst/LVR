/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exn;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author pupil
 */
public class History {
    private Book book;
    private Reader reader;
    private Date givenData;
    private Date returnDate;

    public History() {
        
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Date getGivenData() {
        return givenData;
    }

    public void setGivenData(Date givenData) {
        this.givenData = givenData;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
    @Override
    public String toString(){
        return "History{"
                + "\nbook " + book
                + ", \nreader " + reader
                 + " ,\ngivenDate " + givenData
              + ", \nreturnDate " + returnDate
                                + "\n}";

    }
     
    
    
}
