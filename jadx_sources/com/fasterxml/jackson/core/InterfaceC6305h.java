package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.p062io.SerializedString;
import com.fasterxml.jackson.core.util.Separators;
import com.tencent.bugly.proguard.C33627eb;
import java.io.IOException;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.h */
/* JADX INFO: compiled from: PrettyPrinter.java */
/* JADX INFO: loaded from: classes45.dex */
public interface InterfaceC6305h {

    /* JADX INFO: renamed from: H0 */
    public static final Separators f10064H0 = Separators.createDefaultInstance();

    /* JADX INFO: renamed from: I0 */
    public static final SerializedString f10065I0 = new SerializedString(C33627eb.f69716f);

    void beforeArrayValues(JsonGenerator jsonGenerator) throws IOException;

    void beforeObjectEntries(JsonGenerator jsonGenerator) throws IOException;

    void writeArrayValueSeparator(JsonGenerator jsonGenerator) throws IOException;

    void writeEndArray(JsonGenerator jsonGenerator, int i11) throws IOException;

    void writeEndObject(JsonGenerator jsonGenerator, int i11) throws IOException;

    void writeObjectEntrySeparator(JsonGenerator jsonGenerator) throws IOException;

    void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) throws IOException;

    void writeRootValueSeparator(JsonGenerator jsonGenerator) throws IOException;

    void writeStartArray(JsonGenerator jsonGenerator) throws IOException;

    void writeStartObject(JsonGenerator jsonGenerator) throws IOException;
}
