package com.sumsub.sns.internal.core.presentation.android.location;

import kotlinx.coroutines.InterfaceC41769w;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.android.location.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28675k extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f58304a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC41769w f58305b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28675k(InterfaceC41769w interfaceC41769w, Continuation continuation) {
        super(2, continuation);
        this.f58305b = interfaceC41769w;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28675k(this.f58305b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C28675k(this.f58305b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f58304a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41769w interfaceC41769w = this.f58305b;
        this.f58304a = 1;
        Object objMo91198h = interfaceC41769w.mo91198h(this);
        if (objMo91198h == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objMo91198h;
    }
}
