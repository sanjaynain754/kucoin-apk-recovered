package com.kubi.assets.options;

import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AssetOptionsViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.options.AssetOptionsViewModel", m90122f = "AssetOptionsViewModel.kt", m90123i = {0}, m90124l = {103}, m90125m = "fetchOptionsOverview", m90126n = {FirebaseAnalytics.Param.CURRENCY}, m90127s = {"L$0"})
public final class AssetOptionsViewModel$fetchOptionsOverview$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssetOptionsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetOptionsViewModel$fetchOptionsOverview$1(AssetOptionsViewModel assetOptionsViewModel, Continuation<? super AssetOptionsViewModel$fetchOptionsOverview$1> continuation) {
        super(continuation);
        this.this$0 = assetOptionsViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m18097F(this);
    }
}
