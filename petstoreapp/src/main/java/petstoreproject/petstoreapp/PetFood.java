package petstoreproject.petstoreapp;

public class PetFood {
	private String foodtype;
	private int calories;
	private int quantity;
	public PetFood(String foodtype, int calories, int quantity) {
		super();
		this.foodtype = foodtype;
		this.calories = calories;
		this.quantity = quantity;
	}
	public String getFoodtype() {
		return foodtype;
	}
	public void setFoodtype(String foodtype) {
		this.foodtype = foodtype;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
