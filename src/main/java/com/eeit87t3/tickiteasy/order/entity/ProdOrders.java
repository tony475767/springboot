package com.eeit87t3.tickiteasy.order.entity;

import java.sql.Date;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity 
@Table(name = "prodorders")
public class ProdOrders {
	@Id
	@Column(name = "prodorderid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer prodOrderID; 
	
    @Column(name = "memberID")
	private int memberID; 
	
	@Column(name = "orderdate")
	private Date orderDate;
	
	@Column(name = "payments")
	private String payments;
	
	@Column(name = "paymentinfo")
	private String paymenInfo;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "totalamount")
	private int totalAmount;
	
	@Column(name = "shippingstatus")
	private String shippingStatus;
	
	@Column(name = "shippingID")
	private int shippingID;
	
	@Column(name = "recipientname")
	private String recipientName;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "phone")
	private String phone;
	
    @OneToMany(mappedBy = "prodOrderID", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ProdOrders> prodOrderDetailsBean;

	public ProdOrders(Integer prodOrderID,int memberID, Date orderDate, String payments, String paymenInfo, String status,
			int totalAmount, String shippingStatus, int shippingID, String recipientName, String address,
			String phone) {
		super();
		this.prodOrderID = prodOrderID;
		this.memberID = memberID;
		this.orderDate = orderDate;
		this.payments = payments;
		this.paymenInfo = paymenInfo;
		this.status = status;
		this.totalAmount = totalAmount;
		this.shippingStatus = shippingStatus;
		this.shippingID = shippingID;
		this.recipientName = recipientName;
		this.address = address;
		this.phone = phone;
	}
	public ProdOrders() {
		
	}
	public Integer getProdOrderID() {
		return prodOrderID;
	}
	public void setProdOrderID(int prodOrderID) {
		this.prodOrderID = prodOrderID;
	}
	public int getMemberID() {
		return memberID;
	}
	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getPayments() {
		return payments;
	}
	public void setPayments(String payments) {
		this.payments = payments;
	}
	public String getPaymenInfo() {
		return paymenInfo;
	}
	public void setPaymenInfo(String paymenInfo) {
		this.paymenInfo = paymenInfo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getShippingStatus() {
		return shippingStatus;
	}
	public void setShippingStatus(String shippingStatus) {
		this.shippingStatus = shippingStatus;
	}
	public int getShippingID() {
		return shippingID;
	}
	public void setShippingID(int shippingID) {
		this.shippingID = shippingID;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "ProductOrderBean [prodOrderID=" + prodOrderID + ", memberID=" + memberID + ", orderDate=" + orderDate
				+ ", payments=" + payments + ", paymenInfo=" + paymenInfo + ", status=" + status + ", totalAmount="
				+ totalAmount + ", shippingStatus=" + shippingStatus + ", shippingID=" + shippingID + ", recipientName="
				+ recipientName + ", address=" + address + ", phone=" + phone + "]" + "\n";
	}



}
