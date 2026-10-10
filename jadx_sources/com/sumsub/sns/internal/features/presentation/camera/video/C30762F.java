package com.sumsub.sns.internal.features.presentation.camera.video;

import android.os.CountDownTimer;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.video.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30762F extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f62150a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30763G f62151b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30762F(C30763G c30763g, Continuation continuation) {
        super(2, continuation);
        this.f62151b = c30763g;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30762F(this.f62151b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30762F(this.f62151b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f62150a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C30763G c30763g = this.f62151b;
            if (c30763g.f62158f == null) {
                this.f62150a = 1;
                if (c30763g.m70448a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        AbstractC28073M0.updateState$default(this.f62151b, false, new C30760D(null), 1, null);
        C30763G c30763g2 = this.f62151b;
        CountDownTimer countDownTimer = c30763g2.f62157e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        c30763g2.f62157e = null;
        this.f62151b.f62157e = new CountDownTimerC30761E(this.f62151b).start();
        return Unit.INSTANCE;
    }
}
