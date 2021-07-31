
public class mainFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Victor");
		f1.setCpf("153.363.724-32");
		f1.setSalario(2500);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getCpf());
		System.out.println(f1.getSalario());
		
		Gerente g1 = new Gerente();
		
		g1.setNome("João");
		g1.setCpf("273.739.173-32");
		g1.setSalario(3000);
		g1.setSenha(2222);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(g1.authentic(2222));

	}

}
