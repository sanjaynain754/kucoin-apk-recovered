package com.jumio.core.extraction;

import com.jumio.sdk.enums.JumioFallbackReason;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.jumio.core.extraction.a */
/* JADX INFO: loaded from: classes56.dex */
public final class C9302a extends SuspendLambda implements Function1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ExtractionClient f13899a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ JumioFallbackReason f13900b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9302a(ExtractionClient extractionClient, JumioFallbackReason jumioFallbackReason, Continuation continuation) {
        super(1, continuation);
        this.f13899a = extractionClient;
        this.f13900b = jumioFallbackReason;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C9302a(this.f13899a, this.f13900b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C9302a(this.f13899a, this.f13900b, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f13899a.publishUpdate(ExtractionUpdateInterface.Companion.build$default(ExtractionUpdateInterface.INSTANCE, ExtractionUpdateState.INSTANCE.getFallbackRequired(), this.f13900b, null, 4, null));
        return Unit.INSTANCE;
    }
}
