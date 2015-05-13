package ua.com.webalbum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.com.webalbum.entity.Foto;
import ua.com.webalbum.repository.FotoRepository;

@Service("FotoService")
@Transactional
public class FotoServiceImpl implements FotoService{
	
	@Autowired
	FotoRepository fotoRepository;
	
	@Override
	public Foto saveFoto(Foto Foto) {
		Foto saveFoto = fotoRepository.saveAndFlush(Foto);
		return saveFoto;
	}

	@Override
	public List<Foto> findAllFotos() {
		return fotoRepository.findAll();
	}

	@Override
	public void deleteFotoById(Integer id) {
		fotoRepository.delete(id);
	}

	@Override
	public Foto getFotoById(Integer id) {
		return fotoRepository.findOne(id);
	}

	@Override
	public List<Foto> findFotos(Integer idAlbum) {
		return fotoRepository.findFotos(idAlbum);
	}
	
}
