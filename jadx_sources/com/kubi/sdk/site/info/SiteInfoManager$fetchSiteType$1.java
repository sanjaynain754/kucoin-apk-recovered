package com.kubi.sdk.site.info;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: SiteInfoManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.info.SiteInfoManager", m90122f = "SiteInfoManager.kt", m90123i = {0}, m90124l = {67}, m90125m = "fetchSiteType", m90126n = {"defaultValue"}, m90127s = {"L$0"})
public final class SiteInfoManager$fetchSiteType$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SiteInfoManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SiteInfoManager$fetchSiteType$1(SiteInfoManager siteInfoManager, Continuation<? super SiteInfoManager$fetchSiteType$1> continuation) {
        super(continuation);
        this.this$0 = siteInfoManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m58107a(null, this);
    }
}
