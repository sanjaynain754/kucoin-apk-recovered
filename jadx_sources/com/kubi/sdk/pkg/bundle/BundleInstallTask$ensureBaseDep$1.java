package com.kubi.sdk.pkg.bundle;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: BundleInstallTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.BundleInstallTask", m90122f = "BundleInstallTask.kt", m90123i = {0, 0, 0, 0}, m90124l = {170}, m90125m = "ensureBaseDep", m90126n = {"this", "bundleInfo", "baseVersion", "baseInfo"}, m90127s = {"L$0", "L$1", "L$2", "L$3"})
public final class BundleInstallTask$ensureBaseDep$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BundleInstallTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleInstallTask$ensureBaseDep$1(BundleInstallTask bundleInstallTask, Continuation<? super BundleInstallTask$ensureBaseDep$1> continuation) {
        super(continuation);
        this.this$0 = bundleInstallTask;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m57431e(null, this);
    }
}
