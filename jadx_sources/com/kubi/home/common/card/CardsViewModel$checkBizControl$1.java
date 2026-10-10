package com.kubi.home.common.card;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: CardsViewModel.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.common.card.CardsViewModel", m90122f = "CardsViewModel.kt", m90123i = {0, 0}, m90124l = {159}, m90125m = "checkBizControl", m90126n = {"completableDeferred", "iStateListener"}, m90127s = {"L$0", "L$1"})
public final class CardsViewModel$checkBizControl$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CardsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsViewModel$checkBizControl$1(CardsViewModel cardsViewModel, Continuation<? super CardsViewModel$checkBizControl$1> continuation) {
        super(continuation);
        this.this$0 = cardsViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m29054r(this);
    }
}
