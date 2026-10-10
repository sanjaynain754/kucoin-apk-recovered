package com.revolut.revolutpay.factory.sandbox;

import androidx.webkit.ProxyConfig;
import ka0.InterfaceC40968a;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/* JADX INFO: renamed from: com.revolut.revolutpay.factory.sandbox.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C27529b {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C27529b f56187a = new C27529b();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f56188b = LazyKt.lazy(a.f56189a);

    /* JADX INFO: renamed from: com.revolut.revolutpay.factory.sandbox.b$a */
    public static final class a extends Lambda implements Function0<InterfaceC40968a> {

        /* JADX INFO: renamed from: a */
        public static final a f56189a = new a();

        public a() {
            super(0);
        }

        @Override // p852kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC40968a invoke() {
            return (InterfaceC40968a) new Retrofit.Builder().baseUrl(new HttpUrl.Builder().scheme(ProxyConfig.MATCH_HTTPS).host("sandbox-merchant-mgmt.revolut.com").build()).client(C27529b.f56187a.m68230a()).addConverterFactory(GsonConverterFactory.create()).addConverterFactory(ScalarsConverterFactory.create()).build().create(InterfaceC40968a.class);
        }
    }

    /* JADX INFO: renamed from: a */
    public final OkHttpClient m68230a() {
        return new OkHttpClient.Builder().build();
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC40968a m68231c() {
        Object value = f56188b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-sandboxService>(...)");
        return (InterfaceC40968a) value;
    }
}
