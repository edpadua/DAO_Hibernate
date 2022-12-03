import infra.DAO;
import modelo.Ninja;

public class Testes {

	public static void main(String[] args) {
		/*Ninja naruto = new Ninja("Naruto", "Ninjutsu", "Konoha", 30, false);
		Ninja shikamaru = new Ninja("Shikamaru", "Ninjutsu", "Konoha", 29, true);*/
		DAO<Ninja> daoNinja = new DAO<>(Ninja.class);
		
		/*daoNinja.abrir()
		.create(naruto)
		.create(shikamaru)
		.fechar();	*/
		
		daoNinja.atualizar(2, "Itachi", "Genjutsu", "Nao tem", true, 25);
	}
		
	

}
