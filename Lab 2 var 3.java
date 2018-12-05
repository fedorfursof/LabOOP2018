package com.company;


class BookTest {
    public static void main(String[] args) {
        Book Book1 = new Book();
        Book1.setAuthor("Fedor Mihailovich Dostoevski");
        Book1.setBookNAme("Prestuplenie i Nakazanie");
        Book1.setPublicationYear(1912);
        Book1.PageCount = 229;
        Book1.CriticsRate10 = 9;
        Book1.ShowBookInfo();

        Book Book2 = new Book();
        Book2.setAuthor("Alexandr Sergeivich Pushkin");
        Book2.setBookNAme("Kapitanskaya dochka");
        Book2.setPublicationYear(1836);
        Book2.PageCount = 254;
        Book2.CriticsRate10 = 10;
        Book2.ShowBookInfo();


    }
}

package com.company;

class Book {

    private String Author;
    private String BookNAme;
    private int PublicationYear;
    public int PageCount;
    public int CriticsRate10;

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getBookNAme() {
        return BookNAme;
    }

    public void setBookNAme(String bookNAme) {
        BookNAme = bookNAme;
    }

    public int getPublicationYear() {
        return PublicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        PublicationYear = publicationYear;
    }

    public int getPageCount() {
        return PageCount;
    }

    public void setPageCount(int pageCount) {
        PageCount = pageCount;
    }

    public int getCriticsRate10() {
        return CriticsRate10;
    }

    public void setCriticsRate10(int criticsRate10) {
        CriticsRate10 = criticsRate10;
    }

    void ShowBookInfo() {
        System.out.print("BookName: " + Author + "\t Author: " + Author);
        System.out.print(" PublicationYear: " + PublicationYear + " PageCount " + PageCount + " CriticsRate10: " + CriticsRate10 + "\n");
    }

}
