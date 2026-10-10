package com.kubi.advert;

import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.time.Duration;
import p852kotlin.time.DurationKt;
import p852kotlin.time.DurationUnit;

/* JADX INFO: compiled from: AppsFlyerTracking.kt */
/* JADX INFO: loaded from: classes62.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.advert.AppsFlyerTracking$startSession$1$1", m90122f = "AppsFlyerTracking.kt", m90123i = {}, m90124l = {130}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AppsFlyerTracking$startSession$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;

    public AppsFlyerTracking$startSession$1$1(Continuation<? super AppsFlyerTracking$startSession$1$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppsFlyerTracking$startSession$1$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AppsFlyerTracking$startSession$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Duration.Companion companion = Duration.INSTANCE;
            long duration = DurationKt.toDuration(65000L, DurationUnit.MILLISECONDS);
            this.label = 1;
            if (DelayKt.m90351c(duration, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        synchronized (AppsFlyerTracking.f14974g) {
            try {
                if (AppsFlyerTracking.f14975h.m14781a()) {
                    AppsFlyerTracking.f14968a.m14737s("no_callback_in_window");
                }
                AppsFlyerTracking.f14977j = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return Unit.INSTANCE;
    }
}
