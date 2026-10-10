package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.domain.appdata.C30099f;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.S0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31217S0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63134a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63135b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31251c2 f63136c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f63137d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C31251c2 f63138e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f63139f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31217S0(C31251c2 c31251c2, Continuation continuation, boolean z11, C31251c2 c31251c3, boolean z12) {
        super(2, continuation);
        this.f63136c = c31251c2;
        this.f63137d = z11;
        this.f63138e = c31251c3;
        this.f63139f = z12;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31217S0 c31217s0 = new C31217S0(this.f63136c, continuation, this.f63137d, this.f63138e, this.f63139f);
        c31217s0.f63135b = obj;
        return c31217s0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31217S0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        if (r1.m70656b(r3, r8) == r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6, types: [kotlinx.coroutines.m0] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ?? r11;
        InterfaceC41709m0 interfaceC41709m0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r12 = this.f63134a;
        try {
            if (r12 != 0) {
                try {
                    if (r12 != 1) {
                        if (r12 != 2) {
                            if (r12 == 3) {
                                r11 = (InterfaceC41709m0) this.f63135b;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                } catch (CancellationException unused) {
                                    Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(r11), "CancellationException happened", null, 4, null);
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            InterfaceC41709m0 interfaceC41709m1 = (InterfaceC41709m0) this.f63135b;
                            ResultKt.throwOnFailure(obj);
                            ((Result) obj).getValue();
                            interfaceC41709m0 = interfaceC41709m1;
                            C31251c2 c31251c2 = this.f63138e;
                            boolean z11 = this.f63137d;
                            this.f63135b = interfaceC41709m0;
                            this.f63134a = 3;
                            C31363x0 c31363x0 = C31251c2.f63266C;
                        }
                    } else {
                        InterfaceC41709m0 interfaceC41709m2 = (InterfaceC41709m0) this.f63135b;
                        ResultKt.throwOnFailure(obj);
                        interfaceC41709m0 = interfaceC41709m2;
                    }
                } catch (CancellationException unused2) {
                    r11 = r12;
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            interfaceC41709m0 = (InterfaceC41709m0) this.f63135b;
            try {
                C33272c.f67816e.f67810a.mo68955d("SNSAppViewModel", "Show applicant status screen: isCancelled=" + this.f63137d, null);
                C31251c2 c31251c3 = this.f63138e;
                boolean z12 = this.f63137d;
                this.f63135b = interfaceC41709m0;
                this.f63134a = 1;
                C31363x0 c31363x1 = C31251c2.f63266C;
                if (c31251c3.m70647a(z12, this) == coroutine_suspended) {
                }
                return coroutine_suspended;
            } catch (CancellationException unused3) {
                r11 = interfaceC41709m0;
                Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(r11), "CancellationException happened", null, 4, null);
            }
            C31251c2 c31251c4 = this.f63138e;
            C30099f c30099f = c31251c4.f63273g;
            boolean z13 = this.f63139f;
            InterfaceC29921d interfaceC29921d = c31251c4.f63278l;
            this.f63135b = interfaceC41709m0;
            this.f63134a = 2;
            if (c30099f.m70111a(z13, interfaceC29921d, this) != coroutine_suspended) {
                C31251c2 c31251c5 = this.f63138e;
                boolean z14 = this.f63137d;
                this.f63135b = interfaceC41709m0;
                this.f63134a = 3;
                C31363x0 c31363x2 = C31251c2.f63266C;
            }
            return coroutine_suspended;
        } catch (Exception e11) {
            AbstractC28052C.throwError$default(this.f63136c, e11, "TYPE_UNKNOWN", null, 4, null);
        }
    }
}
