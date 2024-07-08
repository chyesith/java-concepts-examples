package org.yesh.learn;

import org.yesh.learn.basics.Cat;
import org.yesh.learn.basics.Dog;
import org.yesh.learn.record.StudentDetails;
import org.yesh.learn.record.StudentRecord;

public class Main {
    public static void main(String[] args) {

		StudentDetails studentDetails = new StudentDetails("Jack" , 12434);
		System.out.println(studentDetails.getName());

		StudentRecord studentRecord = new StudentRecord("John" , 343434);
		System.out.println(studentRecord.name());

    }
}