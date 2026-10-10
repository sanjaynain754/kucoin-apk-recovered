package com.kubi.kucoin.token;

import com.tencent.bugly.proguard.C33556b3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: TokenLifecycleManager.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.kucoin.token.TokenLifecycleManager", m90122f = "TokenLifecycleManager.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {C33556b3.f69051i}, m90125m = "executeRefresh", m90126n = {"expiredToken", "triggerPath", "source", "refreshContext", "refreshTimeLimit", "taskGeneration"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "J$0", "J$1"})
public final class TokenLifecycleManager$executeRefresh$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TokenLifecycleManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenLifecycleManager$executeRefresh$1(TokenLifecycleManager tokenLifecycleManager, Continuation<? super TokenLifecycleManager$executeRefresh$1> continuation) {
        super(continuation);
        this.this$0 = tokenLifecycleManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m32914E(null, null, null, 0L, 0L, null, this);
    }
}
