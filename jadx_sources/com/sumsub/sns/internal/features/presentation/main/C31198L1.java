package com.sumsub.sns.internal.features.presentation.main;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.internal.features.presentation.main.navigation.C31315k;
import com.sumsub.sns.internal.features.presentation.main.navigation.C31318n;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.main.L1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31198L1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f63081a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f63082b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31243a2 f63083c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f63084d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C31243a2 f63085e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f63086f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31198L1(C31243a2 c31243a2, Continuation continuation, boolean z11, C31243a2 c31243a3, boolean z12) {
        super(2, continuation);
        this.f63083c = c31243a2;
        this.f63084d = z11;
        this.f63085e = c31243a3;
        this.f63086f = z12;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31198L1 c31198l1 = new C31198L1(this.f63083c, continuation, this.f63084d, this.f63085e, this.f63086f);
        c31198l1.f63082b = obj;
        return c31198l1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31198L1) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        if (r1.m70691a(r3, r4, r9) == r0) goto L31;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63081a;
        try {
            if (i11 != 0) {
                if (i11 != 1 && i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC41709m0 = (InterfaceC41709m0) this.f63082b;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (CancellationException unused) {
                    Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(interfaceC41709m0), "CancellationException happened", null, 4, null);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                InterfaceC41709m0 interfaceC41709m1 = (InterfaceC41709m0) this.f63082b;
                try {
                    String str = "Show applicant status screen: isCancelled=" + this.f63084d;
                    C33270a c33270a = C33272c.f67816e;
                    c33270a.f67810a.mo68955d("SNSAppViewModel2", str, null);
                    KProperty[] kPropertyArr = C31243a2.f63220x;
                    if (C33048a.f67467b0.m71434a()) {
                        if (this.f63084d) {
                            C31318n c31318n = this.f63085e.f63230m;
                            this.f63082b = interfaceC41709m1;
                            this.f63081a = 1;
                            if (c31318n.m70674a(this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            C31318n c31318n2 = this.f63085e.f63230m;
                            this.f63082b = interfaceC41709m1;
                            this.f63081a = 2;
                            c31318n2.getClass();
                            c33270a.f67810a.mo68955d("ServerNavigationRouter", "navigateNext", null);
                            Object objM70677a = c31318n2.m70677a(false, new C31315k(c31318n2, null), this);
                            if (objM70677a != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                objM70677a = Unit.INSTANCE;
                            }
                            if (objM70677a == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        C31332p0 c31332p0 = this.f63085e.f63240w;
                        boolean z11 = this.f63084d;
                        boolean z12 = this.f63086f;
                        this.f63082b = interfaceC41709m1;
                        this.f63081a = 3;
                    }
                } catch (CancellationException unused2) {
                    interfaceC41709m0 = interfaceC41709m1;
                    Logger.DefaultImpls.d$default(C33272c.f67812a, AbstractC33294e.m71624a(interfaceC41709m0), "CancellationException happened", null, 4, null);
                }
            }
        } catch (Exception e11) {
            AbstractC28052C.throwError$default(this.f63083c, e11, "TYPE_UNKNOWN", null, 4, null);
        }
        return Unit.INSTANCE;
    }
}
