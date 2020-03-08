package ru.ksoh.test.simpleid;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestEntitySimpleIdRepository extends CrudRepository<TestEntitySimpleId, Integer> {
}
