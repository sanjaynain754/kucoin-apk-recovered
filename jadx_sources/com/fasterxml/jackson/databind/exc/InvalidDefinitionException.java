package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AbstractC6340b;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.introspect.AbstractC6414k;

/* JADX INFO: loaded from: classes45.dex */
public class InvalidDefinitionException extends JsonMappingException {
    protected transient AbstractC6340b _beanDesc;
    protected transient AbstractC6414k _property;
    protected final JavaType _type;

    public InvalidDefinitionException(JsonParser jsonParser, String str, JavaType javaType) {
        super(jsonParser, str);
        this._type = javaType;
        this._beanDesc = null;
        this._property = null;
    }

    public static InvalidDefinitionException from(JsonParser jsonParser, String str, AbstractC6340b abstractC6340b, AbstractC6414k abstractC6414k) {
        return new InvalidDefinitionException(jsonParser, str, abstractC6340b, abstractC6414k);
    }

    public static InvalidDefinitionException from(JsonParser jsonParser, String str, JavaType javaType) {
        return new InvalidDefinitionException(jsonParser, str, javaType);
    }

    public AbstractC6340b getBeanDescription() {
        return this._beanDesc;
    }

    public AbstractC6414k getProperty() {
        return this._property;
    }

    public JavaType getType() {
        return this._type;
    }

    public static InvalidDefinitionException from(JsonGenerator jsonGenerator, String str, AbstractC6340b abstractC6340b, AbstractC6414k abstractC6414k) {
        return new InvalidDefinitionException(jsonGenerator, str, abstractC6340b, abstractC6414k);
    }

    public static InvalidDefinitionException from(JsonGenerator jsonGenerator, String str, JavaType javaType) {
        return new InvalidDefinitionException(jsonGenerator, str, javaType);
    }

    public InvalidDefinitionException(JsonGenerator jsonGenerator, String str, JavaType javaType) {
        super(jsonGenerator, str);
        this._type = javaType;
        this._beanDesc = null;
        this._property = null;
    }

    public InvalidDefinitionException(JsonParser jsonParser, String str, AbstractC6340b abstractC6340b, AbstractC6414k abstractC6414k) {
        super(jsonParser, str);
        this._type = abstractC6340b == null ? null : abstractC6340b.m11151A();
        this._beanDesc = abstractC6340b;
        this._property = abstractC6414k;
    }

    public InvalidDefinitionException(JsonGenerator jsonGenerator, String str, AbstractC6340b abstractC6340b, AbstractC6414k abstractC6414k) {
        super(jsonGenerator, str);
        this._type = abstractC6340b == null ? null : abstractC6340b.m11151A();
        this._beanDesc = abstractC6340b;
        this._property = abstractC6414k;
    }
}
