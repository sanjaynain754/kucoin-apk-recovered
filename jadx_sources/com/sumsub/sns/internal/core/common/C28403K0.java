package com.sumsub.sns.internal.core.common;

import android.content.Context;
import com.sumsub.sns.internal.core.data.network.interceptor.C28519a;
import com.sumsub.sns.internal.core.data.network.interceptor.C28523e;
import com.sumsub.sns.internal.core.data.network.interceptor.HttpLoggingInterceptor$Level;
import com.sumsub.sns.internal.core.data.network.interceptor.InterfaceC28522d;
import com.sumsub.sns.internal.core.domain.C28535a;
import com.sumsub.sns.internal.core.domain.C28544c;
import com.sumsub.sns.internal.core.domain.InterfaceC28584k;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29722y2;
import com.sumsub.sns.internal.features.data.model.common.LogParams;
import com.sumsub.sns.internal.features.data.model.common.LogType;
import com.sumsub.sns.internal.features.data.repository.log.InterfaceC30001a;
import com.sumsub.sns.internal.features.data.repository.settings.C30034c;
import com.sumsub.sns.internal.log.cacher.C33278f;
import com.sumsub.sns.internal.log.cacher.InterfaceC33273a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import p717w8.C45753c;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function0;
import retrofit2.Retrofit;
import xg0.AbstractC46162a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.K0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28403K0 implements InterfaceC33273a {

    /* JADX INFO: renamed from: a */
    public final Context f57896a;

    /* JADX INFO: renamed from: b */
    public final String f57897b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC28584k f57898c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC28584k f57899d;

    /* JADX INFO: renamed from: e */
    public final AbstractC46162a f57900e = AbstractC28400J.m69286a(C28468k0.f57988f);

    /* JADX INFO: renamed from: f */
    public final Lazy f57901f = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.common.h1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C28403K0.m69291d(this.f57978b);
        }
    });

    /* JADX INFO: renamed from: g */
    public final Lazy f57902g = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.common.i1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C28403K0.m69287a(this.f57980b);
        }
    });

    /* JADX INFO: renamed from: h */
    public final Lazy f57903h = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.common.j1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C28403K0.m69289b(this.f57981b);
        }
    });

    /* JADX INFO: renamed from: i */
    public final Lazy f57904i = LazyKt.lazy(new Function0() { // from class: com.sumsub.sns.internal.core.common.k1
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C28403K0.m69290c(this.f58008b);
        }
    });

    @Override // com.sumsub.sns.internal.log.cacher.InterfaceC33273a
    /* JADX INFO: renamed from: a */
    public final Object mo68970a(Object obj, ByteArrayOutputStream byteArrayOutputStream, C33278f c33278f) {
        Object objM91049g = C41686h.m91049g(C41782z0.m91392b(), new C28395G0(byteArrayOutputStream, this, (LogParams) obj, null), c33278f);
        return objM91049g == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91049g : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static final Retrofit m69289b(C28403K0 c28403k0) {
        return new Retrofit.Builder().baseUrl(c28403k0.f57897b).client((OkHttpClient) c28403k0.f57902g.getValue()).addConverterFactory(C45753c.m101007a(c28403k0.f57900e, MediaType.INSTANCE.get("application/json"))).build();
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC30001a m69290c(C28403K0 c28403k0) {
        return (InterfaceC30001a) ((Retrofit) c28403k0.f57903h.getValue()).create(InterfaceC30001a.class);
    }

    /* JADX INFO: renamed from: d */
    public static final C30034c m69291d(C28403K0 c28403k0) {
        return new C30034c(c28403k0.f57898c, c28403k0.f57896a.getSharedPreferences("idensic_mobile_sdk", 0));
    }

    public C28403K0(Context context, String str, C28544c c28544c, C28535a c28535a) {
        this.f57896a = context;
        this.f57897b = str;
        this.f57898c = c28544c;
        this.f57899d = c28535a;
    }

    /* JADX INFO: renamed from: a */
    public static final OkHttpClient m69287a(C28403K0 c28403k0) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderAddInterceptor = builder.callTimeout(30L, timeUnit).connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).addInterceptor(new C28519a((C30034c) c28403k0.f57901f.getValue(), c28403k0.f57899d));
        C28523e c28523e = new C28523e(null, null, null, null, new InterfaceC28522d() { // from class: com.sumsub.sns.internal.core.common.l1
            @Override // com.sumsub.sns.internal.core.data.network.interceptor.InterfaceC28522d
            /* JADX INFO: renamed from: a */
            public final void mo69371a(String str) {
                C28403K0.m69288a(str);
            }
        }, 31);
        c28523e.f58069k = HttpLoggingInterceptor$Level.BODY;
        return builderAddInterceptor.addInterceptor(c28523e).build();
    }

    /* JADX INFO: renamed from: a */
    public static final void m69288a(String str) {
        System.out.println((Object) str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.sumsub.sns.internal.log.cacher.InterfaceC33275c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object send(LogParams logParams, ContinuationImpl continuationImpl) {
        C28401J0 c28401j0;
        if (continuationImpl instanceof C28401J0) {
            c28401j0 = (C28401J0) continuationImpl;
            int i11 = c28401j0.f57893c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28401j0.f57893c = i11 - Integer.MIN_VALUE;
            } else {
                c28401j0 = new C28401J0(this, continuationImpl);
            }
        } else {
            c28401j0 = new C28401J0(this, continuationImpl);
        }
        Object obj = c28401j0.f57891a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28401j0.f57893c;
        boolean z11 = true;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC30001a interfaceC30001a = (InterfaceC30001a) this.f57904i.getValue();
                String value = LogType.Error.getValue();
                LinkedHashMap linkedHashMapM69913a = AbstractC29722y2.m69913a(logParams);
                c28401j0.f57893c = 1;
                if (interfaceC30001a.m70064a(value, linkedHashMapM69913a, c28401j0) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception unused) {
            z11 = false;
        }
        return Boxing.boxBoolean(z11);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r7 == r1) goto L23;
     */
    @Override // com.sumsub.sns.internal.log.cacher.InterfaceC33273a
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo68969a(ByteArrayInputStream byteArrayInputStream, Continuation continuation) {
        C28397H0 c28397h0;
        boolean zBooleanValue;
        if (continuation instanceof C28397H0) {
            c28397h0 = (C28397H0) continuation;
            int i11 = c28397h0.f57887c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c28397h0.f57887c = i11 - Integer.MIN_VALUE;
            } else {
                c28397h0 = new C28397H0(this, (ContinuationImpl) continuation);
            }
        } else {
            c28397h0 = new C28397H0(this, (ContinuationImpl) continuation);
        }
        Object objM91049g = c28397h0.f57885a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c28397h0.f57887c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM91049g);
            c28397h0.f57887c = 1;
            objM91049g = C41686h.m91049g(C41782z0.m91392b(), new C28399I0(byteArrayInputStream, this, null), c28397h0);
            if (objM91049g != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM91049g);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM91049g);
        }
        zBooleanValue = ((Boolean) objM91049g).booleanValue();
        return Boxing.boxBoolean(zBooleanValue);
        LogParams logParams = (LogParams) objM91049g;
        if (logParams != null) {
            c28397h0.f57887c = 2;
            objM91049g = send(logParams, c28397h0);
        } else {
            zBooleanValue = false;
        }
        return Boxing.boxBoolean(zBooleanValue);
    }
}
