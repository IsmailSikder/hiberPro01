package com.ismail.hibernate.dto;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;

import com.ismail.hiberPro01.hibernate.pojo.Emps;
import com.ismail.hibernate.util.HibernateUtil;

public class showHibernateData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		System.out.println("Hibernate is running");
		
		Session session= null;
		
		try {
			session = HibernateUtil.openSession();
			
			 session.beginTransaction();
			 
			 //SQL inner join btn Emp and address entity
			 Criteria criteria= session.createCriteria(Emps.class, "EMPS");
			 
		        criteria.createAlias("EMPS.address", "ADDRESS");
		        criteria.setProjection(Projections.projectionList().
		        		add(Projections.property("id").as("id"))
		                    .add(Projections.property("empName").as("Name"))
		                    .add(Projections.property("salary").as("salary"))
		                    .add(Projections.property("ADDRESS.street").as("street"))
		                    .add(Projections.property("ADDRESS.city").as("city"))
		        );
		        criteria.setResultTransformer(Transformers.aliasToBean(EmpDto.class));
			List<EmpDto>eList=criteria.list();
			System.out.println(eList.size());
			
			Iterator <EmpDto>it= eList.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
				session.delete(eList);
			}
			
			session.getTransaction().commit();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			session.getTransaction().rollback();
		}
		
		
	}


}

