package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.e1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31258e1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63309a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63310b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31251c2 f63311c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31258e1(C31251c2 c31251c2, Continuation continuation) {
        super(2, continuation);
        this.f63311c = c31251c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31258e1 c31258e1 = new C31258e1(this.f63311c, continuation);
        c31258e1.f63310b = obj;
        return c31258e1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C31258e1 c31258e1 = new C31258e1(this.f63311c, (Continuation) obj2);
        c31258e1.f63310b = (InterfaceC41709m0) obj;
        return c31258e1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63309a;
        if (i11 != 0) {
            if (i11 == 1) {
                interfaceC41709m0 = (InterfaceC41709m0) this.f63310b;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41709m0 interfaceC41709m1 = (InterfaceC41709m0) this.f63310b;
            this.f63310b = interfaceC41709m1;
            this.f63309a = 1;
            if (DelayKt.m90350b(7000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC41709m0 = interfaceC41709m1;
        }
        if (C41713n0.m91132h(interfaceC41709m0)) {
            AbstractC28073M0.updateState$default(this.f63311c, false, new C31254d1(null), 1, null);
        }
        return Unit.INSTANCE;
    }
}
