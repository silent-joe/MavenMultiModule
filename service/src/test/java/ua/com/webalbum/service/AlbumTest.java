package ua.com.webalbum.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ua.com.webalbum.entity.Album;
import ua.com.webalbum.repository.AlbumRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConfigurationTest.class)
public class AlbumTest {

	@Autowired
	private AlbumRepository albumRepository;
	        
	@Test
	public void sendFirstAlbum_whenRezultFalse() {
		Album album = albumRepository.findOne(1);
		String result = album.getName();
		assertEquals(result, "super-moto");
	}
	
	@Test
	public void writeAlbum_whenRezultFalse() {
		albumRepository.saveAndFlush(new Album(3, "777"));
		String result = albumRepository.findOne(5).getName();
		assertEquals(result, "777");
	}
	
	@Test
	public void deleteAlbum_whenRezultFalse() {
		albumRepository.delete(5);
		long count = albumRepository.count();
		assertEquals(count, 4);
	}
	
	@Test
	public void getAlbums_whenRezultFalse() {
		List<Album> albums = albumRepository.findAlbums(1);
		String result = albums.toString();
		assertEquals(result, "[[id=1, name=super-moto], [id=2, name=just-moto]]");
	}
	
}
