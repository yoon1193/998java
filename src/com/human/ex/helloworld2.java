/*
 이 프로그램은 초보자들을 위한 처음시작하는
 프로그램 코드입니다.
 20200219
 */

package com.human.ex; //폴더 경로

public class helloworld2 // 클래스 이름
{

	public static void main(String[] args) //main은 프로그램 시작부분
	{
		System.out.println("hello"); 	
		System.out.println("world");
		System.out.println("hello\nworld");
		System.out.println("hello\tworld");
		
		System.out.print("hello");
		System.out.print("world");
		System.out.print("\n");

		System.out.println("hello\"world\"");
		System.out.println("hello\tworld");

	//이스케이프 시퀸스(escape sequence) -> \
	//문법에 문제가 되는 문자나 특수기호를 문자열로 출력하고 싶을때 사용한다.
	//사용방법은 /가 아닌 역슬레쉬다음 문자 형태로 사용한다. ex) \n , \"
	}

}
