package com.kubi.launch;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AnimationStrategy.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.launch.AdExchangeAnimationStrategy", m90122f = "AnimationStrategy.kt", m90123i = {0, 0, 0, 0, 0, 1, 1, 2, 2, 2, 2, 2, 2}, m90124l = {315, 144, 316}, m90125m = "showAnimation", m90126n = {"context", "viewStub", "context$iv", "animationStrategy$iv", "$i$f$showAnimation", "context", "viewStub", "context", "viewStub", "adResult", "context$iv", "animationStrategy$iv", "$i$f$showAnimation"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
public final class AdExchangeAnimationStrategy$showAnimation$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AdExchangeAnimationStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdExchangeAnimationStrategy$showAnimation$1(AdExchangeAnimationStrategy adExchangeAnimationStrategy, Continuation<? super AdExchangeAnimationStrategy$showAnimation$1> continuation) {
        super(continuation);
        this.this$0 = adExchangeAnimationStrategy;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo37418a(null, this);
    }
}
