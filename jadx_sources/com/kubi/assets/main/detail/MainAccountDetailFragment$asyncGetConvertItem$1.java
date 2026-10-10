package com.kubi.assets.main.detail;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: MainAccountDetailFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.main.detail.MainAccountDetailFragment", m90122f = "MainAccountDetailFragment.kt", m90123i = {0, 0}, m90124l = {350}, m90125m = "asyncGetConvertItem$AssetsCenterLib_googleRelease", m90126n = {"coinInfoEntity", "code"}, m90127s = {"L$0", "L$1"})
public final class MainAccountDetailFragment$asyncGetConvertItem$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MainAccountDetailFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainAccountDetailFragment$asyncGetConvertItem$1(MainAccountDetailFragment mainAccountDetailFragment, Continuation<? super MainAccountDetailFragment$asyncGetConvertItem$1> continuation) {
        super(continuation);
        this.this$0 = mainAccountDetailFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m17766f5(null, this);
    }
}
