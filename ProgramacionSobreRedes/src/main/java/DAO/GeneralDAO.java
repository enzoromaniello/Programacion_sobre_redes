package DAO;

import java.util.LinkedList;

import DTO.stockDTO;

public interface GeneralDAO<T> {
	

	public int add( T item);

	public int add(LinkedList<T> lista);

	public int delete(T aBorrar) ;


	public int update(T registro) ;


	public LinkedList<T> getAll();
	public LinkedList<T> getAllH2();
	public int setAll(LinkedList<T> lista);
	public int setAllH2(LinkedList<T> lista);

	public T getById(int id);


}
