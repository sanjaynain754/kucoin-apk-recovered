package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.InterfaceC6375j;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AbstractC6414k;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.util.C6490g;
import com.fasterxml.jackson.databind.util.InterfaceC6484a;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes45.dex */
public final class FieldProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    protected final AnnotatedField _annotated;
    protected final transient Field _field;
    protected final boolean _skipNulls;

    public FieldProperty(AbstractC6414k abstractC6414k, JavaType javaType, AbstractC6428b abstractC6428b, InterfaceC6484a interfaceC6484a, AnnotatedField annotatedField) {
        super(abstractC6414k, javaType, abstractC6428b, interfaceC6484a);
        this._annotated = annotatedField;
        this._field = annotatedField.getAnnotated();
        this._skipNulls = NullsConstantProvider.isSkipper(this._nullProvider);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object objDeserializeWithType;
        if (!jsonParser.mo10890k0(JsonToken.VALUE_NULL)) {
            AbstractC6428b abstractC6428b = this._valueTypeDeserializer;
            if (abstractC6428b == null) {
                Object objDeserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
                if (objDeserialize != null) {
                    objDeserializeWithType = objDeserialize;
                } else if (this._skipNulls) {
                    return;
                } else {
                    objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                }
            } else {
                objDeserializeWithType = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC6428b);
            }
        } else if (this._skipNulls) {
            return;
        } else {
            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
        }
        try {
            this._field.set(obj, objDeserializeWithType);
        } catch (Exception e11) {
            _throwAsIOE(jsonParser, e11, objDeserializeWithType);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object objDeserializeWithType;
        if (!jsonParser.mo10890k0(JsonToken.VALUE_NULL)) {
            AbstractC6428b abstractC6428b = this._valueTypeDeserializer;
            if (abstractC6428b == null) {
                Object objDeserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
                if (objDeserialize != null) {
                    objDeserializeWithType = objDeserialize;
                } else if (!this._skipNulls) {
                    objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                }
            } else {
                objDeserializeWithType = this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC6428b);
            }
            this._field.set(obj, objDeserializeWithType);
            return obj;
        }
        if (!this._skipNulls) {
            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
            try {
                this._field.set(obj, objDeserializeWithType);
                return obj;
            } catch (Exception e11) {
                _throwAsIOE(jsonParser, e11, objDeserializeWithType);
            }
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void fixAccess(DeserializationConfig deserializationConfig) {
        C6490g.m11936g(this._field, deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        AnnotatedField annotatedField = this._annotated;
        if (annotatedField == null) {
            return null;
        }
        return (A) annotatedField.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this._annotated;
    }

    public Object readResolve() {
        return new FieldProperty(this);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void set(Object obj, Object obj2) throws IOException {
        try {
            this._field.set(obj, obj2);
        } catch (Exception e11) {
            _throwAsIOE(e11, obj2);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        try {
            this._field.set(obj, obj2);
            return obj;
        } catch (Exception e11) {
            _throwAsIOE(e11, obj2);
            return obj;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withName(PropertyName propertyName) {
        return new FieldProperty(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withNullProvider(InterfaceC6375j interfaceC6375j) {
        return new FieldProperty(this, this._valueDeserializer, interfaceC6375j);
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
        return new FieldProperty(this, abstractC6390e, interfaceC6375j);
    }

    public FieldProperty(FieldProperty fieldProperty, AbstractC6390e<?> abstractC6390e, InterfaceC6375j interfaceC6375j) {
        super(fieldProperty, abstractC6390e, interfaceC6375j);
        this._annotated = fieldProperty._annotated;
        this._field = fieldProperty._field;
        this._skipNulls = NullsConstantProvider.isSkipper(interfaceC6375j);
    }

    public FieldProperty(FieldProperty fieldProperty, PropertyName propertyName) {
        super(fieldProperty, propertyName);
        this._annotated = fieldProperty._annotated;
        this._field = fieldProperty._field;
        this._skipNulls = fieldProperty._skipNulls;
    }

    public FieldProperty(FieldProperty fieldProperty) {
        super(fieldProperty);
        AnnotatedField annotatedField = fieldProperty._annotated;
        this._annotated = annotatedField;
        Field annotated = annotatedField.getAnnotated();
        if (annotated != null) {
            this._field = annotated;
            this._skipNulls = fieldProperty._skipNulls;
            return;
        }
        throw new IllegalArgumentException("Missing field (broken JDK (de)serialization?)");
    }
}
