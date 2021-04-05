package com.wolken.wolkenapp.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.wolken.wolkenapp.dto.FruitsDTO;

public class FruitsDAOImpl implements FruitsDAO {

	@Override
	public void createFruit(FruitsDTO fruitsDTO) {
		// TODO Auto-generated method stub
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(FruitsDTO.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		
		Transaction transaction=session.beginTransaction();
		session.save(fruitsDTO);
		transaction.commit();
		session.close();
		
	}

	@Override
	public void updateFruit(int id) {
		System.out.println("inside update");
		// TODO Auto-generated method stub
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(FruitsDTO.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		FruitsDTO dto=session.load(FruitsDTO.class, id);
		System.out.println("enter the fruit name");
		Scanner scanner=new Scanner(System.in);
		dto.setFruitName(scanner.next());
		Transaction transaction=session.beginTransaction();
		session.update(dto);
		transaction.commit();
		session.close();
		//configuration.close();
		
	}

	@Override
	public void deleteFruit(int id) {
		// TODO Auto-generated method stub
		System.out.println("inside delete");
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(FruitsDTO.class);
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		FruitsDTO dto=session.get(FruitsDTO.class, id);
		Transaction transaction=session.beginTransaction();
		session.delete(dto);
		transaction.commit();
		session.close();
		factory.close();
		
	}

}
