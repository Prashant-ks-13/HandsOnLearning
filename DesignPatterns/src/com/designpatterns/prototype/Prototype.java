package com.designpatterns.prototype;

public class Prototype {
    public static void main(String[] args) {

        PrototypeFactory pf = new PrototypeFactory();

        BookShop bs = new BookShop();
        bs.setBookShopName("XYZ");
        bs.loadData();
        pf.registerPrototype("XYZ",bs);

        BookShop clone = pf.getClonedBookShop("XYZ");
        bs.getBooks().add(new Books(88,"scd"));

        System.out.println(bs.toString());
        System.out.println(clone.toString());

    }
}
