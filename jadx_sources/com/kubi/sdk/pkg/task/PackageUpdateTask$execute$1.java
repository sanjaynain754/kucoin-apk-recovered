package com.kubi.sdk.pkg.task;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: PackageUpdateTask.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.sdk.pkg.task.PackageUpdateTask", m90122f = "PackageUpdateTask.kt", m90123i = {0, 0, 1, 1}, m90124l = {24, 34}, m90125m = "execute", m90126n = {"this", "downloadTask", "this", "downloadTask"}, m90127s = {"L$0", "L$1", "L$0", "L$1"})
public final class PackageUpdateTask$execute$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PackageUpdateTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PackageUpdateTask$execute$1(PackageUpdateTask packageUpdateTask, Continuation<? super PackageUpdateTask$execute$1> continuation) {
        super(continuation);
        this.this$0 = packageUpdateTask;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m57790a(this);
    }
}
