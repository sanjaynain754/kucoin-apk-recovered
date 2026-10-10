package com.squareup.picasso;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.File;
import java.io.IOException;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: com.squareup.picasso.o */
/* JADX INFO: compiled from: OkHttp3Downloader.java */
/* JADX INFO: loaded from: classes59.dex */
public final class C27831o implements InterfaceC27826j {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final Call.Factory f56787a;

    /* JADX INFO: renamed from: b */
    public final Cache f56788b;

    /* JADX INFO: renamed from: c */
    public boolean f56789c;

    public C27831o(Context context) {
        this(C27841y.m68939e(context));
    }

    public C27831o(File file) {
        this(file, C27841y.m68935a(file));
    }

    @Override // com.squareup.picasso.InterfaceC27826j
    @NonNull
    /* JADX INFO: renamed from: a */
    public Response mo68876a(@NonNull Request request) throws IOException {
        return FirebasePerfOkHttpClient.execute(this.f56787a.newCall(request));
    }

    public C27831o(File file, long j11) {
        this(new OkHttpClient.Builder().cache(new Cache(file, j11)).build());
        this.f56789c = false;
    }

    public C27831o(OkHttpClient okHttpClient) {
        this.f56789c = true;
        this.f56787a = okHttpClient;
        this.f56788b = okHttpClient.cache();
    }
}
