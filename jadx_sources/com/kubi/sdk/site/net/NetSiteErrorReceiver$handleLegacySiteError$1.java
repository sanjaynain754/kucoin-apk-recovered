package com.kubi.sdk.site.net;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: NetSiteErrorReceiver.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.net.NetSiteErrorReceiver", m90122f = "NetSiteErrorReceiver.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, m90124l = {105, 106}, m90125m = "handleLegacySiteError", m90126n = {"errorInfo", "httpBody", "path", "data", "siteStr", "siteType", "forceRedirect", "errorInfo", "httpBody", "path", "data", "siteStr", "siteType", "forceRedirect"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0"})
public final class NetSiteErrorReceiver$handleLegacySiteError$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NetSiteErrorReceiver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetSiteErrorReceiver$handleLegacySiteError$1(NetSiteErrorReceiver netSiteErrorReceiver, Continuation<? super NetSiteErrorReceiver$handleLegacySiteError$1> continuation) {
        super(continuation);
        this.this$0 = netSiteErrorReceiver;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m58159f(null, this);
    }
}
