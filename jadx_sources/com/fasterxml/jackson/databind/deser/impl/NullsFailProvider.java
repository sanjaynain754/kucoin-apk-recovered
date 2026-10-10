package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.InterfaceC6375j;
import com.fasterxml.jackson.databind.exc.InvalidNullException;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.Serializable;

/* JADX INFO: loaded from: classes45.dex */
public class NullsFailProvider implements InterfaceC6375j, Serializable {
    private static final long serialVersionUID = 1;
    protected final PropertyName _name;
    protected final JavaType _type;

    public static NullsFailProvider constructForProperty(BeanProperty beanProperty) {
        return constructForProperty(beanProperty, beanProperty.getType());
    }

    public static NullsFailProvider constructForProperty(BeanProperty beanProperty, JavaType javaType) {
        return new NullsFailProvider(beanProperty.getFullName(), javaType);
    }

    public static NullsFailProvider constructForRootValue(JavaType javaType) {
        return new NullsFailProvider(null, javaType);
    }

    public AccessPattern getNullAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6375j
    public Object getNullValue(DeserializationContext deserializationContext) throws JsonMappingException {
        throw InvalidNullException.from(deserializationContext, this._name, this._type);
    }

    public NullsFailProvider(PropertyName propertyName, JavaType javaType) {
        this._name = propertyName;
        this._type = javaType;
    }

    @Override // com.fasterxml.jackson.databind.deser.InterfaceC6375j
    public /* bridge */ /* synthetic */ Object getAbsentValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return super.getAbsentValue(deserializationContext);
    }
}
