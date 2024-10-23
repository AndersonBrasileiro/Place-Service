package br.com.place.placeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.place.placeservice.entity.Place;

public interface PlaceRepository extends JpaRepository<Place, Long> {
    
}
