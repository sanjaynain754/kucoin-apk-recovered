package com.trtc.uikit.livekit.p180kc.widget;

import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import je0.C40397b;
import kotlinx.coroutines.InterfaceC41709m0;
import le0.InterfaceC42178a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: KCTradeCardPositionView.kt */
/* JADX INFO: loaded from: classes60.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.trtc.uikit.livekit.kc.widget.KCTradeCardPositionView$loadSharedPositionData$1", m90122f = "KCTradeCardPositionView.kt", m90123i = {}, m90124l = {283}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class KCTradeCardPositionView$loadSharedPositionData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $bizId;
    final /* synthetic */ String $closeId;
    final /* synthetic */ String $userOpenId;
    int label;
    final /* synthetic */ KCTradeCardPositionView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KCTradeCardPositionView$loadSharedPositionData$1(String str, String str2, String str3, KCTradeCardPositionView kCTradeCardPositionView, Continuation<? super KCTradeCardPositionView$loadSharedPositionData$1> continuation) {
        super(2, continuation);
        this.$bizId = str;
        this.$userOpenId = str2;
        this.$closeId = str3;
        this.this$0 = kCTradeCardPositionView;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KCTradeCardPositionView$loadSharedPositionData$1(this.$bizId, this.$userOpenId, this.$closeId, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((KCTradeCardPositionView$loadSharedPositionData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        KCTradeCardPositionView$loadSharedPositionData$1 kCTradeCardPositionView$loadSharedPositionData$1;
        Exception exc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                try {
                    ResultKt.throwOnFailure(obj);
                    kCTradeCardPositionView$loadSharedPositionData$1 = this;
                } catch (Exception e11) {
                    exc = e11;
                    C44128b.m97261e("Live", "KCTradeCardPositionView: Load shared position failed - " + exc.getMessage());
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            try {
                C44128b.m97266j("Live", "KCTradeCardPositionView: Loading shared position - bizType=LIVE, bizId=" + this.$bizId + ", userOpenId=" + this.$userOpenId + ", closeId=" + this.$closeId);
                InterfaceC42178a interfaceC42178aM89024b = C40397b.f89707a.m89024b();
                String str = this.$bizId;
                String str2 = this.$userOpenId;
                String str3 = this.$closeId;
                this.label = 1;
                kCTradeCardPositionView$loadSharedPositionData$1 = this;
                try {
                    obj = interfaceC42178aM89024b.m92624l("LIVE", str, str2, str3, kCTradeCardPositionView$loadSharedPositionData$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Exception e12) {
                    e = e12;
                    exc = e;
                    C44128b.m97261e("Live", "KCTradeCardPositionView: Load shared position failed - " + exc.getMessage());
                }
            } catch (Exception e13) {
                e = e13;
                exc = e;
                C44128b.m97261e("Live", "KCTradeCardPositionView: Load shared position failed - " + exc.getMessage());
            }
        }
        C44128b.m97266j("Live", "KCTradeCardPositionView: Loaded shared position successfully");
        kCTradeCardPositionView$loadSharedPositionData$1.this$0.m81684D3((SharedPositionInfo) obj);
        return Unit.INSTANCE;
    }
}
