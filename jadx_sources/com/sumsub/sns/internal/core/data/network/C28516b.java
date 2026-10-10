package com.sumsub.sns.internal.core.data.network;

import com.sumsub.sns.internal.core.common.InterfaceC28418S0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29585o;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p852kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Retrofit;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.data.network.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28516b extends CallAdapter.Factory {

    /* JADX INFO: renamed from: a */
    public final InterfaceC28418S0 f58049a;

    public C28516b(InterfaceC28418S0 interfaceC28418S0) {
        this.f58049a = interfaceC28418S0;
    }

    @Override // retrofit2.CallAdapter.Factory
    public final CallAdapter get(Type type, Annotation[] annotationArr, Retrofit retrofit) {
        if (!Intrinsics.areEqual(Call.class, CallAdapter.Factory.getRawType(type))) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new C28515a(CallAdapter.Factory.getParameterUpperBound(0, (ParameterizedType) type), retrofit.nextResponseBodyConverter(null, C29585o.class, annotationArr), this.f58049a);
        }
        throw new IllegalStateException("return type must be parameterized as Call<NetworkResponse<<Foo>> or Call<NetworkResponse<out Foo>>");
    }
}
