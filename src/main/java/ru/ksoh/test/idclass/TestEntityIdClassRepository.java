package ru.ksoh.test.idclass;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestEntityIdClassRepository extends CrudRepository<TestEntityIdClass, IdClassId> {
}
