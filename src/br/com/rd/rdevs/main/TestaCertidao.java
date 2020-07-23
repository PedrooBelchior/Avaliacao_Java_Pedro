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
		nasc.setTipoCertidao("Certidão de Nascimento");
		nasc.setDataDaEmissaoCertidao("26/01/1997");
		nasc.setNomeDaPessoa("Pedro Souza Araújo");
		nasc.setNomeDosDeclarantes("Nome da Mãe: Valéria | Nome do Pai: Luís");
		nasc.setNomeTabeliaoCertidao("Severino");
		nasc.setNomeCartorioCertidao("1º Cartório de Registro Civil de pessoas naturais");
		nasc.validarRegistroCertidao(nasc);
		
		nasc2.setNumeroDeRegistroCertidao(405);
		nasc2.setTipoCertidao("Certidão de Nascimento");
		nasc2.setDataDaEmissaoCertidao("04/05/1992");
		nasc2.setNomeDaPessoa("Mariana Souza Araújo");
		nasc2.setNomeDosDeclarantes("Nome da Mãe: Valéria | Nome do Pai: Luís");
		nasc2.setNomeTabeliaoCertidao("Gonzaga");
		nasc2.setNomeCartorioCertidao("2º Cartório de Registro Civil de pessoas naturais");
		nasc2.validarRegistroCertidao(nasc2);
		nasc2.getTotal();
		
		List<String> nomesArray = new ArrayList();
		nomesArray.add(nasc.getNomeDaPessoa());
		nomesArray.add(nasc2.getNomeDaPessoa());
				
		for (int i = 0; i < nomesArray.size(); i++) {
			System.out.println(i + "ºRegistro | Nome: " + nomesArray.get(i));
		}
		
		
		
	}

}
