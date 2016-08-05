package com.we.code.dao.api;

import java.util.List;

import com.we.code.model.WePlate;

public interface PlateDao {

	List<?> findByExample(WePlate instance);

	void persist(WePlate transientInstance);

	void attachDirty(WePlate instance);

	void attachClean(WePlate instance);

	void delete(WePlate persistentInstance);

	WePlate merge(WePlate detachedInstance);

	WePlate findById(Integer id);
	

}
