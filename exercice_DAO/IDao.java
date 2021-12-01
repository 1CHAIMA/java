package exercice_DAO;

import java.util.List;

import sql.Client;

public interface IDao<T> {
	public void create(T object);
	public List<T> read();
	public void update(T etudiant, int id );
	public void delete(int id );
    public T findById(int id);
	public List<T>findByName(String nom);
}
