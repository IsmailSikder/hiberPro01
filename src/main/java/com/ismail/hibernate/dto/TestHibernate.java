package com.ismail.hibernate.dto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;


import com.ismail.hiberPro01.hibernate.pojo.Address;
import com.ismail.hiberPro01.hibernate.pojo.Emps;
import com.ismail.hibernate.util.HibernateUtil;

public class TestHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hibernate is running");
		
		Session session= null;
		
		try {
			session = HibernateUtil.openSession();
			
			session.beginTransaction();
			/*List<Emps> emp1 = new ArrayList<Emps>();
			Address adrs1 = new Address();
			Scanner scan = new Scanner(System.in);
			
			int id;
			String name;
			long salary;
			String street;
			String city;
			
			System.out.println("Type y/n to start or end");
			String input;
			while(!(scan.next()).equals("n")){
				
				Scanner numberScan = new Scanner(System.in);
				//Scanner stringScan = new Scanner(System.in);
				System.out.println("set employee id");
				id = numberScan.nextInt();
				//System.out.println("Id: "+ id);
				System.out.println("Enter Employee full name: ");
				name = scan.next();
				System.out.println("Enter salery: ");
				salary = numberScan.nextLong();
				
				
				Scanner adrsScan = new Scanner(System.in);
				System.out.println("Enter street address");
				street = adrsScan.next();
				System.out.print("Enter City name : ");
				city = adrsScan.next();
				
				adrs1.setStreet(street);
				adrs1.setCity(city);
				
				emp1.add(new Emps(id, adrs1, name, salary));
				
				System.out.println("what to continue(y/n):  ");
				scan.next();
			}
			scan.close();
			System.out.println("out of the loop");
			session.save(adrs1);
			session.save(emp1);*/
			
			Emps emp = new Emps();
			Address adrs = new Address();
			
			emp.setIdemps(5);
			emp.setEmpName("hossain irony");
			emp.setSalary(60000);
			//adrs.setAddressId(2);
			adrs.setStreet("lovers point");
			adrs.setCity("Newark");
			
			emp.setAddress(adrs);
			session.saveOrUpdate(adrs);
			session.saveOrUpdate(emp);
			
			
			/*Emps emp2 = new Emps();
			Address adrs2 = new Address();
			
			emp2.setIdemps(3);
			emp2.setEmpName("Sufian Sikder");
			emp2.setSalary(60000);
			//adrs.setAddressId(1);
			adrs2.setStreet("200 Jacqueline dr");
			adrs2.setCity("Wilmington");
			
			emp2.setAddress(adrs2);

			session.save(adrs2);
			session.save(emp2);*/
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			session.getTransaction().rollback();
		}
		
		
	}

}
