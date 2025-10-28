package com.designpatterns.prototype;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    private String bookShopName;
    List<Books> books = new ArrayList<>();

    public String getBookShopName() {
        return bookShopName;
    }

    public void setBookShopName(String bookShopName) {
        this.bookShopName = bookShopName;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }
    public void loadData(){
        for(int i = 0;i<10;i++){
            Books b = new Books();
            b.setBid(i);
            b.setBname("Book"+ i);
            books.add(b);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "bookShopName='" + bookShopName + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop clone = (BookShop) super.clone();
        List<Books> bs = new ArrayList<>();
        for(Books b : books) bs.add(b.clone());
        clone.setBooks(bs);

        return clone;
    }
}
