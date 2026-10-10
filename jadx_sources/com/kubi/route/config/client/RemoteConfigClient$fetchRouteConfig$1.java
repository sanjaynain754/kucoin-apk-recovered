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
@DebugMetadata(m90121c = "com.kubi.route.config.client.RemoteConfigClient", m90122f = "RemoteConfigClient.kt", m90123i = {}, m90124l = {22}, m90125m = "fetchRouteConfig", m90126n = {}, m90127s = {})
public final class RemoteConfigClient$fetchRouteConfig$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteConfigClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigClient$fetchRouteConfig$1(RemoteConfigClient remoteConfigClient, Continuation<? super RemoteConfigClient$fetchRouteConfig$1> continuation) {
        super(continuation);
        this.this$0 = remoteConfigClient;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m56175a(null, this);
    }
}
