package com.sumsub.sns.internal.features.presentation.preview.photo;

import com.sumsub.sns.internal.features.data.model.common.C29015J;
import com.sumsub.sns.internal.features.presentation.utils.C32635M;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.H */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31747H extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f64498a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC31770c0 f64499b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C29015J f64500c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31747H(AbstractC31770c0 abstractC31770c0, C29015J c29015j, Continuation continuation) {
        super(2, continuation);
        this.f64499b = abstractC31770c0;
        this.f64500c = c29015j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C31747H(this.f64499b, this.f64500c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C31747H(this.f64499b, this.f64500c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f64498a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C32635M c32635m = this.f64499b.f64559h;
            C29015J c29015j = this.f64500c;
            this.f64498a = 1;
            if (c32635m.m71228a(c29015j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
