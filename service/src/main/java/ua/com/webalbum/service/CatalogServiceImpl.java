package ua.com.webalbum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.com.webalbum.entity.Catalog;
import ua.com.webalbum.repository.CatalogRepository;

@Service("catalogService")
@Transactional
public class CatalogServiceImpl implements CatalogService{
	
	@Autowired
	CatalogRepository catalogRepository;
	
	@Override
	public Catalog saveCatalog(Catalog catalog) {
		Catalog saveCatalog = catalogRepository.saveAndFlush(catalog);
		return saveCatalog;
	}

	@Override
	public List<Catalog> findAllCatalogs() {
		return catalogRepository.findAll();
	}

	@Override
	public void deleteCatalogById(Integer id) {
		catalogRepository.delete(id);
	}

	@Override
	public Catalog getCatalogById(Integer id) {
		return catalogRepository.findOne(id);
	}
}
