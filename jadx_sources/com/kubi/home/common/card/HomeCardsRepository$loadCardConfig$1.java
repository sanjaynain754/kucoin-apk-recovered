package com.kubi.home.common.card;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: HomeCardsRepository.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.common.card.HomeCardsRepository", m90122f = "HomeCardsRepository.kt", m90123i = {0}, m90124l = {266}, m90125m = "loadCardConfig", m90126n = {"req"}, m90127s = {"L$0"})
public final class HomeCardsRepository$loadCardConfig$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeCardsRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeCardsRepository$loadCardConfig$1(HomeCardsRepository homeCardsRepository, Continuation<? super HomeCardsRepository$loadCardConfig$1> continuation) {
        super(continuation);
        this.this$0 = homeCardsRepository;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m29078p(this);
    }
}
