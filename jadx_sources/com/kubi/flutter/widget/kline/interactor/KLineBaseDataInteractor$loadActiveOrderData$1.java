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
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.interactor.KLineBaseDataInteractor", m90122f = "KLineBaseDataInteractor.kt", m90123i = {0, 0}, m90124l = {113}, m90125m = "loadActiveOrderData$suspendImpl", m90126n = {"$this", "param"}, m90127s = {"L$0", "L$1"})
public final class KLineBaseDataInteractor$loadActiveOrderData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KLineBaseDataInteractor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineBaseDataInteractor$loadActiveOrderData$1(KLineBaseDataInteractor kLineBaseDataInteractor, Continuation<? super KLineBaseDataInteractor$loadActiveOrderData$1> continuation) {
        super(continuation);
        this.this$0 = kLineBaseDataInteractor;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return KLineBaseDataInteractor.m24302w(this.this$0, null, this);
    }
}
