package sql;

public interface IDao<T> {    //type T générique <T>

	/*public void create( Client client); 
	public void create( Article article); */
	public void create(T object);
}
