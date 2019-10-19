package model;

public class Nodo<K extends Comparable<K>,V> {
	private K placa;
	private V marca;
	private int balanceFactor;
	
	private Nodo left;
	private Nodo right;
	
	public Nodo(K p, V m) {
		p = placa;
		m = marca;
		balanceFactor = setBalanceFactor();
	}
	
	public void addNodo(Nodo toAdd, Nodo root) {
		if(root.getPlaca().compareTo(toAdd.getPlaca())<0 ) {
			if(root.getLeft()== null) {
				root.setLeft(toAdd);
			}else {
				
			}
		}
	}
	
	public int getBalanceFactor() {
		return balanceFactor;
	}
	
	public int setBalanceFactor() {
		int balance = this.getHeigth()-this.getHeigth();
		
		return balance;
	}
	
	public int getHeigth() {
		Nodo temporal = this;
		int result = 0;
		while(temporal.getLeft()!= null) {
			result++;
			temporal = temporal.getLeft();
		}
		return result;
	}

	public K getPlaca() {
		return placa;
	}

	public void setPlaca(K placa) {
		this.placa = placa;
	}

	public V getMarca() {
		return marca;
	}

	public void setMarca(V marca) {
		this.marca = marca;
	}

	public Nodo getLeft() {
		return left;
	}

	public void setLeft(Nodo left) {
		this.left = left;
	}

	public Nodo getRight() {
		return right;
	}

	public void setRight(Nodo right) {
		this.right = right;
	}
	
	
}
