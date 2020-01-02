package com.Bank.RestApi.resource;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bank.RestApi.Dao.CustomerDao;
import com.Bank.RestApi.entity.CustomerEntity;
import com.Bank.RestApi.model.Customer;

@RestController
@RequestMapping("/customer")
public class Details {

	@RequestMapping("/{accountNo}")
	public Customer getCustomerDetails(@PathVariable("accountNo") String accountNo) {
		CustomerDao dao = new CustomerDao();
		return dao.getCustomerDetails(accountNo);
	}

	@RequestMapping("/createcustomer")
	public String createCustomerDetails() {
		CustomerDao dao = new CustomerDao();
		return dao.createCustomerDetails();
	}

	@RequestMapping("/getallcustomers")
	public List<CustomerEntity> getAllCustomerDetails() {
		CustomerDao dao = new CustomerDao();
		return dao.getallcustomers();
	}
	
}
