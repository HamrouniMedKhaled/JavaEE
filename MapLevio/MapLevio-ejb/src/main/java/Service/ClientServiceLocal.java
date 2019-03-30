package Service;

import java.util.List;


import javax.ejb.Local;
import javax.ejb.LocalBean;

import Entities.Client;
import Entities.Project;
@Local
@LocalBean
public interface ClientServiceLocal {
	public int ajouterClient(Client client);
	public void Update(Client client);
	public int AjouterProjet(Project projet);
	
	
	
	public void DeleteClientById(int userId);
	public Client GetClientById(int userId);
	public List<Client> GetAllClient();
	public List<Client> GetAllClientById(int userId);
	public Client findClientById(int userId);
	


}
