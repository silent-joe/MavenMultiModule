package ua.com.webalbum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.com.webalbum.entity.Foto;

 
public interface FotoRepository extends JpaRepository<Foto, Integer> {

	@Query("from Foto where id_album = :idAlbum")
    List<Foto> findFotos(@Param("idAlbum") Integer idAlbum);

}
