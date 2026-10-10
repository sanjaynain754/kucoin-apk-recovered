package com.kubi.market.monitor.lib.p100ui.floating.window;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.kubi.utils.extensions.C27046k;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import sl.C44518g;
import sl.C44519h;

/* JADX INFO: compiled from: FloatingFrame.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.window.FloatingFrame$updataSetingLayoutStatus$1", m90122f = "FloatingFrame.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FloatingFrame$updataSetingLayoutStatus$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ FloatingFrame this$0;

    /* JADX INFO: renamed from: h */
    public static final Unit m41025h(FloatingFrame floatingFrame) {
        floatingFrame.m41006e0(true);
        FloatingActionManager.m41302n0(FloatingActionManager.f34540a, "1", null, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingFrame$updataSetingLayoutStatus$1(FloatingFrame floatingFrame, Continuation<? super FloatingFrame$updataSetingLayoutStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = floatingFrame;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final Unit m41026i() {
        FloatingActionManager floatingActionManager = FloatingActionManager.f34540a;
        floatingActionManager.m41334I0();
        FloatingActionManager.m41302n0(floatingActionManager, "2", null, null, 6, null);
        return Unit.INSTANCE;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FloatingFrame$updataSetingLayoutStatus$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FloatingFrame$updataSetingLayoutStatus$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LinearLayout linearLayout;
        View view;
        View viewInflate;
        ImageView imageView;
        ImageView imageView2;
        ViewStub viewStub;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            C44519h binding = this.this$0.getBinding();
            if (binding != null && (linearLayout = binding.f98664d) != null && linearLayout.getVisibility() == 0) {
                if (!FloatingActionManager.f34540a.m41356Z()) {
                    View view2 = this.this$0.f34430g;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                } else {
                    if (this.this$0.f34430g == null) {
                        FloatingFrame floatingFrame = this.this$0;
                        C44519h binding2 = floatingFrame.getBinding();
                        if (binding2 != null && (viewStub = binding2.f98666f) != null) {
                            viewInflate = viewStub.inflate();
                        } else {
                            viewInflate = null;
                        }
                        floatingFrame.f34430g = viewInflate;
                        if (this.this$0.f34430g != null) {
                            final FloatingFrame floatingFrame2 = this.this$0;
                            C44518g kucoinFloatingHeadsetingLayoutBinding = floatingFrame2.getKucoinFloatingHeadsetingLayoutBinding();
                            if (kucoinFloatingHeadsetingLayoutBinding != null && (imageView2 = kucoinFloatingHeadsetingLayoutBinding.f98660c) != null) {
                                C27046k.m66711z(imageView2, 0L, new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.window.e1
                                    @Override // p852kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return FloatingFrame$updataSetingLayoutStatus$1.m41025h(floatingFrame2);
                                    }
                                }, 1, null);
                            }
                            C44518g kucoinFloatingHeadsetingLayoutBinding2 = floatingFrame2.getKucoinFloatingHeadsetingLayoutBinding();
                            if (kucoinFloatingHeadsetingLayoutBinding2 != null && (imageView = kucoinFloatingHeadsetingLayoutBinding2.f98659b) != null) {
                                C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.window.f1
                                    @Override // p852kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return FloatingFrame$updataSetingLayoutStatus$1.m41026i();
                                    }
                                }, 1, null);
                            }
                        }
                    }
                    View view3 = this.this$0.f34430g;
                    if ((view3 == null || view3.getVisibility() != 0) && (view = this.this$0.f34430g) != null) {
                        view.setVisibility(0);
                    }
                    this.this$0.m41004c0();
                }
                if (!this.this$0.m40997V()) {
                    FloatingFrameViewManager floatingFrameViewManager = this.this$0.f34433j;
                    if (floatingFrameViewManager != null) {
                        floatingFrameViewManager.m41164f0();
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
