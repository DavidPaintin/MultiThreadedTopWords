//package com.m3c.dap;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.Assert;
//
//
//public class TestEnvironment {
//    @Before
//    public void setupEnv() {
//
//    }
//
//    @Test
//    public void countWordTest1() {
//        BookReader book = new BookReader();
//        book.countWord("word");
//        Assert.assertTrue(book.wordCount.containsKey("word"));
//    }
//
//    @Test
//    public void countWordTest2() {
//        BookReader book = new BookReader();
//        book.countWord("word");
//        Assert.assertEquals(book.wordCount.get("word"), new Integer(1));
//    }
//
//    @Test
//    public void countWordTest3() {
//        BookReader book = new BookReader();
//        book.countWord("word");
//        book.countWord("word");
//        Assert.assertEquals(book.wordCount.get("word"), new Integer(2));
//    }
//
//    @Test
//    public void countWordTest4() {
//        BookReader book = new BookReader();
//        book.countWord("word");
//        book.countWord("word");
//        book.countWord("mot");
//        Assert.assertEquals(book.wordCount.get("mot"), new Integer(1));
//        Assert.assertEquals(book.wordCount.get("word"), new Integer(2));
//
//    }
//
//    @Test
//    public void mostCommonTest1(){
//        BookReader book = new BookReader();
//        book.countWord("word");
//        book.countWord("word");
//        book.countWord("mot");
//        book.countWord("word");
//        book.countWord("word");
//        book.countWord("mot");
//        book.countWord("mot");
//        book.countWord("third");
//        book.countWord("third");
//        book.countWord("fourth");
//        Assert.assertEquals(book.mostCommon(1),"word");
//    }
//    @Test
//    public void mostCommonTest2(){
//        BookReader book = new BookReader();
//        book.countWord("word");
//        book.countWord("word");
//        book.countWord("mot");
//        book.countWord("word");
//        book.countWord("word");
//        book.countWord("mot");
//        book.countWord("mot");
//        book.countWord("third");
//        book.countWord("third");
//        book.countWord("fourth");
//        Assert.assertEquals(book.mostCommon(1),"word");
//        Assert.assertEquals(book.mostCommon(2),"mot");
//    }
//    @Test
//    public void mostCommonTest3(){
//        BookReader book = new BookReader();
//        book.countWord("word");
//        book.countWord("word");
//        book.countWord("mot");
//        book.countWord("word");
//        book.countWord("word");
//        book.countWord("mot");
//        book.countWord("mot");
//        book.countWord("third");
//        book.countWord("third");
//        book.countWord("fourth");
//        Assert.assertEquals(book.mostCommon(1),"word");
//        Assert.assertEquals(book.mostCommon(2),"mot");
//        Assert.assertEquals(book.mostCommon(3),"third");
//    }
//
//    @Test
//    public void punctuationTest(){
//        BookReader book = new BookReader();
//        String removed =book.lineFormatter("Remove.The:Punctuation+Please!");
//        Assert.assertEquals(removed,"Remove The Punctuation Please ");
//    }
//
//    @Test
//    public void formatTest(){
//        BookReader book = new BookReader();
//        String removed =book.lineFormatter("Remove.The:Punctuation+Please!");
//        Assert.assertEquals(removed,"remove the punctuation please ");
//    }
//
////    @Test
////    public void tieTest1(){
////        BookReader book = new BookReader();
////        book.countWord("word");
////        book.countWord("word");
////        book.countWord("mot");
////        book.countWord("mot");
////        Assert.assertEquals(book.mostCommon,"word/mot");
////    }
//}
