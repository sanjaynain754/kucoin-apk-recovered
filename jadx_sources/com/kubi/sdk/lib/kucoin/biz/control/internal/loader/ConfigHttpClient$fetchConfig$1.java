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
@DebugMetadata(m90121c = "com.kubi.sdk.lib.kucoin.biz.control.internal.loader.ConfigHttpClient", m90122f = "ConfigHttpClient.kt", m90123i = {0}, m90124l = {30}, m90125m = "fetchConfig", m90126n = {"isBlock"}, m90127s = {"Z$0"})
public final class ConfigHttpClient$fetchConfig$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ConfigHttpClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigHttpClient$fetchConfig$1(ConfigHttpClient configHttpClient, Continuation<? super ConfigHttpClient$fetchConfig$1> continuation) {
        super(continuation);
        this.this$0 = configHttpClient;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m57087b(false, this);
    }
}
