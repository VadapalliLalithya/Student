package operator;

import java.util.Scanner;

public class Operator {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		a++;
		System.out.println(a);
        a--;
        System.out.println(a);
        ++a;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(++a);
        System.out.println(--a);
	}

}