package com.example.spring.springbootdemo.test;

import java.util.StringJoiner;

public class Java8 {

	public static void main(String[] args) {
		StringJoiner jn = new StringJoiner("-","[","]");
		jn.add("nata");
		jn.add("raja");
		System.out.println(jn);

	}

}
