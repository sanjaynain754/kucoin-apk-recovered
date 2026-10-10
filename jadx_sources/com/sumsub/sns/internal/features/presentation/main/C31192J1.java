package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.domain.C30079M;
import com.sumsub.sns.internal.features.domain.fisherman.C30182f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.J1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31192J1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63061a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31243a2 f63062b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30079M f63063c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31192J1(C31243a2 c31243a2, C30079M c30079m, Continuation continuation) {
        super(2, continuation);
        this.f63062b = c31243a2;
        this.f63063c = c30079m;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31192J1(this.f63062b, this.f63063c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31192J1(this.f63062b, this.f63063c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63061a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C30182f c30182f = this.f63062b.f63222e;
            String strMo69754e = this.f63063c.f60444b.mo69754e();
            this.f63061a = 1;
            if (c30182f.m70132a(strMo69754e, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
