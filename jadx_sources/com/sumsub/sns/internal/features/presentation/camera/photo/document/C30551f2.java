package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.DelayKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.f2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30551f2 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f61701a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Function0 f61702b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30440B2 f61703c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30551f2(Function0 function0, C30440B2 c30440b2, Continuation continuation) {
        super(2, continuation);
        this.f61702b = function0;
        this.f61703c = c30440b2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30551f2(this.f61702b, this.f61703c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30551f2(this.f61702b, this.f61703c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61701a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            C33272c.f67816e.f67810a.mo68955d("DocCapture", "waiting for doc flip ... ", null);
            this.f61701a = 1;
            if (DelayKt.m90350b(3000L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Function0 function0 = this.f61702b;
        if (function0 != null) {
            function0.invoke();
        }
        this.f61703c.f61296Q = false;
        return Unit.INSTANCE;
    }
}
