package com.sumsub.sns.internal.features.presentation.result;

import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import kotlinx.coroutines.DelayKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.result.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32372l extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65950a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32377q f65951b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32372l(C32377q c32377q, Continuation continuation) {
        super(2, continuation);
        this.f65951b = c32377q;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32372l(this.f65951b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32372l(this.f65951b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(100, r6) == r0) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65950a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            AbstractC28052C.finishWithResult$default(this.f65951b, 0, null, 3, null);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        this.f65950a = 1;
        if (DelayKt.m90350b(2000L, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        this.f65951b.showProgress(true);
        this.f65950a = 2;
    }
}
