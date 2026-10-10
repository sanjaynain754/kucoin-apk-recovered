package com.sumsub.sns.internal.core.data.network;

import com.sumsub.sns.internal.core.common.InterfaceC28418S0;
import okhttp3.Request;
import okio.Timeout;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Converter;
import retrofit2.Response;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.data.network.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28518d implements Call {

    /* JADX INFO: renamed from: a */
    public final Call f58052a;

    /* JADX INFO: renamed from: b */
    public final Converter f58053b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC28418S0 f58054c;

    @Override // retrofit2.Call
    public final void cancel() {
        this.f58052a.cancel();
    }

    @Override // retrofit2.Call
    public final void enqueue(Callback callback) {
        this.f58052a.enqueue(new C28517c(callback, this));
    }

    @Override // retrofit2.Call
    public final Response execute() {
        throw new UnsupportedOperationException("ApiResponseCall doesn't support execute");
    }

    @Override // retrofit2.Call
    public final boolean isCanceled() {
        return this.f58052a.isCanceled();
    }

    @Override // retrofit2.Call
    public final boolean isExecuted() {
        return this.f58052a.isExecuted();
    }

    @Override // retrofit2.Call
    public final Request request() {
        return this.f58052a.request();
    }

    @Override // retrofit2.Call
    public final Timeout timeout() {
        return this.f58052a.timeout();
    }

    public C28518d(Call call, Converter converter, InterfaceC28418S0 interfaceC28418S0) {
        this.f58052a = call;
        this.f58053b = converter;
        this.f58054c = interfaceC28418S0;
    }

    @Override // retrofit2.Call
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final C28518d m103803clone() {
        return new C28518d(this.f58052a.m103803clone(), this.f58053b, this.f58054c);
    }
}
