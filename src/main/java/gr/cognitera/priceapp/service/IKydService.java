package gr.cognitera.priceapp.service;

import gr.cognitera.priceapp.DTO.KydDTO;
import gr.cognitera.priceapp.model.Kyd;
import gr.cognitera.priceapp.service.exceptions.EntityNotFoundException;

import java.util.List;

public interface IKydService {
    Kyd insertKyd(KydDTO kydDTO);
    Kyd updateKyd(KydDTO kydDTO) throws EntityNotFoundException;
    void deleteKyd(Long id) throws EntityNotFoundException;
    List<Kyd> getkydByCode(String code) throws EntityNotFoundException;
    Kyd getKydyId(Long id) throws EntityNotFoundException;
}
