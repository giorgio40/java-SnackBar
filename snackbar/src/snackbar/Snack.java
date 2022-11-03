package snackbar;

public class Snack{
	private int maxid = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingmachineid;


	public Snack(String name, int quantity, double cost, int vendingmachineid){
		maxid++
		id = maxid;
		this.name = name;
		this.quantiy = quantity;
		this.cost = cost;
	}

	public int getId(){
		return id;
	}

	public String getName(){
		return name;
	}

	public int getVendingMachindId(){
		return vendingmachineid;
	}

	public int getQuantity(){
		return quantity;
	}

	public double getCost(){
		return cost;
	}

	public void addQuantity(int amount){
		this.quantity = this.quantity + amount;
	}

	public void buySnack(int amount){
		this.quantity = this.quantity - amount;
	}

	public double totalCost(int amount){
		double cost = this.cost * amount;
		return cost;
	}