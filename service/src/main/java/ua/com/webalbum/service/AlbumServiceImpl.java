package ua.com.webalbum.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.com.webalbum.entity.Album;
import ua.com.webalbum.repository.AlbumRepository;

@Service("albumService")
@Transactional
public class AlbumServiceImpl implements AlbumService{
	
	@Autowired
	AlbumRepository albumRepository;
	
	@Override
	public Album saveAlbum(Album album) {
		Album saveAlbum = albumRepository.saveAndFlush(album);
		return saveAlbum;
	}

	@Override
	public List<Album> findAllAlbums() {
		return albumRepository.findAll();
	}

	@Override
	public void deleteAlbumById(Integer id) {
		albumRepository.delete(id);
	}

	@Override
	public Album getAlbumById(Integer id) {
		return albumRepository.findOne(id);
	}

	@Override
	public List<Album> findAlbums(Integer idCatalog) {
		return albumRepository.findAlbums(idCatalog);
	}
	
}
