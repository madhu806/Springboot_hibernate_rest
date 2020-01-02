package com.Bank.RestApi.Dao;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.Bank.RestApi.entity.CustomerEntity;
import com.Bank.RestApi.model.Customer;

public class CustomerDao {

	public Customer getCustomerDetails(String accountNo) {
		Session session = getSession();
		session.beginTransaction();
		CustomerEntity entity = session.find(CustomerEntity.class, accountNo);
		return new Customer(entity.getAccountNo(), entity.getDate(), entity.getTransactionDetails(),
				entity.getValueDate(), entity.getWithdrawalAmt(), entity.getDepositAmt(), entity.getBalanceAmt());
	}

	public String createCustomerDetails() {
		CustomerEntity entity = new CustomerEntity();
		entity.setAccountNo("409000611072");
		entity.setDate(new Date());
		entity.setTransactionDetails("TRF FROM  Indiaforensic SERVICES");
		entity.setValueDate(new Date());
		entity.setWithdrawalAmt(133900.00);
		entity.setBalanceAmt(1000000.00);
		entity.setDepositAmt(1000000.00);

		Session session = getSession();
		session.beginTransaction();
		session.persist(entity);
		session.getTransaction().commit();

		return "Customer data saved successfully";
	}

	public List<CustomerEntity> getallcustomers() {
		Session session = getSession();
		session.beginTransaction();
		Query query = session.createNativeQuery("select * from Customer");
		@SuppressWarnings("unchecked")
		List<CustomerEntity> entitylist =query.getResultList();
		return entitylist;
	}

	private Session getSession() {
		return new Configuration().configure().buildSessionFactory().openSession();
	}
}
