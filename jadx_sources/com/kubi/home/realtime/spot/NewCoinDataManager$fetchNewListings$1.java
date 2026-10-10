package com.kubi.home.realtime.spot;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: NewCoinDataManager.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.realtime.spot.NewCoinDataManager", m90122f = "NewCoinDataManager.kt", m90123i = {0, 1}, m90124l = {21, 26}, m90125m = "fetchNewListings", m90126n = {"completableDeferred", "completableDeferred"}, m90127s = {"L$0", "L$0"})
public final class NewCoinDataManager$fetchNewListings$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NewCoinDataManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewCoinDataManager$fetchNewListings$1(NewCoinDataManager newCoinDataManager, Continuation<? super NewCoinDataManager$fetchNewListings$1> continuation) {
        super(continuation);
        this.this$0 = newCoinDataManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m30188c(this);
    }
}
