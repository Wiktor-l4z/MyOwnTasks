
public class Warmup-1{

//    The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
//
//    sleepIn(false, false) → true
//    sleepIn(true, false) → false
//    sleepIn(false, true) → true

public boolean sleepIn(boolean weekday,boolean vacation){
        if(!weekday||vacation){
        return true;
        }
        return false;
        }

        Expected	Run		
sleepIn(false, false) → true	true	OK	
sleepIn(true, false) → false	false	OK	
sleepIn(false, true) → true	true	OK	
sleepIn(true, true) → true	true	OK	


//    Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
//
//    diff21(19) → 2
//    diff21(10) → 11
//    diff21(21) → 0

public int diff21(int n){
        if(n<=21){
        return n=21-n;
        }else{
        return(n-21)*2;
        }
        }


//    We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
//
//    parrotTrouble(true, 6) → true
//    parrotTrouble(true, 7) → false
//    parrotTrouble(false, 6) → false

public boolean parrotTrouble(boolean talking,int hour){
        if(talking&&(21<=hour||hour< 7)){
        return true;
        }
        return false;
        }

//        Given a string, return a new string where the first and last chars have been exchanged.
//
//        frontBack("code") → "eodc"
//        frontBack("a") → "a"
//        frontBack("ab") → "ba"

public String frontBack(String str){
        if(str==null||str.length()==0){
        return str;
        }
        char[]cs=str.toCharArray();
        char first=cs[0];
        cs[0]=cs[cs.length-1];
        cs[cs.length-1]=first;
        return new String(cs);
        }


//
//        Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
//
//        front3("Java") → "JavJavJav"
//        front3("Chocolate") → "ChoChoCho"
//        front3("abc") → "abcabcabc"

public String front3(String str){
        String front;

        if(str.length()>=3){
        front=str.substring(0,3);  // ciag znakow
        }
        else{
        front=str;
        }
        return front+front+front;
        }


//        Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
//
//        backAround("cat") → "tcatt"
//        backAround("Hello") → "oHelloo"
//        backAround("a") → "aaa"

public String backAround(String str){
        String mom;

        mom=str.substring(str.length()-1);
        return mom+str+mom;
        }


//        Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
//
//        front22("kitten") → "kikittenki"
//        front22("Ha") → "HaHaHa"
//        front22("abc") → "ababcab"

public String front22(String str){
        if(str.length()<=2){
        return str+str+str;

        }


//        Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.
//
//        front22("kitten") → "kikittenki"
//        front22("Ha") → "HaHaHa"
//        front22("abc") → "ababcab"


public String front22(String str){
        String front;
        String bolec;
        if(str.length()<=2){
        front=str+str+str;
        return front;

        }
        if(str.length()>2){
        bolec=str.substring(0,2);
        return bolec+str+bolec;
        }
        else{
        front=str;
        }
        return front;
        }

        }

        
// Given two temperatures, return true if one is less than 0 and the other is greater than 100.

// icyHot(120, -1) → true
// icyHot(-1, 120) → true
// icyHot(2, 120) → false

public boolean icyHot(int temp1, int temp2) {
  if ( (temp1 < 0 && temp2 > 100) || (temp1 > 110 && temp2 < 0)){
    return true;
  } else {
    return false;
  }
}

// Given a string, return true if the string starts with "hi" and false otherwise.

// startHi("hi there") → true
// startHi("hi") → true
// startHi("hello hi") → false

public boolean startHi(String str) {
    String firstTwo = str.substring(0, 2);

  if (str.length() < 2){
    return false;
  } 
    if (firstTwo.equals("hi")) {
    return true;
  } else {
    return false;
  }
}

// We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.

// loneTeen(13, 99) → true
// loneTeen(21, 19) → true
// loneTeen(13, 13) → false

public boolean loneTeen(int a, int b) {
  boolean aTeen = ( 13 <= a && a <= 19 );
  boolean bTeen = ( 13 <= b && b <=19 );
  return ((!aTeen && bTeen) || (aTeen && !bTeen) );
}

// Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

// nearHundred(93) → true
// nearHundred(90) → true
// nearHundred(89) → false

public boolean nearHundred(int n) {
 return ((Math.abs(100 - n) <= 10) ||
    (Math.abs(200 - n) <= 10));
}


// Given a non-empty string and an int n, return a new string where the char at index n has been removed. 
// The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
// missingChar("kitten", 1) → "ktten"
// missingChar("kitten", 0) → "itten"
// missingChar("kitten", 4) → "kittn"

public String missingChar(String str, int n) {
String front = str.substring(0, n);
String back = str.substring(n+1, str.length());
return  front + back;
}


// Given two int values, return their sum. Unless the two values are the same, then return double their sum.
// sumDouble(1, 2) → 3
// sumDouble(3, 2) → 5
// sumDouble(2, 2) → 8


public int sumDouble(int a, int b) {
  if ( a == b ){
    return (a+b) * 2;
  } else 
  return a+b;
}


// Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

// notString("candy") → "not candy"
// notString("x") → "not x"
// notString("not bad") → "not bad"

public String notString(String str) {
String lol  = "not " +str;
  if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
    return str;
  } else {
   return lol;
  }
}

// Given a string, return true if the string starts with "hi" and false otherwise.

// startHi("hi there") → true
// startHi("hi") → true
// startHi("hello hi") → false

public boolean startHi(String str) {
    String firstTwo = str.substring(0, 2);

  if (str.length() < 2){
    return false;
  } 
    if (firstTwo.equals("hi")) {
    return true;
  } else {
    return false;
  }
}

// Given 2 int values, return true if either of them is in the range 10..20 inclusive.
// in1020(12, 99) → true
// in1020(21, 12) → true
// in1020(8, 99) → false

public boolean in1020(int a, int b) {
if ((a >= 10 && a <= 20 )|| (b >= 10 && b <= 20 )){
  return true;
} else {
  return false;
}
}

Expected	Run		
in1020(12, 99) → true	true	OK	
in1020(21, 12) → true	true	OK	
in1020(8, 99) → false	false	OK	
in1020(99, 10) → true	true	OK	
in1020(20, 20) → true	true	OK	
in1020(21, 21) → false	false	OK	
in1020(9, 9) → false	false	OK	

// We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

// monkeyTrouble(true, true) → true
// monkeyTrouble(false, false) → true
// monkeyTrouble(true, false) → false

public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  if  (aSmile && bSmile){
   return true;
  }
  if  (!aSmile && !bSmile){
   return true;
  }
  return false;
}
Expected	Run		
monkeyTrouble(true, true) → true	true	OK	
monkeyTrouble(false, false) → true	true	OK	
monkeyTrouble(true, false) → false	false	OK	
monkeyTrouble(false, true) → false	false	OK	

