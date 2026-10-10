package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.features.data.model.prooface.C29805H;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.B1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31987B1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65029a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32072c2 f65030b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31987B1(C32072c2 c32072c2, Continuation continuation) {
        super(2, continuation);
        this.f65030b = c32072c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31987B1(this.f65030b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31987B1(this.f65030b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (kotlinx.coroutines.DelayKt.m90350b(60, r4) == r0) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65029a;
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
            C32072c2 c32072c2 = this.f65030b;
            c32072c2.f65271n.m70975a(C29805H.f59881a);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41669n interfaceC41669n = this.f65030b.f65269l;
        C32086f1 c32086f1 = C32086f1.f65298a;
        this.f65029a = 1;
        if (interfaceC41669n.emit(c32086f1, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        this.f65029a = 2;
    }
}
