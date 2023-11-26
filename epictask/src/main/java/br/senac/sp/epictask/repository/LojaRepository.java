package br.senac.sp.epictask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senac.sp.epictask.model.Loja;

public interface LojaRepository extends JpaRepository<Loja,Long>{
    
}
