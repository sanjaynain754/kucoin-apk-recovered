package com.kubi.home.v2.card;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: HomeCardsRepositoryV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.v2.card.HomeCardsRepositoryV2", m90122f = "HomeCardsRepositoryV2.kt", m90123i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3}, m90124l = {174, 184, 185, 191}, m90125m = "fetchCardConfig", m90126n = {"requestMD5", "hasLogin", "retry", "requestMD5", "e", "hasLogin", "retry", "requestMD5", "e", "hasLogin", "retry", "requestMD5", "e", "hasLogin", "retry"}, m90127s = {"L$0", "Z$0", "I$0", "L$0", "L$1", "Z$0", "I$0", "L$0", "L$1", "Z$0", "I$0", "L$0", "L$1", "Z$0", "I$0"})
public final class HomeCardsRepositoryV2$fetchCardConfig$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeCardsRepositoryV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeCardsRepositoryV2$fetchCardConfig$1(HomeCardsRepositoryV2 homeCardsRepositoryV2, Continuation<? super HomeCardsRepositoryV2$fetchCardConfig$1> continuation) {
        super(continuation);
        this.this$0 = homeCardsRepositoryV2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m30789e(null, false, 0, this);
    }
}
