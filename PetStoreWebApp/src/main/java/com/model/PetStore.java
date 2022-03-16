package com.model;
import java.util.*;
public class PetStore {
	private String storeName;
	private String storeAddress;
	public PetStore() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PetStore(String storeName, String storeAddress) {
		super();
		this.storeName = storeName;
		this.storeAddress = storeAddress;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreAddress() {
		return storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}
}
