package com.sumsub.sns.internal.core.data.network;

import com.sumsub.sns.internal.core.common.InterfaceC28418S0;
import java.lang.reflect.Type;
import retrofit2.Call;
import retrofit2.CallAdapter;
import retrofit2.Converter;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.data.network.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28515a implements CallAdapter {

    /* JADX INFO: renamed from: a */
    public final Type f58046a;

    /* JADX INFO: renamed from: b */
    public final Converter f58047b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC28418S0 f58048c;

    @Override // retrofit2.CallAdapter
    public final Object adapt(Call call) {
        return new C28518d(call, this.f58047b, this.f58048c);
    }

    @Override // retrofit2.CallAdapter
    public final Type responseType() {
        return this.f58046a;
    }

    public C28515a(Type type, Converter converter, InterfaceC28418S0 interfaceC28418S0) {
        this.f58046a = type;
        this.f58047b = converter;
        this.f58048c = interfaceC28418S0;
    }
}
