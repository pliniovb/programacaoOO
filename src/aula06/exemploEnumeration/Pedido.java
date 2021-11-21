package aula06.exemploEnumeration;

public class Pedido {

	private final Integer ID;
	private String data;
	private Status statusPedido;
	
	public Pedido(Integer id, String data) {
		super();
		this.ID = id;
		this.data = data;
		this.statusPedido = Status.AGUARDANDO_PAGAMENTO;
	}
	
	public void atualitzarPedido(Status statusAtual) {
		this.statusPedido = statusAtual;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + ID + ", data=" + data + ", statusPedido=" + statusPedido + "]";
	}
	
}
