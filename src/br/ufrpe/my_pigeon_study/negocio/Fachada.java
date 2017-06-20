package br.ufrpe.my_pigeon_study.negocio;
import br.ufrpe.my_pigeon_study.negocio.beans.*;
public class Fachada {
	
	private Login login;
	private CadastroUsuario cadastroU;
	private static Fachada instancia;
	
	public Fachada(){
		this.login=new Login();
		this.cadastroU=new CadastroUsuario();
	}
	
	public static Fachada getInstancia(){
		if(instancia==null){
			instancia= new Fachada();
		}
		return(instancia);
	}
	
	//USUARIO
	public boolean cadastrarUsuario(Usuario user){
		return(this.cadastroU.cadastrar(user));
	}
	public boolean alterarUsuario(Usuario user){
		return(this.cadastroU.alterar(user));
	}

	public Usuario logar(Usuario user){
		return(this.login.logar(user));
	}
<<<<<<< HEAD
	/*public String showDisciplinas(Usuario user){
		return(cadastroU.showDisciplinas(user));
	}
=======
	/*public String showAtividade(Usuario user, Atividade ativ){
		return(cadastroU.);
	}*/
>>>>>>> master
	public String showTasks(Usuario user){
		return(cadastroU.showTasks(user));
	}*/
	public String calendarioAtividades(Usuario user, int dayOfWeek){
		return(cadastroU.calendarioAtividade(user,dayOfWeek));
	}
	public String calendarioTasks(Usuario user, Data data){
		return(cadastroU.calendarioTask(user,data));
	}
	
	//DISCIPLINA
	public boolean cadastrarDisciplina(Atividade ativi){
		return(this.cadastroU.addAtividade(ativi));
	}
	public Atividade buscarAtividade(String ativi){
		return(this.cadastroU.buscarAtividade(ativi));
	}
	public boolean alterarAtividade(Atividade nomeoriginal){
		return(this.cadastroU.alterarAtividade(nomeoriginal));
	}
	public boolean deletarAtividade(String nome){
		return(this.cadastroU.descadastrarAtividade(nome));
	}
	
	public String showAtiv(){
		return(this.cadastroU.showAtiv());
	}
	//TASK
	public boolean cadastrarTask(Usuario user,Task task){
		return(this.cadastroU.cadastrarTask(user,task));
	}
	public Task buscarTask(Usuario user,String nome){
		return(this.cadastroU.buscarTasks(user,nome));
	}
	public boolean alterarTask(Usuario user,Task novaTask,Task nomeOriginal){
		return(cadastroU.alterarTask(user,novaTask,nomeOriginal));
	}
	public boolean deletarTask(Usuario user,String nome){
		return(this.cadastroU.descadastrarTask(user,nome));
	}
	public String showTask(Usuario user){
	return(cadastroU.showTask(user));
}
}
