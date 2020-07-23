package br.com.rd.rdevs.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.rd.rdevs.model.Nascimento;

public class TestaCertidao {

	public static void main(String[] args) {
		
		Nascimento nasc = new Nascimento();
		Nascimento nasc2 = new Nascimento();
		
		nasc.setNumeroDeRegistroCertidao(2601);
		nasc.setTipoCertidao("Certid�o de Nascimento");
		nasc.setDataDaEmissaoCertidao("26/01/1997");
		nasc.setNomeDaPessoa("Pedro Souza Ara�jo");
		nasc.setNomeDosDeclarantes("Nome da M�e: Val�ria | Nome do Pai: Lu�s");
		nasc.setNomeTabeliaoCertidao("Severino");
		nasc.setNomeCartorioCertidao("1� Cart�rio de Registro Civil de pessoas naturais");
		nasc.validarRegistroCertidao(nasc);
		
		nasc2.setNumeroDeRegistroCertidao(405);
		nasc2.setTipoCertidao("Certid�o de Nascimento");
		nasc2.setDataDaEmissaoCertidao("04/05/1992");
		nasc2.setNomeDaPessoa("Mariana Souza Ara�jo");
		nasc2.setNomeDosDeclarantes("Nome da M�e: Val�ria | Nome do Pai: Lu�s");
		nasc2.setNomeTabeliaoCertidao("Gonzaga");
		nasc2.setNomeCartorioCertidao("2� Cart�rio de Registro Civil de pessoas naturais");
		nasc2.validarRegistroCertidao(nasc2);
		nasc2.getTotal();
		
		List<String> nomesArray = new ArrayList();
		nomesArray.add(nasc.getNomeDaPessoa());
		nomesArray.add(nasc2.getNomeDaPessoa());
				
		for (int i = 0; i < nomesArray.size(); i++) {
			System.out.println(i + "�Registro | Nome: " + nomesArray.get(i));
		}
		
		
		
	}

}
