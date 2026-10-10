package com.kubi.tradingbotkit.config;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: TradingBotConfig.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.tradingbotkit.config.TradingBotConfig", m90122f = "TradingBotConfig.kt", m90123i = {0, 0, 0}, m90124l = {80}, m90125m = "getGridTradingListByLanguage", m90126n = {"curLanguageLocaleStr", "storageIdKey", "supportedGrids"}, m90127s = {"L$0", "L$1", "L$2"})
public final class TradingBotConfig$getGridTradingListByLanguage$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TradingBotConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradingBotConfig$getGridTradingListByLanguage$1(TradingBotConfig tradingBotConfig, Continuation<? super TradingBotConfig$getGridTradingListByLanguage$1> continuation) {
        super(continuation);
        this.this$0 = tradingBotConfig;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m64161c(this);
    }
}
