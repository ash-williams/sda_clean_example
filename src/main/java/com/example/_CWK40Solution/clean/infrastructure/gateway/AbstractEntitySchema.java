package com.example._CWK40Solution.clean.infrastructure.gateway;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;
import java.util.Objects;

//@SuppressWarnings("serial")
@MappedSuperclass
abstract class AbstractEntitySchema<ID extends Serializable> implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntitySchema<?> that = (AbstractEntitySchema<?>) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "id=" + id;
    }
}
