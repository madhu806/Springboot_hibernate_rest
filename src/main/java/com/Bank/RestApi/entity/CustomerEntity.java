package com.Bank.RestApi.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class CustomerEntity {
	@Id
	@Column(name = "accountNo")
	private String accountNo;
	private Date date;
	@Column(name = "TransactionDetails")
	private String TransactionDetails;
	@Column(name = "ValueDate")
	private Date ValueDate;
	@Column(name = "withdrawalAmt")
	private double withdrawalAmt;
	@Column(name = "depositAmt")
	private double depositAmt;
	@Column(name = "balanceAmt")
	private double balanceAmt;
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTransactionDetails() {
		return TransactionDetails;
	}
	public void setTransactionDetails(String transactionDetails) {
		TransactionDetails = transactionDetails;
	}
	public Date getValueDate() {
		return ValueDate;
	}
	public void setValueDate(Date valueDate) {
		ValueDate = valueDate;
	}
	public double getWithdrawalAmt() {
		return withdrawalAmt;
	}
	public void setWithdrawalAmt(double withdrawalAmt) {
		this.withdrawalAmt = withdrawalAmt;
	}
	public double getDepositAmt() {
		return depositAmt;
	}
	public void setDepositAmt(double depositAmt) {
		this.depositAmt = depositAmt;
	}
	public double getBalanceAmt() {
		return balanceAmt;
	}
	public void setBalanceAmt(double balanceAmt) {
		this.balanceAmt = balanceAmt;
	}

	

}
