package com.sumsub.sns.internal.features.data.repository.sumsubid;

import com.google.common.net.HttpHeaders;
import com.sumsub.sns.internal.features.data.model.sumsubid.C29858d;
import p852kotlin.ResultKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import retrofit2.Response;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.sumsubid.d */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30055d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC30060i f60391a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m70081a(ContinuationImpl continuationImpl) {
        C30054c c30054c;
        if (continuationImpl instanceof C30054c) {
            c30054c = (C30054c) continuationImpl;
            int i11 = c30054c.f60390c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30054c.f60390c = i11 - Integer.MIN_VALUE;
            } else {
                c30054c = new C30054c(this, continuationImpl);
            }
        } else {
            c30054c = new C30054c(this, continuationImpl);
        }
        Object objM70088b = c30054c.f60388a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30054c.f60390c;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70088b);
            InterfaceC30060i interfaceC30060i = this.f60391a;
            c30054c.f60390c = 1;
            objM70088b = interfaceC30060i.m70088b(c30054c);
            if (objM70088b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70088b);
        }
        Response response = (Response) objM70088b;
        C29858d c29858d = (C29858d) response.body();
        String str = response.headers().get(HttpHeaders.SET_COOKIE);
        if (c29858d != null) {
            return new C29858d(c29858d.f59943a, c29858d.f59944b, str);
        }
        return null;
    }

    public C30055d(InterfaceC30060i interfaceC30060i) {
        this.f60391a = interfaceC30060i;
    }
}
