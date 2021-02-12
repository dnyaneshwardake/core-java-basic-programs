package com.dake.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList
{
	public static void main(String[] args)
	{
		Student s1 = new Student(10, "Dnyanesh", 23);
		Student s2 = new Student(20, "Prashant", 24);
		Student s3 = new Student(30, "Shri", 25);

		List<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		System.out.println(al);
		System.out.println("Student Details");
		Iterator<Student> itr = al.iterator();
		while (itr.hasNext())
		{
			Student st = itr.next();
			System.out.println(st.getRollNo() + " " + st.getName() + " " + st.getAge());
		}
	}
}
