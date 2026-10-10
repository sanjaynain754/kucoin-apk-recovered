package com.sumsub.sns.internal.features.presentation.poa;

import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.internal.features.data.model.common.C29046Q2;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.poa.t */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31468t extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63819a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31472x f63820b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31463o f63821c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31468t(C31472x c31472x, C31463o c31463o, Continuation continuation) {
        super(2, continuation);
        this.f63820b = c31472x;
        this.f63821c = c31463o;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31468t(this.f63820b, this.f63821c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31468t(this.f63820b, this.f63821c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63819a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C31472x c31472x = this.f63820b;
            C29046Q2 c29046q2 = this.f63821c.f63798a;
            this.f63819a = 1;
            int i12 = C31472x.f63837W;
            obj = c31472x.m70736a(c29046q2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        InterfaceC28145r interfaceC28145r = (InterfaceC28145r) obj;
        if (interfaceC28145r != null) {
            C31472x c31472x2 = this.f63820b;
            int i13 = C31472x.f63837W;
            c31472x2.fireEvent(interfaceC28145r);
        }
        return Unit.INSTANCE;
    }
}
