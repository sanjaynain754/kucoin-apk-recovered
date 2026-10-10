package com.kubi.quotefacade.rank;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: NewRankRedDotHelper.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.rank.NewRankRedDotHelper", m90122f = "NewRankRedDotHelper.kt", m90123i = {0}, m90124l = {89}, m90125m = "needShowDot", m90126n = {"curData"}, m90127s = {"L$0"})
public final class NewRankRedDotHelper$needShowDot$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NewRankRedDotHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewRankRedDotHelper$needShowDot$1(NewRankRedDotHelper newRankRedDotHelper, Continuation<? super NewRankRedDotHelper$needShowDot$1> continuation) {
        super(continuation);
        this.this$0 = newRankRedDotHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m52644m(null, this);
    }
}
