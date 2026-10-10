package com.kubi.launch;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: LauncherManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.launch.LauncherManager", m90122f = "LauncherManager.kt", m90123i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, m90124l = {173, 177, 187}, m90125m = "jumpToNext", m90126n = {"context", "activity", "router", "hasAnyBizActivity", "context", "activity", "router", "hasAnyBizActivity", "context", "activity", "router", "hasAnyBizActivity"}, m90127s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "Z$0"})
public final class LauncherManager$jumpToNext$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LauncherManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LauncherManager$jumpToNext$1(LauncherManager launcherManager, Continuation<? super LauncherManager$jumpToNext$1> continuation) {
        super(continuation);
        this.this$0 = launcherManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m37433n(null, this);
    }
}
