package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

/* JADX INFO: loaded from: classes45.dex */
public class UnsupportedTypeSerializer extends StdSerializer<Object> {
    private static final long serialVersionUID = 1;
    protected final String _message;
    protected final JavaType _type;

    public UnsupportedTypeSerializer(JavaType javaType, String str) {
        super(Object.class);
        this._type = javaType;
        this._message = str;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        abstractC6446m.reportBadDefinition(this._type, this._message);
    }
}
