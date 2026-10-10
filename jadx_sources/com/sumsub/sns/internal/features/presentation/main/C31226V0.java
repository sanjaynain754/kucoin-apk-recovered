package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.core.presentation.base.C28150t0;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.flow.InterfaceC41635f;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function5;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.V0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31226V0 extends SuspendLambda implements Function5 {

    /* JADX INFO: renamed from: a */
    public int f63167a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC41635f f63168b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ C28150t0 f63169c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f63170d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ int f63171e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C31251c2 f63172f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31226V0(C31251c2 c31251c2, Continuation continuation) {
        super(5, continuation);
        this.f63172f = c31251c2;
    }

    @Override // p852kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        int iIntValue = ((Number) obj4).intValue();
        C31226V0 c31226v0 = new C31226V0(this.f63172f, (Continuation) obj5);
        c31226v0.f63168b = (InterfaceC41635f) obj;
        c31226v0.f63169c = (C28150t0) obj2;
        c31226v0.f63170d = zBooleanValue;
        c31226v0.f63171e = iIntValue;
        return c31226v0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j11;
        boolean z11;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63167a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC41635f interfaceC41635f = this.f63168b;
            C28150t0 c28150t0 = this.f63169c;
            boolean z12 = this.f63170d;
            int i12 = this.f63171e;
            C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "onProgress: progress=" + z12 + ", internalProgress=" + i12 + ", internalState=" + this.f63172f.getViewModelInternalState().getValue(), null);
            if (!z12 && i12 <= 0 && c28150t0.f57390e && c28150t0.f57391f) {
                j11 = 350;
            } else {
                j11 = 0;
            }
            if (c28150t0.f57390e && c28150t0.f57391f && !z12 && i12 <= 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            Pair pairM90091to = TuplesKt.m90091to(Boxing.boxBoolean(z11), Boxing.boxLong(j11));
            this.f63168b = null;
            this.f63167a = 1;
            if (interfaceC41635f.emit(pairM90091to, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
