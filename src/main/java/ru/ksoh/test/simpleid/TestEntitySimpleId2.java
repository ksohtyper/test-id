package ru.ksoh.test.simpleid;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("test-entity2")
public class TestEntitySimpleId2 extends TestEntitySimpleId {
}
