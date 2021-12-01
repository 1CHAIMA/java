package sql;

import java.util.List;

public class MainDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//GetConnection.getConnection();
		ClientDao moussa =new ClientDao();
		
		moussa.create(new Client("cda", "afpa"));
		moussa.create(new Client("machin", "bidule"));
		moussa.create(new Client("super", "java"));
		//afficher les clients
		/*List<Client> clients =moussa.read();
		for (Client client : clients) {
			System.out.println(client.getNom());
		}
		//update
		Client afpa = new Client("paris","centre");
		//moussa.create("test", "test2");
		moussa.update(afpa, 5);
		moussa.delete(1);*/
	}

	
	//MVC
	
	
	
	
	
	
	
}
