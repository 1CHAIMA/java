package sql;

public interface IDao<T> {    //type T g�n�rique <T>

	/*public void create( Client client); 
	public void create( Article article); */
	public void create(T object);
}
