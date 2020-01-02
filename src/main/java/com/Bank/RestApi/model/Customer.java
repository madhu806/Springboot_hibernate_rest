package com.Bank.RestApi.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

public class Customer {

	private String accountNo;
	private Date date;
	private String TransactionDetails;
	private Date ValueDate;
	private double withdrawalAmt;
	private double depositAmt;
	private double balanceAmt;

	public Customer(String accountNo, Date date, String TransactionDetails, Date ValueDate, double withdrawalAmt,
			double depositAmt, double balanceAmt) {
		this.accountNo = accountNo;
		this.date = date;
		this.TransactionDetails = TransactionDetails;
		this.ValueDate = ValueDate;
		this.withdrawalAmt = withdrawalAmt;
		this.depositAmt = depositAmt;
		this.balanceAmt = balanceAmt;
	}

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
