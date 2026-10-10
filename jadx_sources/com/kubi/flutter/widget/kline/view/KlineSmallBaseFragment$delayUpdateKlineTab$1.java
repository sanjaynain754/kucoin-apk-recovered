package com.kubi.flutter.widget.kline.view;

import android.graphics.Rect;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import com.tencent.thumbplayer.tcmedia.core.common.TPCodecParamers;
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

/* JADX INFO: compiled from: KlineSmallBaseFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.view.KlineSmallBaseFragment$delayUpdateKlineTab$1", m90122f = "KlineSmallBaseFragment.kt", m90123i = {}, m90124l = {TPCodecParamers.TP_PROFILE_MJPEG_HUFFMAN_LOSSLESS}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KlineSmallBaseFragment$delayUpdateKlineTab$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ KlineSmallBaseFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KlineSmallBaseFragment$delayUpdateKlineTab$1(KlineSmallBaseFragment klineSmallBaseFragment, Continuation<? super KlineSmallBaseFragment$delayUpdateKlineTab$1> continuation) {
        super(2, continuation);
        this.this$0 = klineSmallBaseFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KlineSmallBaseFragment$delayUpdateKlineTab$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KlineSmallBaseFragment$delayUpdateKlineTab$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TabLayout.Tab tabAt;
        TabLayout tabLayout;
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
            this.label = 1;
            if (DelayKt.m90350b(200L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        TabLayout tabLayout2 = (TabLayout) this.this$0.f22505W.get();
        View customView = null;
        if (tabLayout2 != null) {
            tabAt = tabLayout2.getTabAt(this.this$0.mo24424w3());
        } else {
            tabAt = null;
        }
        if (tabAt != null) {
            customView = tabAt.getCustomView();
        }
        Rect rect = new Rect();
        if ((customView == null || !customView.getGlobalVisibleRect(rect) || customView.getWidth() != rect.width()) && (tabLayout = (TabLayout) this.this$0.f22505W.get()) != null) {
            tabLayout.setScrollPosition(this.this$0.mo24424w3(), 0.0f, true);
        }
        return Unit.INSTANCE;
    }
}
