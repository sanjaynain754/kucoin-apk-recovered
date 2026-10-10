package com.kubi.market.monitor.lib.p100ui.floating.window;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.kubi.market.monitor.lib.entity.StateTradeItemBean;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import sl.C44519h;

/* JADX INFO: compiled from: FloatingFrame.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "listData", "", "Lcom/kubi/market/monitor/lib/entity/StateTradeItemBean;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.market.monitor.lib.ui.floating.window.FloatingFrame$bindState$2", m90122f = "FloatingFrame.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nFloatingFrame.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingFrame.kt\ncom/kubi/market/monitor/lib/ui/floating/window/FloatingFrame$bindState$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,611:1\n1#2:612\n*E\n"})
public final class FloatingFrame$bindState$2 extends SuspendLambda implements Function2<List<? extends StateTradeItemBean>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FloatingFrame this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends StateTradeItemBean> list, Continuation<? super Unit> continuation) {
        return invoke2((List<StateTradeItemBean>) list, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingFrame$bindState$2(FloatingFrame floatingFrame, Continuation<? super FloatingFrame$bindState$2> continuation) {
        super(2, continuation);
        this.this$0 = floatingFrame;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FloatingFrame$bindState$2 floatingFrame$bindState$2 = new FloatingFrame$bindState$2(this.this$0, continuation);
        floatingFrame$bindState$2.L$0 = obj;
        return floatingFrame$bindState$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<StateTradeItemBean> list, Continuation<? super Unit> continuation) {
        return ((FloatingFrame$bindState$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ImageView imageView;
        List<StateTradeItemBean> list = (List) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C44519h binding = this.this$0.getBinding();
        if (binding != null && (imageView = binding.f98663c) != null && imageView.getVisibility() == 0) {
            return Unit.INSTANCE;
        }
        this.this$0.m40996U(list);
        if (this.this$0.m40997V()) {
            return Unit.INSTANCE;
        }
        if (this.this$0.f34433j == null && list.isEmpty()) {
            return Unit.INSTANCE;
        }
        if (this.this$0.f34433j == null) {
            final FloatingFrame floatingFrame = this.this$0;
            FloatingFrameViewManager floatingFrameViewManager = new FloatingFrameViewManager(new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.window.d1
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Integer.valueOf(FloatingFrame$bindState$2.m41022f(floatingFrame));
                }
            });
            C44519h binding2 = this.this$0.getBinding();
            if (binding2 != null) {
                LinearLayout llexpandContent = binding2.f98664d;
                Intrinsics.checkNotNullExpressionValue(llexpandContent, "llexpandContent");
                floatingFrameViewManager.m41144C(llexpandContent, list);
            }
            floatingFrame.f34433j = floatingFrameViewManager;
        } else {
            FloatingFrameViewManager floatingFrameViewManager2 = this.this$0.f34433j;
            if (floatingFrameViewManager2 != null) {
                floatingFrameViewManager2.m41170m0(list);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public static final int m41022f(FloatingFrame floatingFrame) {
        View view = floatingFrame.f34430g;
        if (view != null && view.getVisibility() == 0) {
            View view2 = floatingFrame.f34430g;
            if (view2 != null) {
                view2.measure(0, 0);
            }
            View view3 = floatingFrame.f34430g;
            if (view3 != null) {
                return view3.getMeasuredHeight();
            }
        }
        return 0;
    }
}
