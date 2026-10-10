package com.kubi.homern.krn;

import android.os.Bundle;
import com.kubi.lite.api.ILiteService;
import com.kubi.sdk.mode.AppMode;
import com.kubi.sdk.protocol.ProtocolException;
import com.kubi.utils.extensions.C27023a;
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

/* JADX INFO: compiled from: KCRnBridgeHomeCallImpl.kt */
/* JADX INFO: loaded from: classes16.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.homern.krn.KCRnBridgeHomeCallImpl$launchLiteMainActivity$1$1", m90122f = "KCRnBridgeHomeCallImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCRnBridgeHomeCallImpl$launchLiteMainActivity$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<Boolean, ProtocolException, Unit> $callback;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public KCRnBridgeHomeCallImpl$launchLiteMainActivity$1$1(Function2<? super Boolean, ? super ProtocolException, Unit> function2, Continuation<? super KCRnBridgeHomeCallImpl$launchLiteMainActivity$1$1> continuation) {
        super(2, continuation);
        this.$callback = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCRnBridgeHomeCallImpl$launchLiteMainActivity$1$1(this.$callback, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCRnBridgeHomeCallImpl$launchLiteMainActivity$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Exception exc;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                Bundle bundle = new Bundle();
                bundle.putString("flutterInitialRoute", "lite/home?showBackTip=true");
                AppMode.Companion companion = AppMode.INSTANCE;
                bundle.putString("from", companion.getCurrentBizMode(AppMode.Pro).name());
                companion.updateCurrentMode(AppMode.Lite);
                ILiteService.m37529d(ILiteService.f32003a.get(), bundle, false, false, 4, null);
                C27023a.m66555b("B1LitePromotionalPopup", "enterLiteVersion", null, null, 12, null);
                exc = null;
            } catch (Exception e11) {
                exc = e11;
            }
            if (exc == null) {
                this.$callback.invoke(Boxing.boxBoolean(true), null);
            } else {
                this.$callback.invoke(Boxing.boxBoolean(false), new ProtocolException(exc.getMessage(), exc, null, false, 12, null));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
