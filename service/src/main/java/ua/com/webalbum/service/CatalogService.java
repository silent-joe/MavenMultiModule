package ua.com.webalbum.service;

import java.util.List;

import ua.com.webalbum.entity.Catalog;

public interface CatalogService {

	Catalog saveCatalog(Catalog catalog);
	
	List<Catalog> findAllCatalogs(); 
	
	void deleteCatalogById(Integer id);

	Catalog getCatalogById(Integer id);
}
