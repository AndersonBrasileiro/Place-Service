package br.com.place.placeservice.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.place.placeservice.entity.Place;
import br.com.place.placeservice.repository.PlaceRepository;

@Service
public class PlaceService {
    private PlaceRepository placeRepoitory;

    public PlaceService(PlaceRepository placeRepoitory) {
        this.placeRepoitory = placeRepoitory;
    }

    public List<Place> create(Place place){
        placeRepoitory.save(place);
        return list();
    }
    public List<Place> list(){
        Sort sort = Sort.by("name").ascending();
        return placeRepoitory.findAll(sort);        
    }
    public List<Place> update(Place place){
        placeRepoitory.save(place);
        return list();
    }
    public List<Place> delete(Long id){
        placeRepoitory.deleteById(id);
        return list();
    }
    

    
}
