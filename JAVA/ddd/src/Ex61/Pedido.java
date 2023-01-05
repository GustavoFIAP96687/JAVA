package Ex61;

import java.util.ArrayList;

public class Pedido {
	private int id;
	private Cliente cliente;
	private ArrayList<String> listaPedido;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<String> getListaPedido() {
		return listaPedido;
	}

	public void setListaPedido(ArrayList<String> listaPedido) {
		this.listaPedido = listaPedido;
	}
	
	public Pedido () {
		
	}
	
	public Pedido(int id, Cliente cliente, ArrayList<String> listaPedido) {
		this.cliente = cliente;
		this.id = id;
		this.listaPedido = listaPedido;
	}

}
