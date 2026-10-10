package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.InterfaceC6305h;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes45.dex */
public class MinimalPrettyPrinter implements InterfaceC6305h, Serializable {
    private static final long serialVersionUID = 1;
    protected String _rootValueSeparator;
    protected Separators _separators;

    public MinimalPrettyPrinter() {
        this(InterfaceC6305h.f10065I0.toString());
    }

    public MinimalPrettyPrinter(String str) {
        this._rootValueSeparator = str;
        this._separators = InterfaceC6305h.f10064H0;
    }

    public void setRootValueSeparator(String str) {
        this._rootValueSeparator = str;
    }

    public MinimalPrettyPrinter setSeparators(Separators separators) {
        this._separators = separators;
        return this;
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6305h
    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.mo10834o0(this._separators.getArrayValueSeparator());
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6305h
    public void writeEndArray(JsonGenerator jsonGenerator, int i11) throws IOException {
        jsonGenerator.mo10834o0(']');
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6305h
    public void writeEndObject(JsonGenerator jsonGenerator, int i11) throws IOException {
        jsonGenerator.mo10834o0('}');
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6305h
    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.mo10834o0(this._separators.getObjectEntrySeparator());
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6305h
    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.mo10834o0(this._separators.getObjectFieldValueSeparator());
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6305h
    public void writeRootValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        String str = this._rootValueSeparator;
        if (str != null) {
            jsonGenerator.mo10838q0(str);
        }
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6305h
    public void writeStartArray(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.mo10834o0('[');
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6305h
    public void writeStartObject(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.mo10834o0('{');
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6305h
    public void beforeArrayValues(JsonGenerator jsonGenerator) throws IOException {
    }

    @Override // com.fasterxml.jackson.core.InterfaceC6305h
    public void beforeObjectEntries(JsonGenerator jsonGenerator) throws IOException {
    }
}
