package me.dio.academia.digital.service.impl;


import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.repository.AvaliacaoFisicaRepository;
import me.dio.academia.digital.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository avaliacaorepository;

    @Autowired
    private AlunoRepository alunorepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaofisica = new AvaliacaoFisica();
        Aluno aluno = alunorepository.findById(form.getAlunoId()).get();
        avaliacaofisica.setAluno(aluno);
        avaliacaofisica.setPeso(form.getPeso());
        avaliacaofisica.setAltura(form.getAltura());
        return avaliacaorepository.save(avaliacaofisica);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return null;
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
