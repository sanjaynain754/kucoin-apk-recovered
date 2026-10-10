package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.exc.StreamWriteException;

/* JADX INFO: loaded from: classes45.dex */
public class JsonGenerationException extends StreamWriteException {
    private static final long serialVersionUID = 123;

    @Deprecated
    public JsonGenerationException(Throwable th2) {
        super(th2, (JsonGenerator) null);
    }

    @Deprecated
    public JsonGenerationException(String str) {
        super(str, (JsonGenerator) null);
    }

    @Override // com.fasterxml.jackson.core.exc.StreamWriteException, com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    public JsonGenerator getProcessor() {
        return this._processor;
    }

    @Override // com.fasterxml.jackson.core.exc.StreamWriteException
    public JsonGenerationException withGenerator(JsonGenerator jsonGenerator) {
        this._processor = jsonGenerator;
        return this;
    }

    @Deprecated
    public JsonGenerationException(String str, Throwable th2) {
        super(str, th2, null);
    }

    public JsonGenerationException(Throwable th2, JsonGenerator jsonGenerator) {
        super(th2, jsonGenerator);
    }

    public JsonGenerationException(String str, JsonGenerator jsonGenerator) {
        super(str, jsonGenerator);
        this._processor = jsonGenerator;
    }

    public JsonGenerationException(String str, Throwable th2, JsonGenerator jsonGenerator) {
        super(str, th2, jsonGenerator);
        this._processor = jsonGenerator;
    }
}
