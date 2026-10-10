package com.kubi.core.biz.submit.vertical;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.kubi.resources.widget.BaseTextView;
import kotlinx.coroutines.InterfaceC41709m0;
import p758xe.C46153b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import v30.C45409v;

/* JADX INFO: compiled from: TradeBaseVerticalSubmitFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.submit.vertical.TradeBaseVerticalSubmitFragment$applyTradeTypeBackgroundColor$1", m90122f = "TradeBaseVerticalSubmitFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TradeBaseVerticalSubmitFragment$applyTradeTypeBackgroundColor$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TradeBaseVerticalSubmitFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeBaseVerticalSubmitFragment$applyTradeTypeBackgroundColor$1(TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment, Continuation<? super TradeBaseVerticalSubmitFragment$applyTradeTypeBackgroundColor$1> continuation) {
        super(2, continuation);
        this.this$0 = tradeBaseVerticalSubmitFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeBaseVerticalSubmitFragment$applyTradeTypeBackgroundColor$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TradeBaseVerticalSubmitFragment$applyTradeTypeBackgroundColor$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BaseTextView baseTextView;
        ConstraintLayout constraintLayout;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            C45409v c45409vM22705l4 = this.this$0.m22705l4();
            if (c45409vM22705l4 != null && (constraintLayout = c45409vM22705l4.f102353d) != null) {
                constraintLayout.setBackgroundResource(C46153b.f103658a.m101749c(this.this$0.m21013D3().m22743w()));
            }
            C45409v c45409vM22705l5 = this.this$0.m22705l4();
            if (c45409vM22705l5 != null && (baseTextView = c45409vM22705l5.f102368s) != null) {
                TradeBaseVerticalSubmitFragment tradeBaseVerticalSubmitFragment = this.this$0;
                baseTextView.setTextColor(tradeBaseVerticalSubmitFragment.getColorRes(C46153b.f103658a.m101751e(tradeBaseVerticalSubmitFragment.m21013D3().m22743w())));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
