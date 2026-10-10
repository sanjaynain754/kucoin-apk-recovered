package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AbstractC6446m;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

/* JADX INFO: loaded from: classes45.dex */
public class FailingSerializer extends StdSerializer<Object> {
    protected final String _msg;

    public FailingSerializer(String str) {
        super(Object.class);
        this._msg = str;
    }

    @Override // com.fasterxml.jackson.databind.ser.std.StdSerializer, com.fasterxml.jackson.databind.AbstractC6393h
    public void serialize(Object obj, JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException {
        abstractC6446m.reportMappingProblem(this._msg, new Object[0]);
    }
}
