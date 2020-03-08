package ru.ksoh.test.idclass;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

public class IdClassGenerator extends SequenceStyleGenerator {

    //constant of full class name value for using as strategy in generator annotation
    public static final String STRATEGY = "ru.ksoh.test.idclass.IdClassGenerator";

    @Override
    public Serializable generate(SessionImplementor session, Object obj) throws HibernateException {
        if (obj instanceof Identifiable) {
            Identifiable entity = (Identifiable) obj;
            Integer id = entity.getId();
            if (id != null) {
                return id;
            }
        }
        return super.generate(session, obj);
    }
}
