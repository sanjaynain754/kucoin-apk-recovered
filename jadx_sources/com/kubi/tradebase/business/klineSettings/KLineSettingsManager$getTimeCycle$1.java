package com.kubi.tradebase.business.klineSettings;

import cn.jiguang.privates.push.constants.JPushConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: KLineSettingsManager.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.tradebase.business.klineSettings.KLineSettingsManager", m90122f = "KLineSettingsManager.kt", m90123i = {0, 0, 0, 0}, m90124l = {185}, m90125m = "getTimeCycle", m90126n = {JPushConstants.Analysis.KEY_JSON, "this_$iv", "json$iv", "$i$f$fromJsonOrNull"}, m90127s = {"L$0", "L$1", "L$2", "I$0"})
public final class KLineSettingsManager$getTimeCycle$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KLineSettingsManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineSettingsManager$getTimeCycle$1(KLineSettingsManager kLineSettingsManager, Continuation<? super KLineSettingsManager$getTimeCycle$1> continuation) {
        super(continuation);
        this.this$0 = kLineSettingsManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m63124i(this);
    }
}
