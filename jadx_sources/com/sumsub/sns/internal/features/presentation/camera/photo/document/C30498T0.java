package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.T0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30498T0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public Object f61574a;

    /* JADX INFO: renamed from: b */
    public C30486P f61575b;

    /* JADX INFO: renamed from: c */
    public InterfaceC41669n f61576c;

    /* JADX INFO: renamed from: d */
    public int f61577d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C30444C2 f61578e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30498T0(C30444C2 c30444c2, Continuation continuation) {
        super(2, continuation);
        this.f61578e = c30444c2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30498T0(this.f61578e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30498T0(this.f61578e, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C30444C2 c30444c2;
        C30486P c30486p;
        InterfaceC41669n interfaceC41669n;
        InterfaceC41669n interfaceC41669n2;
        C30483O c30483o;
        C30486P c30486p2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61577d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    interfaceC41669n2 = this.f61576c;
                    c30486p2 = this.f61575b;
                    C30483O c30483o2 = (C30483O) this.f61574a;
                    ResultKt.throwOnFailure(obj);
                    c30483o = c30483o2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                interfaceC41669n = this.f61576c;
                c30486p = this.f61575b;
                c30444c2 = (C30444C2) this.f61574a;
                ResultKt.throwOnFailure(obj);
            }
            interfaceC41669n2.setValue(C30486P.m70403a(c30486p2, null, c30483o, (C30477M) obj, null, null, 25));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        C30444C2 c30444c3 = this.f61578e;
        c30444c3.f61338B = true;
        AbstractC28073M0.updateState$default(c30444c3, false, new C30495S0(null), 1, null);
        InterfaceC41669n interfaceC41669n3 = this.f61578e.f61343G;
        Object value = interfaceC41669n3.getValue();
        c30444c2 = this.f61578e;
        c30486p = (C30486P) value;
        this.f61574a = c30444c2;
        this.f61575b = c30486p;
        this.f61576c = interfaceC41669n3;
        this.f61577d = 1;
        Object objM70352d = c30444c2.m70352d(this);
        if (objM70352d != coroutine_suspended) {
            interfaceC41669n = interfaceC41669n3;
            obj = objM70352d;
        }
        return coroutine_suspended;
        C30486P c30486p3 = (C30486P) obj;
        C30483O c30483oM70402a = C30483O.m70402a(c30486p.f61538b, Boxing.boxBoolean(true), Boxing.boxBoolean(true), 6);
        C30536d c30536d = new C30536d(false, CheckDetectionResult$SizeCheckResult.SMALL, false);
        this.f61574a = c30483oM70402a;
        this.f61575b = c30486p3;
        this.f61576c = interfaceC41669n;
        this.f61577d = 2;
        KProperty[] kPropertyArr = C30444C2.f61336U;
        Object objM70337a = c30444c2.m70337a(c30536d, false, (ContinuationImpl) this);
        if (objM70337a != coroutine_suspended) {
            interfaceC41669n2 = interfaceC41669n;
            c30483o = c30483oM70402a;
            c30486p2 = c30486p3;
            obj = objM70337a;
            interfaceC41669n2.setValue(C30486P.m70403a(c30486p2, null, c30483o, (C30477M) obj, null, null, 25));
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
