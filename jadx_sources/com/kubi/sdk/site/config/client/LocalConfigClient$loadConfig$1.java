package com.kubi.sdk.site.config.client;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: LocalConfigClient.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.config.client.LocalConfigClient", m90122f = "LocalConfigClient.kt", m90123i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, m90124l = {70, 77, 83}, m90125m = "loadConfig", m90126n = {"context", "fileName", "file", "context", "fileName", "file", "context", "fileName", "file"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
public final class LocalConfigClient$loadConfig$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LocalConfigClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalConfigClient$loadConfig$1(LocalConfigClient localConfigClient, Continuation<? super LocalConfigClient$loadConfig$1> continuation) {
        super(continuation);
        this.this$0 = localConfigClient;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m58071f(null, this);
    }
}
