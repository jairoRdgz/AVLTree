package model;

public class Arbol<K,V> {
	public Nodo<String, String> root;
	
	public Arbol() {
		
	}
	
	public void addRoot(Nodo toAdd) {
		if(root==null) {
			root = toAdd;
		}else {
			root.addNodo(toAdd, root);
		}
	}
}
