package ru.ksoh.test;

import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.type.descriptor.java.UUIDTypeDescriptor;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

public class UUIDCustomType extends AbstractSingleColumnStandardBasicType {

    private static final long serialVersionUID = 902830399800029445L;

    public UUIDCustomType() {
        super(VarcharTypeDescriptor.INSTANCE, UUIDTypeDescriptor.INSTANCE);
    }

    @Override
    public String getName() {
        return "uuid";
    }

}
