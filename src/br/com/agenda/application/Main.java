package br.com.agenda.application;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * CREATE
		 * Criar contato
		 */
		
		ContatoDAO contatoDao = new ContatoDAO();
		
		Contato contato = new Contato();
		contato.setNome("Marília Gabriela");
		contato.setIdade(43);
		contato.setDataCadastro(new Date());
		
		//Descomentar para criar contato:
		//contatoDao.save(contato);
		
		//-------------------------------------------------------------------
		
		/*
		 * READ
		 * Visualização de TODOS os registros do banco de dados
		 */
		
		for(Contato c : contatoDao.getContatos()) {
			System.out.println("ID: " + c.getId());
			System.out.println("Contato: " + c.getNome());
			System.out.println("Idade: " + c.getIdade());
			System.out.println("Data de Cadastro: " + c.getDataCadastro());
			System.out.println("");
		}
		
		//-------------------------------------------------------------------
		
		/*
		 * UPDATE
		 * Atualizar o contato
		 */
		
		Contato c1 = new Contato();
		c1.setNome("Maria Fernanda Dionizio");
		c1.setIdade(37);
		c1.setDataCadastro(new Date());
		c1.setId(1); // É o número que está no banco de dados da PK
		
		//Descomentar para atualizar contato
		//contatoDao.update(c1);
	
		//-------------------------------------------------------------------
		
		/*
		 *DELETE
		 *Deletar o contato pelo seu número de ID 
		 */
		
		//Descomentar para deletar contato:
		//contatoDao.deleteByID(0);
				
	}
}
