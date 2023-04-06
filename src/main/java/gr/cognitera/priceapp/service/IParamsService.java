package gr.cognitera.priceapp.service;

import gr.cognitera.priceapp.DTO.ParamDTO;
import gr.cognitera.priceapp.DTO.PricelistDTO;
import gr.cognitera.priceapp.model.Param;
import gr.cognitera.priceapp.model.Pricelist;
import gr.cognitera.priceapp.service.exceptions.EntityNotFoundException;

import java.util.List;

public interface IParamsService {
    Param insertParam(ParamDTO paramDTO);
    Param updateParam(ParamDTO paramDTO) throws EntityNotFoundException;
    void deleteParam(Long id) throws EntityNotFoundException;
    List<Param> getParamsByTag(String tag) throws EntityNotFoundException;
    Param getParamById(Long id) throws EntityNotFoundException;
}
