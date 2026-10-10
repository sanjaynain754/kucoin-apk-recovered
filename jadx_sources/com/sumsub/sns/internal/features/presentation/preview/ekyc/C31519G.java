package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.remote.C29203D0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29276S;
import com.sumsub.sns.internal.features.data.model.common.remote.C29412m;
import com.sumsub.sns.internal.features.data.model.common.remote.C29683z0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29456A0;
import com.sumsub.sns.internal.features.data.repository.applicant.C29914J;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.presentation.preview.AbstractC31739h;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.G */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31519G extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public String f63953a;

    /* JADX INFO: renamed from: b */
    public int f63954b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31707h0 f63955c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f63956d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31519G(C31707h0 c31707h0, String str, Continuation continuation) {
        super(1, continuation);
        this.f63955c = c31707h0;
        this.f63956d = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C31519G(this.f63955c, this.f63956d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C31519G(this.f63955c, this.f63956d, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        if (r10 == r0) goto L30;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String strMo69754e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63954b;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    str = this.f63953a;
                    ResultKt.throwOnFailure(obj);
                }
                C31707h0 c31707h0 = this.f63955c;
                KProperty[] kPropertyArr = C31707h0.f64357D;
                c31707h0.m70812a((C29456A0) obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            C28936t c28936t = this.f63955c.f64377w;
            KProperty kProperty = C31707h0.f64357D[2];
            C29456A0 c29456a0 = (C29456A0) c28936t.m69705a();
            if (c29456a0 != null && (str = c29456a0.f59444c) != null) {
                C31707h0 c31707h1 = this.f63955c;
                this.f63953a = str;
                this.f63954b = 1;
                obj = c31707h1.m70819d(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
            AbstractC29172p abstractC29172p = (AbstractC29172p) obj;
            if (abstractC29172p != null && (strMo69754e = abstractC29172p.mo69754e()) != null) {
                C29917M c29917m = this.f63955c.f64363i;
                C29412m c29412m = new C29412m((C29203D0) null, (C29683z0) null, new C29276S(this.f63956d, (String) null, 2), 3);
                this.f63953a = null;
                this.f63954b = 2;
                obj = ((C29914J) c29917m.f60057a).f60051a.m69975a(strMo69754e, str, c29412m, this);
            } else {
                return Unit.INSTANCE;
            }
        } catch (Exception e11) {
            C31707h0 c31707h2 = this.f63955c;
            AbstractC28073M0.updateState$default(c31707h2, false, new C31518F(c31707h2, e11, null), 1, null);
        } catch (Throwable th2) {
            AbstractC31739h.m70853a(this.f63955c, th2);
        }
    }
}
