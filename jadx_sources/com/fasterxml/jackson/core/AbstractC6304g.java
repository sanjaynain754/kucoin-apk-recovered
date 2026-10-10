package com.fasterxml.jackson.core;

import java.io.IOException;
import java.util.Iterator;
import p424l7.AbstractC42115a;
import p424l7.AbstractC42116b;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.g */
/* JADX INFO: compiled from: ObjectCodec.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6304g extends AbstractC6319k {
    @Override // com.fasterxml.jackson.core.AbstractC6319k
    public abstract InterfaceC6320l createArrayNode();

    @Override // com.fasterxml.jackson.core.AbstractC6319k
    public abstract InterfaceC6320l createObjectNode();

    @Override // com.fasterxml.jackson.core.AbstractC6319k
    public abstract <T extends InterfaceC6320l> T readTree(JsonParser jsonParser) throws IOException;

    public abstract <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException;

    public abstract <T> T readValue(JsonParser jsonParser, AbstractC42115a abstractC42115a) throws IOException;

    public abstract <T> T readValue(JsonParser jsonParser, AbstractC42116b<T> abstractC42116b) throws IOException;

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, Class<T> cls) throws IOException;

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, AbstractC42115a abstractC42115a) throws IOException;

    public abstract <T> Iterator<T> readValues(JsonParser jsonParser, AbstractC42116b<T> abstractC42116b) throws IOException;

    @Override // com.fasterxml.jackson.core.AbstractC6319k
    public abstract JsonParser treeAsTokens(InterfaceC6320l interfaceC6320l);

    public abstract <T> T treeToValue(InterfaceC6320l interfaceC6320l, Class<T> cls) throws JsonProcessingException;

    public abstract Version version();

    @Override // com.fasterxml.jackson.core.AbstractC6319k
    public abstract void writeTree(JsonGenerator jsonGenerator, InterfaceC6320l interfaceC6320l) throws IOException;

    public abstract void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException;

    public JsonFactory getFactory() {
        return getJsonFactory();
    }

    @Deprecated
    public JsonFactory getJsonFactory() {
        return getFactory();
    }
}
