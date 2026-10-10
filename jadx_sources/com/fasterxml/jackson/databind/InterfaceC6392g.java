package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import java.io.IOException;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.g */
/* JADX INFO: compiled from: JsonSerializable.java */
/* JADX INFO: loaded from: classes45.dex */
public interface InterfaceC6392g {

    /* JADX INFO: renamed from: com.fasterxml.jackson.databind.g$a */
    /* JADX INFO: compiled from: JsonSerializable.java */
    public static abstract class a implements InterfaceC6392g {
        public boolean isEmpty(AbstractC6446m abstractC6446m) {
            return false;
        }
    }

    void serialize(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m) throws IOException;

    void serializeWithType(JsonGenerator jsonGenerator, AbstractC6446m abstractC6446m, AbstractC6431e abstractC6431e) throws IOException;
}
