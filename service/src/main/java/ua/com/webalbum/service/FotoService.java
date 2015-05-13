package ua.com.webalbum.service;

import java.util.List;

import ua.com.webalbum.entity.Foto;

public interface FotoService {

	Foto saveFoto(Foto foto);
	
	List<Foto> findAllFotos();
	
	List<Foto> findFotos(Integer idAlbum);
	
	void deleteFotoById(Integer id);

	Foto getFotoById(Integer id);
}
