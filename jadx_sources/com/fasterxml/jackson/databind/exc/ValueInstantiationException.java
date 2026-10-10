package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;

/* JADX INFO: loaded from: classes45.dex */
public class ValueInstantiationException extends JsonMappingException {
    protected final JavaType _type;

    public ValueInstantiationException(JsonParser jsonParser, String str, JavaType javaType, Throwable th2) {
        super(jsonParser, str, th2);
        this._type = javaType;
    }

    public static ValueInstantiationException from(JsonParser jsonParser, String str, JavaType javaType) {
        return new ValueInstantiationException(jsonParser, str, javaType);
    }

    public static ValueInstantiationException from(JsonParser jsonParser, String str, JavaType javaType, Throwable th2) {
        return new ValueInstantiationException(jsonParser, str, javaType, th2);
    }

    public JavaType getType() {
        return this._type;
    }

    public ValueInstantiationException(JsonParser jsonParser, String str, JavaType javaType) {
        super(jsonParser, str);
        this._type = javaType;
    }
}
