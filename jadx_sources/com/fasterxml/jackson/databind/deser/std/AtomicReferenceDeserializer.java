package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes45.dex */
public class AtomicReferenceDeserializer extends ReferenceTypeDeserializer<AtomicReference<Object>> {
    private static final long serialVersionUID = 1;

    @Override // com.fasterxml.jackson.databind.AbstractC6390e, com.fasterxml.jackson.databind.deser.InterfaceC6375j
    public Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    /* JADX INFO: renamed from: withResolved, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ ReferenceTypeDeserializer<AtomicReference<Object>> withResolved2(AbstractC6428b abstractC6428b, AbstractC6390e abstractC6390e) {
        return withResolved(abstractC6428b, (AbstractC6390e<?>) abstractC6390e);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer, com.fasterxml.jackson.databind.AbstractC6390e, com.fasterxml.jackson.databind.deser.InterfaceC6375j
    public AtomicReference<Object> getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return new AtomicReference<>(this._valueDeserializer.getNullValue(deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    public Object getReferenced(AtomicReference<Object> atomicReference) {
        return atomicReference.get();
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    public AtomicReference<Object> referenceValue(Object obj) {
        return new AtomicReference<>(obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    public AtomicReference<Object> updateReference(AtomicReference<Object> atomicReference, Object obj) {
        atomicReference.set(obj);
        return atomicReference;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer
    public ReferenceTypeDeserializer<AtomicReference<Object>> withResolved(AbstractC6428b abstractC6428b, AbstractC6390e<?> abstractC6390e) {
        return new AtomicReferenceDeserializer(this._fullType, this._valueInstantiator, abstractC6428b, abstractC6390e);
    }

    public AtomicReferenceDeserializer(JavaType javaType, ValueInstantiator valueInstantiator, AbstractC6428b abstractC6428b, AbstractC6390e<?> abstractC6390e) {
        super(javaType, valueInstantiator, abstractC6428b, abstractC6390e);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.ReferenceTypeDeserializer, com.fasterxml.jackson.databind.AbstractC6390e
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return getNullValue(deserializationContext);
    }
}
