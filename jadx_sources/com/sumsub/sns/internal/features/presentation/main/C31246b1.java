package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.b1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31246b1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63244a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31251c2 f63245b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC29172p f63246c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C29124h f63247d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f63248e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31246b1(C31251c2 c31251c2, AbstractC29172p abstractC29172p, C29124h c29124h, boolean z11, Continuation continuation) {
        super(2, continuation);
        this.f63245b = c31251c2;
        this.f63246c = abstractC29172p;
        this.f63247d = c29124h;
        this.f63248e = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31246b1(this.f63245b, this.f63246c, this.f63247d, this.f63248e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31246b1) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r6.m70644a(r7, r8, false, r10, r12) == r0) goto L18;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63244a;
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
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        long j11 = this.f63245b.f63281o;
        this.f63244a = 1;
        if (DelayKt.m90350b(j11, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "level change did not happen, show status screen", null);
        C31251c2 c31251c2 = this.f63245b;
        C31363x0 c31363x0 = C31251c2.f63266C;
        InterfaceC41775x1 interfaceC41775x1 = c31251c2.f63283q;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        c31251c2.f63283q = null;
        C31251c2 c31251c3 = this.f63245b;
        AbstractC29172p abstractC29172p = this.f63246c;
        C29124h c29124h = this.f63247d;
        boolean z11 = this.f63248e;
        this.f63244a = 2;
    }
}
