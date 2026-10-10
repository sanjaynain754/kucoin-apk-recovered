package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.AbstractC6391f;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.json.JsonMapper;
import java.io.IOException;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.node.b */
/* JADX INFO: compiled from: InternalNodeMapper.java */
/* JADX INFO: loaded from: classes45.dex */
public final class C6448b {

    /* JADX INFO: renamed from: a */
    public static final JsonMapper f10572a;

    /* JADX INFO: renamed from: b */
    public static final ObjectWriter f10573b;

    /* JADX INFO: renamed from: c */
    public static final ObjectWriter f10574c;

    /* JADX INFO: renamed from: d */
    public static final ObjectReader f10575d;

    static {
        JsonMapper jsonMapper = new JsonMapper();
        f10572a = jsonMapper;
        f10573b = jsonMapper.writer();
        f10574c = jsonMapper.writer().withDefaultPrettyPrinter();
        f10575d = jsonMapper.readerFor(AbstractC6391f.class);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC6391f m11725a(byte[] bArr) throws IOException {
        return (AbstractC6391f) f10575d.readValue(bArr);
    }

    /* JADX INFO: renamed from: b */
    public static String m11726b(AbstractC6391f abstractC6391f) {
        try {
            return f10574c.writeValueAsString(abstractC6391f);
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m11727c(AbstractC6391f abstractC6391f) {
        try {
            return f10573b.writeValueAsString(abstractC6391f);
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m11728d(Object obj) throws IOException {
        return f10572a.writeValueAsBytes(obj);
    }
}
