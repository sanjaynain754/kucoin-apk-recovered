package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.B0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31167B0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63015a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63016b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31251c2 f63017c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f63018d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC28503w f63019e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C31251c2 f63020f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31167B0(C31251c2 c31251c2, Continuation continuation, long j11, AbstractC28503w abstractC28503w, C31251c2 c31251c3) {
        super(2, continuation);
        this.f63017c = c31251c2;
        this.f63018d = j11;
        this.f63019e = abstractC28503w;
        this.f63020f = c31251c3;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31167B0 c31167b0 = new C31167B0(this.f63017c, continuation, this.f63018d, this.f63019e, this.f63020f);
        c31167b0.f63016b = obj;
        return c31167b0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31167B0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0;
        InterfaceC41709m0 interfaceC41709m1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63015a;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        interfaceC41709m1 = (InterfaceC41709m0) this.f63016b;
                        try {
                            ResultKt.throwOnFailure(obj);
                            AbstractC28052C.finish$default(this.f63020f, this.f63019e, null, null, null, 14, null);
                        } catch (CancellationException unused) {
                            Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(interfaceC41709m1), "CancellationException happened", null, 4, null);
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC41709m0 interfaceC41709m2 = (InterfaceC41709m0) this.f63016b;
                try {
                    ResultKt.throwOnFailure(obj);
                    interfaceC41709m0 = interfaceC41709m2;
                } catch (CancellationException unused2) {
                    interfaceC41709m1 = interfaceC41709m2;
                    Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(interfaceC41709m1), "CancellationException happened", null, 4, null);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                interfaceC41709m0 = (InterfaceC41709m0) this.f63016b;
                try {
                    C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "Delayed finish for " + this.f63018d + " ms requested with reason " + this.f63019e, null);
                    InterfaceC41775x1 interfaceC41775x1 = this.f63020f.f63283q;
                    if (interfaceC41775x1 != null) {
                        this.f63016b = interfaceC41709m0;
                        this.f63015a = 1;
                        if (interfaceC41775x1.mo90385E(this) == coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                } catch (CancellationException unused3) {
                    interfaceC41709m1 = interfaceC41709m0;
                    Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(interfaceC41709m1), "CancellationException happened", null, 4, null);
                }
            }
            long j11 = this.f63018d;
            this.f63016b = interfaceC41709m0;
            this.f63015a = 2;
            if (DelayKt.m90350b(j11, this) != coroutine_suspended) {
                interfaceC41709m1 = interfaceC41709m0;
                AbstractC28052C.finish$default(this.f63020f, this.f63019e, null, null, null, 14, null);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Exception e11) {
            AbstractC28052C.throwError$default(this.f63017c, e11, "TYPE_UNKNOWN", null, 4, null);
        }
    }
}
