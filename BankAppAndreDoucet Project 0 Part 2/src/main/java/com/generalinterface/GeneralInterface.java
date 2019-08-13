package com.generalinterface;

import java.util.List;

public interface GeneralInterface<T> {
	public boolean CreateRecord(T t);
	public List<T> FindAllRecords();
	public T FindByIdRecord(T t);
	public boolean UpdateRecord(T t);
	public boolean DeleteRecord(T t);

}
