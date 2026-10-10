package com.kubi.route.config.client;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: RemoteConfigClient.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.route.config.client.RemoteConfigClient", m90122f = "RemoteConfigClient.kt", m90123i = {0, 0, 0, 1, 1, 1, 1}, m90124l = {44, 57}, m90125m = "retryWhenException", m90126n = {"block", "retryCount", "count", "block", "e", "retryCount", "currentCount"}, m90127s = {"L$0", "I$0", "I$2", "L$0", "L$1", "I$0", "I$2"})
public final class RemoteConfigClient$retryWhenException$1<T> extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
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
        return this.this$0.m56176b(0, null, this);
    }
}
