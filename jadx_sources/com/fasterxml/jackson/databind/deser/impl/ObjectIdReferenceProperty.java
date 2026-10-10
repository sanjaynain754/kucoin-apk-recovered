package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.InterfaceC6375j;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.C6419p;
import java.io.IOException;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes45.dex */
public class ObjectIdReferenceProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    private final SettableBeanProperty _forward;

    public ObjectIdReferenceProperty(SettableBeanProperty settableBeanProperty, C6419p c6419p) {
        super(settableBeanProperty);
        this._forward = settableBeanProperty;
        this._objectIdInfo = c6419p;
    }

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty$a */
    public static final class C6365a extends C6373h.a {

        /* JADX INFO: renamed from: c */
        public final ObjectIdReferenceProperty f10273c;

        /* JADX INFO: renamed from: d */
        public final Object f10274d;

        public C6365a(ObjectIdReferenceProperty objectIdReferenceProperty, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj) {
            super(unresolvedForwardReference, cls);
            this.f10273c = objectIdReferenceProperty;
            this.f10274d = obj;
        }

        @Override // com.fasterxml.jackson.databind.deser.impl.C6373h.a
        /* JADX INFO: renamed from: c */
        public void mo11205c(Object obj, Object obj2) throws IOException {
            if (m11383d(obj)) {
                this.f10273c.set(this.f10274d, obj2);
                return;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void fixAccess(DeserializationConfig deserializationConfig) {
        SettableBeanProperty settableBeanProperty = this._forward;
        if (settableBeanProperty != null) {
            settableBeanProperty.fixAccess(deserializationConfig);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this._forward.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public int getCreatorIndex() {
        return this._forward.getCreatorIndex();
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this._forward.getMember();
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void set(Object obj, Object obj2) throws IOException {
        this._forward.set(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        return this._forward.setAndReturn(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withName(PropertyName propertyName) {
        return new ObjectIdReferenceProperty(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withNullProvider(InterfaceC6375j interfaceC6375j) {
        return new ObjectIdReferenceProperty(this, this._valueDeserializer, interfaceC6375j);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withValueDeserializer(AbstractC6390e<?> abstractC6390e) {
        AbstractC6390e<?> abstractC6390e2 = this._valueDeserializer;
        if (abstractC6390e2 == abstractC6390e) {
            return this;
        }
        InterfaceC6375j interfaceC6375j = this._nullProvider;
        if (abstractC6390e2 == interfaceC6375j) {
            interfaceC6375j = abstractC6390e;
        }
        return new ObjectIdReferenceProperty(this, abstractC6390e, interfaceC6375j);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        deserializeSetAndReturn(jsonParser, deserializationContext, obj);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        try {
            return setAndReturn(obj, deserialize(jsonParser, deserializationContext));
        } catch (UnresolvedForwardReference e11) {
            if (this._objectIdInfo == null && this._valueDeserializer.getObjectIdReader() == null) {
                throw JsonMappingException.from(jsonParser, "Unresolved forward reference but no identity info", e11);
            }
            e11.getRoid().m11373a(new C6365a(this, e11, this._type.getRawClass(), obj));
            return null;
        }
    }

    public ObjectIdReferenceProperty(ObjectIdReferenceProperty objectIdReferenceProperty, AbstractC6390e<?> abstractC6390e, InterfaceC6375j interfaceC6375j) {
        super(objectIdReferenceProperty, abstractC6390e, interfaceC6375j);
        this._forward = objectIdReferenceProperty._forward;
        this._objectIdInfo = objectIdReferenceProperty._objectIdInfo;
    }

    public ObjectIdReferenceProperty(ObjectIdReferenceProperty objectIdReferenceProperty, PropertyName propertyName) {
        super(objectIdReferenceProperty, propertyName);
        this._forward = objectIdReferenceProperty._forward;
        this._objectIdInfo = objectIdReferenceProperty._objectIdInfo;
    }
}
