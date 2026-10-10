package com.kubi.sdk.pkg.bundle.pkgplatform;

import io.chad.library.adapter.base.BaseQuickAdapter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: PkgPlatformUpdateTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.pkgplatform.PkgPlatformUpdateTask", m90122f = "PkgPlatformUpdateTask.kt", m90123i = {0, 0, 0}, m90124l = {BaseQuickAdapter.LOADING_VIEW}, m90125m = "downloadAndInstallOnce", m90126n = {"this", "item", "startTime"}, m90127s = {"L$0", "L$1", "J$0"})
public final class PkgPlatformUpdateTask$downloadAndInstallOnce$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PkgPlatformUpdateTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkgPlatformUpdateTask$downloadAndInstallOnce$1(PkgPlatformUpdateTask pkgPlatformUpdateTask, Continuation<? super PkgPlatformUpdateTask$downloadAndInstallOnce$1> continuation) {
        super(continuation);
        this.this$0 = pkgPlatformUpdateTask;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m57653r(null, this);
    }
}
