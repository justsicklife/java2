public class eX44Book {
    String title;
    String author;

    public eX44Book(String t) {
        title = t;
        author = "작자미상";
    }

    public eX44Book(String t,String e) {
        title = t;
        author = e;
    }

    public static void main(String[] args) {
        eX44Book littlePrince = new eX44Book("어린 왕자","생텍쥐페리");
        eX44Book loveStroy = new eX44Book("춘향");
        System.out.println(littlePrince.title +  " "  +littlePrince.author);
        System.out.println(loveStroy.title +  " " + loveStroy.author);
    }
}
