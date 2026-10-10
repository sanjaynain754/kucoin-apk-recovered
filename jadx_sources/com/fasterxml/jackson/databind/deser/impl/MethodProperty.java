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
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.AbstractC6428b;
import com.fasterxml.jackson.databind.util.InterfaceC6484a;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes45.dex */
public final class MethodProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    protected final AnnotatedMethod _annotated;
    protected final transient Method _setter;
    protected final boolean _skipNulls;

    public MethodProperty(AbstractC6414k abstractC6414k, JavaType javaType, AbstractC6428b abstractC6428b, InterfaceC6484a interfaceC6484a, AnnotatedMethod annotatedMethod) {
        super(abstractC6414k, javaType, abstractC6428b, interfaceC6484a);
        this._annotated = annotatedMethod;
        this._setter = annotatedMethod.getAnnotated();
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
            this._setter.invoke(obj, objDeserializeWithType);
        } catch (Exception e11) {
            _throwAsIOE(jsonParser, e11, objDeserializeWithType);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0041 A[RETURN] */
    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        Object objDeserializeWithType;
        Object objInvoke;
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
            objInvoke = this._setter.invoke(obj, objDeserializeWithType);
            if (objInvoke == null) {
                return objInvoke;
            }
        } else if (!this._skipNulls) {
            objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
            try {
                objInvoke = this._setter.invoke(obj, objDeserializeWithType);
                if (objInvoke == null) {
                    return objInvoke;
                }
            } catch (Exception e11) {
                _throwAsIOE(jsonParser, e11, objDeserializeWithType);
                return null;
            }
        }
        return obj;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void fixAccess(DeserializationConfig deserializationConfig) {
        this._annotated.fixAccess(deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        AnnotatedMethod annotatedMethod = this._annotated;
        if (annotatedMethod == null) {
            return null;
        }
        return (A) annotatedMethod.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this._annotated;
    }

    public Object readResolve() {
        return new MethodProperty(this, this._annotated.getAnnotated());
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public final void set(Object obj, Object obj2) throws IOException {
        try {
            this._setter.invoke(obj, obj2);
        } catch (Exception e11) {
            _throwAsIOE(e11, obj2);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        try {
            Object objInvoke = this._setter.invoke(obj, obj2);
            return objInvoke == null ? obj : objInvoke;
        } catch (Exception e11) {
            _throwAsIOE(e11, obj2);
            return null;
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withName(PropertyName propertyName) {
        return new MethodProperty(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withNullProvider(InterfaceC6375j interfaceC6375j) {
        return new MethodProperty(this, this._valueDeserializer, interfaceC6375j);
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
        return new MethodProperty(this, abstractC6390e, interfaceC6375j);
    }

    public MethodProperty(MethodProperty methodProperty, AbstractC6390e<?> abstractC6390e, InterfaceC6375j interfaceC6375j) {
        super(methodProperty, abstractC6390e, interfaceC6375j);
        this._annotated = methodProperty._annotated;
        this._setter = methodProperty._setter;
        this._skipNulls = NullsConstantProvider.isSkipper(interfaceC6375j);
    }

    public MethodProperty(MethodProperty methodProperty, PropertyName propertyName) {
        super(methodProperty, propertyName);
        this._annotated = methodProperty._annotated;
        this._setter = methodProperty._setter;
        this._skipNulls = methodProperty._skipNulls;
    }

    public MethodProperty(MethodProperty methodProperty, Method method) {
        super(methodProperty);
        this._annotated = methodProperty._annotated;
        this._setter = method;
        this._skipNulls = methodProperty._skipNulls;
    }
}
