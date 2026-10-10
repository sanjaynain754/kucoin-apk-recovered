package com.kubi.p110rn.core;

import android.app.Application;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41769w;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RNApplicationInitGate.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.rn.core.RNApplicationInitGate$startAsync$2$2", m90122f = "RNApplicationInitGate.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nRNApplicationInitGate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNApplicationInitGate.kt\ncom/kubi/rn/core/RNApplicationInitGate$startAsync$2$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,238:1\n1#2:239\n*E\n"})
public final class RNApplicationInitGate$startAsync$2$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Application $application;
    final /* synthetic */ InterfaceC41769w<Result<Unit>> $deferred;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNApplicationInitGate$startAsync$2$2(InterfaceC41769w<Result<Unit>> interfaceC41769w, Application application, Continuation<? super RNApplicationInitGate$startAsync$2$2> continuation) {
        super(2, continuation);
        this.$deferred = interfaceC41769w;
        this.$application = application;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RNApplicationInitGate$startAsync$2$2 rNApplicationInitGate$startAsync$2$2 = new RNApplicationInitGate$startAsync$2$2(this.$deferred, this.$application, continuation);
        rNApplicationInitGate$startAsync$2$2.L$0 = obj;
        return rNApplicationInitGate$startAsync$2$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RNApplicationInitGate$startAsync$2$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        RNApplicationInitGate rNApplicationInitGate = RNApplicationInitGate.INSTANCE;
        long jNow = rNApplicationInitGate.now();
        Application application = this.$application;
        try {
            Result.Companion companion = Result.INSTANCE;
            rNApplicationInitGate.initializeNow(application);
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            RNApplicationInitGate rNApplicationInitGate2 = RNApplicationInitGate.INSTANCE;
            rNApplicationInitGate2.error("[startAsync] background init failed, cost=" + rNApplicationInitGate2.durationSince(jNow) + "ms", thM103847exceptionOrNullimpl);
        } else {
            RNApplicationInitGate rNApplicationInitGate3 = RNApplicationInitGate.INSTANCE;
            rNApplicationInitGate3.info("[startAsync] background init success, cost=" + rNApplicationInitGate3.durationSince(jNow) + "ms");
        }
        this.$deferred.mo91370n(Result.m103843boximpl(objM103844constructorimpl));
        return Unit.INSTANCE;
    }
}
