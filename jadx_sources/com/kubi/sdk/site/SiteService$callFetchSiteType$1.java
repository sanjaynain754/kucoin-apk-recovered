package com.kubi.sdk.site;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: SiteService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.SiteService", m90122f = "SiteService.kt", m90123i = {0, 0, 0}, m90124l = {532}, m90125m = "callFetchSiteType", m90126n = {"defaultValue", "fromType", "start"}, m90127s = {"L$0", "L$1", "J$0"})
public final class SiteService$callFetchSiteType$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SiteService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SiteService$callFetchSiteType$1(SiteService siteService, Continuation<? super SiteService$callFetchSiteType$1> continuation) {
        super(continuation);
        this.this$0 = siteService;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m57998l(null, null, this);
    }
}
