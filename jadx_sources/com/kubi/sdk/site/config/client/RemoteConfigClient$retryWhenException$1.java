package com.kubi.sdk.site.config.client;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: RemoteConfigClient.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.config.client.RemoteConfigClient", m90122f = "RemoteConfigClient.kt", m90123i = {0, 0, 1, 1, 1}, m90124l = {62, 66}, m90125m = "retryWhenException", m90126n = {"block", "count", "block", "ignore", "count"}, m90127s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
public final class RemoteConfigClient$retryWhenException$1<T> extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteConfigClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigClient$retryWhenException$1(RemoteConfigClient remoteConfigClient, Continuation<? super RemoteConfigClient$retryWhenException$1> continuation) {
        super(continuation);
        this.this$0 = remoteConfigClient;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m58081c(null, this);
    }
}
