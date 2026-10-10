package com.kubi.flutter.widget.kline.interactor;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: KLineBaseDataInteractor.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor", m90122f = "KLineBaseDataInteractor.kt", m90123i = {0, 0, 0, 0}, m90124l = {125}, m90125m = "loadHistoryOrderData$suspendImpl", m90126n = {"$this", "param", "cdnRange", "previousTime"}, m90127s = {"L$0", "L$1", "L$2", "J$0"})
public final class KLineBaseDataInteractor$loadHistoryOrderData$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KLineBaseDataInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineBaseDataInteractor$loadHistoryOrderData$1(KLineBaseDataInteractor kLineBaseDataInteractor, Continuation<? super KLineBaseDataInteractor$loadHistoryOrderData$1> continuation) {
        super(continuation);
        this.this$0 = kLineBaseDataInteractor;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return KLineBaseDataInteractor.m24304y(this.this$0, null, 0L, this);
    }
}
