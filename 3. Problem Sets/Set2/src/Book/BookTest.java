public class BookTest {

    //psvm
    public static void main(String[] args) {

        Book book1 = new Book("Chemistry",300,"768fhy7sh",10.50);
        Book book2 = new Book("Biology",205,"9ikjs456tg",15);
        Book book3 = new Book("Physics",65,"jge9475yxhd",8);
        Book book4 = new Book("Math",100,"hfji5h38jk91",12);

    //method 1
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);

    //method 2
    /*  System.out.printf("\n\nTitle: " + book1.getTitle() + "\nNo. of Pages: " + book1.getNoPages() +
                "\nISBN: " + book1.getISBN() + "\nPrice: " + book1.getPrice());
        System.out.printf("\n\nTitle: " + book2.getTitle() + "\nNo. of Pages: " + book2.getNoPages() +
                "\nISBN: " + book2.getISBN() + "\nPrice: " + book2.getPrice());
        System.out.printf("\n\nTitle: " + book3.getTitle() + "\nNo. of Pages: " + book3.getNoPages() +
                "\nISBN: " + book3.getISBN() + "\nPrice: " + book3.getPrice());
        System.out.printf("\n\nTitle: " + book4.getTitle() + "\nNo. of Pages: " + book4.getNoPages() +
                "\nISBN: " + book4.getISBN() + "\nPrice: " + book4.getPrice()); */
    }

}
