package com.kubi.market.monitor.lib.p100ui.floating.window;

import android.widget.LinearLayout;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import sl.C44519h;

/* JADX INFO: compiled from: FloatingFrame.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.window.FloatingFrame$updataItemViewStatus$1", m90122f = "FloatingFrame.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FloatingFrame$updataItemViewStatus$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FloatingFrame this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingFrame$updataItemViewStatus$1(FloatingFrame floatingFrame, Continuation<? super FloatingFrame$updataItemViewStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = floatingFrame;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FloatingFrame$updataItemViewStatus$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FloatingFrame$updataItemViewStatus$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LinearLayout linearLayout;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            C44519h binding = this.this$0.getBinding();
            if (binding != null && (linearLayout = binding.f98664d) != null && linearLayout.getVisibility() == 0) {
                if (!this.this$0.m40997V()) {
                    FloatingFrameViewManager floatingFrameViewManager = this.this$0.f34433j;
                    if (floatingFrameViewManager != null) {
                        floatingFrameViewManager.m41169l0();
                    }
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
