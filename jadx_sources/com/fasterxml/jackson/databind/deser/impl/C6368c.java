package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.AbstractC6390e;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.deser.impl.c */
/* JADX INFO: compiled from: ErrorThrowingDeserializer.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6368c extends AbstractC6390e<Object> {

    /* JADX INFO: renamed from: b */
    public final Error f10296b;

    @Override // com.fasterxml.jackson.databind.AbstractC6390e
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        throw this.f10296b;
    }

    public C6368c(NoClassDefFoundError noClassDefFoundError) {
        this.f10296b = noClassDefFoundError;
    }
}
