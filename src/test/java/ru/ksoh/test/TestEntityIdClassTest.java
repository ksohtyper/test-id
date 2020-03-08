package ru.ksoh.test;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ru.ksoh.test.simpleid.TestEntitySimpleId;
import ru.ksoh.test.simpleid.TestEntitySimpleId2;
import ru.ksoh.test.idclass.TestEntityIdClass;
import ru.ksoh.test.idclass.TestEntityIdClass2;
import ru.ksoh.test.idclass.TestEntityIdClassRepository;
import ru.ksoh.test.simpleid.TestEntitySimpleIdRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class TestEntityIdClassTest {

    @Autowired
    private TestEntityIdClassRepository testEntityIdClassRepository;

    @Autowired
    private TestEntitySimpleIdRepository testEntitySimpleIdRepository;

    //simple id: parent entity, generated id
    @Test
    public void testEntitySimpleIdWithGeneratedId() {
        TestEntitySimpleId testEntity = new TestEntitySimpleId();
        testEntity.setUniqueValue("qwe");
        testEntity.setValue("1");
        TestEntitySimpleId saved = testEntitySimpleIdRepository.save(testEntity);
        System.out.println(saved);
        saved.setValue("2");
        testEntitySimpleIdRepository.save(saved);
        System.out.println(testEntitySimpleIdRepository.findAll());
    }

    //simple id: parent entity, set id
    @Test
    public void testEntitySimpleIdWithSetId() {
        TestEntitySimpleId testEntity = new TestEntitySimpleId();
        testEntity.setUniqueValue("qwe");
        testEntity.setValue("1");
        testEntity.setId(13);
        TestEntitySimpleId saved = testEntitySimpleIdRepository.save(testEntity);
        System.out.println(saved);
        saved.setValue("2");
        testEntitySimpleIdRepository.save(saved);
        System.out.println(testEntitySimpleIdRepository.findAll());
    }

    //simple id: inherited entity, generated id
    @Test
    public void testEntitySimpleId2WithGeneratedId() {
        TestEntitySimpleId2 testEntity = new TestEntitySimpleId2();
        testEntity.setUniqueValue("qwe");
        testEntity.setValue("1");
        TestEntitySimpleId2 saved = testEntitySimpleIdRepository.save(testEntity);
        System.out.println(saved);
        saved.setValue("2");
        testEntitySimpleIdRepository.save(saved);
        System.out.println(testEntitySimpleIdRepository.findAll());
    }

    //simple id: inherited entity, set id
    @Test
    public void testEntitySimpleId2WithSetId() {
        TestEntitySimpleId2 testEntity = new TestEntitySimpleId2();
        testEntity.setUniqueValue("qwe");
        testEntity.setValue("1");
        testEntity.setId(13);
        TestEntitySimpleId2 saved = testEntitySimpleIdRepository.save(testEntity);
        System.out.println(saved);
        saved.setValue("2");
        testEntitySimpleIdRepository.save(saved);
        System.out.println(testEntitySimpleIdRepository.findAll());
    }

    //compound id: parent entity, generated id
    @Test
    public void testEntityIdClassWithGeneratedId() {
        TestEntityIdClass testEntity = new TestEntityIdClass();
        testEntity.setLocality(UUID.randomUUID());
        testEntity.setUniqueValue("qwe");
        testEntity.setValue("1");
        TestEntityIdClass saved = testEntityIdClassRepository.save(testEntity);
        System.out.println(saved);
        saved.setValue("2");
        testEntityIdClassRepository.save(saved);
        System.out.println(testEntityIdClassRepository.findAll());
    }

    //compound id: parent entity, set id
    @Test
    public void testEntityIdClassWithSetId() {
        TestEntityIdClass testEntity = new TestEntityIdClass();
        testEntity.setLocality(UUID.randomUUID());
        testEntity.setUniqueValue("qwe");
        testEntity.setValue("1");
        testEntity.setId(13);
        TestEntityIdClass saved = testEntityIdClassRepository.save(testEntity);
        System.out.println(saved);
        saved.setValue("2");
        testEntityIdClassRepository.save(saved);
        System.out.println(testEntityIdClassRepository.findAll());
    }

    //compound id: inherited entity, generated id
    //todo not passed: 2 inserts instead of insert + update
    @Test
    public void testEntityIdClass2WithGeneratedId() {
        TestEntityIdClass2 testEntity = new TestEntityIdClass2();
        testEntity.setLocality(UUID.randomUUID());
        testEntity.setUniqueValue("qwe");
        testEntity.setValue("1");
        TestEntityIdClass2 saved = testEntityIdClassRepository.save(testEntity);
        System.out.println(saved);
        saved.setValue("2");
        testEntityIdClassRepository.save(saved);
        System.out.println(testEntityIdClassRepository.findAll());
    }

    //compound id: inherited entity, set id
    //todo not passed: 2 inserts instead of insert + update
    @Test
    public void testEntityIdClass2WithSetId() {
        TestEntityIdClass2 testEntity = new TestEntityIdClass2();
        testEntity.setLocality(UUID.randomUUID());
        testEntity.setUniqueValue("qwe");
        testEntity.setValue("1");
        testEntity.setId(13);
        TestEntityIdClass2 saved = testEntityIdClassRepository.save(testEntity);
        System.out.println(saved);
        saved.setValue("2");
        testEntityIdClassRepository.save(saved);
        System.out.println(testEntityIdClassRepository.findAll());
    }
}