package com.kubi.assets.knb;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.tensorflow.lite.schema.BuiltinOperator;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AssetWeb3BridgeManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.knb.AssetWeb3BridgeManager", m90122f = "AssetWeb3BridgeManager.kt", m90123i = {0, 0, 0, 0, 1, 1, 1, 1}, m90124l = {BuiltinOperator.UNSORTED_SEGMENT_MIN, 162}, m90125m = "handleMultipleAddress", m90126n = {"coinName", "chainName", "depositMinSize", "completableDeferred", "coinName", "chainName", "depositMinSize", "completableDeferred"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
public final class AssetWeb3BridgeManager$handleMultipleAddress$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssetWeb3BridgeManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetWeb3BridgeManager$handleMultipleAddress$1(AssetWeb3BridgeManager assetWeb3BridgeManager, Continuation<? super AssetWeb3BridgeManager$handleMultipleAddress$1> continuation) {
        super(continuation);
        this.this$0 = assetWeb3BridgeManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m17495E(null, null, null, this);
    }
}
