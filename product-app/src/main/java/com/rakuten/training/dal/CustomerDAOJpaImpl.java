package com.rakuten.training.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rakuten.training.domain.Customers;

@Repository
@Transactional
public class CustomerDAOJpaImpl implements CustomerDAO{

	@Autowired
	EntityManager em;
	
	@Override
	public Customers save(Customers toBeSaved) {
		em.persist(toBeSaved);
		return toBeSaved;
	}

	@Override
	public Customers findById(int id) {
		return em.find(Customers.class,id);
	}
	
	@Override
	public Customers findByFirstName(String firstName) {
		return em.find(Customers.class,firstName);
	}

	@Override
	public List<Customers> findAll() {
		Query q =em.createQuery("select p from Customers as p");//where p.price<123
		return q.getResultList();
	}

	@Override
	public void deleteById(int id) {
		Customers p = em.find(Customers.class,id);
		em.remove(p);
	}
	

	
}
