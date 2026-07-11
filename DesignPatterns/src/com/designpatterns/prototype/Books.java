package com.designpatterns.prototype;

public class Books implements Cloneable{
    private int bid;
    private String bname;

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public Books( int bid,String bname) {
        this.bname = bname;
        this.bid = bid;
    }

    public Books() {
    }

    @Override
    public String toString() {
        return "Books{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                '}';
    }

    @Override
    protected Books clone() throws CloneNotSupportedException {
        return (Books) super.clone();
    }
}
