package com.kubi.core.biz.bottomtab.order.child;

import com.kubi.sdk.widget.loading.WrapperLoadingView;
import io.chad.library.adapter.base.BaseQuickAdapter;
import java.math.BigDecimal;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: BottomOrderListFragment.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.core.biz.bottomtab.order.child.BottomOrderListFragment$showGuideLayout$1", m90122f = "BottomOrderListFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class BottomOrderListFragment$showGuideLayout$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currency;
    final /* synthetic */ BigDecimal $quoteBalance;
    final /* synthetic */ CharSequence $quoteBalanceDisplayStr;
    int label;
    final /* synthetic */ BottomOrderListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomOrderListFragment$showGuideLayout$1(BottomOrderListFragment bottomOrderListFragment, CharSequence charSequence, String str, BigDecimal bigDecimal, Continuation<? super BottomOrderListFragment$showGuideLayout$1> continuation) {
        super(2, continuation);
        this.this$0 = bottomOrderListFragment;
        this.$quoteBalanceDisplayStr = charSequence;
        this.$currency = str;
        this.$quoteBalance = bigDecimal;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BottomOrderListFragment$showGuideLayout$1(this.this$0, this.$quoteBalanceDisplayStr, this.$currency, this.$quoteBalance, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BottomOrderListFragment$showGuideLayout$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.this$0.isAdded()) {
                BaseQuickAdapter baseQuickAdapter = this.this$0.f46495W;
                if (baseQuickAdapter != null) {
                    baseQuickAdapter.setNewData(null);
                }
                WrapperLoadingView wrapperLoadingView = this.this$0.f20236g0;
                if (wrapperLoadingView != null) {
                    wrapperLoadingView.showContent();
                }
                if (this.this$0.m21481w4()) {
                    this.this$0.m21465C4(this.$quoteBalanceDisplayStr, this.$currency, this.$quoteBalance);
                } else {
                    this.this$0.m21467G4(this.$quoteBalanceDisplayStr, this.$currency);
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
