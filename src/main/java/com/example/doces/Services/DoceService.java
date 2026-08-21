package com.example.doces.Services;

import com.example.doces.DTOs.DoceResponse;
import com.example.doces.Entities.Doce;
import com.example.doces.Repositories.DoceRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DoceService {
        private final DoceRepository doceRepository;

        public DoceService(DoceRepository doceRepository) {
            this.doceRepository = doceRepository;
        }


        public List<DoceResponse> mostrarDoce() {
            return doceRepository.findAll().stream().map(doce -> new DoceResponse(doce.getNome(), doce.getRecheio(), doce.getPreco(), doce.getFabricacao(),doce.getValidade())).toList();

        }
       // funcionalidade mostrar doce, que mostra todas as informações necessarias para o usuario gerenciar seu estoque


        public DoceResponse buscarID(long id) {
            Optional<Doce> doce = doceRepository.findById(id);
            DoceResponse doceResponse = new DoceResponse();
            doceResponse.setNome(doce.get().getNome());
            doceResponse.setRecheio(doce.get().getRecheio());
            doceResponse.setPreco(doce.get().getPreco());
            doceResponse.setFabricacao(doce.get().getFabricacao());
            doceResponse.setValidade(doce.get().getValidade());

            return doceResponse;
        }
    // o buscar id mostra o doce e suas informações de forma individual, de forma a diferente do mostrarDoce, aparecer apenas aquilo que o user está procurando está relacionada com a mesma função no controller


    public String deletar(Long id) {
            Optional<Doce> doce = doceRepository.findById(id);
            if (doce  == null) {
                return "Esse doce nao existe ou não teve lote para vendas";
            } else {
                doceRepository.deleteById(id);
                return "Doce excluido!!";
            }
        // o apagar ID deleta o doce e  suas informações, utilizando seu ID como base

    }

        public DoceResponse criarDoce(DoceResponse response) {
            Doce doce = new Doce();
            doce.setNome(response.getNome());
            doce.setPreco(response.getPreco());
            doce.setRecheio(response.getRecheio());
            doce.setValidade(response.getValidade());
            doce.setFabricacao(response.getFabricacao());
            doceRepository.save(doce);
            return response;
        }
        // utilizando o método SET e POST principalmente é aonde as informações sobre os doces serão cadastradas

        public String alterar(Long id, DoceResponse response){
            Doce doce = doceRepository.findById(id).orElseThrow();
            doce.setNome(doce.getNome());
            doce.setPreco(response.getPreco());
            doce.setValidade(response.getValidade());
            doceRepository.save(doce);
            return "informações alteradas";
        }
    // o alterar utiliza do método PUT e o setter para alterar qualquer informação dos doces que fosse necessária, porém é necessario saber seu id para encontra-la

}

