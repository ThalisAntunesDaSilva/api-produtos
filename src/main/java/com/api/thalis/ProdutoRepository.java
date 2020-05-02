package com.api.thalis;

import org.springframework.data.jpa.repository.JpaRepository;



public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	
Produto findById(int id);

}
