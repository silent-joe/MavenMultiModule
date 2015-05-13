//package ua.com.webalbum.service;
//
//import static org.junit.Assert.assertEquals;
//
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.support.AnnotationConfigContextLoader;
//
//import ua.com.webalbum.entity.Album;
//import ua.com.webalbum.repository.AlbumRepository;
//
//import ua.com.webalbum.configuration.AppConfig;
//
//@RunWith(SpringJUnit4ClassRunner.class)
////@ContextConfiguration(locations = {"classpath*:test-application-context.xml"} )
////@ContextConfiguration({"classpath*:spring/test-application-context.xml"})
////@ContextConfiguration(classes=OrderServiceConfig.class, loader=AnnotationConfigContextLoader.class)
//@ContextConfiguration(classes=ua.com.webalbum.configuration.AppConfig.class)
//public class AlbumTest {
//
//	@Autowired
//	private AlbumRepository albumRepository;
//	        
//	@Test
//	public void send1_whenRezultFalse() {
//		AlbumService album = new AlbumServiceImpl();
//		List<Album> rezult = album.findAlbums(1);
//		System.out.println(1);
//		assertEquals(rezult, "11");
//		AppController d = er;
//		AppConfig d = er;
//		
//	}
//
//}
