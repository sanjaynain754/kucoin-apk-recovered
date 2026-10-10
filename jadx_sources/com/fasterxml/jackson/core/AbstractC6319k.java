package com.fasterxml.jackson.core;

import java.io.IOException;

/* JADX INFO: renamed from: com.fasterxml.jackson.core.k */
/* JADX INFO: compiled from: TreeCodec.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6319k {
    public abstract InterfaceC6320l createArrayNode();

    public abstract InterfaceC6320l createObjectNode();

    public InterfaceC6320l missingNode() {
        return null;
    }

    public InterfaceC6320l nullNode() {
        return null;
    }

    public abstract <T extends InterfaceC6320l> T readTree(JsonParser jsonParser) throws IOException;

    public abstract JsonParser treeAsTokens(InterfaceC6320l interfaceC6320l);

    public abstract void writeTree(JsonGenerator jsonGenerator, InterfaceC6320l interfaceC6320l) throws IOException;
}
