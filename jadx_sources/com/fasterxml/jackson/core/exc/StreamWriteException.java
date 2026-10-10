package com.fasterxml.jackson.core.exc;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonProcessingException;

/* JADX INFO: loaded from: classes45.dex */
public abstract class StreamWriteException extends JsonProcessingException {
    private static final long serialVersionUID = 2;
    protected transient JsonGenerator _processor;

    public StreamWriteException(Throwable th2, JsonGenerator jsonGenerator) {
        super(th2);
        this._processor = jsonGenerator;
    }

    public abstract StreamWriteException withGenerator(JsonGenerator jsonGenerator);

    @Override // com.fasterxml.jackson.core.JsonProcessingException, com.fasterxml.jackson.core.JacksonException
    public JsonGenerator getProcessor() {
        return this._processor;
    }

    public StreamWriteException(String str, JsonGenerator jsonGenerator) {
        super(str, (JsonLocation) null);
        this._processor = jsonGenerator;
    }

    public StreamWriteException(String str, Throwable th2, JsonGenerator jsonGenerator) {
        super(str, null, th2);
        this._processor = jsonGenerator;
    }
}
