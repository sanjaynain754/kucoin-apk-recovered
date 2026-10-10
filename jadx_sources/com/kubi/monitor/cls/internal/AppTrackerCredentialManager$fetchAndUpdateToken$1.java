package com.kubi.monitor.cls.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AppTrackerCredentialManager.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90085k = 3, m90086mv = {1, 6, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.monitor.cls.internal.AppTrackerCredentialManager", m90122f = "AppTrackerCredentialManager.kt", m90123i = {0}, m90124l = {51}, m90125m = "fetchAndUpdateToken", m90126n = {"context"}, m90127s = {"L$0"})
public final class AppTrackerCredentialManager$fetchAndUpdateToken$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppTrackerCredentialManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppTrackerCredentialManager$fetchAndUpdateToken$1(AppTrackerCredentialManager appTrackerCredentialManager, Continuation<? super AppTrackerCredentialManager$fetchAndUpdateToken$1> continuation) {
        super(continuation);
        this.this$0 = appTrackerCredentialManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m42403c(null, this);
    }
}
