package com.SpringRestAPI.springrest.entity;
import java.time.LocalDate;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Load {
	
	@Id
	private long shipperID;
	private int noOfTrucks;
	private double weight;
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String truckType; 
	private String comment;
	private LocalDate Date;

	@Override
	public String toString() {
		return "Load [shipperID=" + shipperID + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint
				+ ", productType=" + productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks
				+ ", weight=" + weight + ", comment=" + comment + ", Date=" + Date + "]";
	}

	public long getShipperID() {
		return shipperID;
	}

	public void setShipperID(long shipperID) {
		this.shipperID = shipperID;
	}

	public String getLoadingPoint() {
		return loadingPoint;
	}

	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}

	public String getUnloadingPoint() {
		return unloadingPoint;
	}

	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getTruckType() {
		return truckType;
	}

	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}

	public int getNoOfTrucks() {
		return noOfTrucks;
	}

	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate date) {
		Date = date;
	}

	public Load() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Load(long shipperID, String loadingPoint, String unloadingPoint, String productType, String truckType,
			int noOfTrucks, double weight, String comment, LocalDate date) {
		super();
		this.shipperID = shipperID;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.comment = comment;
		Date = date;
	}
	
}




