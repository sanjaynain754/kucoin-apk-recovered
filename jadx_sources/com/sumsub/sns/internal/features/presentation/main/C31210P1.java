package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.presentation.main.navigation.C31318n;
import com.sumsub.sns.internal.features.presentation.main.navigation.ServerNavigationRouter$ReinitReason;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.P1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31210P1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63117a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31243a2 f63118b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31210P1(C31243a2 c31243a2, Continuation continuation) {
        super(2, continuation);
        this.f63118b = c31243a2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31210P1(this.f63118b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31210P1(this.f63118b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63117a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C31318n c31318n = this.f63118b.f63230m;
            ServerNavigationRouter$ReinitReason serverNavigationRouter$ReinitReason = ServerNavigationRouter$ReinitReason.RestrictionPassed;
            this.f63117a = 1;
            if (c31318n.m70675a(serverNavigationRouter$ReinitReason, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
