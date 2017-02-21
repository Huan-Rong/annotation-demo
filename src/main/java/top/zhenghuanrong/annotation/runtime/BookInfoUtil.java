package top.zhenghuanrong.annotation.runtime;

import java.awt.print.Book;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 注解处理器：使用反射机制处理 runtime annotations。
 */
public class BookInfoUtil {
    private static String strBookName = "图书名字：";
    private static String strBookPrice = "图书价格：";
    private static String strBookColor = "图书颜色：";
    private static String strBookAuthor = "图书作者：";

    public static void printBookInfo(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(BookName.class)) {
                BookName bookName = field.getAnnotation(BookName.class);
                System.out.println(strBookName + bookName.value());
            } else if (field.isAnnotationPresent(BookPrice.class)) {
                BookPrice bookPrice = field.getAnnotation(BookPrice.class);
                System.out.println(strBookPrice + bookPrice.bookPrice());
            } else if (field.isAnnotationPresent(BookColor.class)) {
                BookColor bookColor = field.getAnnotation(BookColor.class);
                System.out.println(strBookColor + bookColor.bookColor());
            } else if (field.isAnnotationPresent(BookAuthor.class)) {
                BookAuthor bookAuthor = field.getAnnotation(BookAuthor.class);
                System.out.println(strBookAuthor +
                        "\n\t姓名：" + bookAuthor.authorName() +
                        "\n\t联系方式：" + bookAuthor.authorPhone() +
                        "\n\t常住地址：" + bookAuthor.authorAddress());
            }
        }
    }
}
