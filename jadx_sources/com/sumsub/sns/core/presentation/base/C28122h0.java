package com.sumsub.sns.core.presentation.base;

import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.core.presentation.base.h0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28122h0 extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public int f57335a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC41635f f57336b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f57337c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC28142p0 f57338d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28122h0(AbstractC28142p0 abstractC28142p0, Continuation continuation) {
        super(3, continuation);
        this.f57338d = abstractC28142p0;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C28122h0 c28122h0 = new C28122h0(this.f57338d, (Continuation) obj3);
        c28122h0.f57336b = (InterfaceC41635f) obj;
        c28122h0.f57337c = obj2;
        return c28122h0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57335a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = this.f57336b;
            InterfaceC41634e interfaceC41634eM90927m = C41636g.m90927m(this.f57338d.progressFlow, C41636g.m90939v(this.f57338d.buildViewStateFlow((C28075O) this.f57337c)), new C28140o0(null));
            this.f57335a = 1;
            if (C41636g.m90878B(interfaceC41635f, interfaceC41634eM90927m, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
