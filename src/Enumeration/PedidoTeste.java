package Enumeration;

public class PedidoTeste {

	public static void main(String[] args) {
		Pedido pedido1 = new Pedido(111, "21/12/2021");
		System.out.println(pedido1);
		pedido1.atualitzarPedido(Status.PROCESSANDO);
		System.out.println(pedido1);
		pedido1.atualitzarPedido(Status.ENVIADO);
		System.out.println(pedido1);
		pedido1.atualitzarPedido(Status.ENTREGUE);
		System.out.println(pedido1);
	}
}
