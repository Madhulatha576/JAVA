package mc;

import java.util.*;
public class messageDecoderApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		messageDecoder decoder = new messageDecoder();

		System.out.println(decoder.decodeCharacter(ch));
	}

}