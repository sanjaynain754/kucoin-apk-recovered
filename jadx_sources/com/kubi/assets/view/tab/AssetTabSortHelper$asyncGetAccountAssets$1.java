package com.kubi.assets.view.tab;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AssetTabSortHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.view.tab.AssetTabSortHelper", m90122f = "AssetTabSortHelper.kt", m90123i = {0, 0, 0, 0, 1, 1, 1, 1}, m90124l = {369, 371}, m90125m = "asyncGetAccountAssets", m90126n = {DbParams.KEY_CHANNEL_RESULT, FirebaseAnalytics.Param.CURRENCY, "$this$asyncGetAccountAssets_u24lambda_u2410", "$i$a$-runCatching-AssetTabSortHelper$asyncGetAccountAssets$2", DbParams.KEY_CHANNEL_RESULT, FirebaseAnalytics.Param.CURRENCY, "$this$asyncGetAccountAssets_u24lambda_u2410", "$i$a$-runCatching-AssetTabSortHelper$asyncGetAccountAssets$2"}, m90127s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"})
public final class AssetTabSortHelper$asyncGetAccountAssets$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssetTabSortHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetTabSortHelper$asyncGetAccountAssets$1(AssetTabSortHelper assetTabSortHelper, Continuation<? super AssetTabSortHelper$asyncGetAccountAssets$1> continuation) {
        super(continuation);
        this.this$0 = assetTabSortHelper;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m20063f(this);
    }
}
