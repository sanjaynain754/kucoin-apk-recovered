package com.kubi.home.v2.card;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: HomeCardsRepositoryV2.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.v2.card.HomeCardsRepositoryV2", m90122f = "HomeCardsRepositoryV2.kt", m90123i = {0, 0, 1, 1, 1, 1}, m90124l = {BuiltinOperator.UNSORTED_SEGMENT_MIN, 159}, m90125m = "loadCardConfig", m90126n = {"allWidgetList", "md5", "allWidgetList", "md5", "$this$loadCardConfig_u24lambda_u248", "$i$a$-apply-HomeCardsRepositoryV2$loadCardConfig$resp$2"}, m90127s = {"L$0", "L$1", "L$0", "L$1", "L$3", "I$0"})
public final class HomeCardsRepositoryV2$loadCardConfig$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeCardsRepositoryV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeCardsRepositoryV2$loadCardConfig$1(HomeCardsRepositoryV2 homeCardsRepositoryV2, Continuation<? super HomeCardsRepositoryV2$loadCardConfig$1> continuation) {
        super(continuation);
        this.this$0 = homeCardsRepositoryV2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m30796m(this);
    }
}
