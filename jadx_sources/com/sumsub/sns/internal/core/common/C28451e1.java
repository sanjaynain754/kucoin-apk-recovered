package com.sumsub.sns.internal.core.common;

import com.sumsub.sns.internal.features.presentation.status.C32393B;
import com.sumsub.sns.internal.features.presentation.status.C32403L;
import com.sumsub.sns.internal.log.C33272c;
import java.util.concurrent.CancellationException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.e1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28451e1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f57966a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32393B f57967b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32403L f57968c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28451e1(C32393B c32393b, C32403L c32403l, Continuation continuation) {
        super(2, continuation);
        this.f57967b = c32393b;
        this.f57968c = c32403l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28451e1(this.f57967b, this.f57968c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C28451e1(this.f57967b, this.f57968c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57966a;
        try {
            try {
                try {
                    if (i11 != 0) {
                        if (i11 == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        C32393B c32393b = this.f57967b;
                        this.f57966a = 1;
                        if (c32393b.invoke(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    this.f57968c.showProgress(false);
                } catch (CancellationException e11) {
                    throw e11;
                }
            } catch (Exception e12) {
                C33272c.f67816e.f67810a.mo68956e("launchWithProgress", "Error during operation", e12);
                this.f57968c.showProgress(false);
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            this.f57968c.showProgress(false);
            throw th2;
        }
    }
}
