package ua.com.webalbum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.com.webalbum.entity.Album;
import ua.com.webalbum.entity.Catalog;
import ua.com.webalbum.entity.Foto;
import ua.com.webalbum.service.AlbumService;
import ua.com.webalbum.service.CatalogService;
import ua.com.webalbum.service.FotoService;

@Controller
@RequestMapping("/")
public class AppController {

	@Autowired
	CatalogService catalogService;
	
	@Autowired
	AlbumService albumService;
	
	@Autowired
	FotoService fotoService;

	@RequestMapping(value = {"/", "/catalogs"}, method = RequestMethod.GET)
	public String showCatalog(ModelMap model) {
		List<Catalog> catalogs = catalogService.findAllCatalogs();
		model.addAttribute("catalogs", catalogs);
		return "catalogs";
	}
	
	@RequestMapping(value = "/albums/{id}", method = RequestMethod.GET)
	public String showAlbums(ModelMap model, @PathVariable Integer id) {
		List<Album> albums = albumService.findAlbums(id);
		model.addAttribute("albums", albums);
		return "/albums";
	}
	
	@RequestMapping(value = "/fotos/{id}", method = RequestMethod.GET)
	public String showFotos(ModelMap model, @PathVariable Integer id) {
		List<Foto> fotos = fotoService.findFotos(id);
		model.addAttribute("fotos", fotos);
		return "/fotos";
	}

}
