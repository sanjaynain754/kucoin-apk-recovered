package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.jsontype.AbstractC6431e;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.impl.AbstractC6464b;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* JADX INFO: renamed from: com.fasterxml.jackson.databind.l */
/* JADX INFO: compiled from: SequenceWriter.java */
/* JADX INFO: loaded from: classes45.dex */
public class C6445l implements Closeable, Flushable {

    /* JADX INFO: renamed from: b */
    public final DefaultSerializerProvider f10548b;

    /* JADX INFO: renamed from: c */
    public final SerializationConfig f10549c;

    /* JADX INFO: renamed from: d */
    public final JsonGenerator f10550d;

    /* JADX INFO: renamed from: e */
    public final AbstractC6393h<Object> f10551e;

    /* JADX INFO: renamed from: f */
    public final AbstractC6431e f10552f;

    /* JADX INFO: renamed from: g */
    public final boolean f10553g;

    /* JADX INFO: renamed from: h */
    public final boolean f10554h;

    /* JADX INFO: renamed from: i */
    public final boolean f10555i;

    /* JADX INFO: renamed from: j */
    public AbstractC6464b f10556j;

    /* JADX INFO: renamed from: k */
    public boolean f10557k;

    /* JADX INFO: renamed from: l */
    public boolean f10558l;

    /* JADX INFO: renamed from: a */
    public C6445l m11722a(boolean z11) throws IOException {
        if (z11) {
            this.f10550d.mo10843u0();
            this.f10557k = true;
        }
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f10558l) {
            return;
        }
        this.f10558l = true;
        if (this.f10557k) {
            this.f10557k = false;
            this.f10550d.mo10805W();
        }
        if (this.f10553g) {
            this.f10550d.close();
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f10558l) {
            return;
        }
        this.f10550d.flush();
    }

    public C6445l(DefaultSerializerProvider defaultSerializerProvider, JsonGenerator jsonGenerator, boolean z11, ObjectWriter.Prefetch prefetch) throws IOException {
        this.f10548b = defaultSerializerProvider;
        this.f10550d = jsonGenerator;
        this.f10553g = z11;
        this.f10551e = prefetch.getValueSerializer();
        this.f10552f = prefetch.getTypeSerializer();
        SerializationConfig config = defaultSerializerProvider.getConfig();
        this.f10549c = config;
        this.f10554h = config.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE);
        this.f10555i = config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE);
        this.f10556j = AbstractC6464b.m11799d();
    }
}
