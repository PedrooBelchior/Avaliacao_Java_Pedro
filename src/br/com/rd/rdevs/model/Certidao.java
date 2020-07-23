package br.com.rd.rdevs.model;
import java.util.ArrayList;
import java.util.List;

import br.com.rd.rdevs.util.Total;

public abstract class Certidao implements Total{

	private int numeroDeRegistroCertidao;
	private String nomeDaPessoa;
	private String nomeDosDeclarantes;
	private String tipoCertidao;
	private String dataDaEmissaoCertidao;
	private String NomeTabeliaoCertidao;
	private String NomeCartorioCertidao;
	private static int total;
	
	@Override
	public void getTotal() {
		System.out.println("Total de certidões cadastradas: " + this.total);
	}
	
	public Certidao(){
		this.total++;
	}
	
	private void registroCertidao() {
		System.out.println("CERTIDÃO:");
		System.out.println("Nº de Registro: " + getNumeroDeRegistroCertidao());
		System.out.println("Nome: " + getNomeDaPessoa());
		System.out.println("Nome dos declarantes: " + getNomeDosDeclarantes());
		System.out.println("Tipo: " + getTipoCertidao());
		System.out.println("Data de emissão: " + getDataDaEmissaoCertidao());
		System.out.println("Nome do tabelião: " + getNomeTabeliaoCertidao());
		System.out.println("Nome do cartório: " + getNomeCartorioCertidao());
		System.out.println("");
	}
	
	public void validarRegistroCertidao(Certidao certidao) {
		if(getNumeroDeRegistroCertidao()< 0) {
			throw new IllegalArgumentException("O número de registro não pode ser menor que 0");
		}
		certidao.registroCertidao();
	}
	
	
	public int getNumeroDeRegistroCertidao() {
		return numeroDeRegistroCertidao;
	}
	public void setNumeroDeRegistroCertidao(int numeroDeRegistroCertidao) {
		this.numeroDeRegistroCertidao = numeroDeRegistroCertidao;
	}
	public String getNomeDaPessoa() {
		return nomeDaPessoa;
	}
	public void setNomeDaPessoa(String nomeDaPessoa) {
		this.nomeDaPessoa = nomeDaPessoa;
	}
	public String getNomeDosDeclarantes() {
		return nomeDosDeclarantes;
	}
	public void setNomeDosDeclarantes(String nomeDosDeclarantes) {
		this.nomeDosDeclarantes = nomeDosDeclarantes;
	}
	public String getTipoCertidao() {
		return tipoCertidao;
	}
	public void setTipoCertidao(String tipoCertidao) {
		this.tipoCertidao = tipoCertidao;
	}
	public String getDataDaEmissaoCertidao() {
		return dataDaEmissaoCertidao;
	}
	public void setDataDaEmissaoCertidao(String dataDaEmissaoCertidao) {
		this.dataDaEmissaoCertidao = dataDaEmissaoCertidao;
	}
	public String getNomeTabeliaoCertidao() {
		return NomeTabeliaoCertidao;
	}
	public void setNomeTabeliaoCertidao(String nomeTabeliaoCertidao) {
		NomeTabeliaoCertidao = nomeTabeliaoCertidao;
	}
	public String getNomeCartorioCertidao() {
		return NomeCartorioCertidao;
	}
	public void setNomeCartorioCertidao(String nomeCartorioCertidao) {
		NomeCartorioCertidao = nomeCartorioCertidao;
	}


}
