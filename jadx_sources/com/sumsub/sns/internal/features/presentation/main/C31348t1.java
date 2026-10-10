package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.presentation.main.navigation.C31318n;
import com.sumsub.sns.internal.features.presentation.main.navigation.ServerNavigationRouter$ReinitReason;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.t1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31348t1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63538a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31243a2 f63539b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31348t1(C31243a2 c31243a2, Continuation continuation) {
        super(2, continuation);
        this.f63539b = c31243a2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31348t1(this.f63539b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31348t1(this.f63539b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63538a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C31318n c31318n = this.f63539b.f63230m;
            ServerNavigationRouter$ReinitReason serverNavigationRouter$ReinitReason = ServerNavigationRouter$ReinitReason.LevelChanged;
            this.f63538a = 1;
            if (c31318n.m70675a(serverNavigationRouter$ReinitReason, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
