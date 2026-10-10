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
@DebugMetadata(m90121c = "com.kubi.sdk.site.config.client.RemoteConfigClient", m90122f = "RemoteConfigClient.kt", m90123i = {0}, m90124l = {29}, m90125m = "fetchSiteConfig", m90126n = {"api"}, m90127s = {"L$0"})
public final class RemoteConfigClient$fetchSiteConfig$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RemoteConfigClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigClient$fetchSiteConfig$1(RemoteConfigClient remoteConfigClient, Continuation<? super RemoteConfigClient$fetchSiteConfig$1> continuation) {
        super(continuation);
        this.this$0 = remoteConfigClient;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m58080b(this);
    }
}
