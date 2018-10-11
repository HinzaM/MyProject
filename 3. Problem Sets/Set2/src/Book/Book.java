//import javax.swing.*;


    public class Book {

    //private variables
        private String xtitle;
        private int xnoPages;
        private String xisbn;
        private double xprice;

    //no-argument constructor
        public Book(){}

    //...
        public Book(String title, int noPages, String isbn, double price)
        {
            xtitle = title;
            xnoPages = noPages;
            xisbn = isbn;
            xprice = price;
        }

    //accessor
        public void setTitle(String title) {
            xtitle = title;
        }
        public void setNoPages(int noPages) { xnoPages = noPages; }
        public void setISBN(String isbn) {
            xisbn = isbn;
        }
        public void setPrice(double price) { xprice = price; }

    //mutator
        public String getTitle() { return xtitle; }
        public int getNoPages() { return xnoPages; }
        public String getISBN() { return xisbn; }
        public double getPrice() { return xprice; }

    //toString method
        public String toString() {
            return "\n\nTitle: " + getTitle() + "\nNo. of Pages: " + getNoPages()+
                    "\nISBN: " + getISBN() + "\nPrice: " + getPrice(); }

    }











