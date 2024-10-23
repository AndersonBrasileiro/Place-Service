package br.com.place.placeservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.place.placeservice.entity.Place;
import br.com.place.placeservice.service.PlaceService;

@RestController
@RequestMapping("/places")

public class PlaceController {

    private PlaceService placeService;

    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }
    @PostMapping
    List<Place> create (@RequestBody Place place){
        return placeService.create(place);
    }

     @GetMapping
    List<Place> list(){
        return placeService.list();
    }

    @PutMapping
    List<Place> update (@RequestBody Place place){
        return placeService.update(place);
    }

    @DeleteMapping("{id}")
    List<Place> delete (@PathVariable ("id")Long id){
        return placeService.delete(id);
    }

    
}
