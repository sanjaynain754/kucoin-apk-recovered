package com.kubi.sdk.lib.kucoin.biz.control.internal.loader;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: ConfigCacheClient.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.lib.kucoin.biz.control.internal.loader.ConfigCacheClient", m90122f = "ConfigCacheClient.kt", m90123i = {0, 0}, m90124l = {126}, m90125m = "fetchConfig", m90126n = {"this", "updateMemCache"}, m90127s = {"L$0", "Z$0"})
public final class ConfigCacheClient$fetchConfig$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConfigCacheClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigCacheClient$fetchConfig$1(ConfigCacheClient configCacheClient, Continuation<? super ConfigCacheClient$fetchConfig$1> continuation) {
        super(continuation);
        this.this$0 = configCacheClient;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m57080h(false, this);
    }
}
