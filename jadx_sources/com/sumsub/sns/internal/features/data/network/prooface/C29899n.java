package com.sumsub.sns.internal.features.data.network.prooface;

import com.sumsub.sns.core.data.listener.TokenExpirationHandler;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.network.prooface.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29899n extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C29900o f60003a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29899n(C29900o c29900o, Continuation continuation) {
        super(2, continuation);
        this.f60003a = c29900o;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C29899n(this.f60003a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C29899n(this.f60003a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String strOnTokenExpired = null;
        try {
            TokenExpirationHandler tokenExpirationHandler = C28468k0.f57983a.getTokenExpirationHandler();
            if (tokenExpirationHandler != null) {
                strOnTokenExpired = tokenExpirationHandler.onTokenExpired();
            }
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = "";
            }
            C33272c.f67816e.f67810a.mo68956e("Prooface", message, e11);
        }
        if (strOnTokenExpired != null && strOnTokenExpired.length() >= 5) {
            AbstractC32267d.m71078a("Liveness3dFaceRepository.New token is available. Token is " + strOnTokenExpired);
            this.f60003a.f60008e.put(strOnTokenExpired);
            this.f60003a.m69945a(strOnTokenExpired);
        }
        return Unit.INSTANCE;
    }
}
