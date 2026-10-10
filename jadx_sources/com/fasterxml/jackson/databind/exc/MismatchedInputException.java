package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.C6490g;

/* JADX INFO: loaded from: classes45.dex */
public class MismatchedInputException extends JsonMappingException {
    protected Class<?> _targetType;

    public MismatchedInputException(JsonParser jsonParser, String str) {
        this(jsonParser, str, (JavaType) null);
    }

    @Deprecated
    public static MismatchedInputException from(JsonParser jsonParser, String str) {
        return from(jsonParser, (Class<?>) null, str);
    }

    public MismatchedInputException(JsonParser jsonParser, String str, JsonLocation jsonLocation) {
        super(jsonParser, str, jsonLocation);
    }

    public static MismatchedInputException from(JsonParser jsonParser, JavaType javaType, String str) {
        return new MismatchedInputException(jsonParser, str, javaType);
    }

    public Class<?> getTargetType() {
        return this._targetType;
    }

    public MismatchedInputException(JsonParser jsonParser, String str, Class<?> cls) {
        super(jsonParser, str);
        this._targetType = cls;
    }

    public static MismatchedInputException from(JsonParser jsonParser, Class<?> cls, String str) {
        return new MismatchedInputException(jsonParser, str, cls);
    }

    public MismatchedInputException setTargetType(JavaType javaType) {
        this._targetType = javaType.getRawClass();
        return this;
    }

    public MismatchedInputException(JsonParser jsonParser, String str, JavaType javaType) {
        super(jsonParser, str);
        this._targetType = C6490g.m11931d0(javaType);
    }
}
