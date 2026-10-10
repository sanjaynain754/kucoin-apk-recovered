package com.sumsub.sns.internal.features.presentation.prooface;

import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32207e0;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32210f0;
import com.sumsub.sns.internal.features.presentation.prooface.session.C32239r0;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import com.sumsub.sns.internal.features.presentation.prooface.utils.C32266c;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41669n;
import kotlinx.coroutines.flow.InterfaceC41678w;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.N1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32023N1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f65091a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f65092b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C32072c2 f65093c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32023N1(C32072c2 c32072c2, Continuation continuation) {
        super(2, continuation);
        this.f65093c = c32072c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C32023N1 c32023n1 = new C32023N1(this.f65093c, continuation);
        c32023n1.f65092b = obj;
        return c32023n1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32023N1 c32023n1 = new C32023N1(this.f65093c, (Continuation) obj2);
        c32023n1.f65092b = (InterfaceC41709m0) obj;
        return c32023n1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bc, code lost:
    
        if (r1.m70974a((com.sumsub.sns.internal.features.presentation.prooface.session.InterfaceC32150D0) r12, r11) == r0) goto L21;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC41709m0 interfaceC41709m0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65091a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.f65093c.showProgress(false);
                    C32028P0 c32028p0 = this.f65093c.f65271n;
                    this.f65091a = 3;
                }
            } else {
                interfaceC41709m0 = (InterfaceC41709m0) this.f65092b;
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        interfaceC41709m0 = (InterfaceC41709m0) this.f65092b;
        AbstractC32267d.m71078a("ViewModel: startCameraSession");
        this.f65093c.showProgress(true);
        InterfaceC41669n interfaceC41669n = this.f65093c.f65269l;
        C32086f1 c32086f1 = C32086f1.f65298a;
        this.f65092b = interfaceC41709m0;
        this.f65091a = 1;
        if (interfaceC41669n.emit(c32086f1, this) != coroutine_suspended) {
        }
        return coroutine_suspended;
        InterfaceC41709m0 interfaceC41709m1 = interfaceC41709m0;
        C32072c2 c32072c2 = this.f65093c;
        C32210f0 c32210f0 = c32072c2.f65261d;
        InterfaceC41678w interfaceC41678w = c32072c2.f65275r;
        C31984A1 c31984a1 = c32072c2.f65279v;
        C32239r0 c32239r0 = new C32239r0(interfaceC41709m1, c32210f0.f65607a, c32210f0.f65608b, new C32207e0(interfaceC41709m1, interfaceC41678w, c32210f0, c31984a1, new C32266c(c32210f0.f65610d, c31984a1)));
        C32072c2 c32072c3 = this.f65093c;
        AbstractC28421U.m69303a(c32239r0.f65689g, interfaceC41709m1, new C32032Q1(c32072c3, null));
        AbstractC28421U.m69303a(c32239r0.f65689g, interfaceC41709m1, new C32034R1(c32072c3, null));
        AbstractC28421U.m69306b(c32239r0.f65689g, interfaceC41709m1, new C32037S1(c32072c3, null));
        C41696j.m91104d(interfaceC41709m1, null, null, new C32049W1(c32239r0, c32072c3, null), 3, null);
        this.f65093c.f65267j = c32239r0;
        this.f65092b = null;
        this.f65091a = 2;
        obj = c32239r0.m71071b(this);
        if (obj != coroutine_suspended) {
            this.f65093c.showProgress(false);
            C32028P0 c32028p1 = this.f65093c.f65271n;
            this.f65091a = 3;
        }
        return coroutine_suspended;
    }
}
