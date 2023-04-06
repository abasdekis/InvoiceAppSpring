package gr.cognitera.priceapp.service;


import gr.cognitera.priceapp.DTO.PricelistParamsDTO;
import gr.cognitera.priceapp.model.Pricelist;
import gr.cognitera.priceapp.service.exceptions.EntityNotFoundException;

import java.util.List;

public interface IPricelistService {
    Pricelist insertPricelist(PricelistParamsDTO pricelistParamsDTO);
    Pricelist updatePricelist(PricelistParamsDTO pricelistParamsDTO) throws EntityNotFoundException;
    void deletePricelist(Long id) throws EntityNotFoundException;
    List<Pricelist> getPricelistByTitle(String title) throws EntityNotFoundException;
    Pricelist getPricelistById(Long id) throws EntityNotFoundException;
}
