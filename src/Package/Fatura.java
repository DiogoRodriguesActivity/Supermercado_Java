package Package;

import java.util.*;

public class Fatura {
	private ArrayList<Item> item;
	private double total;
	
	public Fatura() {
		this.item = new ArrayList<>();
		this.total = 0;
	}
	
	public void adicionarItem(Item itens) {
        item.add(itens);
        total += itens.getTotal();
    }
	public ArrayList<Item> getItens(){
		return item;
	}
	public double getValorTotal() {
        return total;
    }
	
}
