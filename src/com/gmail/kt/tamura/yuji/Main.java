package com.gmail.kt.tamura.yuji;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	private static final String p5  = "(?:(?:a)+)+c";
	private static final String p7  = "((a)+)+c";
	private static final String p8  = "(?:(?:(?:aa)+)+)+c";
	private static final String p9  = "(((aa)+)+)+c";
	private static final String p10 = "(?:a|a)(?:a|a)(?:a|a)(?:a|a)(?:a|a)(?:a|a)(?:a|a)(?:a|a)(?:a|a)(?:a|a)(?:a|a)(?:a|a)(?:a|a)(?:a|a)(?:a|a)(?:a|a)(?:a|a)(?:a|a)(?:a|a)(?:a|a)(?:a|a)(?:a|a)(?:a|a)(?:a|a)(?:a|a)(?:a|a)c";
	private static final String p11 = "(?:aa|a)(?:aa|a)(?:aa|a)(?:aa|a)(?:aa|a)(?:aa|a)(?:aa|a)(?:aa|a)(?:aa|a)(?:aa|a)(?:aa|a)(?:aa|a)(?:aa|a)(?:aa|a)(?:aa|a)(?:aa|a)(?:aa|a)(?:aa|a)(?:aa|a)(?:aa|a)(?:aa|a)(?:aa|a)(?:aa|a)(?:aa|a)c";
	private static final String p12 = "(aa|a)(aa|a)(aa|a)(aa|a)(aa|a)(aa|a)(aa|a)(aa|a)(aa|a)(aa|a)(aa|a)(aa|a)(aa|a)(aa|a)(aa|a)(aa|a)(aa|a)(aa|a)(aa|a)(aa|a)(aa|a)(aa|a)(aa|a)(aa|a)c";
	
	private static final String u5  = "aaaaaaaaaaaaaaaaaaaaaaabc";
	private static final String u7  = "aaaaaaaaaaaaaaaaaaaaaaabc";
	private static final String u8  = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc";
	private static final String u9  = "aaaaaaaaaaaaaaaaaaaaaaaaaaaabc";
	private static final String u10 = "aaaaaaaaaaaaaaaaaaaaaaaaaabc";
	private static final String u11 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc";
	private static final String u12 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc";

	private static final String m5  = "aaaaaaaaaaaaaaaaaaaaaaac";
	private static final String m7  = "aaaaaaaaaaaaaaaaaaaaaaac";
	private static final String m8  = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaac";
	private static final String m9  = "aaaaaaaaaaaaaaaaaaaaaaaaaaaac";
	private static final String m10 = "aaaaaaaaaaaaaaaaaaaaaaaaaac";
	private static final String m11 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac";
	private static final String m12 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac";


	public static void main(String[] args) {
		checker();
	}
	
	private static boolean matcher(String pat, String input){
		long start = System.nanoTime();
		Pattern p = Pattern.compile(pat);
		Matcher m = p.matcher(input);
		boolean b = m.matches();
		long time = System.nanoTime() - start;
		time /= 1000000;
		System.out.print(time + "[ms] ");
		return b;
	}

	private static void checker(){
		System.out.println("Unmatched.");
		System.out.print(" 5:");
		System.out.println(matcher(p5,u5));
		System.out.print(" 7:");
		System.out.println(matcher(p7,u7));
		System.out.print(" 8:");
		System.out.println(matcher(p8,u8));
		System.out.print(" 9:");
		System.out.println(matcher(p9,u9));
		System.out.print("10:");
		System.out.println(matcher(p10,u10));
		System.out.print("11:");
		System.out.println(matcher(p11,u11));
		System.out.print("12:");
		System.out.println(matcher(p12,u12));

		System.out.println();

/*
		System.out.println("Matched.");
		System.out.print(" 5:");
		System.out.println(matcher(p5,m5));
		System.out.print(" 7:");
		System.out.println(matcher(p7,m7));
		System.out.print(" 8:");
		System.out.println(matcher(p8,m8));
		System.out.print(" 9:");
		System.out.println(matcher(p9,m9));
		System.out.print("10:");
		System.out.println(matcher(p10,m10));
		System.out.print("11:");
		System.out.println(matcher(p11,m11));
		System.out.print("12:");
		System.out.println(matcher(p12,m12));
*/
	}

}
