package br.com.kalil.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import br.com.kalil.object.CPU;

@Repository
@EnableJpaRepositories
public interface CPURepository extends JpaRepository<CPU, Integer>{

}
