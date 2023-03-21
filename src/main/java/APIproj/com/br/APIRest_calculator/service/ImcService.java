package APIproj.com.br.APIRest_calculator.service;

import APIproj.com.br.APIRest_calculator.model.Imc;
import APIproj.com.br.APIRest_calculator.repository.ImcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImcService {

    @Autowired
    private ImcRepository imcRepository;

    public void registrarImc(Imc imc){
        imcRepository.save(imc);
    }

    public List<Imc> listarTodos(){
        return imcRepository.findAll();
    }
}


