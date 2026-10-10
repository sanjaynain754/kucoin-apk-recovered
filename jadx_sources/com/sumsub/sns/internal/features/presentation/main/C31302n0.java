package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.n0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31302n0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63436a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31332p0 f63437b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC29172p f63438c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C29124h f63439d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f63440e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31302n0(C31332p0 c31332p0, AbstractC29172p abstractC29172p, C29124h c29124h, boolean z11, Continuation continuation) {
        super(2, continuation);
        this.f63437b = c31332p0;
        this.f63438c = abstractC29172p;
        this.f63439d = c29124h;
        this.f63440e = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31302n0(this.f63437b, this.f63438c, this.f63439d, this.f63440e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31302n0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r3.m70685a(r4, r5, false, r7, (p852kotlin.coroutines.jvm.internal.ContinuationImpl) r9) == r0) goto L15;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63436a;
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
        long j11 = this.f63437b.f63507q;
        this.f63436a = 1;
        if (DelayKt.m90350b(j11, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "level change did not happen", null);
        this.f63437b.m70692a();
        C31332p0 c31332p0 = this.f63437b;
        AbstractC29172p abstractC29172p = this.f63438c;
        C29124h c29124h = this.f63439d;
        boolean z11 = this.f63440e;
        this.f63436a = 2;
    }
}
