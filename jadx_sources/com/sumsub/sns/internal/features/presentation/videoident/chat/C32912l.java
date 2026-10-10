package com.sumsub.sns.internal.features.presentation.videoident.chat;

import android.graphics.Bitmap;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.videoident.chat.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32912l extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C32917q f67322a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bitmap f67323b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32912l(Bitmap bitmap, C32917q c32917q, Continuation continuation) {
        super(2, continuation);
        this.f67322a = c32917q;
        this.f67323b = bitmap;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32912l(this.f67323b, this.f67322a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C32917q c32917q = this.f67322a;
        return new C32912l(this.f67323b, c32917q, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Function1 function1 = this.f67322a.f67346r;
        if (function1 != null) {
            function1.invoke(this.f67323b);
        }
        return Unit.INSTANCE;
    }
}
