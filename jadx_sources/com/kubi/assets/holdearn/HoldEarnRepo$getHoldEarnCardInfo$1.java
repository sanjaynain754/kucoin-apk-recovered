package com.kubi.assets.holdearn;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: HoldEarnRepo.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.holdearn.HoldEarnRepo", m90122f = "HoldEarnRepo.kt", m90123i = {0, 0}, m90124l = {33}, m90125m = "getHoldEarnCardInfo", m90126n = {"$this$getHoldEarnCardInfo_u24lambda_u241", "$i$a$-runCatching-HoldEarnRepo$getHoldEarnCardInfo$2"}, m90127s = {"L$0", "I$0"})
public final class HoldEarnRepo$getHoldEarnCardInfo$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HoldEarnRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoldEarnRepo$getHoldEarnCardInfo$1(HoldEarnRepo holdEarnRepo, Continuation<? super HoldEarnRepo$getHoldEarnCardInfo$1> continuation) {
        super(continuation);
        this.this$0 = holdEarnRepo;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m17383d(this);
    }
}
