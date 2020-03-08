package ru.ksoh.test.idclass;

import java.io.Serializable;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class IdClassId implements Serializable {
    private Integer id;
    private UUID locality;

    public IdClassId(Integer id) {
        this.id = id;
    }

    public IdClassId(UUID locality) {
        this.locality = locality;
    }

    @Override
    public String toString() {
        return "{id=" + id + ", locality=" + locality + '}';
    }
}
