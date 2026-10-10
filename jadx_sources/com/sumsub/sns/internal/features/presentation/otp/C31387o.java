package com.sumsub.sns.internal.features.presentation.otp;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.otp.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31387o extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63607a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31389q f63608b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31387o(C31389q c31389q, Continuation continuation) {
        super(2, continuation);
        this.f63608b = c31389q;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31387o(this.f63608b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31387o(this.f63608b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63607a;
        if (i11 != 0 && i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        do {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C31389q c31389q = this.f63608b;
            KProperty[] kPropertyArr = C31389q.f63612d;
            C28936t c28936t = c31389q.f63615c;
            KProperty[] kPropertyArr2 = C31389q.f63612d;
            KProperty kProperty = kPropertyArr2[0];
            if (jCurrentTimeMillis < ((Number) c28936t.m69705a()).longValue()) {
                C31389q c31389q2 = this.f63608b;
                AbstractC28073M0.updateState$default(c31389q2, false, new C31388p(c31389q2, null), 1, null);
                this.f63607a = 1;
            } else {
                C31389q c31389q3 = this.f63608b;
                AbstractC28073M0.updateState$default(c31389q3, false, new C31388p(c31389q3, null), 1, null);
                C31389q c31389q4 = this.f63608b;
                Logger.DefaultImpls.v$default(C33272c.f67812a, c31389q4.m70703e(), "stopResendTimer", null, 4, null);
                C28936t c28936t2 = c31389q4.f63615c;
                KProperty kProperty2 = kPropertyArr2[0];
                c28936t2.f58834a.set(c28936t2.f58835b, 0L);
                InterfaceC41775x1 interfaceC41775x1 = c31389q4.f63614b;
                if (interfaceC41775x1 != null) {
                    InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
                }
                c31389q4.f63614b = null;
                return Unit.INSTANCE;
            }
        } while (DelayKt.m90350b(1000L, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
