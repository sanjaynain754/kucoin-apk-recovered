package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes45.dex */
public class AtomicReferenceSerializer extends ReferenceTypeSerializer<AtomicReference<?>> {
    private static final long serialVersionUID = 1;

    public AtomicReferenceSerializer(ReferenceType referenceType, boolean z11, AbstractC6431e abstractC6431e, AbstractC6393h<Object> abstractC6393h) {
        super(referenceType, z11, abstractC6431e, abstractC6393h);
    }

    public AtomicReferenceSerializer(AtomicReferenceSerializer atomicReferenceSerializer, BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, NameTransformer nameTransformer, Object obj, boolean z11) {
        super(atomicReferenceSerializer, beanProperty, abstractC6431e, abstractC6393h, nameTransformer, obj, z11);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public Object _getReferenced(AtomicReference<?> atomicReference) {
        return atomicReference.get();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public Object _getReferencedIfPresent(AtomicReference<?> atomicReference) {
        return atomicReference.get();
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public boolean _isValuePresent(AtomicReference<?> atomicReference) {
        return atomicReference.get() != null;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public ReferenceTypeSerializer<AtomicReference<?>> withContentInclusion(Object obj, boolean z11) {
        return new AtomicReferenceSerializer(this, this._property, this._valueTypeSerializer, this._valueSerializer, this._unwrapper, obj, z11);
    }

    @Override // com.fasterxml.jackson.databind.ser.std.ReferenceTypeSerializer
    public ReferenceTypeSerializer<AtomicReference<?>> withResolved(BeanProperty beanProperty, AbstractC6431e abstractC6431e, AbstractC6393h<?> abstractC6393h, NameTransformer nameTransformer) {
        return new AtomicReferenceSerializer(this, beanProperty, abstractC6431e, abstractC6393h, nameTransformer, this._suppressableValue, this._suppressNulls);
    }
}
