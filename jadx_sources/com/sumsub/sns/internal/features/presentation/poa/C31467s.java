package com.sumsub.sns.internal.features.presentation.poa;

import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.internal.features.domain.utils.C30316a;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.poa.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31467s extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public int f63814a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC41635f f63815b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f63816c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C28075O f63817d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C31472x f63818e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31467s(C28075O c28075o, C31472x c31472x, Continuation continuation) {
        super(3, continuation);
        this.f63817d = c28075o;
        this.f63818e = c31472x;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C31467s c31467s = new C31467s(this.f63817d, this.f63818e, (Continuation) obj3);
        c31467s.f63815b = (InterfaceC41635f) obj;
        c31467s.f63816c = obj2;
        return c31467s.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63814a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = this.f63815b;
            SNSProofOfAddressViewModelV2$Step sNSProofOfAddressViewModelV2$Step = (SNSProofOfAddressViewModelV2$Step) this.f63816c;
            C28075O c28075o = this.f63817d;
            if (c28075o.f57271c != null && c28075o.f57270b != null) {
                if (AbstractC31464p.f63799a[sNSProofOfAddressViewModelV2$Step.ordinal()] == 1) {
                    C31472x c31472x = this.f63818e;
                    InterfaceC41634e interfaceC41634eM90929n = C41636g.m90929n(c31472x.f63846n, c31472x.f63848p, c31472x.f63849q, new C31465q(this.f63817d, c31472x, null));
                    this.f63814a = 1;
                    if (C41636g.m90878B(interfaceC41635f, interfaceC41634eM90929n, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                C30316a.m70182a(this.f63818e.f63842j, "SNSPoaViewModelV2", "buildViewStateFlow: no strings or config");
                throw new IllegalStateException("No strings or config");
            }
        }
        return Unit.INSTANCE;
    }
}
