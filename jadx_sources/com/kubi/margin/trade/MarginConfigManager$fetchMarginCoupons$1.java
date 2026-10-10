package com.kubi.margin.trade;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.margin.api.entity.CouponsOverview;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: MarginConfigManager.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/kubi/margin/api/entity/CouponsOverview;", TtmlNode.RUBY_BASE, "quote"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.margin.trade.MarginConfigManager$fetchMarginCoupons$1", m90122f = "MarginConfigManager.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MarginConfigManager$fetchMarginCoupons$1 extends SuspendLambda implements Function3<CouponsOverview, CouponsOverview, Continuation<? super Pair<? extends CouponsOverview, ? extends CouponsOverview>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public MarginConfigManager$fetchMarginCoupons$1(Continuation<? super MarginConfigManager$fetchMarginCoupons$1> continuation) {
        super(3, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CouponsOverview couponsOverview, CouponsOverview couponsOverview2, Continuation<? super Pair<CouponsOverview, CouponsOverview>> continuation) {
        MarginConfigManager$fetchMarginCoupons$1 marginConfigManager$fetchMarginCoupons$1 = new MarginConfigManager$fetchMarginCoupons$1(continuation);
        marginConfigManager$fetchMarginCoupons$1.L$0 = couponsOverview;
        marginConfigManager$fetchMarginCoupons$1.L$1 = couponsOverview2;
        return marginConfigManager$fetchMarginCoupons$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CouponsOverview couponsOverview, CouponsOverview couponsOverview2, Continuation<? super Pair<? extends CouponsOverview, ? extends CouponsOverview>> continuation) {
        return invoke2(couponsOverview, couponsOverview2, (Continuation<? super Pair<CouponsOverview, CouponsOverview>>) continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CouponsOverview couponsOverview = (CouponsOverview) this.L$0;
        CouponsOverview couponsOverview2 = (CouponsOverview) this.L$1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new Pair(couponsOverview, couponsOverview2);
    }
}
