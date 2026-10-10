package com.sumsub.sns.internal.features.presentation.preview.photo;

import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.InterfaceC28145r;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.C */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31742C extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f64484a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC31770c0 f64485b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f64486c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31742C(AbstractC31770c0 abstractC31770c0, boolean z11, Continuation continuation) {
        super(2, continuation);
        this.f64485b = abstractC31770c0;
        this.f64486c = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31742C(this.f64485b, this.f64486c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31742C(this.f64485b, this.f64486c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64484a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.f64485b.showProgress(false);
            AbstractC28073M0.updateState$default(this.f64485b, false, new C31740A(null), 1, null);
            C32635M c32635m = this.f64485b.f64559h;
            boolean z11 = this.f64486c;
            this.f64484a = 1;
            c32635m.getClass();
            obj = C32635M.m71225a(c32635m, z11, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        InterfaceC28145r interfaceC28145r = (InterfaceC28145r) obj;
        if (interfaceC28145r == null) {
            AbstractC28073M0.updateState$default(this.f64485b, false, new C31741B(null), 1, null);
        } else {
            AbstractC31770c0 abstractC31770c0 = this.f64485b;
            KProperty[] kPropertyArr = AbstractC31770c0.f64557l;
            abstractC31770c0.fireEvent(interfaceC28145r);
        }
        return Unit.INSTANCE;
    }
}
