package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.b0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31541b0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f64042a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f64043b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31707h0 f64044c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f64045d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31541b0(C31707h0 c31707h0, long j11, Continuation continuation) {
        super(2, continuation);
        this.f64044c = c31707h0;
        this.f64045d = j11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31541b0 c31541b0 = new C31541b0(this.f64044c, this.f64045d, continuation);
        c31541b0.f64043b = obj;
        return c31541b0;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31541b0) create((AbstractC31514B) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C31736z c31736z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64042a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    c31736z = (C31736z) this.f64043b;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return C31736z.m70852a(c31736z, (CharSequence) obj, null, this.f64045d, null, 43);
        }
        ResultKt.throwOnFailure(obj);
        AbstractC31514B abstractC31514B = (AbstractC31514B) this.f64043b;
        C31707h0 c31707h0 = this.f64044c;
        this.f64042a = 1;
        KProperty[] kPropertyArr = C31707h0.f64357D;
        c31707h0.getClass();
        if (abstractC31514B instanceof C31736z) {
            obj = (C31736z) abstractC31514B;
        } else {
            obj = null;
        }
        if (obj == null) {
            obj = c31707h0.m70818c(this);
        }
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        C31736z c31736z2 = (C31736z) obj;
        C31707h0 c31707h1 = this.f64044c;
        long j11 = this.f64045d;
        this.f64043b = c31736z2;
        this.f64042a = 2;
        KProperty[] kPropertyArr2 = C31707h0.f64357D;
        Object objM70808a = c31707h1.m70808a(j11, this);
        if (objM70808a != coroutine_suspended) {
            c31736z = c31736z2;
            obj = objM70808a;
            return C31736z.m70852a(c31736z, (CharSequence) obj, null, this.f64045d, null, 43);
        }
        return coroutine_suspended;
    }
}
