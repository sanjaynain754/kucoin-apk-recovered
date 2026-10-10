package com.kubi.sdk.site.config;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: SiteInfoProxy.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.config.SiteInfoProxy", m90122f = "SiteInfoProxy.kt", m90123i = {0, 0, 0, 1, 1, 1, 1}, m90124l = {50, 57}, m90125m = "fetchSiteType", m90126n = {"defaultValue", "supportList", "isFetchSupportList", "defaultValue", "supportList", "api", "isFetchSupportList"}, m90127s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0"})
public final class SiteInfoProxy$fetchSiteType$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SiteInfoProxy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SiteInfoProxy$fetchSiteType$1(SiteInfoProxy siteInfoProxy, Continuation<? super SiteInfoProxy$fetchSiteType$1> continuation) {
        super(continuation);
        this.this$0 = siteInfoProxy;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m58049b(null, this);
    }
}
