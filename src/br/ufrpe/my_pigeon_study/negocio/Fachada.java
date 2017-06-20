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
	public String showDisciplinas(Usuario user){
		return(cadastroU.showDisciplinas(user));
	}
	public String showTasks(Usuario user){
		return(cadastroU.showTasks(user));
	}
	public String calendarioAtividades(Usuario user, int dayOfWeek){
		return(cadastroU.calendarioAtividade(user,dayOfWeek));
	}
	public String calendarioTasks(Usuario user, Data data){
		return(cadastroU.calendarioTask(user,data));
	}
	//DISCIPLINA
//	public boolean cadastrarDisciplina(Usuario user, Disciplina disci){
//		return(this.cadastroD.cadastrar(user, disci));
//	}
//	public Disciplina buscarDisciplina(Usuario user, String disci){
//		return(this.cadastroD.buscar(user, disci));
//	}
//	public boolean alterarDisciplina(Usuario user,Disciplina disci,String nomeoriginal){
//		return(this.cadastroD.alterar(user, disci,nomeoriginal));
//	}
//	public boolean deletarDisciplina(Usuario user,String nomeoriginal){
//		return(this.cadastroD.remover(user, nomeoriginal));
//	}
	//TASK
	public boolean cadastrarTask(Task task){
		return(this.cadastroU.cadastrarTask(task));
	}
	public Task buscarTask(String nome){
		return(this.cadastroU.buscarTasks(nome));
	}
	public boolean alterarTask(Task novaTask,String nomeOriginal){
		return(cadastroU.alterarTask(novaTask,nomeOriginal));
	}
	public boolean deletarTask(String nome){
		return(this.cadastroU.descadastrarTask(nome));
	}
}
