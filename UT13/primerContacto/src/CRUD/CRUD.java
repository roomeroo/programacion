package CRUD;

import java.util.ArrayList;

public interface CRUD<T> {
    public ArrayList<T> query(String col, String val);
    public ArrayList<T> query(String col, int val);
    public ArrayList<T> requestAll(String sortedBy);
    public T requestByID(int ID); 
    public boolean create(T model);
    public boolean update(T model);
    public boolean delete(T model);
}
