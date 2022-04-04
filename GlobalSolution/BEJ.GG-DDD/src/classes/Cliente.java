package classes;

public class Cliente {
	private int codigo_cliente;
	private String nome;
	private String email;
	private String senha;
	private String dataDeNascimento;
	
	public Cliente() {
	}

	public Cliente(int codigo_cliente, String nome, String email, String senha, String dataDeNascimento) {
		this.codigo_cliente = codigo_cliente;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.dataDeNascimento = dataDeNascimento;
	}

	public int getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(int codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	
}
