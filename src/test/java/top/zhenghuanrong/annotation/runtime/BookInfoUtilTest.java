package top.zhenghuanrong.annotation.runtime;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
* BookInfoUtil Tester. 
* 
* @author <Authors name> 
* @since <pre>02/21/2017</pre> 
* @version 1.0 
*/ 
public class BookInfoUtilTest { 

    @Before
    public void before() throws Exception { 
    } 

    @After
    public void after() throws Exception { 
    } 

    /**
    * 
    * Method: printBookInfo(Class<?> clazz) 
    */
    @Test
    public void testPrintBookInfo() throws Exception {
        BookInfoUtil.printBookInfo(ThinkingInJava.class);
    }

    
}
