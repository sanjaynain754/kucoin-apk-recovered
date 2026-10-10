package com.kubi.quotefacade.tradechance.utils;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: TradeChanceSocketHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.tradechance.utils.TradeChanceSocketHelper", m90122f = "TradeChanceSocketHelper.kt", m90123i = {0, 0, 0, 1, 1, 1, 1, 1}, m90124l = {56, 60}, m90125m = "subscribeHotRankPush", m90126n = {"wsApi", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "onData", "wsApi", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "onData", FirebaseAnalytics.Param.ITEMS, "symbols"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4"})
public final class TradeChanceSocketHelper$subscribeHotRankPush$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TradeChanceSocketHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeChanceSocketHelper$subscribeHotRankPush$1(TradeChanceSocketHelper tradeChanceSocketHelper, Continuation<? super TradeChanceSocketHelper$subscribeHotRankPush$1> continuation) {
        super(continuation);
        this.this$0 = tradeChanceSocketHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m53247b(null, null, null, this);
    }
}
