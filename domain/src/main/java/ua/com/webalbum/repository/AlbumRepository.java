package ua.com.webalbum.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.com.webalbum.entity.Album;

public interface AlbumRepository extends JpaRepository<Album, Integer> {

	@Query("from Album where id_catalog = :idCatalog")
    List<Album> findAlbums(@Param("idCatalog") Integer idCatalog);

}
