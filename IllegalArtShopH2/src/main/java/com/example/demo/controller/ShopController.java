package com.example.demo.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Artwork;
import com.example.demo.entity.Shop;
import com.example.demo.repository.DatabaseArt;
import com.example.demo.service.IDatabase;
import com.example.demo.service.IDatabaseArt;

//no funciona controller, restcontroller si.
@Controller
@RequestMapping("/shops")
public class ShopController {

@Autowired	
IDatabase db;
@Autowired
DatabaseArt db1;

//POST. Creación tienda
@PostMapping("/create/{name}/{stock}")
public ResponseEntity<Shop> createShop(@PathVariable(name = "name") String name, @PathVariable(name = "stock") int stock) {
	Shop shop = new Shop(name, stock);
	db.saveShop(shop);
	return ResponseEntity.ok(shop);
}

//GET. Lista de tiendas
@GetMapping("/list")
public ResponseEntity<List<Shop>> listShops() {
	return ResponseEntity.ok(db.listShops());	
}

//POST. Añadir cuadro a una tienda.
@PostMapping("/añadirCuadro/{shop_id}/{name}/{author}/{prize}")
public ResponseEntity<Artwork> createArtwork(@PathVariable(name = "name") String name, @PathVariable(name = "author") String author, @PathVariable(name = "prize") double prize, @PathVariable(name = "shop_id") int shop_id) {
Optional<Shop> shop = db.findShopById(shop_id);
Date date = new Date();

Artwork art = new Artwork(name, author, prize, date, shop.get());
db1.save(art);

	return ResponseEntity.ok(art);
}

//DELETE. Borrar arte de una tienda
@DeleteMapping("/delete/{shop_id}")
public ResponseEntity DeleteArt(@PathVariable(name = "shop_id") int shop_id) {
db.deleteArt(shop_id);

return ResponseEntity.ok("Galería borrada con éxito." + db.showArt(shop_id));
}


//GET. Filtra arte por tienda
@GetMapping("/listArt/{shop_id}")
public ResponseEntity<List<Artwork>> listArt(@PathVariable(name = "shop_id") int shop_id) {
	return ResponseEntity.ok(db.showArt(shop_id));	
}


}
