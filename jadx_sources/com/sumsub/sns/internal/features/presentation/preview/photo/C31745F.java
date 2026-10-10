package com.sumsub.sns.internal.features.presentation.preview.photo;

import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.F */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31745F extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f64494a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC31770c0 f64495b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29054T f64496c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31745F(AbstractC31770c0 abstractC31770c0, C29054T c29054t, Continuation continuation) {
        super(2, continuation);
        this.f64495b = abstractC31770c0;
        this.f64496c = c29054t;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31745F(this.f64495b, this.f64496c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31745F(this.f64495b, this.f64496c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64494a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C32635M c32635m = this.f64495b.f64559h;
            C29054T c29054t = this.f64496c;
            this.f64494a = 1;
            if (c32635m.mo70878a(c29054t, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
