package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.remote.C29203D0;
import com.sumsub.sns.internal.features.data.model.common.remote.C29276S;
import com.sumsub.sns.internal.features.data.model.common.remote.C29412m;
import com.sumsub.sns.internal.features.data.model.common.remote.C29683z0;
import com.sumsub.sns.internal.features.data.model.common.remote.response.C29456A0;
import com.sumsub.sns.internal.features.data.repository.applicant.C29914J;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.presentation.preview.AbstractC31739h;
import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.K */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31523K extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public String f63972a;

    /* JADX INFO: renamed from: b */
    public int f63973b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C31707h0 f63974c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C29456A0 f63975d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CharSequence f63976e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31523K(C31707h0 c31707h0, C29456A0 c29456a0, CharSequence charSequence, Continuation continuation) {
        super(1, continuation);
        this.f63974c = c31707h0;
        this.f63975d = c29456a0;
        this.f63976e = charSequence;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C31523K(this.f63974c, this.f63975d, this.f63976e, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C31523K) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        if (r10 == r0) goto L33;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String strMo69754e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f63973b;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    str = this.f63972a;
                    ResultKt.throwOnFailure(obj);
                }
                C31707h0 c31707h0 = this.f63974c;
                KProperty[] kPropertyArr = C31707h0.f64357D;
                c31707h0.m70812a((C29456A0) obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC41775x1 interfaceC41775x1 = this.f63974c.f64370p;
            if (interfaceC41775x1 != null) {
                InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
            }
            C29456A0 c29456a0 = this.f63975d;
            if (c29456a0 != null && (str = c29456a0.f59444c) != null) {
                C31707h0 c31707h1 = this.f63974c;
                this.f63972a = str;
                this.f63973b = 1;
                obj = c31707h1.m70819d(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
            AbstractC29172p abstractC29172p = (AbstractC29172p) obj;
            if (abstractC29172p != null && (strMo69754e = abstractC29172p.mo69754e()) != null) {
                C29917M c29917m = this.f63974c.f64363i;
                C29412m c29412m = new C29412m(new C29203D0(this.f63976e.toString()), (C29683z0) null, (C29276S) null, 6);
                this.f63972a = null;
                this.f63973b = 2;
                obj = ((C29914J) c29917m.f60057a).f60051a.m69975a(strMo69754e, str, c29412m, this);
            } else {
                return Unit.INSTANCE;
            }
        } catch (Exception e11) {
            C31707h0 c31707h2 = this.f63974c;
            AbstractC28073M0.updateState$default(c31707h2, false, new C31522J(c31707h2, e11, this.f63975d, null), 1, null);
        } catch (Throwable th2) {
            AbstractC31739h.m70853a(this.f63974c, th2);
        }
    }
}
