package com.kubi.sdk.applet;

import com.kubi.sdk.BaseActivity;
import com.kubi.sdk.protocol.ProtocolException;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: KCMiniAppBaseProtocol.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.applet.KCMiniAppBaseProtocol$exit$1$1", m90122f = "KCMiniAppBaseProtocol.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCMiniAppBaseProtocol$exit$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BaseActivity $activity;
    final /* synthetic */ boolean $appPopAnimated;
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCMiniAppBaseProtocol$exit$1$1(BaseActivity baseActivity, boolean z11, Function2<? super Boolean, ? super ProtocolException, Unit> function2, Continuation<? super KCMiniAppBaseProtocol$exit$1$1> continuation) {
        super(2, continuation);
        this.$activity = baseActivity;
        this.$appPopAnimated = z11;
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCMiniAppBaseProtocol$exit$1$1(this.$activity, this.$appPopAnimated, this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCMiniAppBaseProtocol$exit$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                this.$activity.onPreFinish();
                this.$activity.finish();
                if (!this.$appPopAnimated) {
                    this.$activity.overridePendingTransition(0, 0);
                }
                this.$callback.invoke(Boxing.boxBoolean(true), null);
            } catch (Throwable th2) {
                this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException(th2.getMessage(), th2, null, false, 12, null));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
