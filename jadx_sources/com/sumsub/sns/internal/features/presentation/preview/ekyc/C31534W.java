package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import com.sumsub.sns.internal.features.data.model.common.remote.response.C29456A0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.W */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31534W extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f64017a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f64018b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31707h0 f64019c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C29456A0 f64020d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31534W(C31707h0 c31707h0, C29456A0 c29456a0, Continuation continuation) {
        super(2, continuation);
        this.f64019c = c31707h0;
        this.f64020d = c29456a0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C31534W c31534w = new C31534W(this.f64019c, this.f64020d, continuation);
        c31534w.f64018b = obj;
        return c31534w;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C31534W) create((AbstractC31514B) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C31736z c31736z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64017a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    c31736z = (C31736z) this.f64018b;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return C31736z.m70852a(c31736z, (CharSequence) obj, null, 0L, this.f64020d, 27);
        }
        ResultKt.throwOnFailure(obj);
        AbstractC31514B abstractC31514B = (AbstractC31514B) this.f64018b;
        C31707h0 c31707h0 = this.f64019c;
        this.f64017a = 1;
        KProperty[] kPropertyArr = C31707h0.f64357D;
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
        C31707h0 c31707h1 = this.f64019c;
        this.f64018b = c31736z2;
        this.f64017a = 2;
        KProperty[] kPropertyArr2 = C31707h0.f64357D;
        Object objM70808a = c31707h1.m70808a(60L, this);
        if (objM70808a != coroutine_suspended) {
            c31736z = c31736z2;
            obj = objM70808a;
            return C31736z.m70852a(c31736z, (CharSequence) obj, null, 0L, this.f64020d, 27);
        }
        return coroutine_suspended;
    }
}
