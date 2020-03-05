package simetric.card.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import simetric.card.model.JpaEntity;


@Repository
public interface PersonDao extends CrudRepository<JpaEntity, Integer> {

}