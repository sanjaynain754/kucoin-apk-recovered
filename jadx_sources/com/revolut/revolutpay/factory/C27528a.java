package com.revolut.revolutpay.factory;

import androidx.webkit.ProxyConfig;
import com.revolut.revolutpay.api.RevolutPayEnvironment;
import ja0.InterfaceC40359a;
import oa0.C43005a;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Lambda;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/* JADX INFO: renamed from: com.revolut.revolutpay.factory.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C27528a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C27528a f56183a = new C27528a();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Lazy f56184b = LazyKt.lazy(c.f56186a);

    /* JADX INFO: renamed from: com.revolut.revolutpay.factory.a$a */
    public static final class a implements Interceptor {
        @Override // okhttp3.Interceptor
        @NotNull
        public Response intercept(@NotNull Interceptor.Chain chain) {
            Intrinsics.checkNotNullParameter(chain, "chain");
            return chain.proceed(chain.request().newBuilder().addHeader("Revolut-Pay-Sdk-Version", "Android/2.3").build());
        }
    }

    /* JADX INFO: renamed from: com.revolut.revolutpay.factory.a$c */
    public static final class c extends Lambda implements Function0<OkHttpClient> {

        /* JADX INFO: renamed from: a */
        public static final c f56186a = new c();

        public c() {
            super(0);
        }

        @Override // p852kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OkHttpClient invoke() {
            return C27528a.f56183a.m68225a();
        }
    }

    /* JADX INFO: renamed from: com.revolut.revolutpay.factory.a$b */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f56185a;

        static {
            int[] iArr = new int[RevolutPayEnvironment.values().length];
            try {
                iArr[RevolutPayEnvironment.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RevolutPayEnvironment.SANDBOX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f56185a = iArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public final OkHttpClient m68225a() {
        return new OkHttpClient.Builder().addInterceptor(new a()).build();
    }

    /* JADX INFO: renamed from: c */
    public final OkHttpClient m68226c() {
        return (OkHttpClient) f56184b.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC40359a m68227d() {
        String str;
        RevolutPayEnvironment revolutPayEnvironmentM94438d = C43005a.f95164a.m94438d();
        int i11 = revolutPayEnvironmentM94438d == null ? -1 : b.f56185a[revolutPayEnvironmentM94438d.ordinal()];
        if (i11 == -1) {
            throw null;
        }
        if (i11 == 1) {
            str = "merchant-mgmt.revolut.com";
        } else {
            if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "sandbox-merchant-mgmt.revolut.com";
        }
        return (InterfaceC40359a) new Retrofit.Builder().baseUrl(new HttpUrl.Builder().scheme(ProxyConfig.MATCH_HTTPS).host(str).build()).client(m68226c()).addConverterFactory(GsonConverterFactory.create()).addConverterFactory(ScalarsConverterFactory.create()).build().create(InterfaceC40359a.class);
    }
}
