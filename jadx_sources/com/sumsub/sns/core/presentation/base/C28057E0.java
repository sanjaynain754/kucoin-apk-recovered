package com.sumsub.sns.core.presentation.base;

import com.sumsub.sns.core.data.model.SNSSDKState;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.E0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28057E0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57223a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC41709m0 f57224b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28057E0(InterfaceC41709m0 interfaceC41709m0, Continuation continuation) {
        super(2, continuation);
        this.f57224b = interfaceC41709m0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C28057E0 c28057e0 = new C28057E0(this.f57224b, continuation);
        c28057e0.f57223a = obj;
        return c28057e0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C28057E0 c28057e0 = new C28057E0(this.f57224b, (Continuation) obj2);
        c28057e0.f57223a = (SNSSDKState) obj;
        return c28057e0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String message;
        boolean z11;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        SNSSDKState sNSSDKState = (SNSSDKState) this.f57223a;
        String strM71624a = AbstractC33294e.m71624a(this.f57224b);
        if (sNSSDKState != null) {
            message = sNSSDKState.getMessage();
        } else {
            message = null;
        }
        C33272c.f67816e.f67810a.mo68955d(strM71624a, "sdkState: " + sNSSDKState + ", " + message, null);
        if (sNSSDKState != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        return Boxing.boxBoolean(z11);
    }
}
