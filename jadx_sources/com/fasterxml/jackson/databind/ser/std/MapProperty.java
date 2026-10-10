package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6393h;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import p528p7.InterfaceC43404j;

/* JADX INFO: loaded from: classes45.dex */
public class MapProperty extends PropertyWriter {

    /* JADX INFO: renamed from: b */
    public static final BeanProperty f10653b = new BeanProperty.C6333a();
    private static final long serialVersionUID = 1;
    protected Object _key;
    protected AbstractC6393h<Object> _keySerializer;
    protected final BeanProperty _property;
    protected final AbstractC6431e _typeSerializer;
    protected Object _value;
    protected AbstractC6393h<Object> _valueSerializer;

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    @Deprecated
    public void depositSchemaProperty(ObjectNode objectNode, AbstractC6446m abstractC6446m) throws JsonMappingException {
    }

    public void reset(Object obj, Object obj2, AbstractC6393h<Object> abstractC6393h, AbstractC6393h<Object> abstractC6393h2) {
        this._key = obj;
        this._value = obj2;
        this._keySerializer = abstractC6393h;
        this._valueSerializer = abstractC6393h2;
    }

    public MapProperty(AbstractC6431e abstractC6431e, BeanProperty beanProperty) {
        super(beanProperty == null ? PropertyMetadata.STD_REQUIRED_OR_OPTIONAL : beanProperty.getMetadata());
        this._typeSerializer = abstractC6431e;
        this._property = beanProperty == null ? f10653b : beanProperty;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public void depositSchemaProperty(InterfaceC43404j interfaceC43404j, AbstractC6446m abstractC6446m) throws JsonMappingException {
        this._property.depositSchemaProperty(interfaceC43404j, abstractC6446m);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this._property.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        return (A) this._property.getContextAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public PropertyName getFullName() {
        return new PropertyName(getName());
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this._property.getMember();
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty, com.fasterxml.jackson.databind.util.InterfaceC6494k
    public String getName() {
        Object obj = this._key;
        return obj instanceof String ? (String) obj : String.valueOf(obj);
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public JavaType getType() {
        return this._property.getType();
    }

    public Object getValue() {
        return this._value;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public PropertyName getWrapperName() {
        return this._property.getWrapperName();
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws Exception {
        AbstractC6431e abstractC6431e = this._typeSerializer;
        if (abstractC6431e == null) {
            this._valueSerializer.serialize(this._value, jsonGenerator, abstractC6446m);
        } else {
            this._valueSerializer.serializeWithType(this._value, jsonGenerator, abstractC6446m, abstractC6431e);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        this._keySerializer.serialize(this._key, jsonGenerator, abstractC6446m);
        AbstractC6431e abstractC6431e = this._typeSerializer;
        if (abstractC6431e == null) {
            this._valueSerializer.serialize(this._value, jsonGenerator, abstractC6446m);
        } else {
            this._valueSerializer.serializeWithType(this._value, jsonGenerator, abstractC6446m, abstractC6431e);
        }
    }

    public void setValue(Object obj) {
        this._value = obj;
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsOmittedField(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws Exception {
        if (!jsonGenerator.m10821i()) {
            jsonGenerator.m10832n0(getName());
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.PropertyWriter
    public void serializeAsPlaceholder(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws Exception {
        jsonGenerator.mo10812b0();
    }

    @Deprecated
    public void reset(Object obj, AbstractC6393h<Object> abstractC6393h, AbstractC6393h<Object> abstractC6393h2) {
        reset(obj, this._value, abstractC6393h, abstractC6393h2);
    }
}
