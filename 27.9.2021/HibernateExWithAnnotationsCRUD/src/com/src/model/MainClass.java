package com.src.model;

		import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;

import org.hibernate.Session;
		import org.hibernate.SessionFactory;
		import org.hibernate.Transaction;
		import org.hibernate.boot.Metadata;
		import org.hibernate.boot.MetadataSources;
		import org.hibernate.boot.registry.StandardServiceRegistry;
		import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.persister.entity.Loadable;

		public class MainClass {

			public static void main(String[] args) {
				   int  choice;
				   Customer c;
				StandardServiceRegistry ssr;       
		        Metadata meta ;       
		        SessionFactory factory;
		        Session session;
		        Transaction t;
		           Scanner inp= new Scanner(System.in);
		      do { System.out.println("Enter your choice  1:insert  2:update  3:delete   4.retrive  0:exit");
		      choice=inp.nextInt();	
		        
		        switch(choice) {
		        case 1:
		       	ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		       	meta = new MetadataSources(ssr).getMetadataBuilder().build(); 
		       	factory=meta.getSessionFactoryBuilder().build();
		        session=factory.openSession();
		        t=session.beginTransaction();
		        c=new Customer(23,86776637,"qwerty","qwerty@qwerty");
		        	session.persist(c);
		        System.out.println("values got inserted successfully");
		        t.commit();
		        session.close();
		        factory.close();
			       
		        break;
		        
		        case 2:
		        	ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		        	meta = new MetadataSources(ssr).getMetadataBuilder().build(); 
		        	factory=meta.getSessionFactoryBuilder().build();
     	        	session=factory.openSession();
		        	t=session.beginTransaction();
		        	c=new Customer(23,86776637,"qwerty","qwerty@gmail.com");
				        session.merge(c);
				     System.out.println("values got updated successfully");
				     t.commit();
				     session.close();
				     factory.close();
				     break;
		        	
		        case 3:
		        	ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		        	meta = new MetadataSources(ssr).getMetadataBuilder().build(); 
		        	factory=meta.getSessionFactoryBuilder().build();
		        	session=factory.openSession();
		        	t=session.beginTransaction();
		        		c=new Customer(23);
		        		//c=new Customer(23,86776637,"qwerty","qwerty@gmail");
				    session.delete(c);
				    System.out.println("values got deleted successfully");
			        t.commit();
			        session.close();
			        factory.close();
					       
				        break;
				        
				        
		        case 4:
		        	
		           ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		        	meta = new MetadataSources(ssr).getMetadataBuilder().build(); 
		        	factory=meta.getSessionFactoryBuilder().build();
		        	session=factory.openSession();
		        	System.out.println( session.get(Customer.class,23));
				    System.out.println("values got retrived successfully");
				    session.close();
			      factory.close();
			
		        }
		      }while(choice!=0);
		         
		        
		       
		        
			}

		}
