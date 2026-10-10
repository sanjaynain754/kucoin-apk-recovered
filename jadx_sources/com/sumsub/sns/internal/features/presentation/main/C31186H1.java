package com.sumsub.sns.internal.features.presentation.main;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.H1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31186H1 extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public int f63048a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31243a2 f63049b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31186H1(C31243a2 c31243a2, Continuation continuation) {
        super(1, continuation);
        this.f63049b = c31243a2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C31186H1(this.f63049b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C31186H1(this.f63049b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63048a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C31243a2 c31243a2 = this.f63049b;
        this.f63048a = 1;
        Object strings = c31243a2.getStrings(this);
        if (strings == coroutine_suspended) {
            return coroutine_suspended;
        }
        return strings;
    }
}
