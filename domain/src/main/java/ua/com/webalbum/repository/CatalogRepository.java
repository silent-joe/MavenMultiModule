package ua.com.webalbum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.com.webalbum.entity.Catalog;

 
public interface CatalogRepository extends JpaRepository<Catalog, Integer> {



}
