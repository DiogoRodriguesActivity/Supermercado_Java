package Package;

public class Item {
	private Produto produto;
	private int quantidade;
	private double total;
	
	public Item(int quantidade, Produto produto) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.total = soma();
	}
	
	public double soma() {
		return  produto.getPreco() * quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	
	
}
