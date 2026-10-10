package com.kubi.sdk.pkg.bundle.i18n;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: RnI18nPrefetchTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.bundle.i18n.RnI18nPrefetchTask", m90122f = "RnI18nPrefetchTask.kt", m90123i = {0, 0, 0, 0}, m90124l = {120}, m90125m = "download", m90126n = {"this", "item", "locale", "inflightKey"}, m90127s = {"L$0", "L$1", "L$2", "L$3"})
public final class RnI18nPrefetchTask$download$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RnI18nPrefetchTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RnI18nPrefetchTask$download$1(RnI18nPrefetchTask rnI18nPrefetchTask, Continuation<? super RnI18nPrefetchTask$download$1> continuation) {
        super(continuation);
        this.this$0 = rnI18nPrefetchTask;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m57573h(null, null, this);
    }
}
