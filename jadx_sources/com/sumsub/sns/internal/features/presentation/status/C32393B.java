package com.sumsub.sns.internal.features.presentation.status;

import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.C41685g2;
import kotlinx.coroutines.C41686h;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32393B extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public int f65986a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C32403L f65987b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC29172p f65988c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32393B(C32403L c32403l, AbstractC29172p abstractC29172p, Continuation continuation) {
        super(1, continuation);
        this.f65987b = c32403l;
        this.f65988c = abstractC29172p;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C32393B(this.f65987b, this.f65988c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C32393B(this.f65987b, this.f65988c, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f65986a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C32403L c32403l = this.f65987b;
            AbstractC29172p abstractC29172p = this.f65988c;
            this.f65986a = 1;
            KProperty[] kPropertyArr = C32403L.f66041o;
            obj = C41686h.m91049g(C41685g2.f91735b, new C32450t(c32403l, abstractC29172p, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            C32403L c32403l2 = this.f65987b;
            KProperty[] kPropertyArr2 = C32403L.f66041o;
            c32403l2.m71124f();
        } else {
            C33272c.f67816e.f67810a.mo68956e("SNSApplicantStatusViewModel", "Agreement was not accepted", null);
        }
        return Unit.INSTANCE;
    }
}
