package ua.com.webalbum.service;

import java.util.List;
import ua.com.webalbum.entity.Album;

public interface AlbumService {

	Album saveAlbum(Album album);
	
	List<Album> findAllAlbums();
	
	List<Album> findAlbums(Integer idCatalog);
	
	void deleteAlbumById(Integer id);

	Album getAlbumById(Integer id);
}
