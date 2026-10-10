package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import kotlinx.coroutines.DelayKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.h0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32095h0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65313a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32109k0 f65314b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f65315c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32095h0(C32109k0 c32109k0, float f11, Continuation continuation) {
        super(2, continuation);
        this.f65314b = c32109k0;
        this.f65315c = f11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32095h0(this.f65314b, this.f65315c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32095h0(this.f65314b, this.f65315c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65313a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.f65314b.f65352I.setValue(new C31994E(this.f65315c));
            this.f65313a = 1;
            if (DelayKt.m90350b(250L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.f65314b.showProgress(false);
        AbstractC32267d.m71078a("Calibration finished");
        return Unit.INSTANCE;
    }
}
