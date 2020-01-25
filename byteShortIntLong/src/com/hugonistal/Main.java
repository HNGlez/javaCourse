package com.hugonistal;

public class Main {

    public static void main(String[] args) {
	int myValue = 10000;
	int myMinIntValue = Integer.MIN_VALUE;
	int myMaxIntValue = Integer.MAX_VALUE;
    System.out.println("Integer Minimum Value = " + myMaxIntValue);
    System.out.println("Integer Minimum Value = " + myMinIntValue);
    System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
    System.out.println("Busted Min Value = " + (myMinIntValue - 1));
    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println("Byte Minimum Value = " + myMinByteValue);
    System.out.println("Byte Minimum Value = " + myMaxByteValue);
    short myMinShortValue = Short.MIN_VALUE;
    short myMaxShortValue = Short.MAX_VALUE;
    System.out.println("Short Minimum Value = " + myMinShortValue);
    System.out.println("Short Minimum Value = " + myMaxShortValue);
    
    long myLongValue = 100L;
    long myMinLongValue = Long.MIN_VALUE;
    long myMaxLongValue = Long.MAX_VALUE;
    System.out.println("Long Minimum Value = " + myMinLongValue);
    System.out.println("Long Minimum Value = " + myMaxLongValue);

    int myTotal = (myMaxIntValue/2);

    byte myNewByteValue = (byte) (myMinByteValue/2);

    short myNewShortValue = (short) (myMinShortValue/2);

    byte myChallengeByte = Byte.MAX_VALUE;
    short myChallengeShort = Short.MIN_VALUE;
    int myChallengeInt = Integer.MAX_VALUE;
    long myChallengeLong = 50000L + 10L * ((long) (myChallengeByte) + (long) (myChallengeShort) + (long) (myChallengeInt));
    System.out.println(myChallengeLong);
    }
}
