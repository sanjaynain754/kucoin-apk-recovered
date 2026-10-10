package com.sumsub.sns.internal.core.exception;

import com.sumsub.sns.internal.core.domain.C28535a;
import com.sumsub.sns.internal.core.domain.C28578h;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.exception.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28617b extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public int f58231a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28578h f58232b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28617b(C28578h c28578h, Continuation continuation) {
        super(1, continuation);
        this.f58232b = c28578h;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C28617b(this.f58232b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C28617b(this.f58232b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f58231a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C28535a c28535a = this.f58232b.f58156M;
        this.f58231a = 1;
        Object objMo69411a = c28535a.mo69411a(this);
        if (objMo69411a == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objMo69411a;
    }
}
