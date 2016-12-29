
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


