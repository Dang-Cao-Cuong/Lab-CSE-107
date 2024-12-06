package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.StringManipulator;

public class StringManipulatorTest {
   StringManipulator stringManipulator = new StringManipulator();

   @Test
   public void testReverse() {
      assertEquals("ba", stringManipulator.reverse("ab"));
      assertEquals("ExAmPLE", stringManipulator.reverse("ELPmAxE"));

   }

   @Test
   public void testIsPalindrome() {
      assertEquals(true, stringManipulator.isPalindrome("aba"));
   }

   @Test
   public void testIsContained() {
      assertEquals(true, stringManipulator.isContained("aba", "ba"));
   }

   @Test
   public void testNumberRemoved() {
      assertEquals("cuong", stringManipulator.numberRemoved("c1u2o3n4g"));
   }

   @Test
   public void testUpperString() {
      assertEquals("CUONG", stringManipulator.upperString("cuong"));

   }

   @Test
   public void testLowerString() {
      assertEquals("cuong", stringManipulator.lowerString("CUONG"));
   }

   @Test
   public void testCapitalString() {
      assertEquals("Example String", stringManipulator.capitalString("example string"));
   }

   @Test
   public void testCountVowels() {
      assertEquals(3, stringManipulator.countVowels("Example"));
   }

   @Test
   public void testCountWords() {
      assertEquals(4, stringManipulator.countWords("Hello, how are you?"));
   }

   @Test
   public void testFindSubstringIndex() {
      assertEquals(5, stringManipulator.findSubstringIndex("Java programming", "programming"));
      assertEquals(-1, stringManipulator.findSubstringIndex("Java programming", "Programming"));

   }

   @Test(timeout = 1000)
   public void testReverseWords() {
      assertEquals("You Are How World Hello", stringManipulator.reverseWords("Hello World How Are You"));
   }

   @Test(timeout = 1000)
   public void testReverseWithTimeout() {
      assertEquals("ba", stringManipulator.reverse("ab"));
      assertEquals("ExAmPLE", stringManipulator.reverse("ELPmAxE"));
   }

   @Test(timeout = 1000)
   public void testIsPalindromeWithTimeout() {
      assertEquals(true, stringManipulator.isPalindrome("aba"));
   }

   @Test(timeout = 1000)
   public void testIsContainedWithTimeout() {
      assertEquals(true, stringManipulator.isContained("aba", "ba"));
   }

   @Test(timeout = 1000)
   public void testNumberRemovedWithTimeout() {
      assertEquals("cuong", stringManipulator.numberRemoved("c1u2o3n4g"));
   }

}
