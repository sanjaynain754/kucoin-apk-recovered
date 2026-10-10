package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.databind.introspect.C6419p;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;

/* JADX INFO: loaded from: classes45.dex */
public class PropertyBasedObjectIdGenerator extends ObjectIdGenerators$PropertyGenerator {
    private static final long serialVersionUID = 1;
    protected final BeanPropertyWriter _property;

    public PropertyBasedObjectIdGenerator(C6419p c6419p, BeanPropertyWriter beanPropertyWriter) {
        this(c6419p.m11575f(), beanPropertyWriter);
    }

    public PropertyBasedObjectIdGenerator(Class<?> cls, BeanPropertyWriter beanPropertyWriter) {
        super(cls);
        this._property = beanPropertyWriter;
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator<Object> forScope(Class<?> cls) {
        return cls == this._scope ? this : new PropertyBasedObjectIdGenerator(cls, this._property);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerators$Base, com.fasterxml.jackson.annotation.ObjectIdGenerator
    public Object generateId(Object obj) {
        try {
            return this._property.get(obj);
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception e12) {
            throw new IllegalStateException("Problem accessing property '" + this._property.getName() + "': " + e12.getMessage(), e12);
        }
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator.IdKey key(Object obj) {
        if (obj == null) {
            return null;
        }
        return new ObjectIdGenerator.IdKey(getClass(), this._scope, obj);
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator, com.fasterxml.jackson.annotation.ObjectIdGenerators$Base, com.fasterxml.jackson.annotation.ObjectIdGenerator
    public boolean canUseFor(ObjectIdGenerator<?> objectIdGenerator) {
        if (objectIdGenerator.getClass() == getClass()) {
            PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator = (PropertyBasedObjectIdGenerator) objectIdGenerator;
            if (propertyBasedObjectIdGenerator.getScope() == this._scope && propertyBasedObjectIdGenerator._property == this._property) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public ObjectIdGenerator<Object> newForSerialization(Object obj) {
        return this;
    }
}
