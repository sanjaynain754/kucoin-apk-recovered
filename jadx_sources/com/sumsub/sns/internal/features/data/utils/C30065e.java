package com.sumsub.sns.internal.features.data.utils;

import java.io.InputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import okio.Okio;
import okio.Source;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.utils.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30065e extends RequestBody {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MediaType f60404a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InputStream f60405b;

    @Override // okhttp3.RequestBody
    public final boolean isOneShot() {
        return true;
    }

    public C30065e(MediaType mediaType, InputStream inputStream) {
        this.f60404a = mediaType;
        this.f60405b = inputStream;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f60405b.available();
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public final MediaType get$contentType() {
        return this.f60404a;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink bufferedSink) {
        Source source = Okio.source(this.f60405b);
        try {
            bufferedSink.writeAll(source);
            CloseableKt.closeFinally(source, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(source, th2);
                throw th3;
            }
        }
    }
}
