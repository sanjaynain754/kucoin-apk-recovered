package com.kubi.sdk.pkg.bundle;

import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: BundleUpdateTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.BundleUpdateTask", m90122f = "BundleUpdateTask.kt", m90123i = {0, 1}, m90124l = {154, 212}, m90125m = "pullPackageInfo", m90126n = {"this", DbParams.KEY_CHANNEL_RESULT}, m90127s = {"L$0", "L$0"})
public final class BundleUpdateTask$pullPackageInfo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BundleUpdateTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleUpdateTask$pullPackageInfo$1(BundleUpdateTask bundleUpdateTask, Continuation<? super BundleUpdateTask$pullPackageInfo$1> continuation) {
        super(continuation);
        this.this$0 = bundleUpdateTask;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m57506l(null, this);
    }
}
