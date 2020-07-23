package br.com.rd.rdevs.model;
import br.com.rd.rdevs.util.Total;

public abstract class Contrato implements Total{

	private int numeroDeRegistroContrato;
	private String nomeDasPartesEnvolvidas;
	private String nomesDasTestemunhas;
	private String objetoDoContrato;
	private String dataDaEmissaoContrato;
	private String dataDeRegistro;
	private String NomeTabeliaoContrato;
	private String NomeCartorioContrato;
	private static int total;
	
	
	@Override
	public void getTotal() {
		System.out.println("Total de contratos: " + this.total);
	}
	
	public Contrato() {
		this.total++;
	}
	private void registroContrato() {
		System.out.println("CONTRATO:");
		System.out.println("Nº de Registro: " + getNumeroDeRegistroContrato());
		System.out.println("Nome das partes: " + getNomeDasPartesEnvolvidas());
		System.out.println("Nome das testemunhas: " + getNomesDasTestemunhas());
		System.out.println("Objeto: " + getObjetoDoContrato());
		System.out.println("Data de emissão: " + getDataDaEmissaoContrato());
		System.out.println("Data de registro: " + getDataDeRegistro());
		System.out.println("Nome do tabelião: " + getNomeTabeliaoContrato());
		System.out.println("Nome do cartório: " + getNomeCartorioContrato());
		System.out.println("");
	}
	
	public void validarRegistroContrato(Contrato contrato) {
		if(getNumeroDeRegistroContrato()< 0) {
			throw new IllegalArgumentException("O número de registro não pode ser menor que 0");
		}
		contrato.registroContrato();
	}
	
	
	public int getNumeroDeRegistroContrato() {
		return numeroDeRegistroContrato;
	}
	public void setNumeroDeRegistroContrato(int numeroDeRegistroContrato) {
		this.numeroDeRegistroContrato = numeroDeRegistroContrato;
	}
	public String getNomeDasPartesEnvolvidas() {
		return nomeDasPartesEnvolvidas;
	}
	public void setNomeDasPartesEnvolvidas(String nomeDasPartesEnvolvidas) {
		this.nomeDasPartesEnvolvidas = nomeDasPartesEnvolvidas;
	}
	public String getNomesDasTestemunhas() {
		return nomesDasTestemunhas;
	}
	public void setNomesDasTestemunhas(String nomesDasTestemunhas) {
		this.nomesDasTestemunhas = nomesDasTestemunhas;
	}
	public String getObjetoDoContrato() {
		return objetoDoContrato;
	}
	public void setObjetoDoContrato(String objetoDoContrato) {
		this.objetoDoContrato = objetoDoContrato;
	}
	public String getDataDaEmissaoContrato() {
		return dataDaEmissaoContrato;
	}
	public void setDataDaEmissaoContrato(String dataDaEmissaoContrato) {
		this.dataDaEmissaoContrato = dataDaEmissaoContrato;
	}
	public String getDataDeRegistro() {
		return dataDeRegistro;
	}
	public void setDataDeRegistro(String dataDeRegistro) {
		this.dataDeRegistro = dataDeRegistro;
	}
	public String getNomeTabeliaoContrato() {
		return NomeTabeliaoContrato;
	}
	public void setNomeTabeliaoContrato(String nomeTabeliaoContrato) {
		NomeTabeliaoContrato = nomeTabeliaoContrato;
	}
	public String getNomeCartorioContrato() {
		return NomeCartorioContrato;
	}
	public void setNomeCartorioContrato(String nomeCartorioContrato) {
		NomeCartorioContrato = nomeCartorioContrato;
	}
	
}
