package com.kubi.sdk.site.migration;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: SiteMigrationService.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.site.migration.SiteMigrationService", m90122f = "SiteMigrationService.kt", m90123i = {0, 0}, m90124l = {96}, m90125m = "updateSiteMigration", m90126n = {"from", "force"}, m90127s = {"L$0", "Z$0"})
public final class SiteMigrationService$updateSiteMigration$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SiteMigrationService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SiteMigrationService$updateSiteMigration$1(SiteMigrationService siteMigrationService, Continuation<? super SiteMigrationService$updateSiteMigration$1> continuation) {
        super(continuation);
        this.this$0 = siteMigrationService;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m58151k(null, false, this);
    }
}
