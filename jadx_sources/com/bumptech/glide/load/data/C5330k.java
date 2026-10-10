package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import p710w1.InterfaceC45684b;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.k */
/* JADX INFO: compiled from: InputStreamRewinder.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5330k implements InterfaceC5324e<InputStream> {

    /* JADX INFO: renamed from: a */
    public final RecyclableBufferedInputStream f6768a;

    /* JADX INFO: renamed from: com.bumptech.glide.load.data.k$a */
    /* JADX INFO: compiled from: InputStreamRewinder.java */
    public static final class a implements InterfaceC5324e.a<InputStream> {

        /* JADX INFO: renamed from: a */
        public final InterfaceC45684b f6769a;

        @Override // com.bumptech.glide.load.data.InterfaceC5324e.a
        @NonNull
        /* JADX INFO: renamed from: a */
        public Class<InputStream> mo6663a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC5324e.a
        @NonNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC5324e<InputStream> mo6664b(InputStream inputStream) {
            return new C5330k(inputStream, this.f6769a);
        }

        public a(InterfaceC45684b interfaceC45684b) {
            this.f6769a = interfaceC45684b;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5324e
    /* JADX INFO: renamed from: b */
    public void mo6661b() {
        this.f6768a.release();
    }

    /* JADX INFO: renamed from: c */
    public void m6689c() {
        this.f6768a.m6853b();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC5324e
    @NonNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream mo6660a() throws IOException {
        this.f6768a.reset();
        return this.f6768a;
    }

    public C5330k(InputStream inputStream, InterfaceC45684b interfaceC45684b) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, interfaceC45684b);
        this.f6768a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }
}
