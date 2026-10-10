package com.kubi.sdk.site.config;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: SiteConfigManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.config.SiteConfigManager", m90122f = "SiteConfigManager.kt", m90123i = {0, 0}, m90124l = {46}, m90125m = "fetchConfig", m90126n = {"context", "targetSite"}, m90127s = {"L$0", "L$1"})
public final class SiteConfigManager$fetchConfig$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SiteConfigManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SiteConfigManager$fetchConfig$1(SiteConfigManager siteConfigManager, Continuation<? super SiteConfigManager$fetchConfig$1> continuation) {
        super(continuation);
        this.this$0 = siteConfigManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m58038d(null, null, this);
    }
}
