package com.kubi.mine.lib.service;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: MineService.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.service.MineService", m90122f = "MineService.kt", m90123i = {}, m90124l = {118}, m90125m = "fetchKycStatus", m90126n = {}, m90127s = {})
public final class MineService$fetchKycStatus$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MineService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MineService$fetchKycStatus$1(MineService mineService, Continuation<? super MineService$fetchKycStatus$1> continuation) {
        super(continuation);
        this.this$0 = mineService;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo41624g(this);
    }
}
