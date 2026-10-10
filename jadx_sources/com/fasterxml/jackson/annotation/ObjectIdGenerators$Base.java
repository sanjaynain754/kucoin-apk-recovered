package com.fasterxml.jackson.annotation;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes45.dex */
public abstract class ObjectIdGenerators$Base<T> extends ObjectIdGenerator<T> {
    protected final Class<?> _scope;

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public abstract T generateId(Object obj);

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public Class<?> getScope() {
        return this._scope;
    }

    public ObjectIdGenerators$Base(Class<?> cls) {
        this._scope = cls;
    }

    @Override // com.fasterxml.jackson.annotation.ObjectIdGenerator
    public boolean canUseFor(ObjectIdGenerator<?> objectIdGenerator) {
        if (objectIdGenerator.getClass() == getClass() && objectIdGenerator.getScope() == this._scope) {
            return true;
        }
        return false;
    }
}
