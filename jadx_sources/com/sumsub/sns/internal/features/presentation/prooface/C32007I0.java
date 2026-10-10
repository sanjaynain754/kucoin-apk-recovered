package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.I0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32007I0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65066a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f65067b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC28142p0 f65068c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C32072c2 f65069d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32007I0(AbstractC28142p0 abstractC28142p0, Continuation continuation, C32072c2 c32072c2) {
        super(2, continuation);
        this.f65068c = abstractC28142p0;
        this.f65069d = c32072c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32007I0 c32007i0 = new C32007I0(this.f65068c, continuation, this.f65069d);
        c32007i0.f65067b = obj;
        return c32007i0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C32007I0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r6.emit(r1, r5) == r0) goto L20;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65066a;
        try {
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
                this.f65068c.showProgress(false);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            C32072c2 c32072c2 = this.f65069d;
            this.f65066a = 1;
            if (C32072c2.m71010a(c32072c2, this) == coroutine_suspended) {
            }
            return coroutine_suspended;
            InterfaceC41669n interfaceC41669n = this.f65069d.f65266i;
            Boolean boolBoxBoolean = Boxing.boxBoolean(true);
            this.f65066a = 2;
        } catch (Throwable th2) {
            this.f65068c.showProgress(false);
            throw th2;
        }
    }
}
