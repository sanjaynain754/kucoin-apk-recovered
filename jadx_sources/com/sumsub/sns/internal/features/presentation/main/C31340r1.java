package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.core.common.AbstractC28503w;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
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
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.r1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31340r1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63524a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63525b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31243a2 f63526c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f63527d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC28503w f63528e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C31243a2 f63529f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31340r1(C31243a2 c31243a2, Continuation continuation, long j11, AbstractC28503w abstractC28503w, C31243a2 c31243a3) {
        super(2, continuation);
        this.f63526c = c31243a2;
        this.f63527d = j11;
        this.f63528e = abstractC28503w;
        this.f63529f = c31243a3;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31340r1 c31340r1 = new C31340r1(this.f63526c, continuation, this.f63527d, this.f63528e, this.f63529f);
        c31340r1.f63525b = obj;
        return c31340r1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31340r1) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0;
        InterfaceC41775x1 interfaceC41775x1;
        InterfaceC41709m0 interfaceC41709m1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63524a;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        interfaceC41709m1 = (InterfaceC41709m0) this.f63525b;
                        try {
                            ResultKt.throwOnFailure(obj);
                            AbstractC28052C.finish$default(this.f63529f, this.f63528e, null, null, null, 14, null);
                        } catch (CancellationException unused) {
                            Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(interfaceC41709m1), "CancellationException happened", null, 4, null);
                        }
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC41709m0 interfaceC41709m2 = (InterfaceC41709m0) this.f63525b;
                try {
                    ResultKt.throwOnFailure(obj);
                    interfaceC41709m0 = interfaceC41709m2;
                } catch (CancellationException unused2) {
                    interfaceC41709m1 = interfaceC41709m2;
                    Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(interfaceC41709m1), "CancellationException happened", null, 4, null);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                interfaceC41709m0 = (InterfaceC41709m0) this.f63525b;
                try {
                    C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel2", "Delayed finish for " + this.f63527d + " ms requested with reason " + this.f63528e, null);
                    KProperty[] kPropertyArr = C31243a2.f63220x;
                    if (!C33048a.f67467b0.m71434a() && (interfaceC41775x1 = this.f63529f.f63240w.f63508r) != null) {
                        this.f63525b = interfaceC41709m0;
                        this.f63524a = 1;
                        if (interfaceC41775x1.mo90385E(this) == coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                } catch (CancellationException unused3) {
                    interfaceC41709m1 = interfaceC41709m0;
                    Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(interfaceC41709m1), "CancellationException happened", null, 4, null);
                }
            }
            long j11 = this.f63527d;
            this.f63525b = interfaceC41709m0;
            this.f63524a = 2;
            if (DelayKt.m90350b(j11, this) != coroutine_suspended) {
                interfaceC41709m1 = interfaceC41709m0;
                AbstractC28052C.finish$default(this.f63529f, this.f63528e, null, null, null, 14, null);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Exception e11) {
            AbstractC28052C.throwError$default(this.f63526c, e11, "TYPE_UNKNOWN", null, 4, null);
        }
    }
}
