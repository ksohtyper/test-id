package ru.ksoh.test.idclass;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ru.ksoh.test.UUIDCustomType;

@Getter
@Setter
@Entity
@Table(name = "TEST_ENTITY_ID_CLASS")
@EqualsAndHashCode(of = {"id", "locality"})
@IdClass(IdClassId.class)
@TypeDef(
    name = "pg-uuid",
    defaultForType = UUID.class,
    typeClass = UUIDCustomType.class
)
@DiscriminatorColumn(name = "discr", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("test-entity1")
@ToString
public class TestEntityIdClass implements Identifiable {

    @Id
    @GeneratedValue(generator = IdClassGenerator.STRATEGY, strategy = GenerationType.SEQUENCE)
    @GenericGenerator(name = IdClassGenerator.STRATEGY, strategy = IdClassGenerator.STRATEGY,
        parameters = @org.hibernate.annotations.Parameter(
            name = "sequence_name",
            value = "default_sequence"
        ))
    protected Integer id;

    @Id
    @Type(type = "pg-uuid")
    protected UUID locality;

    @Column(unique = true)
    private String uniqueValue;

    @Column(unique = true)
    private String value;
}
