package ru.ksoh.test.idclass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("test-entity2")
public class TestEntityIdClass2 extends TestEntityIdClass {
}
