package com.kubi.sdk.lib.kucoin.biz.control.internal.loader;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: ConfigHttpClient.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.lib.kucoin.biz.control.internal.loader.ConfigHttpClient", m90122f = "ConfigHttpClient.kt", m90123i = {0, 0, 1, 1, 1, 2}, m90124l = {47, 55, 56}, m90125m = "loadConfig", m90126n = {"this", "isBlock", "this", "$this$onFail$iv", "isBlock", "$this$onFail$iv"}, m90127s = {"L$0", "Z$0", "L$0", "L$1", "Z$0", "L$0"})
public final class ConfigHttpClient$loadConfig$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConfigHttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigHttpClient$loadConfig$1(ConfigHttpClient configHttpClient, Continuation<? super ConfigHttpClient$loadConfig$1> continuation) {
        super(continuation);
        this.this$0 = configHttpClient;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m57089d(false, this);
    }
}
