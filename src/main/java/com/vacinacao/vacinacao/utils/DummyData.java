package com.vacinacao.vacinacao.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vacinacao.vacinacao.model.CadUsuario;
import com.vacinacao.vacinacao.model.CadVacina;
import com.vacinacao.vacinacao.repository.VacinaRepository;
import com.vacinacao.vacinacao.repository.VacinacaoRepository;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    VacinacaoRepository vacinacaoRepository;
    
    @Autowired
    VacinaRepository vacinaRepository;
    
    //@PostConstruct
    public void saveCads(){

        List<CadUsuario> cadUList = new ArrayList<>();
        CadUsuario cad1 = new CadUsuario();
        cad1.setNomeUsuario("Brunno Fabricio");
        cad1.setDataNasc(LocalDate.now());
        cad1.setCpf("14946865624");
        cad1.setEmail("brunnofabricio70@gmail.com");
        
        CadUsuario cad2 = new CadUsuario();
        cad2.setNomeUsuario("Brunno Viegas");
        cad2.setDataNasc(LocalDate.now());
        cad2.setCpf("25646865626");
        cad2.setEmail("brunnoviegass@gmail.com");
        
        cadUList.add(cad1);
        cadUList.add(cad2);

        for(CadUsuario cad: cadUList){
            CadUsuario cadUSaved = vacinacaoRepository.save(cad);
            System.out.println(cadUSaved.getId());
        }
        
        List<CadVacina> cadVList = new ArrayList<>();
        CadVacina cadv1 = new CadVacina();
        cadv1.setNomeVacina("CoronaVac");
        cadv1.setDataAplicacao(LocalDate.now());
        cadv1.setEmail("brunnofabricio70@gmail.com");
        
        CadVacina cadv2 = new CadVacina();
        cadv2.setNomeVacina("Sputnik");
        cadv2.setDataAplicacao(LocalDate.now());
        cadv2.setEmail("brunnoviegass@gmail.com");
        
        cadVList.add(cadv1);
        cadVList.add(cadv2);

        for(CadVacina cad: cadVList){
            CadVacina cadUSaved = vacinaRepository.save(cad);
            System.out.println(cadUSaved.getId());
        }
    }
}
