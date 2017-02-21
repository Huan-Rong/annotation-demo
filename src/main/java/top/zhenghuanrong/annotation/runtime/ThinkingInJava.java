package top.zhenghuanrong.annotation.runtime;

/**
 * 书籍：Thinking In Java
 */
public class ThinkingInJava {

    @BookName(value = "Thinking In Java")
    private String bookName;

    @BookColor(bookColor = BookColor.Color.GREEN)
    private String bookColor;

    @BookPrice(bookPrice = 99)
    private Double bookPrice;

    @BookAuthor(authorName = "Da.J", authorPhone = "123", authorAddress = "GZ")
    private String bookAuthor;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookColor() {
        return bookColor;
    }

    public void setBookColor(String bookColor) {
        this.bookColor = bookColor;
    }

    public Double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
}
