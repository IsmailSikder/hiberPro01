package com.ismail.hibernate.dto;

import java.io.Serializable;
import java.util.Locale.Category;

import org.hibernate.Session;

import com.ismail.hiberPro01.hibernate.pojo.Address;
import com.ismail.hiberPro01.hibernate.pojo.Emps;
import com.ismail.hibernate.util.HibernateUtil;

public class deleteHibernateData {

	public static void main(String[] args) {
	System.out.println("Hibernate is running");
		
		Session session= null;
		
		try {
			session = HibernateUtil.openSession();
			
			session.beginTransaction();
			
			//Deleting Employee by Id
			Serializable id = new Integer(2);
			Object persistentInstance = session.load(Address.class, id);
			if (persistentInstance != null) {
				
			    session.delete(persistentInstance);
			}
			
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			session.getTransaction().rollback();
		}

	}

}
