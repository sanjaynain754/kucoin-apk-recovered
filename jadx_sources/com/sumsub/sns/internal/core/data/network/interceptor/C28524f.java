package com.sumsub.sns.internal.core.data.network.interceptor;

import com.sumsub.sns.internal.features.data.repository.sumsubid.C30052a;
import com.sumsub.sns.internal.features.data.repository.sumsubid.C30053b;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.data.network.interceptor.f */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28524f implements Interceptor {

    /* JADX INFO: renamed from: a */
    public final C30053b f58070a;

    public C28524f(C30053b c30053b) {
        this.f58070a = c30053b;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        String str;
        Request.Builder builderNewBuilder = chain.request().newBuilder();
        if (StringsKt.contains$default((CharSequence) chain.request().url().getUrl(), (CharSequence) "resources/snsId/sdk", false, 2, (Object) null) && (str = ((C30052a) this.f58070a.f60387a.getValue()).f60386d) != null) {
            builderNewBuilder.addHeader("X-Sumsub-Id-Token", str);
        }
        return chain.proceed(builderNewBuilder.build());
    }
}
