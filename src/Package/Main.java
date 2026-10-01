package Package;

public class Main {

	public static void main(String[] args) {
	
		Produto vol1 = new Produto("Xampoo", "XL-200", 10);
		Item item1 = new Item(20, vol1);
		
		  System.out.println("Produto: " + item1.getProduto().getNome());
	        System.out.printf("Preço: R$ %.2f%n", item1.getProduto().getPreco());
	        System.out.println("Quantidade: " + item1.getQuantidade());
	        System.out.printf("Total: R$ %.2f%n", item1.getTotal());
	        
	        
	        Fatura fatura = new Fatura();

	        fatura.adicionarItem(item1);
	        System.out.printf("Valor total da fatura: R$ %.2f%n", fatura.getValorTotal());
	}

}
