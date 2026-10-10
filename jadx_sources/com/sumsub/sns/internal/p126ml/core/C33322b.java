package com.sumsub.sns.internal.p126ml.core;

import android.content.Context;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.sumsub.sentry.AbstractC27897U;
import com.sumsub.sentry.android.AbstractC27920h;
import com.sumsub.sns.internal.core.common.AbstractC28458h;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import java.io.IOException;
import java.nio.ByteBuffer;
import okhttp3.CacheControl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.p407io.CloseableKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.core.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C33322b extends AbstractC33324c {

    /* JADX INFO: renamed from: a */
    public final Context f67946a;

    /* JADX INFO: renamed from: b */
    public final OkHttpClient f67947b;

    /* JADX INFO: renamed from: c */
    public final String f67948c;

    /* JADX INFO: renamed from: d */
    public final boolean f67949d;

    /* JADX INFO: renamed from: e */
    public final String f67950e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33322b)) {
            return false;
        }
        C33322b c33322b = (C33322b) obj;
        return Intrinsics.areEqual(this.f67946a, c33322b.f67946a) && Intrinsics.areEqual(this.f67947b, c33322b.f67947b) && Intrinsics.areEqual(this.f67948c, c33322b.f67948c) && this.f67949d == c33322b.f67949d && Intrinsics.areEqual(this.f67950e, c33322b.f67950e);
    }

    @Override // com.sumsub.sns.internal.p126ml.core.AbstractC33324c
    /* JADX INFO: renamed from: a */
    public final ByteBuffer mo71643a() throws IOException {
        String str = this.f67950e;
        String str2 = "Loading model " + this.f67948c;
        C33270a c33270a = C33272c.f67816e;
        c33270a.f67810a.mo68955d(str, str2, null);
        Request.Builder builderUrl = new Request.Builder().url(this.f67948c);
        if (!this.f67949d) {
            builderUrl = builderUrl.cacheControl(CacheControl.FORCE_NETWORK);
        }
        Response responseExecute = FirebasePerfOkHttpClient.execute(this.f67947b.newCall(builderUrl.build()));
        try {
            if (responseExecute.isSuccessful()) {
                if (responseExecute.cacheResponse() != null) {
                    c33270a.f67810a.mo68955d(this.f67950e, "Got MlModel from cache", null);
                } else {
                    c33270a.f67810a.mo68955d(this.f67950e, "Got MlModel from the server", null);
                }
                byte[] bArrBytes = responseExecute.body().bytes();
                ByteBuffer byteBufferPut = ByteBuffer.allocateDirect(bArrBytes.length).put(bArrBytes);
                CloseableKt.closeFinally(responseExecute, null);
                return byteBufferPut;
            }
            c33270a.f67810a.mo68955d(this.f67950e, "Failed to load model", null);
            if (responseExecute.code() == 404) {
                c33270a.f67810a.mo68955d(this.f67950e, "Model file NOT found", null);
                throw new C33330i();
            }
            throw new IOException("Unexpected code " + responseExecute);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(responseExecute, th2);
                throw th3;
            }
        }
    }

    public final int hashCode() {
        return this.f67950e.hashCode() + AbstractC27920h.m69001a(this.f67949d, AbstractC27897U.m68983a(this.f67948c, (this.f67947b.hashCode() + (this.f67946a.hashCode() * 31)) * 31, 31), 31);
    }

    public C33322b(Context context, OkHttpClient okHttpClient, String str, boolean z11, String str2) {
        this.f67946a = context;
        this.f67947b = okHttpClient;
        this.f67948c = str;
        this.f67949d = z11;
        this.f67950e = str2;
    }

    public final String toString() {
        return AbstractC28458h.m69333a(this) + ": " + this.f67948c;
    }
}
