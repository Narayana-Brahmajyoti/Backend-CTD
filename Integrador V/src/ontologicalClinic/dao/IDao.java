package ontologicalClinic.dao;

public interface IDao <T>{
    public T save(T t);
    public T search(int id);
    public void delete(int id);
    public T edit(T t);

}
