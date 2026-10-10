package com.kubi.margin.market.recommend;

import android.widget.ImageView;
import com.kubi.otc.api.IOtcService;
import com.kubi.sdk.util.C24277v;
import kotlinx.coroutines.InterfaceC41709m0;
import mp.C42579a;
import p402kf.C41016c;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginMarketRecommendAdapter.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.market.recommend.MarginMarketRecommendAdapter$convertOtc$1", m90122f = "MarginMarketRecommendAdapter.kt", m90123i = {}, m90124l = {299}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MarginMarketRecommendAdapter$convertOtc$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ ImageView $ivCurrency;
    final /* synthetic */ ImageView $ivFiat;
    int label;
    final /* synthetic */ MarginMarketRecommendAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarginMarketRecommendAdapter$convertOtc$1(MarginMarketRecommendAdapter marginMarketRecommendAdapter, ImageView imageView, ImageView imageView2, Continuation<? super MarginMarketRecommendAdapter$convertOtc$1> continuation) {
        super(2, continuation);
        this.this$0 = marginMarketRecommendAdapter;
        this.$ivFiat = imageView;
        this.$ivCurrency = imageView2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarginMarketRecommendAdapter$convertOtc$1(this.this$0, this.$ivFiat, this.$ivCurrency, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MarginMarketRecommendAdapter$convertOtc$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            IOtcService iOtcServiceM93344d = C42579a.f94275a.m93344d();
            String strM89965c = C41016c.m89965c();
            Intrinsics.checkNotNullExpressionValue(strM89965c, "getCurrentCurrency(...)");
            String baseCurrency = this.this$0.getF33410j().getSymbolInfoEntity().getBaseCurrency();
            Intrinsics.checkNotNullExpressionValue(baseCurrency, "getBaseCurrency(...)");
            this.label = 1;
            obj = iOtcServiceM93344d.mo43955b(strM89965c, baseCurrency, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        ImageView imageView = this.$ivFiat;
        ImageView imageView2 = this.$ivCurrency;
        Pair pair = (Pair) obj;
        C24277v.m58540e(imageView.getContext(), (String) pair.getFirst(), imageView);
        C24277v.m58540e(imageView2.getContext(), (String) pair.getSecond(), imageView2);
        return Unit.INSTANCE;
    }
}
